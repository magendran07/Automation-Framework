package Selenium_Practise;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Demo_print_sort {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Selenium_jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Books")).click();
		WebElement sortBy=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sel=new Select(sortBy);
		List<WebElement> sel2=sel.getOptions();
		for(int i=0;i<sel2.size()-1;i++) {
			System.out.println(sel2.get(i).getText());
										}
							}
					}
