package com.docker2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("users")
public class Docker2Controller {
	 @Autowired
	 RestTemplate restTemplate;
	@GetMapping
	public String getUser() {
		String res = restTemplate.getForObject("http://localhost:8080/Dockerpro1-0.0.1-SNAPSHOT/users", String.class);
		return "docker 2 responding -- "+res;
	}
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
