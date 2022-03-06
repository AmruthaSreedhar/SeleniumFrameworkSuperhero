package tests;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
	
	public static Properties CONFIG= null;
	public static Properties OR = null;
	public static WebDriver driver =null;
	
	
	@BeforeTest(alwaysRun = true)
	public void initialize() throws IOException {
		if(driver==null) {
			CONFIG = new Properties();
			FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"//src/config/config.properties");
			CONFIG.load(fn);
			OR = new Properties();
			fn = new FileInputStream(System.getProperty("user.dir")+"//src//config/OR.properties");
			OR.load(fn);
			if(CONFIG.getProperty("browser").equals("Firefox")) {
				driver = new FirefoxDriver();
			}else if (CONFIG.getProperty("browser").equals("IE")) {
				driver = new InternetExplorerDriver();
			}else if(CONFIG.getProperty("browser").equals("Chrome"))
			{
				driver = new ChromeDriver();
				
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		}
	@Test
	public static WebElement getObject(String xpathKey) {
		try {
			return driver.findElement(By.xpath(OR.getProperty(xpathKey)));
			
		}catch(Throwable t) {
			return null;
		}
	}
	

}
