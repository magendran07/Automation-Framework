package Update_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import POM_Pages.DWS_Advance_SEarch;

public class Advances_search_pom extends Base_Test {
@Test
public void Advance_Test() {
	DWS_Advance_SEarch advance=new 	DWS_Advance_SEarch(driver);
		advance.Small_Search("mobiles");
		advance.Submit_Register();
		advance.Advance_Search();
		advance.Catagerory();
		advance.Check_Box2();
		advance.Drop_Down2();
		advance.From_Amt("1000");
		advance.To_Amt("5000");
		advance.Final_Click();
}



}
