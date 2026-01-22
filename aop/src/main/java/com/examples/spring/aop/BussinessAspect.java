package com.examples.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BussinessAspect {
	
	
	@Before("")
	public void log() {
		System.out.println("This method is the advice method..!");
	}

}
