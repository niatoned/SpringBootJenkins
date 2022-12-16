package com.emonics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingController {
	@GetMapping("/")
	public String sayHello(Model model) {
		model.addAttribute("message", "Hello jenkins");
		return "hello";
	}

}
