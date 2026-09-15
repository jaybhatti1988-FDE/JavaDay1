package com.exampleCallculateAddCartItm.dayone;

import java.util.Scanner;

public class MainSimpleInteresrApp {

	public static void main(String[] args) {
		
		AddCartItemCalculation addcrttot=new AddCartItemCalculation();
		
		try(Scanner inputIntstScan=new Scanner(System.in)){
			
			float item1=addcrttot.readValidFloat(inputIntstScan, "Enter Item One :- ");
			addcrttot.setItem1One(item1);
			
			float item2=addcrttot.readValidFloat(inputIntstScan, "Enter Item Two :- ");
			addcrttot.setItem2Two(item2);
			
			float item3=addcrttot.readValidFloat(inputIntstScan, "Enter Item Three :- ");
			addcrttot.setItem3Three(item3);
			

			addcrttot.setTotalAmount();
			addcrttot.displayAddCartItemTotalCostDetails();
		}

	}

}
