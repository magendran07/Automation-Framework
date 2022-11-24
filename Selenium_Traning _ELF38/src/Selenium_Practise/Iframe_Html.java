package Selenium_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Html {
public static void main(String []args) {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Documents/Demo%20webpages/iframe.html");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	driver.findElement(By.className("ico-login")).click();
}

}
