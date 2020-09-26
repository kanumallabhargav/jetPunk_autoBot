package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Base 
{
	WebDriver driver;
	Properties prop = new Properties();
	private static Logger log = LogManager.getLogger(Base.class.getName());

	public WebDriver driverInitialize() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+partialFilePaths.getBrowserConfig_partialPath());
		prop.load(fis);
		String bName = prop.getProperty("browser");

		switch(bName)
		{
		case "chrome":
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+partialFilePaths.getChromeDriver_partialPath());
			driver = new ChromeDriver();
		}
		case "headlessChrome":
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+partialFilePaths.getChromeDriver_partialPath());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver(options);
		}
		case "firefox":
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+partialFilePaths.getGeckoDriver_partialPath());
			driver = new FirefoxDriver();
		}
		default:
		{
			Exception e = new Exception();
			e.printStackTrace();
			log.error("Invalid browser choice");
		}
		}
		driver.manage().window().maximize();
		return driver;
	}
}
