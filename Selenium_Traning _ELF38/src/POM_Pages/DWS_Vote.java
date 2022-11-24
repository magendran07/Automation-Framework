package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_Method;

public class DWS_Vote  extends Utility_Method{
	public  DWS_Vote(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//WebElement
	@FindBy(id="Email")
	WebElement username;
	@FindBy(name="Password")
	WebElement password;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement login_btn;
	@FindBy(id="pollanswers-1")
	WebElement vote;
	@FindBy(id="vote-poll-1")
	WebElement place;
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
		public void Select_Vote() {
			Click_Element(vote);
		}
		public void place_vote() {
			Click_Element(place);
		}
	}


