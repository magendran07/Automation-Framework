 package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependant {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("(//table)[1]/tbody/tr[11]/td[3]")).click();
		driver.findElement(By.xpath("(//input)[4]/parent::fieldset/following-sibiling::legend")).click();
	}

}
