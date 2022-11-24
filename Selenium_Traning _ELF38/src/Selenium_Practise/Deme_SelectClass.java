package Selenium_Practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Deme_SelectClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Documents/Demo%20webpages/demo.html");
	driver.manage().window().maximize();
	WebElement car=driver.findElement(By.id("standard_cars"));
	Select sel=new Select(car);
	sel.selectByVisibleText("Audi");//by using visible text
	Thread.sleep(2000);
	sel.selectByIndex(6);//by using index value of the number
	Thread.sleep(2000);
	sel.selectByValue("bmw");//by using the attribute value
}
}
