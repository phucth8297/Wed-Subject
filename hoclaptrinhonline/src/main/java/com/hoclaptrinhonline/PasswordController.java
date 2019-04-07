package com.hoclaptrinhonline;

import java.io.IOException;


import java.util.UUID;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hoclaptrinhonline.entity.PasswordResetHelperModel;
import com.hoclaptrinhonline.entity.User;
import com.hoclaptrinhonline.service.EmailService;
import com.hoclaptrinhonline.service.UserService;



@Controller
public class PasswordController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private EmailService emailService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	
	@RequestMapping(value = "/forgot", method = RequestMethod.GET)
	public ModelAndView displayForgotPasswordPage(Model model) {
		return new ModelAndView("forgot");
    }
	/*
	 * Process form submission from forgotPassword page
	 */
	@RequestMapping(value = "/forgot", method = RequestMethod.POST)
	public String processForgotPasswordForm(ModelMap modelmap, @RequestParam("email") String userEmail, HttpServletRequest request,RedirectAttributes redir) {
		// Lookup user in database by e-mail
		User aUser = userService.findUserByEmail(userEmail);
		if (aUser==null) 
		{
			modelmap.addAttribute("errorMessage", "We didn't find an account for that e-mail address.");
		} 
		else 
		{
			// Generate random 36-character string token for reset password 
			String randompassword=UUID.randomUUID().toString();
			try {
				String randomtoken=GetAPIFunction();
			} catch (IOException e) {
				
			}
			// Save token to database
	
			aUser.setReset_token(randompassword);
			//userService.save(aUser);
			userService.updateUser(aUser);	
			String appUrl = request.getScheme() + "://" + request.getServerName() +":8080/hoclaptrinhonline";
			// Email message
			SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
			passwordResetEmail.setFrom("hoangphucnlit821997@gmail.com");
			passwordResetEmail.setTo(aUser.getId_email());
			passwordResetEmail.setSubject("Password Reset");
			passwordResetEmail.setText("To reset your password, click the link below:\n" + appUrl+""
					+ "/reset?token=" + aUser.getReset_token());
			emailService.sendEmail(passwordResetEmail);
			// Add success message to view
			redir.addFlashAttribute("successMessage", "A password reset link has been sent to " + userEmail);
			modelmap.addAttribute("successMessage", "A password reset link has been sent to " + userEmail);
			}	
		
		
		return "forgot";
	}
	/*
	 * Display form to reset password
	 */
	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String displayResetPasswordPage(ModelMap modelmap, @RequestParam(required=false, name="token") String token) {
		User aUser = userService.findUserByResetToken(token);
		if (aUser!=null) 
		{ // Token found in DB
			PasswordResetHelperModel aPasswordResetHelperModel= new PasswordResetHelperModel();
			aPasswordResetHelperModel.aUser=aUser;
			aPasswordResetHelperModel.setResetToken(token);
			modelmap.addAttribute("aPasswordResetHelperModel", aPasswordResetHelperModel);
		} else 
		{ // Token not found in DB
			modelmap.addAttribute("errorMessage", "Oops!  This is an invalid password reset link.");
		}
		
		return "reset";
	}
	/*
	 * Process reset password form
	 */
	@RequestMapping(value = "/reset", method = RequestMethod.POST)
	public String setNewPassword(ModelMap modelmap, PasswordResetHelperModel aPasswordResetHelperModel,RedirectAttributes redir) {
		// Find the user associated with the reset token
		User aUser = userService.findUserByResetToken(aPasswordResetHelperModel.getResetToken());
		String password1=aPasswordResetHelperModel.newPassword;
		String password2=aPasswordResetHelperModel.oldPassword;
		if(password1.equals(password2) && password1.length()>4)
		{
			// This should always be non-null but we check just in case
			if (aUser!=null) 
			{
				User resetUser = aUser;    
				// Set new password    
	            resetUser.setPass(bCryptPasswordEncoder.encode(aPasswordResetHelperModel.newPassword));
				// Set the reset token to null so it cannot be used again
				resetUser.setReset_token(null);
				// Save user
				userService.updateUser(resetUser);
				// In order to set a model attribute on a redirect, we must use
				// RedirectAttributes
				redir.addFlashAttribute("successMessage", "You have successfully reset your password.  You may now login.");
				modelmap.addAttribute("pass",aPasswordResetHelperModel);
				modelmap.addAttribute("successMessage", "You have successfully reset your password.  You may now login.");
				return "reset";
			} 
			else 
			{
				modelmap.addAttribute("errorMessage", "Oops!  This is an invalid password reset link ");
				return "reset";	
			}
		}
		else 
		{			
			modelmap.addAttribute("errorMessage", "Oops!  Password mismatch or password length should be atleast 5");
			return "reset";		
		}
		
	}
	/*
	 * API function to get unique token
	 */
	public String GetAPIFunction () throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://api.wordpress.org/secret-key/1.1/salt/";
        String atoken =restTemplate.getForObject(url, String.class, 200);return atoken;
	}
	/*
	 * Going to reset page without a token redirects to login page
	 */
//	@ExceptionHandler(MissingServletRequestParameterException.class)
//	public ModelAndView handleMissingParams(MissingServletRequestParameterException ex) {
//		return new ModelAndView("redirect:login");
//	}

}