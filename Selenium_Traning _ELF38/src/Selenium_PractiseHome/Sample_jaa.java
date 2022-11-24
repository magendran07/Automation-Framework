package Selenium_PractiseHome;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Sample_jaa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select sele=new Select(ele);
		sele.selectByVisibleText("Option1");
		//multipleHandles
		WebElement tab=driver.findElement(By.id("openwindow"));
		Actions action=new Actions(driver);
		String parent_window=driver.getWindowHandle();
		Set<String>Whole_window=driver.getWindowHandles();
		action.moveToElement(tab).click().perform();
		//action class for the parent and childwindow
		for(String childwindow:Whole_window) {
		driver.switchTo().window(childwindow);
		//driver.close();
		}//switchto parent and child window
		driver.switchTo().window(parent_window);
		//System.out.println(driver.getTitle());
		//driver.quit();
		//Working on alerts
		WebElement anne=driver.findElement(By.id("name"));
		anne.sendKeys("mahendran");
		driver.findElement(By.id("alertbtn")).click();
		Actions action1=new Actions(driver);
		Alert alert=driver.switchTo().alert();
		//action1.contextClick().perform();
		Thread.sleep(2000);
		alert.accept();
	WebElement table=driver.findElement(By.xpath("(//td[contains(text(),'25')])[1]"));
	System.out.println(table.getText());
	//mousehover
	Thread.sleep(3000);
	WebElement mouse=driver.findElement(By.id("mousehover"));
	Actions action4=new Actions(driver);
	action4.moveToElement(mouse);
	//pagedown
	Thread.sleep(3000);
	Actions action2=new Actions (driver);
	action2.sendKeys(Keys.PAGE_DOWN);
	//iframe
	driver.switchTo().frame(0);
	driver.findElement(By.linkText("Job Support")).click();
	}
}
