package com.ztp.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ztp.cloud.db.entities.User;
import com.ztp.cloud.db.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/example/{id}")
	public User findByUserId(@PathVariable Long id) {
		return this.userRepository.findOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/post")
    public User post(@RequestBody User user) {
		return user;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/get")
	public User get(@RequestBody User user) {
		return user;
	}
	
}
