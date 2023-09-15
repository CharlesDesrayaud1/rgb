package com.example.Oui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RGBApplication {

	public static void main(String[] args) {
		SpringApplication.run(RGBApplication.class, args);
	}

}
