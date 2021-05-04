package com.qa.marvel.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	public String sayHello() {
		return "Sav says 'hi'";
	}

}
