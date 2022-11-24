package Update_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import POM_Pages.Digital_homepage_01;

public class Digital_HomePAge extends Base_Test{
	@Test
	public void homepage() {
		Digital_homepage_01 home=new Digital_homepage_01(driver);
		home.Link();
		home.dropdown_01();
		home.CLASS(driver);
		home.Name();
		home.DDD();
	}

}
