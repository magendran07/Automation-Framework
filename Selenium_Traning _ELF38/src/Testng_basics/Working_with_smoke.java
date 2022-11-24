package Testng_basics;
import org.testng.annotations.Test;
public class Working_with_smoke {
	@Test(groups="smoketest")
	public void advancesearch() {
		System.out.println("advancesearch");
	}
	@Test
	public void checkbox() {
	System.out.println("checkbox is clicked");
	}
	@Test(groups="smoketest")
	public void clickok() {
		System.out.println("click ok is clicked");
	}
	@Test
	public void product() {
		System.out.println("product");
	}
}

