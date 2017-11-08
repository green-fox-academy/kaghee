package com.greenfox.kaghee.guardian;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuardianApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GuardianApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
