package TestCases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Framework_utility.Base_Test;
import Framework_utility.Utility_Method;
public class Testng_Register  extends Base_Test{
@DataProvider(name="Register")
	
	public Object[][] testdata() throws IOException{
		Object[][]data=Utility_Method.Get_test_data("Sheet1");
		//data[0][0]="Mahendran";
		//data[0][1]="p";
		//data[0][2]="magendranmagi2008@gmail.com";
		//data[0][3]="Mahesh2008";
		//data[0][4]="Mahesh2008";
		return data;
}
@Test(dataProvider="Register")
public void Register(String firstname,String lastname,String email,String password,String confrim) {
		WebElement reg=driver.findElement(By.linkText("Register"));
		Utility_Method.Click_Element(reg);
	    WebElement partial=	driver.findElement(By.xpath("//label[@for='gender-male']"));
	    Utility_Method.Click_Element(partial);
		WebElement first_name=driver.findElement(By.id("FirstName"));
		Utility_Method.Enter_Value_In_Login(first_name,firstname);
		WebElement last_name=driver.findElement(By.name("LastName"));
		Utility_Method.Enter_Value_In_Login(last_name,lastname);
		WebElement email1=driver.findElement(By.xpath("//input[@name='Email']"));
		Utility_Method.Enter_Value_In_Login(email1,email);
		WebElement password1=driver.findElement(By.xpath("//input[@class='text-box single-line password']"));
		Utility_Method.Enter_Value_In_Login(password1,password);
		WebElement confrim_password=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		Utility_Method.Enter_Value_In_Login(confrim_password,confrim);
		WebElement register2=driver.findElement(By.xpath("//input[@id='register-button']"));
		Utility_Method.Click_Element(register2);
	}
}
