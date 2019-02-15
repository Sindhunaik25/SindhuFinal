package com.cart.test;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cart.dao.CartDAO;
import com.cart.service.CartService;

public class Maintest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
		CartDAO dao = context.getBean(CartDAO.class);
		
		CartService service=context.getBean(CartService.class);
		
		
		
		//System.out.println(service.addProductIntoCart(9, "watch", 2, 5000));
		//System.out.println(service.removeProductFromCart(5));
		//System.out.println(service.updateProductIntoCart(9,"shirt"));
System.out.println(service.emptyCart());
}
}
 