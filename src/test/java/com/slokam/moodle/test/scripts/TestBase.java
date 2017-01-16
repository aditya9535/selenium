package com.slokam.moodle.test.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.slokam.moodle.test.commons.listeners.CustomListener;
import com.slokam.moodle.test.commons.listeners.CustomWebDriverListiner;
import com.slokam.moodle.test.commons.utils.UtilsManager;
@Listeners(CustomListener.class)
public class TestBase {

	public static WebDriver fdriver;
	public static EventFiringWebDriver driver;
	@BeforeSuite
	public void init() {
		// Launching chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_classes\\jars\\chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver();
		fdriver = new ChromeDriver();
		 driver = new EventFiringWebDriver(fdriver);
		 driver.register(new CustomWebDriverListiner());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url  = UtilsManager.getValue("url");
		driver.get(url);
		
	}

	@AfterSuite
	public void tearDown() {
		//driver.quit();
	}
}
