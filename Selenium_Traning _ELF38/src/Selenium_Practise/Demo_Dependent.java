package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Dependent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).click(); 
	}

}
