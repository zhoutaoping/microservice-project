package com.ztp.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.ztp.cloud.annotation.ExcludeSann;

@Configuration
@ExcludeSann
public class FooConfiguration {

	@Bean
	public IRule ribbonRule(/*IClientConfig config*/) {
		return new RandomRule();
	}
}
