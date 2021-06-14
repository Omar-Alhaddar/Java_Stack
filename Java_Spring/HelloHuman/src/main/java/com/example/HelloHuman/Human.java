package com.example.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Human {

	@RequestMapping("/")
	public String human(@RequestParam(value="q", required=false) String searchQuery) {
		if (searchQuery == null) {
		return "Hello Human" + " " + "welcome to SpringBoot";
		}
		else 
		{
			return "Hello "+ searchQuery + " welcome to SpringBoot";
		}
		
	}
}
