package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Homepage {
//in here we are using a findBy
	//constructor
	public DWS_Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//webelement
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement Login;
	//method
	public void Click_Login() {
	Login.click();
	}
	}

