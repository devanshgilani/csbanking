package com.banking.test;

import com.banking.impl.Current;
import com.banking.impl.Customer;
import com.banking.impl.Savings;

public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		
		Customer cust1 = new Customer("Devansh","1");
		
		
		Current current = cust1.createCurrentAccount(5000);
		Savings savings = cust1.createSavingsAccount(10000);
		
		current.deposit(4000);
		current.deposit(2000);
		savings.deposit(100000);
		savings.deposit(500000);
		
		current.withdraw(2000);
		savings.withdraw(30000);
		
		//Throws exception because withdraw now is > 1 lac
		try{
			savings.withdraw(75000);
		}
		catch(Exception e){
			System.out.println("Withdrawal limit exceeded");
		}
		
		
		
		//Current operations
		
		System.out.println("Current account balance is: "+current.getBalance());
		System.out.println("Current account total withdrawls: "+current.getTotalWithdraw());
		System.out.println("Current account total deposits: "+current.getTotalDeposit());
		
		
		//Savings operations
		System.out.println("Savings account balance is: "+savings.getBalance());
		System.out.println("Savings account total withdrawls: "+savings.getTotalWithdraw());
		System.out.println("Savings account total deposits: "+savings.getTotalDeposit());
		
		

	}

}
