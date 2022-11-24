package Selenium_Practise;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Demo_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Books")).click();
	WebElement ele=driver.findElement(By.id("products-orderby"));
	Select sel=new Select(ele);
sel.selectByValue("https://demowebshop.tricentis.com/books?orderby=10");
     Thread.sleep(2000);
WebElement ele2=driver.findElement(By.id("products-pagesize"));
Select sel2=new Select(ele2);
sel2.selectByVisibleText("4");
Thread.sleep(2000);
WebElement ele3=driver.findElement(By.name("products-viewmode"));
Select sel3=new Select(ele3);
sel3.selectByVisibleText("Grid");
	}
}
