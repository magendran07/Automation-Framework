package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_xPathRelative {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/xpath1.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input")).sendKeys("mahendran");
	driver.findElement(By.xpath("//input[2]")).sendKeys("magi");
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("tyss");
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("banglore");
}
	

}
