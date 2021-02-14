package com.lamn.microservices.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServierApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServierApplication.class, args);
	}

}
