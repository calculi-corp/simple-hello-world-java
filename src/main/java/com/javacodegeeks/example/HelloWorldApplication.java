package com.javacodegeeks.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	public static boolean badCode() {
		boolean test;
		test = false;
		// duplicate the follwing bad code so we some duplication metrics
		// as well as code smells
		if (test == true) {/* don't test against boolean values */
			System.out.println(-0.0f == 0.0f);
			System.out.println(Float.compare(-0.0f, 0.0f) == 0 ? true : false);
		}
		if (test == true) {/* don't test against boolean values */
			System.out.println(-0.0f == 0.0f);
			System.out.println(Float.compare(-0.0f, 0.0f) == 0 ? true : false);
		}
		if (test == true) {/* don't test against boolean values */
			System.out.println(-0.0f == 0.0f);
			System.out.println(Float.compare(-0.0f, 0.0f) == 0 ? true : false);
		}
		int day = 5;
		String dayString;
		dayString = "";
		// switch statement with int data type
		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		// no default, should trigger code issue
		}
		System.out.println(dayString);
		
		// multiple returns...bad idea!
		if (test) {
			return true;
		} else {
			return false;
		}
	}

}
