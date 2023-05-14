package com.springb5.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

//				Spring beans are POJOs managed by spring
		String path = "com/springb5/autowiring/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		Worker w1 = context.getBean("w1", Worker.class);
		System.out.println(w1);


	}

}
