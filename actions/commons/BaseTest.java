package commons;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BaseTest {
	
	protected BaseTest() {
		log = LogFactory.getLog(getClass());
	}

	private WebDriver driverBaseTest;
	protected final Log log;
	
	public WebDriver getBrowserName(String browserName) {
		if (browserName.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", GlobalConstants.PROJECT_PATH + "\\browserDrivers\\geckodriver.exe");
			
			//Dùng thư viện WebDriverManager để tải browser Driver về một cách tự động
			//WebDriverManager.firefoxdriver().setup();
			driverBaseTest = new FirefoxDriver();
			driverBaseTest.manage().window().maximize();	
		} else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", GlobalConstants.PROJECT_PATH + "\\browserDrivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
			
			//WebDriverManager.chromedriver().setup();
			driverBaseTest = new ChromeDriver(options);
			driverBaseTest.manage().window().maximize();	

		}
		
		else {
			throw new RuntimeException("Browser name is invalid");
		}
		
		driverBaseTest.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driverBaseTest.get(GlobalConstants.PORTAL_PAGE_URL);
		
		return driverBaseTest;
	}
	public void sleepInSecond(long timeInSecond) {
		try {
			Thread.sleep(timeInSecond * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public WebDriver getDriverInstance() {
		return this.driverBaseTest;
	}
	
	protected int generateRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(99999);
	}
	
	
	}

