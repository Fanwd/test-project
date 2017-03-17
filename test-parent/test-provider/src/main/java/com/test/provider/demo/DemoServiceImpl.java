package com.test.provider.demo;

import org.springframework.stereotype.Service;

import com.test.common.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

	@Override
	public void sayHello(){
		System.out.println("00000000000000000000000000000000000000000");
	}
}
