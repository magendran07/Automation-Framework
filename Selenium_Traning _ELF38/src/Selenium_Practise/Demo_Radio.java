package Selenium_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Radio {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" ");
		driver.manage().window().maximize();
		List<WebElement>ele=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int  i=0;i<=ele.size()-1;i++) {
			ele.get(i).click();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
