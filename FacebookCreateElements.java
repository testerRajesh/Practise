package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookCreateElements {
	 WebDriver driver ;
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstName;
	@FindBy(xpath="//input[@name='lastname']")
	WebElement surName;
	@FindBy(xpath="//input[@name='reg_email__']")
	WebElement Mobile;
	public FacebookCreateElements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public WebElement firstName() {
		return firstName;
		}
	public WebElement surName() {
		return surName;
		}
	public WebElement Mobile() {
		return Mobile;
		}
	
}
