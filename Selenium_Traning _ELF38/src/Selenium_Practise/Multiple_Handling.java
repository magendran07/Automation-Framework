package Selenium_Practise;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Multiple_Handling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement page=driver.findElement(By.linkText("Facebook"));
		Thread.sleep(2000);
		Actions page_down=new Actions(driver);
		Thread.sleep(2000);
		page_down.moveToElement(page).click().perform();
		//to get parent_window
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
	Thread.sleep(2000);
	Set<String>total_window=driver.getWindowHandles();
	System.out.println(total_window);
	
//	System.out.println(driver.getTitle());
	//we get access of both parent and child;
	 for(String child_window:total_window) {
		//driver.switchTo().window(child_window);
		 
		 System.out.println(driver.getTitle());
		 
		 //System.out.println(total_window);
	driver.switchTo().window(child_window);
 if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
	 driver.findElement(By.name("email")).sendKeys("mahimagendran@gmail.com");
	 driver.close();
 }
	 }
	 
	 driver.switchTo().window(parent_window);
	 driver.close();		
	}
}
