package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Beta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.whatsapp.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close(); 
		
	}
}
