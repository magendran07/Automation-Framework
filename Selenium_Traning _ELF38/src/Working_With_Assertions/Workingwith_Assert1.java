package Working_With_Assertions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Framework_utility.Utility_Method;

public class Workingwith_Assert1 extends Utility_Method  {
	@Test
	public static   void   assert1() {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe")	;
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement search1=driver.findElement(By.id("small-searchterms"));
	Utility_Method.Enter_Value_In_Login(search1,"mobiles");
	WebElement click_search=driver.findElement(By.xpath("//input[@value='Search']"));
	Utility_Method.Click_Element(click_search);
	//String validation=driver.findElement(By.id("Q"))
	//Hard Assert//
	/*String validation=driver.findElement(By.id("Q")).getAttribute("value");
	Assert.assertEquals(validation,"moblies");*/   
	//soft assert
	String title=driver.getTitle();
	SoftAssert ast=new SoftAssert();
	ast.assertEquals(title,"Demo Web Shop");
	driver.close();
	ast.assertAll();
	}
}
