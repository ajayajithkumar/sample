package Ticket;
import java.io.IOException;
import java.util.Scanner;
import TicketBooking.TicketBookingExcel;
public class signUp {

	public boolean signup() throws IOException {
		boolean send=false;
		System.out.println("enter your Email");
		Scanner s=new Scanner(System.in);
		String email=s.nextLine();
		System.out.println("enter your Email:");
		String pass=s.nextLine();
		TicketBookingExcel t= new TicketBookingExcel();
		if(t.Check(email,pass)==true) {
			send=true;
			}
		return send;
		}
}
