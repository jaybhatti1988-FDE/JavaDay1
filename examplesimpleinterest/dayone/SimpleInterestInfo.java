package com.examplesimpleinterest.dayone;

import java.util.Scanner;

public class SimpleInterestInfo {
	
	private float principalAmount,rateOfInterest,timeInyears,simpleInterest;



	public void setPrincipalAmount(float principalAmount) {
		
		if(principalAmount<=0) {
			System.out.println("Principal Amount can't be negative & Zero" );
			return;
		}
		this.principalAmount = principalAmount;
	}

	public void setRateOfInterest(float rateOfInterest) {
		if(rateOfInterest<=0) {
			System.out.println("Rate of Interest can't be negative & Zero" );
			return;
		}
		this.rateOfInterest = rateOfInterest;
	}

	public void setTimeInyears(float timeInyears) {
		if(timeInyears<=0) {
			System.out.println("Time In Years can't be negative & Zero" );
			return;
		}
		this.timeInyears = timeInyears;
	}
	
	public void setSimpleInterest() {
		this.simpleInterest=(principalAmount*rateOfInterest*timeInyears)/100;
		
	}
	
	public void displaySimpleInterstDetails() {
		System.out.println("\n\n**********************************************");
		System.out.println("Principal Amount :-  " + principalAmount);
		System.out.println("Rate Of Interest :-  " +rateOfInterest);
		System.out.println("Time In years :-  " + timeInyears);
		System.out.println("Simple Interst :- " + simpleInterest);
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
		
	public float getPrincipalAmount() {
		return principalAmount;
	}
		
	public float getTimeInyears() {
		return timeInyears;
	}
	
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	
	public float getSimpleInterest() {
		return simpleInterest;
	}

}
