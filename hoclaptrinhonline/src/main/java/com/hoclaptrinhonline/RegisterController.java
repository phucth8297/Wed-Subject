package com.hoclaptrinhonline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hoclaptrinhonline.entity.User;
import com.hoclaptrinhonline.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	UserService userService;
	private Pattern regexPattern;
    private Matcher regMatcher;
	@GetMapping
	public String Default() {
		return "register";
	}
	@PostMapping
	public String register(@RequestParam String id_email, @RequestParam String name, @RequestParam String addr, @RequestParam String phone, @RequestParam String pass, @RequestParam String re_pass, ModelMap modelmap) {
		boolean validateEmail= validateEmailAddress(id_email);
		boolean validatePhone = validateMobileNumber(phone);
		if(!validateEmail) {  
			if(validatePhone) {
			if(pass.equals(re_pass)) {
				User user = new User();
				user.setId_email(id_email);
				user.setAddr(addr);
				user.setName(name);
				user.setPass(pass);
				user.setPhone(phone);
				
				boolean checkRegister = userService.register(user);
				return "redirect:/login";
			}else {
				modelmap.addAttribute("validatePass","Pass is not simalar");
			}
		}else {
			modelmap.addAttribute("validatePhone","Phone is not valid");
		}
			}else{
				modelmap.addAttribute("validateEmail","Email is not valid");
			}
		return "register";
	}
	public boolean validateEmailAddress(String emailAddress) {

        regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        regMatcher   = regexPattern.matcher(emailAddress);
        if(regMatcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateMobileNumber(String mobileNumber) {
        regexPattern = Pattern.compile("^[0-9]{10}$");
        regMatcher   = regexPattern.matcher(mobileNumber);
        if(regMatcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
