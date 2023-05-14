package com.springb5.autowiring.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

//				Spring beans are POJOs managed by spring
		String path = "com/springb5/autowiring/spel/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		Demo d1 = context.getBean("demo", Demo.class);
		Demo d2 = context.getBean("demo", Demo.class);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d1);


	}

}
