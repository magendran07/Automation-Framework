package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Parse {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.get("https://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("Log")).click();
	
}
}
