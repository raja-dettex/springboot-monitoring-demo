package com.raja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbPrometheusDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbPrometheusDemoApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String greeting() {
		return "welcome ";
	}

	@GetMapping("/short")
	public String shortDuration() {
		return "this is short";
	}
	
	@GetMapping("/long")
	public String lonDuration() throws InterruptedException {
		Thread.sleep(10000);
		return "this is long";
	}
}
