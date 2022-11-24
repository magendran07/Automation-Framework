package Update_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import POM_Pages.DWS_ScrolDown_Handles;

public class Multiple_HAndles extends Base_Test{

	@Test
	public void T3est_case() {
		DWS_ScrolDown_Handles scroll=new DWS_ScrolDown_Handles(driver);
		scroll.Facebook_click();
		
	}
}

