package com.ztp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceDemoProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoProviderUserApplication.class, args);
	}
}
