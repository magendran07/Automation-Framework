package POM_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Framework_utility.Utility_Method;
public class DWS_Add_to_Cart extends Utility_Method  {
	
	public DWS_Add_to_Cart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//input[@value='Add to cart']")
WebElement cart;

public void ADD_cart() {
	cart.click();
}
}