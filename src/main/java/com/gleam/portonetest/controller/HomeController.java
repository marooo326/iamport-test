package com.gleam.portonetest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/payment")
	public String payment() {
		return "payment";
	}
}
