package Testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_withthe_Iteration {
   @DataProvider(name="TestData")
   	public Object [] [] testData() {
	   Object [] [] data=new Object[3][3];
	   data[0][0]="Mahenndran";
	   data[0][1]="Mahi";
	   data[0][2]="magendranmagi200811@gmail.com";
return data;
   }
@Test(dataProvider="TestData")
public void testdataRegister(String firstname,String Lastname,String Email) {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.name("FirstName")).sendKeys(firstname);
	driver.findElement(By.name("LastName")).sendKeys(Lastname);
	driver.findElement(By.id("Email")).sendKeys(Email);
	
	
}
}
