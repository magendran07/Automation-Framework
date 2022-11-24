package Testng_basics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
public class Working_with_propertyfile {
	@Test
public void propertydemo() throws IOException {
		String filepath="./Test_configuration/Test_configuration.properties";
		FileInputStream fis=new FileInputStream(filepath);//
		//create object forthe property for only a property file
		 
		Properties prop=new Properties();
		prop.load(fis); 
		System.out.println(prop.get("url"));
	}
}
 