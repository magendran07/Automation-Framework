package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_page {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("Ind");
		driver.findElement(By.xpath("//ul[@id='ui-id-1']")).click();
	}

}
