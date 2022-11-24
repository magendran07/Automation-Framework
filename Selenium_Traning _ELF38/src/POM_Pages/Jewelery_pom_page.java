package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_Method;

public class Jewelery_pom_page extends Utility_Method {
		public  Jewelery_pom_page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="(//a[@href=\"/jewelry\"])[1]")
		WebElement Jewel;
		@FindBy(xpath = "(//input[@type=\"button\"])[3]")
		WebElement add;
		@FindBy(xpath="(//span[@class='cart-label'])[1]")
		WebElement shop;
		@FindBy(xpath = "//input[@id='termsofservice']")
		WebElement tick;
		@FindBy(xpath = "//button[@id=\"checkout\"]")
		WebElement radio;
		public void Clickjew() {
			Jewel.click();
		}	
		public void cart() {
			add.click();	
		}
		public void view() {
			shop.click();
		}
		public void mark() {
			tick.click();
		}

		public void help() {
			radio.click();
		}
	}

