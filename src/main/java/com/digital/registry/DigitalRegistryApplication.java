package com.digital.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DigitalRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalRegistryApplication.class, args);
	}

}
