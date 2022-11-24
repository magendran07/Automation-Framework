package Update_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import POM_Pages.DWS_Register;
import POM_Pages.DWS_Vote;

public class Vote_pom  extends Base_Test{
	@Test
	public void Test_case1() {
		DWS_Vote vote=new DWS_Vote(driver);
		vote.Select_Vote();
		vote.place_vote();
}
}