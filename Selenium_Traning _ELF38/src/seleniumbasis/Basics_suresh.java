package seleniumbasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_suresh {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.com");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.className("search-box-text")).sendKeys("Mobilephones");
		driver.findElement(By.className("class=button-1 search-box-button")).click();
}

}
