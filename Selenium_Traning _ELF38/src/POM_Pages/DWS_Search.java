package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Framework_utility.Utility_Method;

public class DWS_Search extends  Utility_Method {
	
	public DWS_Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//WebElement
	@FindBy(id="small-searchterms")
	WebElement search;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	//method
	public void Search_Box(String value) {
		search.sendKeys(value);
	}
	public void Submit_Register() {
	submit.click();
	}
}
