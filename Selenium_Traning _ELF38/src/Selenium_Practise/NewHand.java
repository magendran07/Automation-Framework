package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewHand {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.className("forcheckbox")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.cssSelector("input[class='text-box single-line']")).sendKeys("pavi");
		
	}

}
