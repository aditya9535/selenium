package com.slokam.moodle.test.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.moodle.test.commons.pages.DashBoardPage;
import com.slokam.moodle.test.commons.pages.HomePage;
import com.slokam.moodle.test.commons.pages.LoginPage;
import com.slokam.moodle.test.commons.pages.ParticipantPage;

public class TestCourseModule extends TestBase{

	@Test
	public void verifyCourseUserDetails(){
		//2.Verify HomePage displayed.
		//3.Click on login link
		HomePage homePage = new HomePage(driver);
		homePage.clickLogin();
		
		//4.Login into application with valid credentials.
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("user", "user123");
		
		//5.Goto ParticipantPage

		DashBoardPage dashBoardPage = new DashBoardPage(driver);
		dashBoardPage.gotoParticipantsPage();
		
		//6.Verify user details.
		
		String expected = "test1@gmail.com";
		
		ParticipantPage participantPage  = new ParticipantPage(driver);
		String actual  = participantPage.getUserDetails();
		
		Assert.assertEquals( actual, expected);
	}
	
	//@Test
	public void createCourseTest(){
		
		
	}
	
	//@Test
	public void createCourseWithTitle(){
		
		
	}
	
	
	
	
}
