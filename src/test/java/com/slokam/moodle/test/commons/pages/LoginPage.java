package com.slokam.moodle.test.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage (WebDriver driver){
		this.driver = driver;
	}
	
	/**
	 * THis login method takes user name and password and logs intp application.
	 * @param username
	 * @param password
	 */
	public void login(String username ,String password){
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector("#loginbtn")).click();
	}
	
	public String getErrorMessage(){
		return driver.findElement(By.cssSelector(".error")).getText();
	}
	public void loginAsGuest(){
		
	}
	
	public void forgotPassword(){
		
	}
}
