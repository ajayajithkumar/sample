package swiggy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class checkExcel {
	
 synchronized static void get() throws FileNotFoundException,IOException {
		File n=new File("C:\\Users\\Lenovo\\Downloads\\projectexcel\\item.xlsx");
		FileInputStream in=new FileInputStream(n);
		XSSFWorkbook x=new XSSFWorkbook(in);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter what would you like to have:");
		String user=s.next();
		Sheet s1= x.getSheet("items");
		int get=s1.getPhysicalNumberOfRows();
		for(int i=0;i<get;i++) {
			Row r=s1.getRow(i);
			Cell itemcell= r.getCell(0);
			Cell ratecell= r.getCell(1);
				if(itemcell!=null&&itemcell.getCellType()==CellType.STRING&& user.equalsIgnoreCase(itemcell.getStringCellValue())){
					if(ratecell!=null&&ratecell.getCellType()==CellType.NUMERIC)
					{
						System.out.println("Rate For"+itemcell+"\tis"+ratecell);					
					}					
				}
					}
			}
	public static void main(String ar[]) throws IOException {
		checkExcel.get();
		
	}
		}

