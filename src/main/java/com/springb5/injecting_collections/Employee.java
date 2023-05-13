package com.springb5.injecting_collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> coursesEnroled;// key : course Name | value : course Duration

	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> coursesEnroled) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.coursesEnroled = coursesEnroled;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", coursesEnroled="
				+ coursesEnroled + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCoursesEnroled() {
		return coursesEnroled;
	}

	public void setCoursesEnroled(Map<String, String> coursesEnroled) {
		this.coursesEnroled = coursesEnroled;
	}

}
