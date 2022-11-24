package seleniumbasis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Selenium_BrowserMethods {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//doing search browser using the driver keyword
		//driver.get("http://www.yahoo.co.in");
		System.setProperty("webdriver.gecko.driver","./Selenium_jar/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//navigate to the browser
		driver.get("http://www.gmail.co.in");
		
	}

}
