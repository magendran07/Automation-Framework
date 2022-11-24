package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Registername {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("LastName")).sendKeys("Mahi");
		driver.findElement(By.id("FirstName")).sendKeys("mahendran");
		driver.close();
	}

}
