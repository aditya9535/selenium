package com.slokam.moodle.test.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.slokam.moodle.test.commons.dtos.UserDTO;

public class NewUserPage {

/*	WebDriver driver;
	public NewUserPage (WebDriver driver){
		this.driver = driver;
	}
	*/
	@FindBy(name="username")
	public WebElement usernameEle;
	
	@FindBy(name="newpassword")
	public WebElement newpasswordEle;
	
	@FindBy(name="firstname")
	public WebElement firstnameEle;
	
	@FindBy(name="lastname")
	public WebElement lastnameEle;
	
	@FindBy(name="email")
	public WebElement emailEle;
	
	@FindBy(name="city")
	public WebElement cityEle;
	
	public void createUser(UserDTO dto){
		
		usernameEle.sendKeys(dto.getUsername());
		newpasswordEle.sendKeys(dto.getPassword());
		firstnameEle.sendKeys(dto.getFirstname());
		lastnameEle.sendKeys(dto.getLastname());
		emailEle.sendKeys(dto.getEmail());
		cityEle.sendKeys(dto.getCity());
		
		//driver.findElement(By.xpath("")).click();
	}
	/*public void createUser(String username, String password , String firstname ,String lastname ,String email){
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("newpassword")).sendKeys(password);
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("email")).sendKeys(email);
		
		//driver.findElement(By.xpath("")).click();
	}*/
}
