package com.insurancedetails.example.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainInsuranceApp {

	public static void main(String[] args) {
		
		InsurancePolicy policy=new InsurancePolicy();
		
		try(Scanner policyScanner=new Scanner(System.in)){
			
			String policyHolderName;
			while(true){
			policyHolderName =policy.readValidString(policyScanner,"Enter the Policy Holder Name :- ");
			if(policyHolderName.matches("[a-zA-Z]+")&& policyHolderName.length()<=20){
				break;
			}
			System.out.println("oops...! Enter valid name ");
			}
			policy.setPolicyHolderName(policyHolderName);
			
			long policyNumber=policy.readValidLong(policyScanner, "Enter The Policy Number :- ");
			policy.setPolicyNumber(policyNumber);
			
			long policyAmount=policy.readValidLong(policyScanner, "Enter The Policy Amount :- ");
			policy.setPolicyAmount(policyAmount);
			
			System.out.println("\n\n***********************************");
			System.out.println("Policy Holder Name : " + policy.getPolicyHolderName());
			System.out.println("Policy Number : " + policy.getPolicyNumber());
			System.out.println("Policy Amount : ₹" + policy.getPolicyAmount());

	 }
		catch (ArithmeticException e) {
			System.out.println("Error : " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
