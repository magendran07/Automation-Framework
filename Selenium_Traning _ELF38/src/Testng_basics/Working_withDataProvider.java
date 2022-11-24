package Testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_withDataProvider {
	@DataProvider(name="TestData")
public Object[] [] testdata (){
 Object[] [] data=new Object[1] [2];
	data[0] [0]="mahendran";
	data[0] [1]="Ronaldo";
	return data;
	}
	@Test(dataProvider ="TestData")
	public void testmethod(String firstname,String lastname) {
		System.out.println(firstname);
		System.out.println(lastname);
	}
}
