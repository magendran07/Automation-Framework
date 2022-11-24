package Testng_basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Working_parameteres {
	@Parameters({"URL","product"})
	@Test
public void Demoweb(String abc,String def) {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(abc);
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys(def);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.close();
}
}