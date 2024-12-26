package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//By default Spring IOC will be created objects
		new ClassPathXmlApplicationContext("Beans.xml");
		
	}

}
