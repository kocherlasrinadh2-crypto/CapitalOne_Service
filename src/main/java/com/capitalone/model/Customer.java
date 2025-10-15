package com.capitalone.model;

public class Customer {

	// access specifier datatype name-variable declaration
	private Long customerId;
	private String Name;
	private String Address;
	private int phoneNumber;
	private String email;
	private boolean status;
	private double balance;

	/*
	 * access specifiers
	 * 
	 * private-the scope exists only in the class public-the scope exists entire
	 * application protected-the scope is to access only inside package default-is
	 * same as public
	 * 
	 * 
	 * datatypes
	 * 
	 * int char string float boolean long double byte short
	 * 
	 * Wrapper Classes-can be used to typecase
	 * 
	 * INTEGER LONG
	 * 
	 * Constructor
	 * 
	 * is a method have a same name of class name it is need when we call the
	 */

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Long customerId) {
		// TODO Auto-generated constructor stub
		this.customerId = customerId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
