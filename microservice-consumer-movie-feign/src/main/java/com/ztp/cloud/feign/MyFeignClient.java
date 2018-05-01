package com.ztp.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ztp.cloud.pojo.User;


@FeignClient("microservice-provider-user")
public interface MyFeignClient {
	@RequestMapping(value = "/example/{id}", method = RequestMethod.GET)
	public User findByUserId(@PathVariable("id") Long id);
	
	@RequestMapping(method = RequestMethod.POST, value = "/post", 
			consumes = "application/json")
	public User post(/*@RequestBody*/ User user);
	
	//Feign发送Get请求时怎么用对象传递参数
	//https://blog.csdn.net/u014281502/article/details/72896182
	@RequestMapping(method = RequestMethod.GET, value = "/get", 
			consumes = "application/json")
	public User get(@RequestBody User user);
}
