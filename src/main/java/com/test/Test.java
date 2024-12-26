package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//By default Spring IOC will be created objects
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Car obj = context.getBean("car",Car.class);
		System.out.println(obj.hashCode());
		
		Car obj1 = context.getBean("car",Car.class);
		System.out.println(obj1.hashCode());
		
	}

}
