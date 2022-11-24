package Update_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import POM_Pages.DWS_Homepage_computers;
public class Action_Class extends Base_Test{
			@Test
			public void Computer() {
				DWS_Homepage_computers hp=new DWS_Homepage_computers(driver);
				hp.click_electronics();
			}
		}


