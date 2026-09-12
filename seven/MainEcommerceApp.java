package com.ecommerce.example.seven;

import java.util.Scanner;

public class MainEcommerceApp {

	public static void main(String[] args) {
		
		
		productdisplay product=new productdisplay();
		
		try (Scanner prdScan=new Scanner(System.in)){
			String productName;
			while(true) {
				productName=product.readValidString(prdScan, "Enter the Product Name :- ");
				if (productName.matches("[a-zA-z]+")&& productName.length()<=20) {
					break;
				}
				System.out.println("Oops...! Enter valid name");
			}
			product.setProductName(productName);
			
			long productPri=product.readValidLong(prdScan, "Enter Product Price :-" );
			product.setPrice(productPri);
					
			
			long productQuantity=product.readValidLong(prdScan, "Enter Product Quantity :- ");
			product.setQuantity(productQuantity);
			
			product.DisplayProductDetails();
		}
	}

}
