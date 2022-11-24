package Testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class Working_with_excel_print { 
	@Test
public void  printing () throws IOException {
		
	String filepath="./Testdata/Testdata.xlsx"; 
	FileInputStream fis=new FileInputStream(filepath);
	Workbook book=new XSSFWorkbook(fis);
	Sheet sheet=book.getSheet("Sheet1");
	int rowcount=sheet.getPhysicalNumberOfRows();
	int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println(rowcount);
	Object[][]data=new Object [rowcount][col_count];
	for(int row=1;row<=rowcount-1;row++) { 
		for(int col=0;col<=col_count-1;col++) {
		System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
		}
	}
}
}
