package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_assingment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	
}
}
