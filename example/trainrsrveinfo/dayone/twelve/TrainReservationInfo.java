package com.example.trainrsrveinfo.dayone.twelve;

import java.util.Scanner;

public class TrainReservationInfo {
	
	private String trainName,trainNumber,passengerName,seatNumber;
	private float ticketPrice,totalTickets,totalTicketPrice;
	
	public void settrainName(String trainName) {
		
		if(trainName ==null || trainName.isEmpty()) {
			System.out.println("Train name can't be null or empty" );
			return;
		}		
		this.trainName = trainName;
	}
	
	public void settrainNumber(String trainNumber) {
		
		if(trainNumber ==null || trainNumber.isEmpty()) {
			System.out.println("Train Number can't be null or empty" );
			return;
		}		
		this.trainNumber = trainNumber;
	}
	
	public void setpassengerName(String passengerName) {
		
		if(passengerName ==null || passengerName.isEmpty()) {
			System.out.println("passenge rName can't be null or empty" );
			return;
		}		
		this.passengerName = passengerName;
	}
	
	public void setTicketPrice(float ticketPrice) {
		if(ticketPrice<=0  || ticketPrice>50000) {
			System.out.println("Train Ticket Price can't be negative,Zero or more premium Price" );
			return;
		}	
		this.ticketPrice = ticketPrice;
	}
	
	public void setTotalTickets(float totalTickets) {
		if(totalTickets<=0  || totalTickets>10000) {
			System.out.println("Train Total Tickets can't be negative,Zero or more premium Price" );
			return;
		}
		this.totalTickets = totalTickets;
	}
	
	public void setseatNumber(String seatNumber) {
		if(seatNumber ==null || seatNumber.isEmpty()) {
			System.out.println("Seat Number can't be null or empty" );
			return;
		}
		this.seatNumber = seatNumber;
	}
	
	public void setTotalTicketPrice(float totalTicketPrice) {
		this.totalTicketPrice = ticketPrice*totalTickets;
	}
	
	public void displayTrainReservationDetails() {
		System.out.println("\n\n*************************************************");
		System.out.println("Train Name : - " + trainName);
		System.out.println("Train Number : - " + trainNumber);
		System.out.println("Booking Ticket Passenger Name  : - " + passengerName);
		System.out.println("Train Seat Number :  " + seatNumber);
		System.out.println("Train Ticket Price : - " + ticketPrice);
		System.out.println("You have booked Total Train Tickets : - " + totalTickets);
		System.out.println("Total Reservation Ticket Price : - " + totalTicketPrice);
	}
	
	public String readValidString(Scanner inputScan, String message) {
		while(true) {
			System.out.println(message);
			 String line = inputScan.nextLine();
			if(line!=null && line.length()>0) {
				return line;
			}else {
				System.out.println("Invalid Input...! Please Enter valid value");
			}
		}
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
	
	/*public int readValidInteger(Scanner inputScan, String message) {
		while(true) {
			System.out.println(message);
			if(inputScan.hasNextInt()) {
				return inputScan.nextInt();
			}else {
				System.out.println("Invalid Input...! Please Enter valid value");
				inputScan.next();
			}
		}
	} */
	
	
	public String gettrainNumber() {
		return trainNumber;
	}
	
	public String getpassengerName() {
		return passengerName;
	}
	
	public String getseatNumber() {
		return seatNumber;
	}
		
	public String gettrainName() {
		return trainName;
	}
	
	public float getTicketPrice() {
		return ticketPrice;
	}
	
	public float getTotalTickets() {
		return totalTickets;
	}
	
	public float getTotalTicketPrice() {
		return totalTicketPrice;
	}
}
