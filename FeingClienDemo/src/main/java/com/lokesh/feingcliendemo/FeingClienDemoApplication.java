package com.lokesh.feingcliendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.lokesh.feingcliendemo")
public class FeingClienDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeingClienDemoApplication.class, args);
	}

}
