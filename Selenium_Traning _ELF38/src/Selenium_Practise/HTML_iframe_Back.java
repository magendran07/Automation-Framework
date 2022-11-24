package Selenium_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

abstract class HTML_iframe_Back {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Documents/Demo%20webpages/iframe.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.switchTo().frame("frame1");
	WebElement frame=driver.findElement(By.id("FR1"));
	driver.findElement(By.id("small-searchterms")).sendKeys("Books");
	driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()='Google']")).click();
	}
}
