package com.lamn.microservices.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * The type Eureka servier application.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServierApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServierApplication.class, args);
	}

}
