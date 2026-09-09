package com.basciexampletwo.numeric.BasicStrudentMarksheetOperation;

import java.util.Scanner;
public class StudenMarksheet {
	
	private String studentName;
	private int studentRollNumber,studentSub1,studentSub2,studentSub3;
	
	
	public void setStudentName(String studentName) {
		if(studentName==null || studentName.trim().isEmpty()) {
			System.out.println("Oops..! Student Name is Empty or null");
			return;
		}
		
		if(!studentName.matches("[a-zA-Z]+")) {
			System.out.println("Oops...! Studet Name is Invalid. Please enter valid Name");
			return;
		}
		this.studentName=studentName;
	}
	
	public void setStudentRollNumber(Integer studentRollNumber) {
		if(studentRollNumber<=0 || studentRollNumber==null) {
			System.out.println("Oops..! Student Roll Number Negative , Zero or null");
			return;
		}
		this.studentRollNumber=studentRollNumber;
	}
	
	
	public void setstudentSub1(Integer studentSub1) {
		if(studentSub1<=0 || studentSub1>100 ||studentSub1==null) {
			System.out.println("Oops..! Student marks Negative or null");
			return;
		}
		this.studentSub1=studentSub1;
		
	}
	
	public void setstudentSub2(Integer studentSub2) {
		if(studentSub2<=0 || studentSub2>100 ||studentSub2==null) {
			System.out.println("Oops..! Student marks Negative or null");
			return;
		}
		this.studentSub2=studentSub2;
		
	}	
	public void setstudentSub3(Integer studentSub3) {
		if(studentSub3<=0 || studentSub3>100 ||studentSub3==null) {
			System.out.println("Oops..! Student marks Negative or null");
			return;
		}
		this.studentSub3=studentSub3;
		
	}
	
	public String getstudentName() {
		return studentName;
	}
	
	public Integer getstudentRollNumber() {
		return studentRollNumber;
	}
	
	public Integer getstudentSub1() {
		return studentSub1;
	}
	
	public Integer getstudentSub2() {
		return studentSub2;
	}
	
	public Integer getstudentSub3() {
		return studentSub3;
	}
	
	public String readValidString(Scanner inputScan,String prompt) {
		while(true) {
			System.out.println(prompt);
			if(inputScan.hasNextLine()) {
				return inputScan.nextLine();
			}
			else {
				System.out.println("Invalid Input...! Please Enter a valid String Value");
				inputScan.next();
			}
		}
	}

}
