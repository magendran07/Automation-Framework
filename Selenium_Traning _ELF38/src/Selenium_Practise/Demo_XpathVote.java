package Selenium_Practise;
//using address methodXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_XpathVote {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("pavithrapavi@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234mahi");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		Thread.sleep(2000);//Synchronization using the thread;
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
	    driver.findElement(By.xpath("//input[@value='Vote']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
	}
}
