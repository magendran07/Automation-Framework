package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Register_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//label[@for='gender-female']")).click();
		driver.findElement(By.xpath("//input[@class='text-box single-line']")).sendKeys("pavi");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("mahi");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("pavithrapavi@gmail.com");
		driver.findElement(By.xpath("//input[@class='text-box single-line password']")).sendKeys("1234mahi");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("1234mahi");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}

}
