package com.slokam.moodle.test.scripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.slokam.moodle.test.commons.dtos.UserDTO;
import com.slokam.moodle.test.commons.enums.UpdatedNavigation;
import com.slokam.moodle.test.commons.pages.DashBoardPage;
import com.slokam.moodle.test.commons.pages.HomePage;
import com.slokam.moodle.test.commons.pages.LoginPage;
import com.slokam.moodle.test.commons.pages.NewUserPage;
import com.slokam.moodle.test.commons.utils.UtilsManager;

public class TestCourseModule extends TestBase{

	@Test
	public void verifyCourseUserDetails(){
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
		System.out.println(username + " " + password + " " + firstname  + " " + lastname + " " + email);
		//2.Verify HomePage displayed.
		//3.Click on login link
		HomePage homePage = new HomePage(driver);
		homePage.clickLogin();
		
		//4.Login into application with valid credentials.
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("user", "user123");
		
		//5.Goto ParticipantPage

		DashBoardPage dashBoardPage = new DashBoardPage(driver);
		dashBoardPage.navigateToPage(UpdatedNavigation.CREATE_USER);
		NewUserPage newUserPage = new NewUserPage();
		PageFactory.initElements(driver, newUserPage);
		newUserPage.createUser(dto);
	}
	
	//@Test
	public void createCourseTest(){
		
		
	}
	
	//@Test
	public void createCourseWithTitle(){
		
		
	}
	
	
	
	
}
