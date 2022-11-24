package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_Method;

public class DWS_contactus  extends Utility_Method{
	public DWS_contactus(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[contains(text(), 'Contact us')]")
	WebElement contact;
	@FindBy(id="FullName")
	WebElement fullname;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(name="Enquiry")
	WebElement enq;
	@FindBy(name="send-email")
	WebElement send;
	
	public void click() {
		contact.click();
	}
	public void Enter_name(String name) {
		fullname.sendKeys(name);
	}
	public void Enter_email( String Email) {
		email.sendKeys(Email);
	}
	public void Enquriy_details(String details) {
		enq.sendKeys(details);
	}
	public void Send_Email() {
		send.click();
	}
	}