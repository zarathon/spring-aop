package com.zaraz.aspect.springaop;

import com.zaraz.aspect.springaop.service.ServiceA;
import com.zaraz.aspect.springaop.service.ServiceB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ServiceA serviceA;

	@Autowired
	ServiceB serviceB;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		logger.info(serviceA.doSomething());
		logger.info(serviceB.doSomething());
	}
}
