package com.meals.dishes.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MealsDishesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MealsDishesServiceApplication.class, args);
	}

}
