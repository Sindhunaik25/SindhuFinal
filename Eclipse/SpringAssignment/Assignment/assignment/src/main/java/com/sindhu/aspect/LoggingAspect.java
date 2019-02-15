package com.sindhu.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
public void loggingAdvice(){
	System.out.println("Advice method called");
}
	/*@Before("allGetters()")
	public void lsecondAdvice(){
		System.out.println("second Advice method called");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	*/
	/*@Before("execution(public void getName())")
	public void loggingAdvice(){
		System.out.println("Advice method called");
	}	*/
	
}
