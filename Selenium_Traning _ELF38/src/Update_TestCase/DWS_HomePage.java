package Update_TestCase;

import Framework_utility.Base_Test;
import POM_Pages.DWS_Homepage;

public class DWS_HomePage extends Base_Test {

	public void text_case001() {
		DWS_Homepage home=new DWS_Homepage(driver);
		home.Click_Login();
	}
}
