package com.test.thymeleaf.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.thymeleaf.entities.User;

@Controller
@RequestMapping("/user")

public class UserController {
	
	@GetMapping("/index")
	public String dashboard(Model model,Principal principal) {
model.addAttribute("title", "Register - Smart Web");
		
		model.addAttribute("user",new User());
		System.out.println(principal.getName()+" Name ");
		return "normal/user_dashboard";
		
	}

}
