package com.hoclaptrinhonline;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class TrangChuControllerb {
	@Autowired
	SessionFactory sessionFactory;
		
	@GetMapping
	public String Default() {

		return "index";
	}
}
