package com.BankExampleOne.FRDClass.DayOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBankAccountApp {

	public static void main(String[] args) {
	
		BankAccount bankaccnt=new BankAccount();
		try (Scanner inputScanner=new Scanner(System.in);){
	
			
			long accountNumber=bankaccnt.readValidLong(inputScanner, "Enter The Bank Account Number");
			bankaccnt.setBankAccountNumber(accountNumber);
			
			long balance=bankaccnt.readValidLong(inputScanner, "Enter The Bank Balance");
			bankaccnt.setBankBalance(balance);
			
			
			System.out.println("***********************************");
			System.out.println("Bank Account Number: "+bankaccnt.getAccountNumber());
			System.out.println("Bank Balance: "+bankaccnt.getBalance());
	}
	
	catch(InputMismatchException err) {
		System.out.println("Error : "+err.getMessage());
	}

	catch(ArithmeticException err) {
			System.out.println("Error : "+err.getMessage());
		}	
    }
}