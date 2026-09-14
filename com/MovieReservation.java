package com.basicExample.moviereservation.com;

import java.util.Scanner;

public class MovieReservation {
	
	private String movieName;
	private float ticketPrice,totalTickets,totalTicketPrice;
	
	public void setMovieName(String movieName) {
		
		if(movieName ==null || movieName.isEmpty()) {
			System.out.println("Movie name can't be null or empty" );
			return;
		}		
		this.movieName = movieName;
	}
	
	public void setTicketPrice(float ticketPrice) {
		if(ticketPrice<=0  || ticketPrice>50000) {
			System.out.println("Movie name can't be negative,Zero or more premium Price" );
			return;
		}	
		this.ticketPrice = ticketPrice;
	}
	
	public void setTotalTickets(float totalTickets) {
		if(ticketPrice<=0  || ticketPrice>10000) {
			System.out.println("Movie name can't be negative,Zero or more premium Price" );
			return;
		}
		this.totalTickets = totalTickets;
	}
	
	public void setTotalTicketPrice(float totalTicketPrice) {
		totalTicketPrice=ticketPrice*totalTickets;
		this.totalTicketPrice = totalTicketPrice;
	}
	
	public void displayMovieDetails() {
		System.out.println("\n\n*************************************************");
		System.out.println("Movie Name : - " + movieName);
		System.out.println("Movie Ticket Price : - " + ticketPrice);
		System.out.println("You have booked Total Tickets : - " + totalTickets);
		System.out.println("Total Ticket Price : - " + totalTicketPrice);
	}
	
	public String readValidString(Scanner inputScan, String message) {
		while(true) {
			System.out.println(message);
			if(inputScan.hasNextLine()) {
				return inputScan.nextLine();
			}else {
				System.out.println("Invalid Input...! Please Enter valid value");
				inputScan.nextLine();
			}
		}
	}
	
	public float readValidFloat(Scanner inputScan, String message) {
		while(true) {
			System.out.println(message);
			if(inputScan.hasNextFloat()) {
				return inputScan.nextFloat();
			}else {
				System.out.println("Invalid Input...! Please Enter valid value");
				inputScan.next();
			}
		}
	}
	
	public String getMovieName() {
		return movieName;
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
