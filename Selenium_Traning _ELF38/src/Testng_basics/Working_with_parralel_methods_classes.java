package Testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_parralel_methods_classes { 	
	@Test(invocationCount =4,threadPoolSize =4)
	public void Demoweb() {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("mobiles");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.close();
}
}