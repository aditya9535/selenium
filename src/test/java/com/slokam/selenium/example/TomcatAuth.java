package com.slokam.selenium.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.slokam.moodle.test.commons.utils.UtilsManager;

public class TomcatAuth {

	WebDriver driver;
	@Test
	public void test1(){
		String username ="tomcat";
		String password = "rajesh@123";
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_classes\\jars\\ChromeDriver.exe");
		// ChromeDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url  = UtilsManager.getValue("url");
		driver.get("http://"+username + ":" +password+"@192.168.1.8:8083/host-manager/html");
		//driver.get("http://192.168.1.8:8083/host-manager/html");

		WebElement ele = driver.findElement(By.xpath("//img[@alt='The Tomcat Servlet/JSP Container']"));
		Actions actions = new Actions(driver);
		actions.contextClick(ele).build().perform();
		
		actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
		/*
		//ROBOT
		try {
			Robot robot = new Robot();
			StringSelection ss = new StringSelection("tomcat");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);;
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Alert alert  = driver.switchTo().alert();
		
		alert.sendKeys("tomcat");
		alert.accept();
		Credentials creds  = new UserAndPassword("tomcat", "rajesh@123");
		alert.authenticateUsing(creds);
		RemoteExecuteMethod execute = new RemoteExecuteMethod((RemoteWebDriver)driver);
		Keyboard keyboard = new RemoteKeyboard(execute);
		Mouse mouse = new RemoteMouse(execute);
		Actions actions = new Actions(keyboard,mouse );
		actions.contextClick().doubleClick().build().perform();
		
		actions.sendKeys(Keys.CONTROL);*/
	}
}
