package com.springb5.basics;

import org.springframework.context.annotation.Scope;

//@Scope("prototype")//take it as a assingment
public class Student {// POJO Class -Plain Old Java Object
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Student parameterized () called");
	}

	public void setName(String name) {//By default Spring does Setter Injection
		System.out.println("setName() called");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge() called");

		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Student () called");
	}

}
