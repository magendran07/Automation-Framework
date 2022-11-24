package Update_TestCase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Framework_utility.Base_Test;
import Framework_utility.Utility_Method;
import POM_Pages.DWS_Newspapper;
public class Newspapper_DWS extends Base_Test {
/*
		@DataProvider(name="Testdata")
		public Object[][] testdata() throws IOException {
			
			Object[][]data=Utility_Method.getTestData("DWS_NL_Subscribe");
			
			return data;
		}*/
		
		@Test
public void Newsletter() {
			DWS_Newspapper news=new DWS_Newspapper(driver);
			news.enter_subscribe_field("magendranmagi20089@gmail.com");
			news.click_subscribe();

		}
}
