package com.examplePolicyClaim.dayone;

import java.util.Scanner;

public class MainPolicyClainApp {

	public static void main(String[] args) {
		
		PolicyClaimSInfo policyinfo=new PolicyClaimSInfo();
		
		try(Scanner inputIntstScan=new Scanner(System.in)){
			
			float totalClaimsSettled=policyinfo.readValidFloat(inputIntstScan, "Enter Total Claims Settled :- ");
			policyinfo.setTotalClaimsSettled(totalClaimsSettled);
			
			float totalClaimsReceived=policyinfo.readValidFloat(inputIntstScan, "Enter Total Claims Received :- ");
			policyinfo.setTotalClaimsReceived(totalClaimsReceived);
			
			policyinfo.setCSR();
			policyinfo.displaySimpleInterstDetails();
		}

	}

}
