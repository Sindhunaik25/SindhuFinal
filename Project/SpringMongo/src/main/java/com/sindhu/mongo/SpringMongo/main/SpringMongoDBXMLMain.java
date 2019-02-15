package com.sindhu.mongo.SpringMongo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sindhu.mongo.SpringMongo.dao.PersonDAOImpl;
import com.sindhu.mongo.SpringMongo.model.Person;

public class SpringMongoDBXMLMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		PersonDAOImpl personDAO = context.getBean(PersonDAOImpl.class);
		
		Person p=new Person("107", "Pavitra", "Siddapur");
		Person p1=new Person("108", "Neha", "Siddapur");
		
				//create
				//personDAO.create(p);
				personDAO.create(p1);
				/*System.out.println("Generated ID="+p.getId());
				
				System.out.println(p);
				*/
				//readById
				Person p4 = personDAO.readById(p1.getId());
				System.out.println("Id is="+p4);
				
				//update
				p.setAddress("Hallibail");
				personDAO.update(p);
				Person p5 = personDAO.readById(p.getId());
				System.out.println("Id is="+p5);
				
				//delete
				int count = personDAO.deleteById(p1.getId());
				System.out.println("Number of records deleted="+count);
				
				context.close();
	}

}
