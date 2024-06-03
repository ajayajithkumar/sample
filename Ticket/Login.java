package Ticket;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

import TicketBooking.TicketBookingExcel;
public class Login{
	public void log()throws IOException{
		System.out.println("enter your Email");
		Scanner s=new Scanner(System.in);
		String email=s.nextLine();
		Pattern p=Pattern.compile("[a-z0-9]+@+gmail.com",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(email);
		if(m.find()) {
		TicketBookingExcel t= new TicketBookingExcel();
		System.out.println("enter password:");
		String pass=s.nextLine();
		t.insert(email,pass);
	}
		else {
			System.out.println("This is unvalide Email type.\"The Email Must Be LIke 'aji664125@gmail.com,must have 5 letter'\"The ");
		}
	}
}
