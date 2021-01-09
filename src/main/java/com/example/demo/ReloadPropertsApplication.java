package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReloadPropertsApplication {

	public static void main(String[] args) {
		String s ="Hello ReloadPropertsApplication";
		
		System.out.println("=======");
		System.out.println(s);
		System.out.println("=======");
		SpringApplication.run(ReloadPropertsApplication.class, args);
	}

}
