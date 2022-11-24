package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_Method;

public class DWS_Login extends Utility_Method{
//constructor
	public  DWS_Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//WebElement
	@FindBy(id="Email")
	WebElement username;
	@FindBy(name="Password")
	WebElement password;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement login_btn;
	//methods
	public void Enter_username(String email) {
		username.sendKeys(email);
	}
		public void Enter_Password(String value) {
	password.sendKeys(value);
		}
		public void Login_Button() {
			Click_Element(login_btn);
		}
	}

