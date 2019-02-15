package com.sindhu.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
		Question question=context.getBean(Question.class);
		question.display();
		for(String str:question.getAnswer())
		{
			System.out.println(str);
		}
		for(String str:question.getAnswer1())
		{
			System.out.println(str);
		}
	}

}
