package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_Method;

public class DWS_Register extends Utility_Method {
	//constructor
	public DWS_Register(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//WebElement
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement reg;
	@FindBy(id="gender-male")
	WebElement gender;
	@FindBy(id="FirstName")
	WebElement firstname;
	@FindBy(name="LastName")
	WebElement last;
	@FindBy(name="Email")
	WebElement email;
	@FindBy(name="Password")
	WebElement password;
	@FindBy(name="ConfirmPassword")
	WebElement confrim;
	@FindBy(name="register-button")
	WebElement Reg_btn;
//mehtod
	public void Register() {
		Click_Element(reg);
	}
	public void Select_gender() {
		Click_Element(gender);
	}
	
	public void Enter_firstname(String Firstname) {
		firstname.sendKeys(Firstname);
		}
	public void Enter_Lastname(String lastname) {
		last.sendKeys(lastname);
	}
	public void Enter_Email(String Email) {
		email.sendKeys(Email);
	}
	public void Enter_password(String Password) {
		password.sendKeys(Password);
	}
	public void Enter_ConfrimPassword(String Confrim) {
			confrim.sendKeys(Confrim);
	}
	public void Register_click() {
		Click_Element(Reg_btn);
	}
}
