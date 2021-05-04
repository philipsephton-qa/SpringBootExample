package com.qa.marvel;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MarvelApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MarvelApplication.class, args);
		System.out.println(context.getBean("greeting"));
		System.out.println(context.getBean("time"));
		System.out.println(context.getBean(LocalTime.class));
		System.out.println(context.getBean("time", LocalTime.class));
	}
// a bean is a self managed object meaning the creating, maintaining, and destruction of the object
// is purely under the control of the spring framework!
	
	@Bean
	public String greeting() {
		return "Hello!";
	}
	@Bean
	public LocalTime time() {
		LocalTime x = LocalTime.now();
		return x;
	}
}
