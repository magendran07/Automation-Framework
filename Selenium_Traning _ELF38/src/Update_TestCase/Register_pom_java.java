package Update_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import POM_Pages.DWS_Register;

public class Register_pom_java extends Base_Test {
	@Test
	public void Test_case1() {
		DWS_Register register=new DWS_Register(driver);
		register.Register();
		register.Select_gender();
		register.Enter_firstname("mahesh");
		register.Enter_Lastname("manoj");
		register.Enter_Email("magendranmahendran@gmail.com");
		register.Enter_password("hllomahesh");
		register.Enter_ConfrimPassword("hllomahesh");
		register.Register_click();
	}

}
