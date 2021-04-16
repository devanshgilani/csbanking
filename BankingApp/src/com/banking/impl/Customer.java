package com.banking.impl;

public class Customer {
	
	private String name;
	
	private String id;
	
	public Customer(String Name, String Id){
		name= Name;
		id= Id;
	}

	public Savings createSavingsAccount(double amount){
		Savings savings = Savings.getInstance(amount);
		return savings;
		
	}
	

	public Current createCurrentAccount(double balance){
		Current current = new Current(balance);
		return current;
		
	}

}
