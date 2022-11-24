package Selenium_Practise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_HTml {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
	File login=ts.getScreenshotAs(OutputType.FILE);
	File destations=new File("./ScreenShot/screenshot1.png");
	FileHandler.copy(login, destations);
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("magendranmahi2008@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("mahi123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File logn=ts.getScreenshotAs(OutputType.FILE);
		File destation=new File("./ScreenShot/screenshot2.png");
		FileHandler.copy(login, destations);
		driver.close();
	}
}
