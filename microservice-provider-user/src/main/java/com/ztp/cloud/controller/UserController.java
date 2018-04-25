package com.ztp.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
}
