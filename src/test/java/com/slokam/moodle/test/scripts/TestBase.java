package com.slokam.moodle.test.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public WebDriver driver;

	@BeforeSuite
	public void init() {
		// Launching chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_classes\\jars\\chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://localhost:90/moodle/");

	}

	@AfterSuite
	public void tearDown() {
		//driver.quit();
	}
}
