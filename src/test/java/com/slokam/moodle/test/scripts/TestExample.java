package com.slokam.moodle.test.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExample {

	
	WebDriver driver  = null;
	
	//@Test
	public void test1(){
	
		// Launching chrome browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_classes\\jars\\chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Open Naukri url
		driver.get("http://localhost:90/moodle/");
		
		//Click login button -- -HomePage
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//Login into application ----- LoginPage ---- testdata - username ,password
		
		driver.findElement(By.cssSelector("#username")).sendKeys("user");
		driver.findElement(By.cssSelector("#password")).sendKeys("user123");
		driver.findElement(By.cssSelector("#loginbtn")).click();
		
		
		 //Click on Courses - Dashboard Page
		
		String value = driver.findElement(By.xpath("//p[@id='expandable_branch_0_courses']//a[text()='Courses']/ancestor::li[1]")).getAttribute("aria-expanded");
		if(value.equals("false")){
			driver.findElement(By.xpath("//a[text()='Courses']/..")).click();
		}
		
		driver.findElement(By.xpath("//a[@title='Selenium Course1']")).click();
		driver.findElement(By.xpath("//a[text()='Participants']")).click();
		
		//Verify user details - Participants Page --- Testdata
		String expected = "test1@gmail.com";
		String actual = driver.findElement(By.xpath("//table[@id='participants']//tr[1]/td[4]")).getText();
		Assert.assertEquals( actual, expected);
		
	}
}
