package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ec2Controller {
	
@GetMapping("welcome")
	public String welcome() {
	 return "hii!! guys welcome to india";
	
}

}
