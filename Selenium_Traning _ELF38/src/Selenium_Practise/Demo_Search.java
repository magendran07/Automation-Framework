package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Search {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
	//driver.findElement(By.className("search-box-text")).sendKeys("Mobilephones");
	//driver.findElement(By.className("class=button-1 search-box-button")).click();
	//driver.findElement(By.cssSelector("a[href='/register']")).click();
	driver.findElement(By.cssSelector("a[href='/login']")).click();
	driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("magendranmagi2008@gmail.com");
	driver.findElement(By.cssSelector("input[class='password']")).sendKeys("mahesh2008");
	driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
	}

}
