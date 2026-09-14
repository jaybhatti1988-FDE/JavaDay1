package com.basicExample.moviereservation.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMovieTicketBookingApp {

	public static void main(String[] args) {
		
		MovieReservation movieresertion= new MovieReservation();
		
		try(Scanner inputScan = new Scanner(System.in)){
			String pictureName=movieresertion.readValidString(inputScan,"Enter Movie Name : -");
			movieresertion.setMovieName(pictureName);
			
			float pictureCost=movieresertion.readValidFloat(inputScan,"Enter Movie Ticket Price : -");
			movieresertion.setTicketPrice(pictureCost);
			
			float pictureTotalTickets=movieresertion.readValidFloat(inputScan,"Enter Movie Total Tickets : -");
			movieresertion.setTotalTickets(pictureTotalTickets);
			
			movieresertion.setTotalTicketPrice(pictureCost*pictureTotalTickets);
						
			movieresertion.displayMovieDetails();
		}
		

		catch(ArithmeticException e) {
			System.out.println("Error : - " + e.getMessage());
		}
		
		catch(InputMismatchException e) {
			System.out.println("Error : - " + e.getMessage());
		}
	}

}
