package com.sindhu.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Customer customer=context.getBean(Customer.class);
		System.out.println(customer.getContact());
		System.out.println(customer.getAddress());
		System.out.println(customer.getName());
		System.out.println(customer.getId());
		System.out.println(customer.address2.getCity());
		System.out.println(customer.address2.getCountry());
		System.out.println(customer.address2.getState());
		System.out.println(customer.address2.getStreet());
		System.out.println(customer.address2.getZip());


	}

}
