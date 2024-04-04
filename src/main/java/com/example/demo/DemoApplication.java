 package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	String username="user";
	int password=123456;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	public String m1(){
		return home("this is my home");
	}

	@RequestMapping("/")
  public String home(String home) {
    return home;
  }
}
