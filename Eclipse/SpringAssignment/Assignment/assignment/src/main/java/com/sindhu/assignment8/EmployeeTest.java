package com.sindhu.assignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring8.xml");
		Employee employee = context.getBean(Employee.class);
		EmployeePostPre employee1 = context.getBean(EmployeePostPre.class);
		EmployeeInitDestroy employee2 = context.getBean(EmployeeInitDestroy.class);
		System.out.println(employee.getName());
		((ClassPathXmlApplicationContext) context).close();
	}

}
