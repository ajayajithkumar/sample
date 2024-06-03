//login page
package TicketBooking;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TicketBookingExcel {
	//create a sheet
   public void sheetCreate() throws IOException {
	   File f=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\Email.xlsx");
	   FileInputStream fs=new FileInputStream(f);
	   XSSFWorkbook  x=new XSSFWorkbook();
	   Sheet s=x.createSheet("Mail");
	   //int r=s.getLastRowNum();
	 for(int i=0;i<1;i++) {
		   Row r=s.createRow(i);
		   for(int j=0;j<2;j++) {
			   Cell c=r.createCell(j);
	   System.out.println("created");
		   }
	   }
	 FileOutputStream fo=new FileOutputStream(f);
	 x.write(fo);
	 x.close();
   }
   //insert a value to (0,0),(0,1) cell
   public void login() throws IOException{
	   File f=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\Email.xlsx");
	   FileInputStream fs=new FileInputStream(f);
	   XSSFWorkbook  x=new XSSFWorkbook(fs);
	   Sheet s=x.getSheet("Mail");
	   s.getRow(0).getCell(0).setCellValue("aji664125@gmail.com");
	   s.getRow(0).getCell(1).setCellValue("ajay123@");
	  FileOutputStream fo=new FileOutputStream(f);
	   System.out.println("inserted");
	   x.write(fo);
	   x.close();
   }
   //insert a value and get that value by users
   public void insert(String email,String pass) throws IOException {
	   if(Check1(email)!=true) {
	   File f=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\Email.xlsx");
	   FileInputStream fs=new FileInputStream(f);
	  XSSFWorkbook x=new XSSFWorkbook(fs);
	   Sheet s=x.getSheet("Mail");
	 int a=s.getLastRowNum()+1;
	  Row r=s.createRow(a);
	   Cell c=r.createCell(0);
	   Cell c1=r.createCell(1);
	   s.getRow(a).getCell(0).setCellValue(email);
	   s.getRow(a).getCell(1).setCellValue(pass);
	   FileOutputStream f1=new FileOutputStream(f);
	   System.out.println("You Successfully Login!!");
	   x.write(f1);
	   x.close();
	   }
	   else {
		   System.out.println("the email id not available!!!!");
	   }
   }
   public void get()throws IOException {
	   File f=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\Email.xlsx");
	   FileInputStream fs=new FileInputStream(f);
	   XSSFWorkbook  x=new XSSFWorkbook(fs);
	   Sheet s=x.getSheet("Mail");
	   for(Row r:s) {
		   for(Cell c:r) {
			   System.out.println(c);
		   }
	   }
   }
   public boolean Check(String Email,String Pass)throws IOException {
	   boolean send=false;
	   File f=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\Email.xlsx");
	   FileInputStream fs=new FileInputStream(f);
	   XSSFWorkbook  x=new XSSFWorkbook(fs);
	   Sheet s=x.getSheet("Mail");
	   for(Row r:s) {
		   String mail=r.getCell(0).getStringCellValue();
		   String pass=r.getCell(1).getStringCellValue();
		   if(mail.equalsIgnoreCase(Email)&& pass.equalsIgnoreCase(Pass) ) {
			 send=true;
			 break;
		   }
	   }
	   return send;
   }
   public boolean Check1(String Email)throws IOException {
	   boolean send=false;
	   File f=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\Email.xlsx");
	   FileInputStream fs=new FileInputStream(f);
	   XSSFWorkbook  x=new XSSFWorkbook(fs);
	   Sheet s=x.getSheet("Mail");
	   for(Row r:s) {
		   String mail=r.getCell(0).getStringCellValue();
		   String pass=r.getCell(1).getStringCellValue();
		   if(mail.equalsIgnoreCase(Email)) {
			 send=true;
			 break;
		   }
	   }
	   return send;
   }
   //train Time Place(propertie file)
   public void TTP(String place) throws IOException {
	   
	   File f=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\TTP.properties");
	   FileInputStream r=new FileInputStream(f);
	   Properties p=new Properties();
	   p.load(r);
	   int i=1;
	   String get=p.getProperty(place);
	   String[] data=get.split(",");
	   for(String a:data) {
		   System.out.println(a+"\n");
	   }
	   
   }
   
	public static void main(String[] args) throws IOException{
       TicketBookingExcel t=new TicketBookingExcel();
       //t.sheetCreate();
      //t.login();
       //t.insert("ajaykumar31102003gmail.com","ajay123@");
      t.get();
      // t.TTP("trichy-chennai");
    }
}

