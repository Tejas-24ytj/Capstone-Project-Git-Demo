package com.example.cp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerCC {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
		@GetMapping("/goodbye")
		public String goodbye() {
			
			return "Good Bye";
		}
}
