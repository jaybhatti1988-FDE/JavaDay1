package com.BankExampleThress.FRDaClass.DayOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBankAccountApp {

	public static void main(String[] args) {
	
		BankAccount bankaccnt=new BankAccount();
		try (Scanner inputScanner=new Scanner(System.in);){
	
			
			long accountNumber=bankaccnt.readValidLong(inputScanner, "Enter The Bank Account Number");
			bankaccnt.setBankAccountNumber(accountNumber);

			String accountName=bankaccnt.readValidString(inputScanner, "Enter The Bank Account Holder Name");
			bankaccnt.setAccountHolderName(accountName);

			long balance=bankaccnt.readValidLong(inputScanner, "Enter The Bank Balance");
			bankaccnt.setBankInitialBalance(balance);
			
			long depositAmount=bankaccnt.getBankInitialBalance()+bankaccnt.readValidLong(inputScanner, "Enter Deposit Amount");
			bankaccnt.setBankInitialBalance(depositAmount);
			
			
			long withdrawAmount=bankaccnt.getBankInitialBalance()-bankaccnt.readValidLong(inputScanner, "Enter Withdraw Amount");
			bankaccnt.setBankInitialBalance(withdrawAmount);
			
			
			System.out.println("***********************************");
			System.out.println("Bank Account Number: "+bankaccnt.getAccountNumber());
			System.out.println("Account Holder Name: "+bankaccnt.getaccountHolderName());
			System.out.println("Current Account Balance: "+bankaccnt.getBankInitialBalance());		
			
	}
	
	catch(InputMismatchException err) {
		System.out.println("Error : "+err.getMessage());
	}

	catch(ArithmeticException err) {
			System.out.println("Error : "+err.getMessage());
		}	
    }
}