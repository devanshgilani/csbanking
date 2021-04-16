package com.banking.impl;

public class Current {
	

	
	private double interest;
	private static double savingsBalance;
	private double annualInterest;
	private static double totalDeposit;
	private static double totalWithdraws;
	
		public Current(){
			interest = 0;
			savingsBalance = 0;
		}
		
		public Current(double balance){
			interest = 0;
			savingsBalance = balance;
		}
		
		public double getBalance(){
			return savingsBalance;		
		}
		
		public void deposit(double amount){
			savingsBalance += amount;
			totalDeposit+= amount;
		}
		
		public void withdraw(double amount){
			savingsBalance -= amount;
			totalWithdraws += amount;
		}
		
		public double getTotalWithdraw(){
			return totalWithdraws;
		}
		
		public double getTotalDeposit(){
			return totalDeposit;
		}
		
	



}
