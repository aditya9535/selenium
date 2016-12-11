package com.slokam.moodle.test.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.moodle.test.commons.pages.DashBoardPage;
import com.slokam.moodle.test.commons.pages.HomePage;
import com.slokam.moodle.test.commons.pages.LoginPage;
import com.slokam.moodle.test.commons.utils.DataProviderManager;

public class TestLogin  extends TestBase{

	
	//@Test
	public void verifyLogin(){
		
		String username= "user";
		String password= "user123";
		HomePage homePage = new HomePage(driver);
		homePage.clickLogin();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		DashBoardPage  dashBoardPage  = new DashBoardPage(driver);
		dashBoardPage.logout();
	}
	
	
	@Test(dataProvider="loginData3" , dataProviderClass=DataProviderManager.class)
	public void verifyLoginDP(String username,String password ,String flag){
		String expected = "Invalid login, please try again";
		
		
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		DashBoardPage  dashBoardPage  = new DashBoardPage(driver);
		
		if(dashBoardPage.isLoggedin()){
			dashBoardPage.logout();
		}
		homePage.navigateToHomePage();
		
		homePage.clickLogin();
		
		loginPage.login(username, password);
		if(flag.equalsIgnoreCase("false")){
		String actual = loginPage.getErrorMessage();
		Assert.assertEquals(actual, expected);
		}else if(flag.equalsIgnoreCase("true")){
		
		dashBoardPage.logout();
		}
	}
	

	
}
