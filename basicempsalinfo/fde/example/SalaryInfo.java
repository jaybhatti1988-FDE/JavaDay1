package com.basicempsalinfo.fde.example;

import java.util.Scanner;

public class SalaryInfo {

	private float basicSalary, allowance, tax, finalSalary;

	public void setBasicSalary(float basicSalary) {
		if (basicSalary <= 0) {
			System.out.println("Basic Salary can't be negative & Zero");
			return;
		}
		this.basicSalary = basicSalary;
	}

	public void setAllowance(float allowance) {
		if (allowance < 0) {
			System.out.println("Allowance can't be negative");
			return;
		}
		this.allowance = allowance;
	}

	public void setTax(float tax) {
		if (tax < 0) {
			System.out.println("Tax can't be negative");
			return;
		}
		this.tax = tax;
	}

	public void setFinalSalary() {
		this.finalSalary = (basicSalary + allowance) - tax;
	}

	public void displaySalaryDetails() {
		System.out.println("\n\n**********************************************");
		System.out.printf("Basic Salary   :-  %.2f%n", basicSalary);
		System.out.printf("Allowance      :-  %.2f%n", allowance);
		System.out.printf("Tax Deducted   :-  %.2f%n", tax);
		System.out.printf("Final Monthly Salary :- ₹%.2f%n", finalSalary);
		System.out.println("**********************************************");
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

	public float getBasicSalary() { return basicSalary; }
	public float getAllowance() { return allowance; }
	public float getTax() { return tax; }
	public float getFinalSalary() { return finalSalary; }
}
