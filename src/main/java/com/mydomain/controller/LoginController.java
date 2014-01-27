package com.mydomain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		System.out.println("I'm in the controller...");
		//return "index";
		System.out.println("redirecting...111");
		return "redirect:/index.jsp";
	}
}
