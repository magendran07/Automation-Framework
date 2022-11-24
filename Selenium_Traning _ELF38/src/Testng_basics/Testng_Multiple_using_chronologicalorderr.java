package Testng_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testng_Multiple_using_chronologicalorderr {
	@BeforeSuite
	public void Laptop() {
		System.out.println("Welcome to laptopshop");
	}
	@BeforeMethod
	public void Vehicle() {
		System.out.println("Welcome to Vechicle");
	}
	@BeforeClass
	public void KeyBoard() {
		System.out.println("Welcome to KeyboardShop");
	}
	@AfterMethod 
	public void Afterclass() {
		System.out.println("Welcome to the Afterclass");
	}
	@Test
	public void Shop() {
		System.out.println("Welcome to shop");
	}
	@Test 
	public void Man() {
		System.out.println("Welcome Man");
	}

}
