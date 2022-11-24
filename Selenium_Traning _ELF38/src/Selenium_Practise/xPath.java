package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/xpath1.html");
		driver.findElement(By.xpath("/html/body/div/input")).sendKeys("mahendran");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("mahi");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("Test Yantra");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Bangalore");
		
	}

}
