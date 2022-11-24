 package TestCases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Framework_utility.Base_Test;
import Framework_utility.Utility_Method;
public class Testng_login_demo extends Base_Test {
	@DataProvider(name="LoginData")
	public Object[][] testdata() throws IOException{
		Object[][]data=Utility_Method.Get_test_data("Sheet2");
	//data[0][0]="mahendranmahimahesh2008@gmail.com";
	//data[0][1]="mahesh12345";

	return data;
	}
@Test(dataProvider="LoginData")
public void Login(String username,String password) {
	WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
	Utility_Method.Click_Element(login);
	WebElement email1=driver.findElement(By.xpath("((//input[(@autocomplete='off')])[2]"));
	Utility_Method.Enter_Value_In_Login(email1,username);
	WebElement code=driver.findElement(By.xpath("//input[@type='password']"));
	Utility_Method.Enter_Value_In_Login(code,password);
	WebElement submit=driver.findElement(By.tagName("Login"));
	Utility_Method.Click_Element(submit);
	//WebElement logout=driver.findElement(By.className("ico-logout"));
	//Utility_Method.Click_Element(logout);  
}
}