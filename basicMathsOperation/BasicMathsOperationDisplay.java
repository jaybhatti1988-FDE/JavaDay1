package com.basicexamples.numeric.basicMathsOperation;

import java.util.Scanner;

public class BasicMathsOperationDisplay {
	
	private float a,b;
	
	public void basicMathOperationDisplay(Scanner basicMathsScanner) {
		
		a=readValidFloatValue(basicMathsScanner,"Enter Value A :");
		b=readValidFloatValue(basicMathsScanner,"Enter Value B :");
	}
	
	public float readValidFloatValue(Scanner basicMathsScanner,String Msg) {
		while(true) {
			System.out.println(Msg);
			try {
				return basicMathsScanner.nextFloat();
			}
			catch (Exception e) {
				
				System.out.println("Error : Please enter any valid Positive Number only");
				basicMathsScanner.nextLine();
			}
		}
		
	}
	
	public float inputa() {
		return a;
	}
	
	public float inputb() {
		return b;
	}

}
