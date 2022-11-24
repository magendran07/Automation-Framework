package Selenium_PractiseHome;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import Framework_utility.Utility_Method;

public class Practise1 extends Base_Test{
	@DataProvider(name="LoginData")
	public Object[][] testdata() throws IOException{
		Object[][]data=Utility_Method.Get_test_data("Sheet2");
	return data;
	}
@Test(dataProvider="LoginData")
public void Login(String username,String password) {
	WebElement login=driver.findElement(By.linkText("Login"));
	Utility_Method.Click_Element(login);
	//switch to the child po up window
	WebElement page1=driver.findElement(By.className("_2MlkI1"));
	Actions page=new Actions(driver);
	String parent_window=driver.getWindowHandle();
	page.moveToElement(page1).build().perform();
	WebElement email1=driver.findElement(By.className("_2IX_2- VJZDxU"));
	Utility_Method.Enter_Value_In_Login(email1,username);
	WebElement code=driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
	Utility_Method.Enter_Value_In_Login(code,password);
	WebElement submit=driver.findElement(By.xpath("//input[@value='Log in']"));
	Utility_Method.Click_Element(submit);
//	WebElement logout=driver.findElement(By.className("ico-logout"));
//	Utility_Method.Click_Element(logout);  
}
}


