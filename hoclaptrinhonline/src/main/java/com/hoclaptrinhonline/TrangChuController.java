package com.hoclaptrinhonline;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hoclaptrinhonline.entity.Roles;
import com.hoclaptrinhonline.entity.User;

@Controller
@RequestMapping("/")
public class TrangChuController {
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@GetMapping
	@Transactional
	public String Default() {
//		Session session = sessionFactory.getCurrentSession();
//		
//		Roles role1 = new Roles();
//		role1.setId_role("1");
//		role1.setName("Admin");
//		
//		Roles role2 = new Roles();
//		role2.setId_role("2");
//		role2.setName("User");
//		
//		Set<Roles> roles = new HashSet<Roles>();
//		roles.add(role1);
//		roles.add(role2);
//
//		User user = new User();
//		user.setId_email("zfdvdfb");
//		user.setName("advsadv");
//		user.setAddr("dvsdv");
//		user.setPhone("dvfssb");
//		user.setPass("dhdg");
//		user.setRole(roles);
//		
//		session.save(user);
		
		return "index";
	}
}
