package com.springb5.basics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// UPSC
//		Student s1 = new Student();// OLC Object Life Cycle
//		s1.setAge(23);
//		s1.setName("Jack Sparow");
//		System.out.println(s1);
//		s1 = null;

//				Spring beans are POJOs managed by spring
		String path = "com/springb5/basics/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);

		Student s2 = (Student) context.getBean("s2");
		System.out.println(s2);//IOC

		
		//Spring Infosys - 2.8 Lac
		// 10Lac
		//25Lacs
		
		Object o1 = context.getBean("s3");
		Student s3 = (Student) o1;
		System.out.println(s3.hashCode());
		s3.setAge(100);
		System.out.println(s3);
		
//		Student s4 = (Student) context.getBean("s4");//Dont ask a bean which you have not defined
		
		Student s3_2nd = (Student) context.getBean("s3");
		System.out.println(s3_2nd.hashCode());//By default Spring follows Singelton Pattern


	}

}
