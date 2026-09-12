package com.insurancedetails.example.six;

import java.util.Scanner;

public class InsurancePolicy {
	
	private String policyHolderName;
	private long policyNumber,policyAmount;
	
	public void setPolicyHolderName(String policyHolderName) {
		if(policyHolderName==null || policyHolderName.trim().isEmpty()) {
			System.out.println("Oops...! Blank or null values are not allowed");
			return;
		}
		if(policyHolderName.length()<=0 || policyHolderName.length()>20) {
			System.out.println("Oops...! Blank or null values are not allowed");
			return;
	}
		if(policyHolderName.matches(".*\\d.*")) {
			System.out.println("Oops...! digits are not allowed in the name");
			return;
		}
		this.policyHolderName=policyHolderName;
	}
	
	public void setPolicyNumber(long policyNumber) {
		if(policyNumber<=0 || policyNumber>999999999) {
			System.out.println("Oops...! Negative,Zero or more than 9 digits are not allowed ");
			return;
		}
		this.policyNumber=policyNumber;
	}
	
	public void setPolicyAmount(long policyAmount) {
		if(policyAmount<=0 || policyAmount>999999999) {
			System.out.println("Oops...! Negative,Zero or more than 9 digits are not allowed ");
			return;
		}
		this.policyAmount=policyAmount;
	}
	
	public String readValidString(Scanner inputScan,String prompt) {
		while(true) {
			System.out.println(prompt);
			String inputString=inputScan.nextLine();
			if(inputString==null|| inputString.trim().isEmpty()) 
			{
				System.out.println("Oops...! Blank or null values are not allowed");
			}else{
			return inputString;	
			}	
		}
	}
	
	public Long readValidLong(Scanner inputScan,String prompt) {
		
		while(true) {
			System.out.println(prompt);
			if(inputScan.hasNextLong()) {
				return inputScan.nextLong();
			}
			else {
				System.out.println("Invalid Input...! Please Enter valid Value");
				inputScan.next();
			}
		}
	}
		
	
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	
	public long getPolicyNumber() {
		return policyNumber;
	}
	
	public long getPolicyAmount() {
		return policyAmount;
	}
}
