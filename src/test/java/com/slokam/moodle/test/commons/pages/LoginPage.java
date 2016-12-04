package com.slokam.moodle.test.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage (WebDriver driver){
		this.driver = driver;
	}
	public void login(String username ,String password){
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector("#loginbtn")).click();
	}
	
	public void loginAsGuest(){
		
	}
	
	public void forgotPassword(){
		
	}
}
