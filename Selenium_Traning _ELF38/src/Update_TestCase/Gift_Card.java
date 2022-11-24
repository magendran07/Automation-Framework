package Update_TestCase;
import org.testng.annotations.Test;
import Framework_utility.Base_Test;
import POM_Pages.DWS_Gift_Card;
public class Gift_Card extends Base_Test{
	@Test
public void Gift_card() {
		DWS_Gift_Card gift=new DWS_Gift_Card(driver);
		gift.Select_Card();
		gift.ADD_The_Cart();
		gift.Enter_Name("mahendran");
		gift.Enter_Email("magendranmagi2008@gmail.com");
		gift.Enter_sender("mahesh");
		gift.Click_Add();
	}
}
