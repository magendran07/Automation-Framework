package Selenium_Practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multile_demoWeb_shop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement page1=driver.findElement(By.linkText("Facebook"));
		Actions page=new Actions(driver);
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		page.moveToElement(page1).click().perform();
		////////
		Thread.sleep(2000);
		
	Set<String>whole_window=driver.getWindowHandles();
	for(String child_window:whole_window) {
		//System.out.println(child_window);
		Thread.sleep(2000);
	}
		driver.switchTo().window(parent_window);
		System.out.println(driver.getTitle());
		if(driver.getTitle().equalsIgnoreCase("Demo Web Shop")) {
			driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		}
		
		
	
		
		
	}

	
	}


