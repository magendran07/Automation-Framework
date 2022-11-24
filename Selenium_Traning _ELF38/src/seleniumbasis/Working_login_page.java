package seleniumbasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_login_page {
@DataProvider(name="TestData")
	
	public Object[][] testdata(){
		Object[][]data=new Object[3][5];
		data[0][0]="Mahendran";
		data[0][1]="p";
		data[0][2]="magendranmagi2008@gmail.com";
		data[0][3]="Mahesh2008";
		data[0][4]="Mahesh2008";
		
		data[1][0]="Mahesh";
		data[1][1]="p";
		data[1][2]="maheshmahesh@gmail.com";
		data[1][3]="HelloWorld";
		data[1][4]="HelloWorld";
		
		data[2][0]="manojKumar";
		data[2][1]="p";
		data[2][2]="manojmanoj28@gamil.com";
		data[2][3]="manoj2008";
		data[2][4]="manoj2008";
		
		data[3][0]="ramesh";
		data[3][1]="m";
		data[3][2]="rameshram@gmail.com";
		data[3][3]="ramesh20082";
		data[3][4]="ramesh20082";
		
		data[4][0]="suresh";
		data[4][1]="m";
		data[4][2]="suresh1811@gmail.com";
		data[4][3]="suresh123";
		data[4][4]="suresh123";
		return data;
	}
	@Test(dataProvider="TestData")
	public void testdatademo(String Firstname,String secondname,String email,String Password,String confirm) {
	
	
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.google.com");
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.cssSelector("input[id=\'gender-male\']")).click();
   driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys(Firstname);
   driver.findElement(By.id("LastName")).sendKeys(secondname);
	driver.findElement(By.cssSelector("input[id='Email']")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(Password);
	driver.findElement(By.name("ConfirmPassword")).sendKeys(confirm);
	driver.findElement(By.id("register-button")).click();
	driver.close();

}
}

