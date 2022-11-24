package Selenium_Practise;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class RoboT_class {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/Demo%20webpages/demo.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement choose=driver.findElement(By.id("resume"));
		Actions action=new Actions(driver);
		action.moveToElement(choose).click().perform(); 
		Robot robo=new Robot();
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_T);
		robo.keyPress(KeyEvent.VK_E);
		robo.keyPress(KeyEvent.VK_S);
		for(int i=0;i<=2;i++) {
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_TAB);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
	}
}
