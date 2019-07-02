package com.apusic.micro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@Value("${version}")
	private String version;
	
	@GetMapping("/version")
	public String version(){
		return this.version;
	}
}
