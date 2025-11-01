package com.metlife.claim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.metlife.claim")
public class ClaimApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaimApplication.class, args);
	}

}
