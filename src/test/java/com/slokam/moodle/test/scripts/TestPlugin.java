package com.slokam.moodle.test.scripts;

import org.testng.annotations.Test;

import com.slokam.moodle.test.commons.ConstantInterface;
import com.slokam.moodle.test.commons.CustomConstants;
import com.slokam.moodle.test.commons.pages.DashBoardPage;
import com.slokam.moodle.test.commons.pages.HomePage;
import com.slokam.moodle.test.commons.pages.LoginPage;

public class TestPlugin extends TestBase {

	@Test
	public void verifyWebServices() {

		// 2.Verify HomePage displayed.
		// 3.Click on login link
		HomePage homePage = new HomePage(driver);
		homePage.clickLogin();

		// 4.Login into application with valid credentials.
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("user", "user123");

		DashBoardPage dashBoardPage = new DashBoardPage(driver);
		dashBoardPage.navigateToPage(ConstantInterface.LANGUAGE, ConstantInterface.LANGUAGE_PACKS);
		//dashBoardPage.navigateToPage(CustomConstants.REGISTRATION);
	}
}
