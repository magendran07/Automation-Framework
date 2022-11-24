package Update_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import POM_Pages.DWS_Homepage;
import POM_Pages.DWS_Login;
 
public class Login_TEst_pom extends Base_Test {
	@Test
	public void Test_case() {
		
	
	DWS_Homepage home=new DWS_Homepage(driver);
	home.Click_Login();
	 DWS_Login login=new  DWS_Login (driver);
	 login.Enter_username("magendranmagi2008@gmail.com");
	 login.Enter_Password("Mahesh2008");
	 login.Login_Button(); 
	}
}
