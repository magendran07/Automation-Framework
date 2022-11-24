package Update_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import POM_Pages.Jewelery_pom_page;
public class Jewelery_DWS  extends Base_Test{
		@Test
		public void Jewelery() {
			Jewelery_pom_page page=new Jewelery_pom_page(driver);
			page.Clickjew();
			page.cart();
			page.view();
			page.mark();
			page.help();
		}
	}


