package com.lonsec.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lonsec.core.service.ServerInitializer;

@ComponentScan(value = "com.lonsec.core")
@SpringBootApplication
public class LonsecApplication {


	public static void main(String[] args) {
		SpringApplication.run(LonsecApplication.class, args);

		/*ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:Spring-AutoScan.xml" });

		ServerInitializer cust = (ServerInitializer) context.getBean("serverInitializer");
		System.out.println(cust);

		try {
			cust.run(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*
		 * List<BenchMark> benchmarks= benchMarkService.findAll();
		 * if(benchmarks!=null && benchmarks.size()>0){ System.out.println(
		 * "Total benchmark:"+ benchmarks.size()); for(BenchMark benchMark:
		 * benchmarks){ System.out.println(benchMark.toString()); } }
		 */
	}
}
