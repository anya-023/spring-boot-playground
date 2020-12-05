package com.spring.playground.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.playground.producer.Producer;
import com.spring.playground.properties.PlaygroundProperties;

@RestController
public class MainController {
	
	@Autowired
	Producer producer;
	
	@Autowired
	PlaygroundProperties playgroundProperties;
	
	@PostMapping(value = "/send",consumes = MediaType.TEXT_PLAIN_VALUE)
	public void postMessage(@RequestBody String message) {
		
		producer.publishMessage(message);
		
		System.out.println(playgroundProperties.getName());
		System.out.println(playgroundProperties.getMenu().get(0).getName());
		
	}

}
