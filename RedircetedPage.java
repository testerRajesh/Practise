package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedircetedPage {
	WebDriver driver;
	@FindBy(id="user_email")
	WebElement email;
	@FindBy(id="user_password")
	WebElement pwd;
	@FindBy(name="commit")
	WebElement login;
	
	public RedircetedPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement email() {
		return email;
	}
	public WebElement password() {
		return pwd;
		
	}
	public WebElement login() {
		return login;
	}
}
