package com.book.citi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
		
	@GetMapping("/form")
	public String openForm() {
		System.out.println("welcome to form page");
		return "form";
	}
}
