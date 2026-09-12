package com.ecommerce.example.seven;

import java.util.Scanner;

public class productdisplay {
	
	private String productName;
	private long price,quantity;

	public void setProductName(String productName) {
		
		if(productName == null || productName.trim().isEmpty()) {
			System.out.println("Oops...! Blank and null values not allowed");
			return;
		}
		
		this.productName = productName;
	}

	public void setPrice(long price) {
		if(price<=0) {
			System.out.println("Oops...! Negative and zero values are not allowed");
			return;
		}
		this.price = price;
	}

	public void setQuantity(long quantity) {
		if(quantity<=0) {
			System.out.println("Oops...! Negative and zero values are not allowed");
			return;
		}
		this.quantity = quantity;
	}
	
	public long calculateTotalPrice() {
		return price*quantity;
	}
	
	public float calculateDiscount() {
		float totalprice=calculateTotalPrice();
		if(totalprice>10000) {
			return totalprice*0.12f;
		}
		else if(totalprice>7000) {
			return totalprice*0.08f;
		}
		else if(totalprice>5000) {
			return totalprice*0.04f;
		}
		else {
			return 0;
		}	
	}
	
	public void DisplayProductDetails() {
		System.out.println("\n\n*********************************");
		System.out.println("Product Name : " + productName);
		System.out.println("Product Price : " + price );
		System.out.println("Product Quantity : " + quantity );
		System.out.println("Product Total Price : " + calculateTotalPrice());
		System.out.println("Product Total Discount : " +calculateDiscount());
		System.out.println("Product final Price :" +(calculateTotalPrice()-calculateDiscount()));
	}
	
	public String readValidString(Scanner inputScan,String prompt) {
		
		while(true) {
			System.out.println(prompt);
			String inputString=inputScan.nextLine();
			if(inputString==null || inputString.trim().isEmpty()) {
				System.out.println("Oops...! Blank and null Values are not allowed");
			}
			else {
				return inputString;	
			}
		}
	}
	
	public long readValidLong(Scanner inputScan,String prompt) {
		
		while(true) {
			System.out.println(prompt);
			if(inputScan.hasNextLong()) {
				long inputLong=inputScan.nextLong();
				if(inputLong<=0) {
					System.out.println("Oops...! Zero and negative Values are not allowed");
				}
				else {
					return inputLong;
				}
				
			}
			else {
				System.out.println("Enter valid Float Value");
				inputScan.next();
			}
		}
	}
	
	public long getPrice() {
		return price;
	}
	
	public long getQuantity() {
		return quantity;
	}
	
	public String getProductName() {
		return productName;
	}
	
	
}
