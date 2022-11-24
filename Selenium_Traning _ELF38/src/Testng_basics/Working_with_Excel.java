package Testng_basics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class Working_with_Excel {
 @Test
public void Working_xslm () throws IOException {
			String filepath="./Testdata/Testdata.xlsx";
			FileInputStream fis=new FileInputStream(filepath);
			Workbook book=new XSSFWorkbook(fis);
			Sheet sheet=book.getSheet("Sheet1");
			String value=sheet.getRow(0).getCell(0).getStringCellValue();
			String value1=sheet.getRow(0).getCell(1).getStringCellValue();
			System.out.println(value1);		
			int rowcount=sheet.getPhysicalNumberOfRows();
			int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println(rowcount);
			System.out.println(col_count);
			}
}