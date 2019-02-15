package com.spring.bank.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bank.BankAccountController;
import com.spring.bank.Exception.InvalidAccountNumber;

public class TestBank {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		BankAccountController accountController = context
				.getBean(BankAccountController.class);

		System.out.println(accountController.deposit(102, 6000, "deposit"));
		System.out.println(accountController.deposit(101, 1000, "withdraw"));

	}

}
