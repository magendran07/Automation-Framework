package POM_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Framework_utility.Utility_Method;
public class DWS_Newspapper extends Utility_Method{

	public DWS_Newspapper(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
		@FindBy(xpath="(//input[@id=\"newsletter-email\"])[1]")
		WebElement newsletter;
		@FindBy(xpath="(//input[@type=\'button\'])[1]")
		WebElement subscribe;
		public void enter_subscribe_field(String value) {
			Enter_Value_In_Login(newsletter, value);
		}
		public void click_subscribe() {
			
			Click_Element(subscribe);
		}
}


