package swiggy;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class hotel1 {
	static String[] get;
	public  void hot() throws FileNotFoundException, IOException, InterruptedException{
		excel h=new excel();
		String[] hotel = { "nethra", "alifha", "saravanabavan", "hukeem", "kannappa", "thai-hotel", "raja-kafe" };
		int i = 0;
		System.out.println(
				"...................................................Welcome To swiggy................................................................");
		while (i < hotel.length) {
			System.out.println(hotel[i]);
			i++;
		}
		//get data from users using scanner 
		Scanner user=new Scanner(System.in);
		System.out.println("===========================================================================================================================");
		System.out.println("please Enter Hotel:");
		String input=user.next();
		//get excel cell value from excel file like arraylist
		try {
		 get= h.recevie();
		List ge=Arrays.asList(get);
		if(ge.contains(input)) {
				 System.out.println("================================================================================================================");
				 System.out.println(input+" "+"hotel is available");
				 items.item();
		}
		else {System.out.println(" 'Hotel Is Unavailable'");}
		}catch(Exception e) {
			System.out.println("Sorry Unable to find hotel.");
			
		}
		  //get array value one by one 
		/*for(String hot:get) {
			if( hot.equalsIgnoreCase(input)) {	
			 System.out.println("================================================================================================================");
			 System.out.println(hot+" "+"hotel is available");
			 break;
			}
		}*/
	} 
	}


