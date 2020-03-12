package com.spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class RestApiController {
	@GetMapping("/index")
	public String index() {
		return "Welcome to the home page!";
	}
}
