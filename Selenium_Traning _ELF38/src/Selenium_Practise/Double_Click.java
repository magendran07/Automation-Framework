package Selenium_Practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Double_Click {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	WebElement doubleclick=driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
	Actions Double=new Actions(driver);
	Double.doubleClick(doubleclick).build().perform();	
}
}


