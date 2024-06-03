package swiggy;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
public class items extends hotel1{
	static String input;
	public static void item() throws FileNotFoundException,IOException, InterruptedException{
		   System.out.println("\n\n");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
           System.out.println("\t\t\tMAIN FOOD\t\t\t\t\t\t\tBEVERAGES");
           System.out.println("-------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t1.CHICKEN65\t\t\t\t\t\t\t1.MILK-SHAKE");
        System.out.println("\t\t\t2.CHICKEN-RICE\t\t\t\t\t\t\t2.ICED-TEA");
        System.out.println("\t\t\t3.CHICKEN-BIRIYANI\t\t\t\t\t\t2.ORANGE-JUICE");
        System.out.println("\t\t\t4.MUTTON-BIRIYANI\t\t\t\t\t\t4.LEMON-TEA");
        System.out.println("\t\t\t5.VEGAN-BIRIYANI\t\t\t\t\t\t5.COFFEE"); 
        System.out.println("\t\t\t6.PANEER-BIRIYANI\n");
          Scanner user=new Scanner(System.in);
  		 System.out.println("===========================================================================================================================");
         System.out.println("Enter what would you life have:"); 
  		  input=user.next().toUpperCase();
  		//get excel cell value from excel file like arraylist
	
	}
}
