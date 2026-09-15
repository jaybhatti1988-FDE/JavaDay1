package com.example.trainrsrveinfo.dayone.twelve;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBasicTrainReservationInfoApp {

	public static void main(String[] args) {
		
		TrainReservationInfo reserveinfo=new TrainReservationInfo();
		
		try(Scanner inputScan = new Scanner(System.in)){
			String trainName=reserveinfo.readValidString(inputScan,"Enter Train Name : -");
			reserveinfo.settrainName(trainName);
			
			String trainNo=reserveinfo.readValidString(inputScan,"Enter Train Number : -");
			reserveinfo.settrainNumber(trainNo);
			
			String passengerName=reserveinfo.readValidString(inputScan,"Enter Name of Reserved Person : -");
			reserveinfo.setpassengerName(passengerName);
			
			float ticktPrice=reserveinfo.readValidFloat(inputScan,"Enter Price of Train Ticket : -");
			reserveinfo.setTicketPrice(ticktPrice);
			
			float totalTickt=reserveinfo.readValidFloat(inputScan,"Enter Number of Train Ticket/s : -");
			reserveinfo.setTotalTickets(totalTickt);
			
			String seatNo=reserveinfo.readValidString(inputScan, "Seat Number : ");
			reserveinfo.setseatNumber(seatNo);
			
			reserveinfo.setTotalTicketPrice(ticktPrice*totalTickt);
						
			reserveinfo.displayTrainReservationDetails();
		}
		

		catch(ArithmeticException e) {
			System.out.println("Error : - " + e.getMessage());
		}
		
		catch(InputMismatchException e) {
			System.out.println("Error : - " + e.getMessage());
		}
	}

}
