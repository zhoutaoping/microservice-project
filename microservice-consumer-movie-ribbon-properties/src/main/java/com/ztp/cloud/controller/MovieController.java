package com.ztp.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ztp.cloud.pojo.User;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@GetMapping("/movie/{id}")
	public User findUserById(@PathVariable Long id) {
		return restTemplate.getForObject("http://microservice-provider-user/example/" + id, User.class);
	}
	
	@GetMapping("/test")
	public void test() {
		ServiceInstance serviceInstance = loadBalancerClient.choose("microservice-provider-user");
		ServiceInstance serviceInstance2 = loadBalancerClient.choose("microservice-provider-user2");
		System.out.println(serviceInstance.getServiceId() + ": " + serviceInstance.getPort());
		System.out.println(serviceInstance2.getServiceId() + ": " + serviceInstance2.getPort());
	}
	
}
