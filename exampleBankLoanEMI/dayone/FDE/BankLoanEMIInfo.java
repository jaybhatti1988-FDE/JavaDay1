package com.exampleBankLoanEMI.dayone.FDE;

import java.util.Scanner;

public class BankLoanEMIInfo {

	private float principal, annualRate, tenureRate, emi;

	public void setPrincipal(float principal) {
		if (principal <= 0) {
			System.out.println("Principal Amount can't be negative & Zero");
			return;
		}
		this.principal = principal;
	}

	public void setAnnualRate(float annualRate) {
		if (annualRate <= 0) {
			System.out.println("Annual Rate can't be negative & Zero");
			return;
		}
		this.annualRate = annualRate;
	}

	public void setTenureRate(float tenureRate) {
		if (tenureRate <= 0) { // fixed: check correct field
			System.out.println("Tenure Rate can't be negative & Zero");
			return;
		}
		this.tenureRate = tenureRate;
	}

	public void setEMI() {
		float monthlyRate = (annualRate / 12) / 100; // convert annual % to monthly decimal
		float tenureMonths = tenureRate * 12; // convert years to months

		this.emi = (float) ((principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths))
				/ (Math.pow(1 + monthlyRate, tenureMonths) - 1));
	}

	public void displayBasicBankEMICalculator() {
		System.out.println("\n\n**********************************************");
		System.out.printf("Principal Amount :-  %.2f%n", principal);
		System.out.printf("Annual Interest Rate :-  %.2f%%%n", annualRate);
		System.out.printf("Tenure :-  %.2f years%n", tenureRate);
		System.out.printf("Monthly EMI :- ₹%.2f%n", emi);
	}

	public float readValidFloat(Scanner inputScan, String message) {
		while (true) {
			System.out.println(message);
			if (inputScan.hasNextFloat()) {
				float value = inputScan.nextFloat();
				inputScan.nextLine();
				return value;
			} else {
				System.out.println("Invalid Input...! Please Enter valid value");
				inputScan.next();
			}
		}
	}

	public float getPrincipal() {
		return principal;
	}

	public float getAnnualRate() {
		return annualRate;
	}

	public float getTenureRate() {
		return tenureRate;
	}

	public float getEMI() {
		return emi;
	}
}