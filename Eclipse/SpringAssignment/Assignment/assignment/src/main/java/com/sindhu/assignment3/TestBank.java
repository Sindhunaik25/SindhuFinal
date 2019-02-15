package com.sindhu.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring3.xml");
		BankAccountController controller=context.getBean(BankAccountController.class);
		System.out.println(controller.getBalance(1));
		System.out.println(controller.deposit(1, 5000));
		System.out.println(controller.withdraw(1, 10000));
		System.out.println("to account balance " + controller.getBalance(2));
		System.out.println(controller.fundTransfer(1, 2, 5000));
		System.out.println("from account balance " + controller.getBalance(1));
		System.out.println("to account balance " + controller.getBalance(2));
		
		//((ConfigurableApplicationContext)(context)).close();
	}

}
