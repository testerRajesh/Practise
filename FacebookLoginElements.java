package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginElements {
	WebDriver driver;
	By userId = By.id("email");
	By password = By.id("pass");
	By logIn = By.xpath("//button[@name='login']");
	By forgottenPassword = By.xpath("//a[text()='Forgotten password?']");
	By createAccount = By.xpath("//a[@data-testid='open-registration-form-button']");
	By message =By.xpath("//div[@class='_9ay7']");

	public FacebookLoginElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement user() {
		return driver.findElement(userId);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement login() {
		return driver.findElement(logIn);

	}

	public WebElement forgot() {
		return driver.findElement(forgottenPassword);

	}

	public WebElement createAccount() {
		return driver.findElement(createAccount);
	}
	public WebElement message() {
		return driver.findElement(message);
	}

}
