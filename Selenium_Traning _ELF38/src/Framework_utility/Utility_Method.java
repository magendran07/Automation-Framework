package Framework_utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Utility_Method {
	public static  void Enter_Value_In_Login(WebElement element ,String value) {
		element.sendKeys(value);
	}
public static  void Click_Element(WebElement element) {
	element.click();
}
public static void Click() {
	Click();
}
public static void select_by_value(WebElement element,int value) {
	Select sel=new Select(element);
	sel.selectByIndex(value);
}
public static void select_by_value(WebElement element,String value) {
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public static void Select_drop_down(WebElement element,String value) {
	Select down=new Select(element);
	down.selectByVisibleText(value);
}
public static String Test_configuration() throws IOException{
	String filepath="./Test_configuration/Test_configuration.properties";
	FileInputStream fis=new FileInputStream(filepath);
	Properties prop=new Properties();
	prop.load(fis); 
String url=prop.getProperty("url");
       return url;
}	
public  static Object[][] Get_test_data (String sheetname) throws IOException {
	String filepath="./Testdata/Testdata.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
    Workbook book= new XSSFWorkbook (fis);
	Sheet sheet=book.getSheet(sheetname);
	int row_count=sheet.getPhysicalNumberOfRows();
	int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
    //System.out.println(row_count); 
    //System.out.println(col_count);
    Object[][]data=new Object[row_count-1][col_count];
	for(int row=1;row<=row_count-1;row++) {
    	for(int col=0;col<=col_count-1;col++) {
			data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
		}
    //	System.out.println(); 
	}
	book.close();
	//for(int i=0;i<=data.length-1;i++) {
	//for(int j=0;j<=data[i].length-1;j++) {
		//	System.out.println(data[i][j]);
		     //  }
		//}
	return data;
	}
public static void  Action_clause(WebElement element,WebDriver driver) {
	Actions action=new Actions(driver);
	action.moveToElement(element).build().perform();	
}
}



