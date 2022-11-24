package Selenium_Practise;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HTMLpage_close {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/Demo%20webpages/MultipleWindow.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		WebElement page1=driver.findElement(By.xpath("//input[contains(@value,'Open Food Sites')]"));
		Actions page=new Actions(driver);
		String parent_window=driver.getWindowHandle();
		page.moveToElement(page1).build().perform();
		Set<String>whole_window=driver.getWindowHandles();
		for(String child_window:whole_window) {
         System.out.println(child_window);
			//driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());		
	 }
if(driver.getTitle().equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food"));
		             driver.close();
	}
}
