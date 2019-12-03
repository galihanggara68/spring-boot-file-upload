package com.galih.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.galih.spring"})
public class SpringApp {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}

}
