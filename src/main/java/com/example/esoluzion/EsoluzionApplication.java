package com.example.esoluzion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example"})
public class EsoluzionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsoluzionApplication.class, args);
	}

}
