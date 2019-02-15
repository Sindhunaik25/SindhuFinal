package com.spring.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring1.xml");
		Question question=context.getBean(Question.class);
		System.out.println(question.getQuestionId());
		System.out.println(question.getQuestions());
		
		for(String qst:question.getAnswer()){
		System.out.println(qst);}
		
		for(String qst:question.getAnswer1()){
			System.out.println(qst);}
		
		question.display();
	}

}
