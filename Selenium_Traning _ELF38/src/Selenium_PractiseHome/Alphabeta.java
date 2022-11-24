package Selenium_PractiseHome;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alphabeta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 //driver.get(");
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.xpath("//label[@for='gender-female']")).click();
	driver.findElement(By.xpath("//input[@class='text-box single-line']")).sendKeys("pavi");
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("mahi");
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("ronaldomahendran@gmail.com");
	driver.findElement(By.xpath("//input[@class='text-box single-line password']")).sendKeys("1234mahi");
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("1234mahi");
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	driver.findElement(By.className("ico-logout")).click();
	driver.findElement(By.className("login")).click();
	driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("ronaldomahendran@gmail.com");//css
	driver.findElement(By.cssSelector("input[class='password']")).sendKeys("1234mahi");
	driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();//css
	//driver.findElement(By.)
		}
}