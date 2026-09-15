package com.exampleCallculateAddCartItm.dayone;

import java.util.Scanner;

public class AddCartItemCalculation {
	
	private float Item1,Item2,Item3,totalAmount;



	public void setItem1One(float Item1) {
		
		if(Item1<=0) {
			System.out.println("Item 1 Value can't be negative & Zero" );
			return;
		}
		this.Item1 = Item1;
	}

	public void setItem2Two(float Item2) {
		
		if(Item2<=0) {
			System.out.println("Item 2 Value can't be negative & Zero" );
			return;
		}
		this.Item2 = Item2;
	}

	public void setItem3Three(float Item3) {
		
		if(Item3<=0) {
			System.out.println("Item 3 Value can't be negative & Zero" );
			return;
		}
		this.Item3 = Item3;
	}
	
	public void setTotalAmount() {
		this.totalAmount=Item1+Item2+Item3;
		
	}
	
	public void displayAddCartItemTotalCostDetails() {
		System.out.println("\n\n**********************************************");
		System.out.println("Item 1 :-  " + Item1);
		System.out.println("Item 2 :-  " +Item2);
		System.out.println("Item 3 :-  " + Item3);
		System.out.println("Total Cost :- " + totalAmount);
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
		
	public float getItem1One() {
		return Item1;
	}
		
	public float getItem2Two() {
		return Item2;
	}
	
	public float getItem3Three() {
		return Item3;
	}
	
	public float getTotalAmount() {
		return totalAmount;
	}

}
