package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	By loginButton = By.xpath("//span[text()='Login']");
	public LandingPage(WebDriver driver) {
		this.driver =driver;
	}
	public WebElement getLogin() 
		{
		return driver.findElement(loginButton);
		}
	By text =By.xpath("//h2[text()='Featured Courses']");
	public WebElement text() {
		return driver.findElement(text);
	}
	By allCourses = By.xpath("//div[@class='text-center']//a");
	public WebElement getcourses() {
		return driver.findElement(allCourses);
	}
	

}
