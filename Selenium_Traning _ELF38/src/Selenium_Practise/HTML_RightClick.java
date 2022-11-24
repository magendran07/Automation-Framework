  package Selenium_Practise;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HTML_RightClick {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	WebElement rightclick=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
	Actions mahi=new Actions(driver);
	//rightclick.click();
	Thread.sleep(2000);
	List<WebElement>copyclick=driver.findElements(By.xpath("//span[text()='Edit']/../../li/span"));
	for(int i=0;i<copyclick.size();i++) {
		mahi.contextClick(rightclick).build().perform();
		Thread.sleep(2000);
		copyclick.get(i).click();
		Alert a=driver.switchTo().alert();
		a.accept();
	
	}
	
}
}
