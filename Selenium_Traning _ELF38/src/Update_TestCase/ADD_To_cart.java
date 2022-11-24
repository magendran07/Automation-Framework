package Update_TestCase;

import org.testng.annotations.Test;
import Framework_utility.Base_Test;
import POM_Pages.DWS_Add_to_Cart;
import POM_Pages.DWS_Register;
     public class ADD_To_cart extends Base_Test {
	@Test
	public void Test_case1() throws InterruptedException {
		DWS_Add_to_Cart cart=new DWS_Add_to_Cart(driver);
        cart.ADD_cart();
}
}