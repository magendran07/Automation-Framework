  package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement electronics=driver.findElement(By.xpath("//a[contains(text(),'Computers')][1]"));
	Actions mahi=new Actions(driver);
	mahi.moveToElement(electronics).build().perform();
	Thread.sleep(2000);
	mahi.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Notebooks')])[1]"))).click().perform();
}
}