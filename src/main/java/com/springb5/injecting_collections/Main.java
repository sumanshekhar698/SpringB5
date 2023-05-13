package com.springb5.injecting_collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;


//My SQL
public class Main {

	public static void main(String[] args) {
		String path = "com/springb5/injecting_collections/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Employee e1 = (Employee)context.getBean("e1");
		System.out.println(e1);
		
	
		
		

	}

}
