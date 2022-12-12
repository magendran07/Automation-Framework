package test_scription;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class kia_Test {
	public WebDriver driver;
	
	@Test
	public void Browsersetup(){
	System.setProperty("webdriver.chrome.driver", "./src/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.ktm.com/en-in.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	driver.quit();
	
	}
}
