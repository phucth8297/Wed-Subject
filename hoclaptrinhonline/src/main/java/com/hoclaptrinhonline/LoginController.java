package com.hoclaptrinhonline;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hoclaptrinhonline.entity.*;
import com.hoclaptrinhonline.entity.User;
import com.hoclaptrinhonline.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	UserService userService;
	
	@GetMapping
	public String Default() {
		return "login";
	}
	@PostMapping
	public String login(@RequestParam String id_email, @RequestParam String pass, ModelMap modolmap){
		boolean checkLogin = userService.login(id_email, pass);
		if(checkLogin) {
			modolmap.addAttribute("loginS","Success");
			modolmap.addAttribute("id_email",id_email);
			return "redirect:/home";
		}else {
			modolmap.addAttribute("loginF","Fail");
			return "login";
		}		
		
	}
	
}
