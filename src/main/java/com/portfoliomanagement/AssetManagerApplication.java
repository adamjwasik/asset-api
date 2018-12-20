package com.portfoliomanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication			//meta-annotation that pulls in component scanning, autoconfiguration, and property support. 
public class AssetManagerApplication {

	public static void main(String... args) {
		SpringApplication.run(AssetManagerApplication.class, args);
	}
}