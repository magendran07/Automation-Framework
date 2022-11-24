package Testng_basics;

import org.testng.annotations.Test;

public class Working_with_smoking1 {
	public void advancesearch() {
		System.out.println("advancesearch");
	}
	@Test
	public void checkbox1() {
	System.out.println("checkbox is clicked");
	}
	@Test(groups="smoketest")
	public void clickok2() {
		System.out.println("click ok is clicked2");
	}
	@Test(groups="smoketest")
	public void product2() {
		System.out.println("product2");
	}
}


