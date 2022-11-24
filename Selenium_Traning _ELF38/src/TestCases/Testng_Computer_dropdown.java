package TestCases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import Framework_utility.Utility_Method;
public class Testng_Computer_dropdown extends Base_Test{
@DataProvider(name="suggestion")
	public Object[][] testdata() throws IOException{
		Object[][]data=Utility_Method.Get_test_data("Sheet5");
		//data[0][0]="Accessories";
		return data;
}
@Test(dataProvider="suggestion")
public void Electironics(){
WebElement computer_tab=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(computer_tab).build().perform();
	WebElement drop_down=driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]"));
	Utility_Method.Click_Element(drop_down);
} 
} 
