 package Selenium_Practise;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HTML_Alerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.google.com");
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightclick=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
	Actions click=new Actions(driver);
	click.doubleClick(rightclick).build().perform();
	Thread.sleep(2000);
	Alert a=driver.switchTo().alert();
	a.accept();
}
}
