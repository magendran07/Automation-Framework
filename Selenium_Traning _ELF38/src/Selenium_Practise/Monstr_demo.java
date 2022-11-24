package Selenium_Practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Monstr_demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./SElenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.monsterindia.com/");
	driver.manage().window().maximize();
	WebElement jobsearch=driver.findElement(By.xpath("(//a[@data-check='menutab'])[1]"));
	Actions carrer=new Actions(driver);
	carrer.moveToElement(jobsearch).build().perform();
	Thread.sleep(2000);
	WebElement jobsearch1=driver.findElement(By.xpath("(//a[contains(text(),'Jobs by Skills')])[1]"));
	Actions Carrer1=new Actions(driver);
	Carrer1.moveToElement(jobsearch1).build().perform();
	WebElement jobsearch2=driver.findElement(By.xpath("(//a[contains(text(),'Java Jobs')])[1]"));
	Actions carrer2=new Actions(driver);
	carrer2.moveToElement(jobsearch2).click().perform();
	  
	
}

	
}
