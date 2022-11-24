package Selenium_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Link {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> ele=driver.findElements(By.xpath("//a"));
	System.out.println(ele.size());
	for(int i=0;i<=ele.size()-1;i++) {
		System.out.println(ele.get(i).getText());
	}
	
	}

}
