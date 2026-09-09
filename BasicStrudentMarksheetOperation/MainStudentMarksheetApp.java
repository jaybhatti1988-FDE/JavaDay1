package com.basciexampletwo.numeric.BasicStrudentMarksheetOperation;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MainStudentMarksheetApp {

	public static void main(String[] args) {
		
		StudenMarksheet marksheet=new StudenMarksheet();
		
		try(Scanner ScanMarks=new Scanner(System.in);){
			
			System.out.print("Enter The Student Name :- ");
			String studentName=ScanMarks.nextLine();
			marksheet.setStudentName(studentName);
			
			System.out.print("Enter The Student Roll Number :- ");
			Integer studentRollName=ScanMarks.nextInt();
			marksheet.setStudentRollNumber(studentRollName);
			
			System.out.print("Enter The Student Maths Marks :- ");
			Integer studentSub1=ScanMarks.nextInt();
			marksheet.setstudentSub1(studentSub1);
			
			System.out.print("Enter The Student Science Marks :- ");
			Integer studentSub2=ScanMarks.nextInt();
			marksheet.setstudentSub1(studentSub2);
			
			System.out.print("Enter The Student English Marks :- ");
			Integer studentSub3=ScanMarks.nextInt();
			marksheet.setstudentSub3(studentSub3);
			
			float totalMarks=studentSub1+studentSub2+studentSub3;
			float AvarageMarks=totalMarks/3;
			
			if(totalMarks>300 || totalMarks<0 ||AvarageMarks>100 || AvarageMarks<0) {
				System.out.println("Oops...! Invalid Marks & Average.");
				return;
			}
			
			if(AvarageMarks>=40) {
				System.out.println("***********************************");
				System.out.println("Student Name : "+ marksheet.getstudentName());
				System.out.println("Student Roll No : "+ marksheet.getstudentRollNumber());
				System.out.println("Student Total : "+ totalMarks);
				System.out.println("Student Average :  "+ String.format("%.2f", AvarageMarks));
				System.out.println("Student Result : Pass");
				
			}
			else {
			System.out.println("***********************************");
			System.out.println("Student Name : "+ marksheet.getstudentName());
			System.out.println("Student Roll No : "+ marksheet.getstudentRollNumber());
			System.out.println("Student Total : "+ totalMarks);
			System.out.println("Student Average :  "+ String.format("%.2f", AvarageMarks));
			System.out.println("Student Result : Fail");
			}
			
		}
		
		catch(ArithmeticException err) {
			System.out.println("Error :" +err.getMessage());
		}
		
		catch(InputMismatchException err ) {
			System.out.println("Error :" +err.getMessage());
		}

	}

}
