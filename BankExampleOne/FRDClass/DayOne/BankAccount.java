package com.BankExampleOne.FRDClass.DayOne;

import java.util.Scanner;

public class BankAccount {
	
	private long accountNumber,balance;
		
		public void setBankAccountNumber(Long accountNumber) {
			
			if(accountNumber<=0) {
				System.out.println("Oops...! Zero or Negative Values are not Allowed");
				return;
			}
			 this.accountNumber=accountNumber;
		}
		
		public void setBankBalance(Long balance) {
			
			if(balance<=0) {
				System.out.println("Oops...! Zero or Negative Values are not Allowed");
				return;
			}
			this.balance=balance;
		}	
		
		public long getAccountNumber() {
			return accountNumber;
		}
		
		public long getBalance() {
			return balance;
		}
		
		public long readValidLong(Scanner inputScan,String prompt) {
			
			while(true) {
				System.out.println(prompt);
				if(inputScan.hasNextLong()) {
					return inputScan.nextLong();
				}
				else {
					System.out.println("Invalid Input...! Please Enter a valid Long Value");
					inputScan.next();
				}
			}
			
		}
		
		

}
