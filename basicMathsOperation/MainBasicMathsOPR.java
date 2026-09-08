package com.basicexamples.numeric.basicMathsOperation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBasicMathsOPR {

	public static void main(String[] args) {
		BasicMathsOperationDisplay basicmath=new BasicMathsOperationDisplay();
		BasicMathOperationInputProcess basicprocess=new BasicMathOperationInputProcess();
		
		try (Scanner inputScan=new Scanner(System.in)){
			
			basicmath.basicMathOperationDisplay(inputScan);
			
			float a=basicmath.inputa();
			float b=basicmath.inputb();
			
			float Addresult=basicprocess.basicAddMathInput(a, b);
			float Subresult=basicprocess.basicSubMathInput(a, b);
			float Mulresult=basicprocess.basicMulMathInput(a, b);
			float Divresult=basicprocess.basicDivInput(a, b);
			float Modresult=basicprocess.basicModInput(a, b);
			
			System.out.println(a +"+"+ b +" = "+ Addresult);
			System.out.println(a +"-"+ b +" = "+ Subresult);
			System.out.println(a +"*"+ b +" = "+ Mulresult);
			System.out.println(a +"/"+ b +" = "+ Divresult);
			System.out.println(a +"%"+ b +" = "+ Modresult);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Error : "+ e.getMessage());
		}
		
		catch (InputMismatchException e) {
			System.out.println("Error : "+ e.getMessage());
		}
		
		
	}

}
