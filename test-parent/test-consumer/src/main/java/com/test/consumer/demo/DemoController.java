package com.test.consumer.demo;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.common.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService = null;

	private static Logger LOG = LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping(value="/test")
	public String test(){
		LOG.info("--------------------------------------dubbotest------------------------------------");
		demoService.sayHello();
		return "OK";
	}
}
