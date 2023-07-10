package com.motorcycle.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MotorcycleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotorcycleServiceApplication.class, args);
	}

}
