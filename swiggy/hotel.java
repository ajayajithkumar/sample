package swiggy;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.util.Properties;

public class hotel {
	static String get;

	public static void hot() throws FileNotFoundException, IOException{
		// try{
		String[] hotel = { "nethra", "alifha", "saravanabavan", "hukeem", "kannappa", "thai-hotel", "raja-kafe" };
		int i = 0;
		System.out.println(
				"............................These Hotels Are Only Available Now.Please Choose Any Of One:.............................");
		while (i < hotel.length) {
			System.out.println(hotel[i]);
			i++;
		}
		File f = new File("C:\\Users\\Lenovo\\Downloads\\sample\\available.properties");
		System.out.println(
				"==============================================================================================================================");
		// hotel given by users
		Scanner in = new Scanner(System.in);
		String user = in.next();
		FileInputStream fs = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fs);
		get = p.getProperty(user);// getProperty(nethra)
		if (get != null){
			System.out.println("Hotel Is " + get);
			if (get.equalsIgnoreCase("available")) {
				System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->WELCOME OUR" + " " + ""
						+ user.toUpperCase() + "<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
			} else {
				System.out.println("The Hotel Is Unavailable!!");
				System.out.println(
						"===============*===============*=================*=================*==================*================*=================*===========\n\n");
				hot();
			}
		} else {
			System.out.println("The Hotel Is Unavailable!!");
			System.out.println(
					"===============*===============*=================*=================*==================*================*=================*===========\n\n");
		}
		/*
		 * } catch(Exception e){
		 * System.out.println("Sorry You Choose Unknown Hotel Name!!"); }
		 */
	}

}

