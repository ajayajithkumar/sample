package Ticket;

import java.io.IOException;
import java.util.Scanner;
public class TTB extends HomePage {
public static void main(String args[]) throws IOException {
	TTB ttb=new TTB();
	System.out.println("\t\t\t\t\t\t    \"WELCOME TO TRAIN TICKET BOOKING\"\n ");
	System.out.println("\t\t\t\t\t\t\t\t -----");
	System.out.println("\t\t\t\t\t\t\t\t|LOGIN|");
	System.out.println("\t\t\t\t\t\t\t\t-----\n");
	System.out.println("\t\t\t\t\t\t\t\t-------");
	System.out.println("\t\t\t\t\t\t\t\t|SIGNUP| ");
	System.out.println("\t\t\t\t\t\t\t\t-------");
	System.out.println("=========================================================================================================================================================");
	System.out.println("Enter Your Choice");
	Scanner scan=new Scanner(System.in);
	String user=scan.nextLine();
if(user.equalsIgnoreCase("login")) {
	System.out.println("=========================================================================================================================================================");
	System.out.println("\t\t\t\t\t\t\tWELCOME TO LOGIN PAGE\n");
	  Login l=new Login();
	   l.log();
}else if(user.equalsIgnoreCase("signup")){
	System.out.println("=========================================================================================================================================================");
	System.out.println("\t\t\t\t\t\t\tWELCOME TO SIGN  UP PAGE\n");
	signUp s=new signUp();
	if(s.signup()==true){
	ttb.TicketBooking();
	}else {
		System.out.println("it's a wrong sign up ID");
	}
	
}
else {
	System.out.println("\t\t\t\tsorry you click wrong option!! ");
}
	}
}
