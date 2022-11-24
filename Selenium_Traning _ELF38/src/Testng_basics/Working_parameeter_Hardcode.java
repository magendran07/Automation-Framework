package Testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_parameeter_Hardcode {
	@DataProvider(name="TestData")
	public Object[] [] testdata (){
	 Object[] [] data=new Object[5] [2];
		data[0] [0]="Tom";
		data[0] [1]="Jerry";
		data[1] [0]="Mahesh";
		data[1] [1]="Manoj";
		data[2] [0]="Ramesh";
		data[2] [1]="Suresh";
		data[3] [0]="Thar";
		data[3] [1]="Jeep";
		data[4] [0]="2008";
		data[4] [1]="2009";
		return data;
	}
@Test (dataProvider ="TestData")
public void testdatademo(String name,String brothername){
System.out.println(name);
System.out.println(brothername);
}
}
