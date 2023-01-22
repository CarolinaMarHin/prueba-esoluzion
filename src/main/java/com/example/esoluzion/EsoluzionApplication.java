package com.example.esoluzion;

import com.example.ecommerce.controller.ECommerceController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = ECommerceController.class)
//@EnableAutoConfiguration
@ComponentScan({"com.example"})
public class EsoluzionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsoluzionApplication.class, args);
	}

}
