package com.hoclaptrinhonline;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cancel")
public class CancerController {
	@RequestMapping(method = RequestMethod.GET)
	public String cancelPay(){
		return "cancel";
	}
}
