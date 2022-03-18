package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base2 {
	public WebDriver driver;
	public Properties prop;

	public WebDriver data() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\91994\\eclipse-workspace\\E2EFramework\\src\\main\\java\\resources\\data2.properties");
		prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\softwares\\geckodriver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
