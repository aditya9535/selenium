package com.slokam.moodle.test.scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExample {

	
	@Test
	public void test1(){
		System.out.println("Test1 started at " + System.currentTimeMillis());
		Capabilities cap = DesiredCapabilities.firefox();
		URL url=null;
		try {
			url = new URL("http://169.254.165.164:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriver driver = new RemoteWebDriver(url,cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.mozilla.org/en-US/firefox/organizations/faq/");
		System.out.println("Test1 Ends at " + System.currentTimeMillis());
		driver.quit();
	}
	@Test
	public void test2(){
		System.out.println("Test2 started at " + System.currentTimeMillis());
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_classes\\jars\\chromedriver.exe");
		Capabilities cap = DesiredCapabilities.chrome();
		URL url=null;
		try {
			url = new URL("http://169.254.165.164:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriver driver = new RemoteWebDriver(url,cap);
		
		// ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://wiki.jenkins-ci.org/display/JENKINS/GMail");
		System.out.println("Test2 Ends at " + System.currentTimeMillis());
		
		driver.quit();
	}
	@Test
	public void test3(){
		System.out.println("Test3 started at " + System.currentTimeMillis());
		
		System.setProperty("webdriver.ie.driver", "D:\\selenium_classes\\jars\\IEDriverServer.exe");
		Capabilities cap = DesiredCapabilities.internetExplorer();
		URL url=null;
		try {
			url = new URL("http://169.254.165.164:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriver driver = new RemoteWebDriver(url,cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.mozilla.org/en-US/firefox/organizations/faq/");
		System.out.println("Test3 Ends at " + System.currentTimeMillis());
		driver.quit();
	}
	
}
