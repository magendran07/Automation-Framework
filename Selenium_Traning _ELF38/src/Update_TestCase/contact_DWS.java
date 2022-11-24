package Update_TestCase;
import org.testng.annotations.Test;
import Framework_utility.Base_Test;
import POM_Pages.DWS_contactus;
import POM_Pages.DWS_contactus;
public class contact_DWS extends Base_Test {
	@Test
	public void contact() {
	DWS_contactus con=new DWS_contactus(driver);
	con.click();
con.Enter_name("magendran");
	con.Enter_email("magendranmagi2008@gmail.com");
con.Enquriy_details("kjasdfkdnfadhfkjdnfoasidf");
	con.Send_Email();
}
}