package Update_TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Framework_utility.Base_Test;
import POM_Pages.DWS_WhishList;
public class Whishlist_DWS extends Base_Test {
		@Test
		public void WishlistTest() {
		DWS_WhishList whish=new DWS_WhishList(driver);
		whish.click_wishlist();
		}
	}
