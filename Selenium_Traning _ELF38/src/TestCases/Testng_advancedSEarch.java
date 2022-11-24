package TestCases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Framework_utility.Base_Test;
import Framework_utility.Utility_Method;
public class Testng_advancedSEarch extends Base_Test{
	@DataProvider(name="Search")
	public Object[][] advance() throws IOException{
		Object[][]data=Utility_Method.Get_test_data("Sheet3");
	return data;
	}
@Test(dataProvider="Search")
public void Advance(String material,String options,String quantity,String from,String to) {
	WebElement search1=driver.findElement(By.xpath("//input[@name='q']"));
	Utility_Method.Enter_Value_In_Login(search1,material);
	
	WebElement search_click=driver.findElement(By.xpath("//input[@type='submit']"));
	Utility_Method.Click_Element(search_click);
	
	WebElement check_box=driver.findElement(By.id("As"));
	Utility_Method.Click_Element(check_box);
	
	WebElement drop=driver.findElement(By.id("Cid"));
	Utility_Method.Select_drop_down(drop,options);
	WebElement check_box1=driver.findElement(By.id("Isc"));
	Utility_Method.Click_Element(check_box1);
	WebElement middle=driver.findElement(By.name("Mid"));
	Utility_Method.Select_drop_down(middle,quantity);
	WebElement pricefrom=driver.findElement(By.className("price-from"));
	Utility_Method.Enter_Value_In_Login(pricefrom,from);
	 WebElement priceto=driver.findElement(By.id("Pt"));
	 Utility_Method.Enter_Value_In_Login(priceto,to);
	 WebElement check_box3=driver.findElement(By.name("Sid"));
	 Utility_Method.Click_Element(check_box3);
	 WebElement search2=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
	 Utility_Method.Click_Element(search2);
}
}