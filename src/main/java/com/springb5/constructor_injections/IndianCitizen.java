package com.springb5.constructor_injections;

public class IndianCitizen {
	private String name;
	private Aadhar aadharCard;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Aadhar getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(Aadhar aadharCard) {
		this.aadharCard = aadharCard;
	}

	public IndianCitizen(String name, Aadhar aadharCard) {
		super();
		this.name = name;
		this.aadharCard = aadharCard;
	}

	public IndianCitizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IndianCitizen [name=" + name + ", aadharCard=" + aadharCard + "]";
	}

}

class Aadhar {
	private int aadharNo;
	private String address;
	private String dob;

	public int getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Aadhar(int aadharNo, String address, String dob) {
		super();
		System.out.println("Aadhar parameterized called");
		this.aadharNo = aadharNo;
		this.address = address;
		this.dob = dob;
	}

	public Aadhar() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Aadhar [aadharNo=" + aadharNo + ", address=" + address + ", dob=" + dob + "]";
	}

}
