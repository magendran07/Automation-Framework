package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Homepage_computers {
	public DWS_Homepage_computers(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[@href=\"/computers\"])[1]")
	WebElement computers;

public void click_electronics() {
		computers.click();
	}
}
