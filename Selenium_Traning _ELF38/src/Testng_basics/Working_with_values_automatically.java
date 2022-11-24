package Testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_with_values_automatically {
	@Test
	public void automaticall() throws IOException {
		String filepath="./Testdata/magendran1.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
	    Workbook book= new XSSFWorkbook (fis);
		Sheet sheet=book.getSheet("Sheet1");
    	int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
	    System.out.println(row_count); 
        System.out.println(col_count);
	    Object[][]data=new Object[row_count-1][col_count];
		for(int row=1;row<=row_count-1;row++) {
        	for(int col=0;col<=col_count-1;col++) {
				data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
			}
        	System.out.println();
		}
		for(int i=0;i<=data.length-1;i++) {
		for(int j=0;j<=data[i].length-1;j++) {
				System.out.println(data[i][j]);
			       }
			}
		}
}
