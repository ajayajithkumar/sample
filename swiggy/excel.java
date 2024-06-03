package swiggy;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
public class excel extends Thread{
	/* create sheet and create rows and columns*/
	File n=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\hotel.xlsx");
	XSSFWorkbook x=new XSSFWorkbook();
   Sheet s=x.createSheet("hotel");
	//public String[] a;
	public   void create() throws FileNotFoundException,IOException,InterruptedException{
		int i;
		for(i=0;i<6;i++){
			Row r=s.createRow(i);
			Cell c=r.createCell(0);		
		}
		
		FileOutputStream f=new FileOutputStream(n);
		x.write(f);
		x.close();
		System.out.println("row and column created");
	}
	
	
	
	/*set value to row and columns*/
	
	public void add()throws FileNotFoundException,IOException {
		FileInputStream i=new FileInputStream(n);
		XSSFWorkbook x=new XSSFWorkbook(i);
		Sheet s1=x.getSheet("hotel");
		//set data to hotel
		s1.getRow(0).getCell(0).setCellValue("nethra");
		s1.getRow(1).getCell(0).setCellValue("alifha");
		s1.getRow(2).getCell(0).setCellValue("saravanabavan");
		s1.getRow(3).getCell(0).setCellValue("hukeem");
		s1.getRow(4).getCell(0).setCellValue("kannappa");
		s1.getRow(5).getCell(0).setCellValue("thai-hotel");
		//set data to item
		/*s1.getRow(0).getCell(0).setCellValue("Chicken65");
		s1.getRow(0).getCell(1).setCellValue(80);
		s1.getRow(1).getCell(0).setCellValue("chicken-rice");
		s1.getRow(1).getCell(1).setCellValue(120);
		s1.getRow(2).getCell(0).setCellValue("chicken-biriyani");
		s1.getRow(2).getCell(1).setCellValue(150);
		s1.getRow(3).getCell(0).setCellValue("mutton-biriyani");
		s1.getRow(3).getCell(1).setCellValue(220);
		s1.getRow(4).getCell(0).setCellValue("vegan-biriyani");
		s1.getRow(4).getCell(1).setCellValue(200);
		s1.getRow(5).getCell(0).setCellValue("paneer-biriyani");
		s1.getRow(5).getCell(1).setCellValue(200);*/
		FileOutputStream f=new FileOutputStream(n);
		x.write(f);
		x.close();
		System.out.println("successfully run");
		
	} 
	
	//get excel file cell value and get that like a string.finally i store that into array and return to hotel1 class.
	public  String[] recevie() throws FileNotFoundException, IOException,InterruptedException  {
		//receive cell value from hotel xlsx file.
		String d=" ";
		File n=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\hotel.xlsx");
		FileInputStream in=new FileInputStream(n);
		XSSFWorkbook x=new XSSFWorkbook(in);
		Sheet s1=x.getSheetAt(0);
		int NOR=s1.getPhysicalNumberOfRows();//get number of rows into sheet
		for(int j=0;j<NOR;j++) {
			String c=s1.getRow(j).getCell(0).toString();
			d+=c+" "; //d is "" and c=. so d=d+c+space;again d=nethra+space+ alifha;......
		}
		String[] split=d.split(" ");
		return split;
	}	
	//receive items from item excel file
	public String[] receiveRate()throws FileNotFoundException,IOException,InterruptedException {
		//receive cell value from hotel xlsx file.
		String c ;
		String d=" ";
		File n=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\item.xlsx");
		FileInputStream in=new FileInputStream(n);
		XSSFWorkbook x=new XSSFWorkbook(in);
		Sheet s1=x.getSheet("items");
		int NOR=s1.getPhysicalNumberOfRows();//get number of rows into sheet
		for(int j=0;j<NOR;j++) {
			Row r=s1.getRow(j);
			c=r.getCell(0).toString();
			d+=c+" "; //d is "" and c=. so d=d+c+space;again d=nethra+space+ alifha;......
		}
		String[] split=d.split(" ");
		return split;
	}
	public void run() {
		
		excel e=new excel();
		try {
			e.recevie();
		} catch (IOException | InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
