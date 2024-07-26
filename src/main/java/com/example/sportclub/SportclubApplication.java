package com.example.sportclub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SportclubApplication {


	public static void main(String[] args) throws Exception {
		//BUNDLES POST API EKLE
		SpringApplication.run(SportclubApplication.class, args);
	}

}
