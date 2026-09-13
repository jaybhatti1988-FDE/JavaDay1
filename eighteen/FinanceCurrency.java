package com.Finance.basicexamples.numeric.eighteen;

import java.util.Scanner;

public class FinanceCurrency {
	
	private Float indianCurrency;
	
	public void setIndianCurrency(Float indianCurrency) {
		if(indianCurrency==null || indianCurrency<=0) {
			System.out.println("Oops...! Negative and zero values are not allowed");
			return;
		}
		this.indianCurrency = indianCurrency;
	}
	
	public float convertToUsd() {
		return indianCurrency/91.74f;
	}
	
	public void displayDetails() {
		System.out.println("Your Indian Ruppes to Convert Usd dollar is " + convertToUsd());
	}

	public float readValidFloat(Scanner inputScan,String prompt) {
		while(true) {
			System.out.println(prompt);
			if(inputScan.hasNextFloat()) {
				return inputScan.nextFloat();
			}else {
				System.out.println("Invalid Input...! Please Enter valid Value");
				inputScan.next();
			}
		} 
	}
	public Float getIndianCurrency() {
		return indianCurrency;
	}
}
