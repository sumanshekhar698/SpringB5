package com.springb5.constructor_injections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String path = "com/springb5/constructor_injections/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Aadhar a1=(Aadhar)context.getBean("a1");
		System.out.println(a1);
		
		
		Aadhar a2=(Aadhar)context.getBean("a2");
		System.out.println(a2);
		
		Aadhar a3=(Aadhar)context.getBean("a3");
		System.out.println(a3);
		
		
		Aadhar a4=(Aadhar)context.getBean("a4");
		System.out.println(a4);
		
		
		
		IndianCitizen i1=(IndianCitizen)context.getBean("i1");
		System.out.println(i1);
		
		

	}

}
