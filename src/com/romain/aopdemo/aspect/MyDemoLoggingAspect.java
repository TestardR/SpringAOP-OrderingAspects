package com.romain.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	@Before("com.romain.aopdemo.aspect.AopExpressions.forDaoPackageNogetterSetter()")
	public void beforeAddAcountAdvice() {
		
		System.out.println("\n====>>> Executing @Before advice on addAccount()");
	}

}
