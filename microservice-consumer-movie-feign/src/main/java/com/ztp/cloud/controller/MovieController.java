package com.ztp.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ztp.cloud.feign.MyFeignClient;
import com.ztp.cloud.pojo.User;

@RestController
public class MovieController {

	@Autowired
	private MyFeignClient myFeignClient;
	
	@GetMapping("/movie/{id}")
	public User findUserById(@PathVariable Long id) {
		return myFeignClient.findByUserId(id);
	}
	
	@GetMapping("/post")
	public User post(User user) {
		return myFeignClient.post(user);
	}
	
	@GetMapping("/get")
	public User get(User user) {
		return myFeignClient.get(user);
	}
}
