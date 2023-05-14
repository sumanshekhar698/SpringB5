package com.springb5.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Worker {
	
	@Autowired
	@Qualifier("a2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("a1")//More powerful
	public void setAddress(Address address) {
		System.out.println("Setter used");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Worker [address=" + address + "]";
	}

//	@Autowired
//	@Qualifier("a1")
	public Worker(Address address) {
		super();
		this.address = address;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

}

class Address {

	private String city;
	private int pin;
	private String state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(String city, int pin, String state) {
		super();
		this.city = city;
		this.pin = pin;
		this.state = state;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + ", state=" + state + "]";
	}

}
