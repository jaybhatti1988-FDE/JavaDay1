package com.basicempsalinfo.fde.example;

import java.util.Scanner;

public class MainSalaryCalculationApp {

	public static void main(String[] args) {

		SalaryInfo salaryInfo = new SalaryInfo();

		try (Scanner inputScan = new Scanner(System.in)) {

			float basicSalary = salaryInfo.readValidFloat(inputScan, "Enter Basic Salary :- ");
			salaryInfo.setBasicSalary(basicSalary);

			float allowance = salaryInfo.readValidFloat(inputScan, "Enter Allowance :- ");
			salaryInfo.setAllowance(allowance);

			float tax = salaryInfo.readValidFloat(inputScan, "Enter Tax :- ");
			salaryInfo.setTax(tax);

			salaryInfo.setFinalSalary();
			salaryInfo.displaySalaryDetails();
		}
	}
}