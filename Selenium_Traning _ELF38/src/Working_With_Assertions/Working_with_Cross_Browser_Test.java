package Working_With_Assertions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Framework_utility.Utility_Method;
public class Working_with_Cross_Browser_Test  extends Utility_Method{
	WebDriver driver;
	
	@Parameters("Browser")	
	@Test
	public void crossBrowserDemo(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		else {
		System.setProperty("webdriver.gecko.driver","./Selenium_jar/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		WebElement search1=driver.findElement(By.id("small-searchterms"));
		Utility_Method.Enter_Value_In_Login(search1,"mobiles");
		WebElement click_search=driver.findElement(By.xpath("//input[@value='Search']"));
		Utility_Method.Click_Element(click_search);
		driver.close();
	}
}
