package com.example.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	 @RequestMapping("/welcome")
	  public String welcome() {
		  String text ="this is my privte page ";
		  text+="this page is not allowed to unauthenticated user";
		  return text;

}
}
