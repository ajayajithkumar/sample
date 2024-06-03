package Ticket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import TicketBooking.TicketBookingExcel;

public class HomePage {
public void TicketBooking() throws IOException {
	System.out.println("=========================================================================================================================================================");
	System.out.println("\t\t\t\t\t\t--WELCOME TO TICKET BOOKING HOME PAGE--\n\n");
	System.out.println("\t\t\t\t\t\t\t*Apply Ticket*\n");
	System.out.println("\t\t\t\t\t\t\t*Find(to know train timing)*\n");
	System.out.println("\t\t\t\t\t\t\t*Know(about train)*\n");
	System.out.println("=========================================================================================================================================================");
	System.out.println("Enter Option:");
	Scanner s=new Scanner(System.in);
	String option=s.nextLine();
	switch(option.toLowerCase()){
	case "apply ticket":
		try {
		System.out.println("DEPARTURE PLACE->");
		String departure=s.nextLine();
		System.out.println("DESTINATION PLACE<-");
		String destination=s.nextLine();
      TicketBookingExcel get=new TicketBookingExcel();
      get.TTP(departure+"-"+destination);
		}catch(Exception e) {
			System.out.println("please enter direction name correctly");
		}
		break;
	case "find":
		break;
	case "know":
		break;
		default:
			System.out.println("sorry you click Wrong option");
	}
}
public static void main(String ar[]) throws IOException {
	 HomePage h=new  HomePage();
	 h.TicketBooking();
}
}
