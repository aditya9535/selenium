package com.slokam.selenium.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.slokam.moodle.test.commons.dtos.UserDTO;
import com.slokam.moodle.test.commons.utils.UtilsManager;

public class A {

	@Test
	public void test1() {
		String username = UtilsManager.randomString(5);
		String password = UtilsManager.randomString(8);
		String firstname =UtilsManager.randomString(5);
		String lastname = UtilsManager.randomString(5);
		String email = 	  UtilsManager.randomString(5);
		
		UserDTO dto = new UserDTO();
		dto.setUsername(username);
		dto.setPassword(password);
		dto.setFirstname(firstname);
		dto.setLastname(lastname);
		dto.setEmail(email);
		dto.setCity("Hyderabad");
				
		
		System.out.println(dto);
	}
}
