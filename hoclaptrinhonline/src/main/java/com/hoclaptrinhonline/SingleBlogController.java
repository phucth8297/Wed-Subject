package com.hoclaptrinhonline;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/single-blog")
public class SingleBlogController {
	@GetMapping
	public String Default() {
		return "single-blog";
	}
}