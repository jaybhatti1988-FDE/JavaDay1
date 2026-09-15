package com.examplePolicyClaim.dayone;

import java.util.Scanner;

public class PolicyClaimSInfo {
	
	private float CSR,totalClaimsSettled,totalClaimsReceived;



	public void setTotalClaimsSettled(float totalClaimsSettled) {
		
		if(totalClaimsSettled<=0) {
			System.out.println("Total Claims Settled can't be negative & Zero" );
			return;
		}
		this.totalClaimsSettled = totalClaimsSettled;
	}

	public void setTotalClaimsReceived(float totalClaimsReceived) {
		if(totalClaimsReceived<=0) {
			System.out.println("Total Claims Received can't be negative & Zero" );
			return;
		}
		this.totalClaimsReceived = totalClaimsReceived;
	}

	
	
	public void setCSR() {
		this.CSR=(totalClaimsSettled/totalClaimsReceived)*100;
		
	}
	
	public void displaySimpleInterstDetails() {
		System.out.println("\n\n**********************************************");
		System.out.printf("Total Claims Settled :-  %.2f%n" , totalClaimsSettled);
		System.out.printf("Total Claims Received :-  %.2f%n" ,totalClaimsReceived);
		System.out.printf("Claim Settlement Ratio :- %.2f%%%n" , CSR ,"%");
	}
	
	public float readValidFloat(Scanner inputScan, String message) {
		while(true) {
			System.out.println(message);
			if(inputScan.hasNextFloat()) {
				float value=inputScan.nextFloat();
				inputScan.nextLine();
				return value;
			}else {
				System.out.println("Invalid Input...! Please Enter valid value");
				inputScan.next();
			}
		}
	}
		
	public float getTotalClaimsSettled() {
		return totalClaimsSettled;
	}
		
	public float getTotalClaimsReceived() {
		return totalClaimsReceived;
	}
	
	public float getCSR() {
		return CSR;
	}
	

}
