package com.sindhu.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sindhu.spring.AddressApplication1.HelloWorld;

public class Main {

	public static void main(String[] args) {

		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "spring.xml"); Address address = (Address)
		 * context.getBean("address"); System.out.println(address.getStreet());
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Customer customer = context.getBean(Customer.class);
		System.out.println(customer.address.getCity());
		System.out.println(customer.address.getCountry());
		System.out.println(customer.address.getState());

		System.out.println(customer.address.getZip());
		System.out.println(customer.address.getStreet());

		System.out.println(customer.custId);

		System.out.println(customer.custContact);

		System.out.println(customer.custName);

		System.out.println(customer.custAddress);

	}

}
