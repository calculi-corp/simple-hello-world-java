package com.javacodegeeks.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	public static void badCode(){
		boolean test;
		test = false;
		if (test == true){/* don't test against boolean values */
		System.out.println(-0.0f == 0.0f);
		System.out.println(Float.compare (-0.0f, 0.0f) == 0 ? true :false);
	}
	}

}
