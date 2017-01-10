package com.lonsec.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ServerInitializer implements ApplicationRunner {

	@Autowired
	private BenchMarkService benchMarkService;
	
	@Autowired
	private FundService fundService; 
	
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		benchMarkService.findAll().stream().forEach(System.out::println);
		fundService.findFundByBenchMarkCode("bm1").forEach(System.out::println);
	}
}