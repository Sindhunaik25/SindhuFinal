package com.sindhu.spring.AddressApplication1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        HelloWorld world=(HelloWorld) context.getBean("hello");
        world.Message();
    }
}
