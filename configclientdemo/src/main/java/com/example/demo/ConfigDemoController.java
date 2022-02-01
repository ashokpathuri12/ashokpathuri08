package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigDemoController {
	
	@Autowired
	ConfigDemoConfiguration confg;
	
	@GetMapping("/limits")
	public Limits getLimits() {
	//	return new Limits(0,100);
		
		return new Limits(confg.getMinimum(),confg.getMaximum());
	}

}
