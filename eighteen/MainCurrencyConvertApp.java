package com.Finance.basicexamples.numeric.eighteen;

import java.util.Scanner;

public class MainCurrencyConvertApp {

	public static void main(String[] args) {
		
		FinanceCurrency fincurncy=new FinanceCurrency(); 
		try(Scanner currencyScanner =new Scanner(System.in)){
			
			float indianCurrency=fincurncy.readValidFloat(currencyScanner, "Enter Amount :- ");
			fincurncy.setIndianCurrency(indianCurrency);
			
			fincurncy.displayDetails();
			
		}

	}

}
