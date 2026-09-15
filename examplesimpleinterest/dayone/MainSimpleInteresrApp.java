package com.examplesimpleinterest.dayone;

import java.util.Scanner;

public class MainSimpleInteresrApp {

	public static void main(String[] args) {
		
		SimpleInterestInfo simplInrst=new SimpleInterestInfo();
		
		try(Scanner inputIntstScan=new Scanner(System.in)){
			
			float principalAmount=simplInrst.readValidFloat(inputIntstScan, "Enter Principal Amount :- ");
			simplInrst.setPrincipalAmount(principalAmount);
			
			float rateOfInterest=simplInrst.readValidFloat(inputIntstScan, "Enter Rate of Interest :- ");
			simplInrst.setRateOfInterest(rateOfInterest);
			
			float timeInYears=simplInrst.readValidFloat(inputIntstScan, "Enter Time in Years :- ");
			simplInrst.setTimeInyears(timeInYears);
			

			simplInrst.setSimpleInterest();
			simplInrst.displaySimpleInterstDetails();
		}

	}

}
