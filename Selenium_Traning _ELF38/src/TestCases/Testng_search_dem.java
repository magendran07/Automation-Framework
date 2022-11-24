package TestCases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import Framework_utility.Utility_Method;
public class Testng_search_dem extends Base_Test{
@DataProvider(name="search")
	public Object[][] testdata() throws IOException{
		Object[][]data=Utility_Method.Get_test_data("Sheet4");
		//data[0][0]="laptop";
		return data;
}
@Test(dataProvider="search")
public void search(String material) {
	WebElement search1=driver.findElement(By.name("q"));
	Utility_Method.Enter_Value_In_Login(search1,material);
	WebElement click_search=driver.findElement(By.xpath("//input[@value='Search']"));
	Utility_Method.Click_Element(click_search);
	
}
}
