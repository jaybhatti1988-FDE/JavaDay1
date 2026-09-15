package com.exampleBankLoanEMI.dayone.FDE;

import java.util.Scanner;

public class MainBankEMICALApp {

	public static void main(String[] args) {
		
		BankLoanEMIInfo bankloaninfo=new BankLoanEMIInfo();
		
		try(Scanner inputIntstScan=new Scanner(System.in)){
			
			float principal=bankloaninfo.readValidFloat(inputIntstScan, "Enter Principal Amount :- ");
			bankloaninfo.setPrincipal(principal);
			
			float annualRate=bankloaninfo.readValidFloat(inputIntstScan, "Enter Annual Rate :- ");
			bankloaninfo.setAnnualRate(annualRate);
			
			float tenureRate=bankloaninfo.readValidFloat(inputIntstScan, "Enter Tenure Rate :- ");
			bankloaninfo.setTenureRate(tenureRate);
			
			bankloaninfo.setEMI();
			bankloaninfo.displayBasicBankEMICalculator();
		}

	}

}
