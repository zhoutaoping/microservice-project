package com.ztp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoverEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoverEurekaApplication.class, args);
	}
}
