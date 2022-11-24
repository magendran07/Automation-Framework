package POM_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Framework_utility.Utility_Method;
public class DWS_WhishList  extends  Utility_Method{
	public DWS_WhishList(WebDriver driver){
	PageFactory.initElements(driver,this);
	    }
@FindBy(xpath="//span[text()=\"Wishlist\"]")
	 		WebElement wishlist;
public void click_wishlist() {
		wishlist.click();
	}
}