package POM_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Framework_utility.Utility_Method;
public class Digital_homepage_01 extends Utility_Method {
	public Digital_homepage_01(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	WebElement link;
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement dropdown;
	@FindBy(xpath = "(//input[@type=\"button\"])[3]")
	WebElement name;
	@FindBy(xpath = "(//span[@class='cart-label'])[1]")
	WebElement classs;
	@FindBy(xpath="//input[@class='button-1 cart-button']")
	WebElement ddd;

public void Link() {
link.click();
}			
public void dropdown_01() {
	Select_drop_down(dropdown,"Name: Z to A");
}
public void CLASS(WebDriver d) {
	Action_clause(classs,d);
}
public void Name() {
name.click();
}
public void DDD() {
ddd.click();
}


}