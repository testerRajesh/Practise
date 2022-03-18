package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;

	@SuppressWarnings("deprecation")
	public WebDriver driverInitilization() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\91994\\eclipse-workspace\\E2EFramework\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);//  will load all the details from .properties files
		String browserName = prop.getProperty("browser");
		String url= prop.getProperty("URL");
		String url2 = prop.getProperty("URL2");
		System.out.println(url);
		System.out.println(url2);
		System.out.println(browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver( );

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\softwares\\geckodriver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", "D:\\softwares\\edgedriver\\edgedriver_win64msedgedriver.exe");
			driver = new EdgeDriver();

		}
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
	}

}
