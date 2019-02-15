package com.sindhu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ShapeProvider;

public class TestShape {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springShape.xml");
		ShapeProvider provider=context.getBean(ShapeProvider.class);
		System.out.println(provider.getCircle().getName());
		System.out.println(provider.getTraingle().getName());

	}

}
