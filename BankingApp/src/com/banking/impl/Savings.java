package com.banking.impl;


public class Savings {
	
	private double interest;
	private static double savingsBalance;
	private double annualInterest;
	private static double totalDeposit;
	private static double totalWithdraws;
	
	private static Savings savings = null;
	
		private Savings(){
			interest = 5;
			savingsBalance = 0;
		}
		
		public static Savings getInstance(double amount){
			if(savings==null){
				savings = new Savings(amount);
			}
			return savings;
		}
		
		public Savings(double balance){
			interest = 5;
			savingsBalance = balance;
		}
		
		public double getBalance(){
			return savingsBalance;		
		}
		
		public void deposit(double amount){
			savingsBalance += amount;
			totalDeposit+= amount;
		}
		
		public void withdraw(double amount) throws Exception{
			
			totalWithdraws += amount;
			if(totalWithdraws > 100000){
				throw new Exception("Withdrawl limit exceed.");
			}else{
			savingsBalance -= amount;
				
			}
			
		}
		
		public double getTotalWithdraw(){
			return totalWithdraws;
		}
		
		public double getTotalDeposit(){
			return totalDeposit;
		}
		
	

}
