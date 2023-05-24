package com.springb5.jdbc.crud;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

//				Spring beans are POJOs managed by spring
		String path = "com/springb5/jdbc/crud/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		StudentDAOImpl studentDAOImplBean = context.getBean("studentDaoImpl", StudentDAOImpl.class);

//		int insertedRows = studentDAOImplBean.insert(new Student(99, "Jackson", "Florida"));
//		System.out.println(insertedRows);
		
		
		
		Student s100 = studentDAOImplBean.getSingleStudent(100);
		System.out.println(s100);
		
		
		studentDAOImplBean.update(new Student(s100.getId(), s100.getName(), "Varanasi"));
		
		Student s100_updated = studentDAOImplBean.getSingleStudent(100);
		System.out.println(s100_updated);
		
//		studentDAOImplBean.de

	}

}
