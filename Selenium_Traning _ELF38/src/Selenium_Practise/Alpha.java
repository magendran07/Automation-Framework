package Selenium_Practise;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alpha {
public static void main(String[] args) {
	/*System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.gmail.com");*/
	System.setProperty("webdriver.gecko.driver","./Selenium_jar/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
}
}
