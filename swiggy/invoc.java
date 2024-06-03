package swiggy;
 import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
public  class  invoc extends items{
    static int rate,rate1,rate2,rate3;
    public static void rate() throws FileNotFoundException,IOException,InputMismatchException, InterruptedException{
    	int get1=0;
    	excel h=new excel();
  		String[] get=h.receiveRate();
  		List s=Arrays.asList(get);
  		Map<String,Integer> h1=new HashMap<>();
		h1.put("chicken65",80);
  	    h1.put("chicken-rice",130);
  	    h1.put("chicken-biriyani",180);
  	    h1.put("mutton-biriyani",220);
  	    h1.put("vegan-biriyani",150);
  	    h1.put("paneer-biriyani",150);
  		  //get array value one by one 
  		for( String hot1:get) {
  			if( hot1.equalsIgnoreCase(items.input)) {			
  			 System.out.println("================================================================================================================\n");
  			 System.out.println(hot1+" "+"Item is available\n\n");
  			 for(String key:h1.keySet()) {
  				 if(key.equalsIgnoreCase(hot1)) {
  					get1= h1.get(key);
  					break;
  				 }
  			 }
  	        }
  			 }
    	Scanner inv=new Scanner(System.in);
         LocalDate d=LocalDate.now();
    	try{	
    switch(items.input.toUpperCase()){
        case "CHICKEN65":
            int gram=0;
            try{
            System.out.println("PLEASE ENTER GRAM IN NUMBERS. for ex::50,100");
            gram=inv.nextInt();
             }catch(Exception e){
            System.out.println("error");}
            if(gram>=50&&(gram%50)==0){
 try{
           System.out.println("PLEASE ENTER NUMBER OF ITEM:");
           int NOI=inv.nextInt();
             rate=get1*(gram/50*NOI);//NOI MEANS NUMBER OF ITEMS
              System.out.println("============================================================================================================================");
             System.out.println("\t\t\t\t\t\tPAY  BILL ON COUNTER->");
             System.out.println(d);
             System.out.println(d.getDayOfWeek()+"\n\n");
        System.out.println("\t\t\tItem Amount::"+rate);
          System.out.println("\t\t\tNumber Of Item:"+NOI);
              System.out.println("\t\t\tGrams:"+gram);
        tax();}
         catch(Exception e){
            System.out.println("Enter Value In Numbers Only");
            }
            }
            else{ 
            System.out.println("Please Enter Grams Above 50 'TRY AGAIN' And then Enter Only Value Like 50,100.Don't Like 50g,100g");
            }
           break;
        case "CHICKEN-RICE":
            int kg=0;
            try{
             System.out.println("PLEASE ENTER 'kg' IN NUMBERS for ex::1kg,2kg");
            kg=inv.nextInt();
            }
            catch(Exception e){
            System.out.println("error");
            }
            if(kg>=0){
                try{
            System.out.println("PLEASE ENTER NUMBER OF ITEM:");
            int NOI1=inv.nextInt();
            rate1=get1*(kg*NOI1);
             System.out.println("============================================================================================================================");
             System.out.println("\t\t\t\t\t\tPAY  BILL ON COUNTER->");
             System.out.println(d);
             System.out.println(d.getDayOfWeek()+"\n\n");
            System.out.println("\t\t\tItem Amount::"+rate1);
               System.out.println("\t\t\tNumber Of Item:"+NOI1);
              System.out.println("\t\t\tKilogram:"+kg);
            tax();
                }
             catch(Exception e){
                System.out.println("*");
            System.out.println("Enter Value In Numbers Only");
            }
                }
            else{
                System.out.println("*");
            System.out.println("Sorry You Click Wrong  Value");
            }
            break;
             case "CHICKEN-BIRIYANI":
           int kg1=0;
                 try{  
           System.out.println("PLEASE ENTER 'kg' IN NUMBERS for Ex::1kg,2kg");
           kg1=inv.nextInt();
             }
            catch(Exception e){
                System.out.println("*");
            System.out.println("error");
            }
           if(kg1>=1){
               try{
            System.out.println("PLEASE ENTER NUMBER OF ITEM:");
           int  NOI2=inv.nextInt();
             rate2=get1*(kg1*NOI2);
              System.out.println("============================================================================================================================");
             System.out.println("\t\t\t\t\t\tPAY  BILL ON COUNTER->");
             System.out.println(d);
             System.out.println(d.getDayOfWeek()+"\n\n");
             System.out.println("\t\t\tItem Amount::"+rate2);
                System.out.println("\t\t\tNumber Of Item:"+NOI2);
              System.out.println("\t\t\tKilogram:"+kg1);
             tax();
               }
                catch(Exception e){
                System.out.println("*");
            System.out.println("Enter Value In Numbers Only");
            }
              }
            else{
               System.out.println("*");
            System.out.println("Sorry You Click Wrong  Value");
            }
            break;
             case "MUTTON-BIRIYANI":
            int kg3=0;
          try{
            System.out.println("PLEASE ENTER 'kg'IN NUMBERS for ex::1kg,2kg");
             kg3=inv.nextInt();
              }
            catch(Exception e){
                System.out.println("*");
            System.out.println("Enter kg in Number");
            }
          if(kg3>=1){
              try{
            System.out.println("PLEASE ENTER NUMBER OF ITEM:");
           int NOI3=inv.nextInt();
             rate3=get1*(kg3*NOI3);
             System.out.println("============================================================================================================================");
             System.out.println("\t\t\t\t\t\tPAY  BILL ON COUNTER->");
               System.out.println(d);
             System.out.println(d.getDayOfWeek()+"\n\n");
             System.out.println("\t\t\tItem Amount:"+rate3);
                System.out.println("\t\t\tNumber Of Item:"+NOI3);
              System.out.println("\t\t\tKilogram:"+kg3);
             tax();
              }
               catch(Exception e){
            System.out.println("Enter Value In Numbers Only");
            }
          }
            else{
            System.out.println("Sorry You Click Wrong Value");
            }
            break;
    }
    }
      catch(NumberFormatException e){
        System.out.println("\n\"You Click Wrong Option\"\n");
        }
  	
    }
    public static void tax()throws  FileNotFoundException,IOException{
        try{
    invoc t=new invoc();
    int tax[]={t.rate/30,t.rate1/20,t.rate2/20,t.rate3/15};
    if(tax[0]!=0.0){
    System.out.println("\t\t\tGST  Is:"+tax[0]);
     System.out.println("\t\t\t-----------------");
     System.out.println("\t\t\tTOTAL AMOUNT:"+(rate+tax[0]));
    }
    else if(tax[1]!=0.0){
    System.out.println("\t\t\tGST  Is:"+tax[1]);
     System.out.println("\t\t\t-----------------");
    System.out.println("\t\t\tTOTAL AMOUNT:"+(rate1+tax[1]));
    }
    else if(tax[2]!=0.0){
    System.out.println("\t\t\tGST  Is:"+tax[2]);
     System.out.println("\t\t\t-----------------");
    System.out.println("\t\t\tTOTAL AMOUNT:"+(rate2+tax[2]));
    }
    else if(tax[3]!=0.0){
    System.out.println("\t\t\tGST  Is:"+tax[3]);
     System.out.println("\t\t\t-----------------");
    System.out.println("\t\t\tTOTAL AMOUNT:"+(rate3+tax[3]));
    }
    else{
    System.out.println("it has no GST");
    }    
        }
        catch(Exception e){
        
        System.out.println("Something went Wrong");
        }
    }
}


