package com.BankExampleThress.FRDaClass.DayOne;

import java.util.Scanner;

public class BankAccount {
	
	private long accountNumber,initialBalance;
	private String accountHolderName;
		
		public void setBankAccountNumber(Long accountNumber) {
			
			if(accountNumber<=0) {
				System.out.println("Oops...! Zero or Negative Values are not Allowed");
				return;
			}
			 this.accountNumber=accountNumber;
		}
		
		public void setBankInitialBalance(Long initialBalance) {
			
			if(initialBalance<=0) {
				System.out.println("Oops...! Zero or Negative Values are not Allowed");
				return;
			}
			this.initialBalance=initialBalance;
		}
		
		public void setAccountHolderName(String accountHolderName) {
			
			if(accountHolderName == null || accountHolderName.trim().isEmpty()) {
				System.out.println("Oops...! Zero or Negative Values are not Allowed");
				return;
			}
			if (accountHolderName.length()<=0 || accountHolderName.length()>20){
				System.out.println("Oops...! Name should not be Empty or more than 20 characters");
				return;
			}
			if(accountHolderName.matches(".*\\d.*")) {
				System.out.println("Oops...! Name should not contains any digits");
				return;
				
			}
			this.accountHolderName=accountHolderName;
			
		}
				
		public long getAccountNumber() {
			return accountNumber;
		}
		
		public long getBankInitialBalance() {
			return initialBalance;
		}
		
		public String getaccountHolderName() {
			return accountHolderName;
		}
		
		
		public long readValidLong(Scanner inputScan,String prompt) {
			
			while(true) {
				System.out.println(prompt);
				if(inputScan.hasNextLong()) {
					long value=inputScan.nextLong();
					inputScan.nextLine();
					return value;
				}
				else {
					System.out.println("Invalid Input...! Please Enter a valid Long Value");
					inputScan.next();
				}
			}
			
		}
		
public String readValidString(Scanner inputScan,String prompt) {
			
			while(true) {
				System.out.println(prompt);
				String line = inputScan.nextLine();
				if (line != null && !line.trim().isEmpty()) {
					return line;
				}else {
					System.out.println("Invalid Input...! Please Enter a valid Long Value");
				}
			}
			
		}
		
		

}
