package Selenium_Practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practise {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Computers")).click();
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.xpath("(//div[@class='buttons'])[2]/input[@type='button']")).click();
		//driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
	
		
	}
	
}
