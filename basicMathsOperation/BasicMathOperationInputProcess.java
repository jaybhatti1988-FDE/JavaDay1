package com.basicexamples.numeric.basicMathsOperation;

public class BasicMathOperationInputProcess {
	
	public float basicAddMathInput(float a, float b) {
		
		if(a<=0||b<=0) {
			throw new ArithmeticException("Oops..! Zero or Negative Values are not Allowed");
		}
		return a+b;
		}
	
public float basicSubMathInput(float a, float b) {
		
		if(a<=0||b<=0) {
			throw new ArithmeticException("Oops..! Zero or Negative Values are not Allowed");
		}
		return a-b;
		}

public float basicMulMathInput(float a, float b) {
	
	if(a<=0||b<=0) {
		throw new ArithmeticException("Oops..! Zero or Negative Values are not Allowed");
	}
	return a*b;
	}

public float basicDivInput(float a, float b) {
	
	if(a<=0||b<=0) {
		throw new ArithmeticException("Oops..! Zero or Negative Values are not Allowed");
	}
	return a/b;
	}

public float basicModInput(float a, float b) {
	
	if(a<=0||b<=0) {
		throw new ArithmeticException("Oops..! Zero or Negative Values are not Allowed");
	}
	return a%b;
	}

}
