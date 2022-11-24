package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Gift_Card {
		public DWS_Gift_Card(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
		WebElement giftcard;
		@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[2]")
		WebElement add;
		@FindBy(className = "recipient-name")
		WebElement name;
		@FindBy(className ="recipient-email")
		WebElement email;
		@FindBy(className ="sender-name")
		WebElement sender;
		@FindBy(id="add-to-cart-button-2")
		WebElement add2; 

public void Select_Card() {
	giftcard.click();
}	
public void ADD_The_Cart() {
	add.click();
}
public void Enter_Name(String sendername) {
	name.sendKeys(sendername);
}
public void Enter_Email(String Email2) {
	email.sendKeys(Email2);
}
public void Enter_sender(String Sname) {
	sender.sendKeys(Sname);
}
public void Click_Add() {
	add2.click();
}
}