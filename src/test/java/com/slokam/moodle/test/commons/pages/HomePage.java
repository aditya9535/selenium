package com.slokam.moodle.test.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.slokam.moodle.test.commons.utils.UtilsManager;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	public void clickLogin() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

	public void verifyCalander() {

	}

	public boolean verifyHomePage() {
		return true;
	}
	public void navigateToHomePage() {
		String url  = UtilsManager.getValue("url");
		driver.get(url);
		
	}
}
