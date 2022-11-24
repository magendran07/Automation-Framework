package Selenium_Practise;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo_Guru {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//create a object for the Webriverwait
		/*WebDriverWait wait=new WebDriverWait(driver,1);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Register']")))).click();
	driver.findElement(By.id("gender-male")).click();
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("FirstName")))).sendKeys("mahendran");
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("LastName")))).sendKeys("Mahi");
driver.findElement(By.id("Email")).sendKeys("mahendranmahi2008@gmail.com");
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Password")))).sendKeys("123456");
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("ConfirmPassword")))).sendKeys("123456");
Thread.sleep(5000);
 driver.findElement(By.id("register-button")).click();*/
 
driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		
driver.findElement(By.xpath("//a[text()='Register']")).click();
driver.findElement(By.id("FirstName")).sendKeys("mahendran");
driver.findElement(By.id("LastName")).sendKeys("Mahi");
	}

}
