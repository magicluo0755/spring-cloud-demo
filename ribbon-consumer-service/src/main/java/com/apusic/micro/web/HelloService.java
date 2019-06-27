package com.apusic.micro.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

	//private final Logger logger = Logger.getLogger(getClass());

	@Autowired
	RestTemplate restTemplate;

	public String hello() {
		StringBuilder result = new StringBuilder();
		result.append(restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody());
		return result.toString();
	}

	public String helloFallback() {
		return "error";
	}

}
