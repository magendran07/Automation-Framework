package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_Method;

public class DWS_ScrolDown_Handles extends Utility_Method {
	public  DWS_ScrolDown_Handles(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="(//a[@target='_blank'])[1]")
WebElement facebook;

public  void Facebook_click() {
	facebook.click();
}
}
