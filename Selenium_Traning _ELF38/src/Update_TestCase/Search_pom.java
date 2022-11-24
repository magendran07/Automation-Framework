package Update_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_Test;
import POM_Pages.DWS_Search;

public class Search_pom extends Base_Test {
	@Test
	public void Test_case2() {
		DWS_Search search=new DWS_Search(driver);
		search.Search_Box("laptop");
	search.Submit_Register();
	}

}
