package com.test.consumer.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@RequestMapping(value="/test")
	public String test(){
		return "OK";
	}
}
