package com.slokam.moodle.test.commons.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.slokam.moodle.test.scripts.TestBase;

public class CustomListener extends TestListenerAdapter{

	WebDriver driver = TestBase.driver;
	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("D:\\screenshot_" +tr.getMethod().getMethodName() + "_" +System.currentTimeMillis() + ".jpeg");
	/*	File soruce  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File dest =  new File("D:\\screenshot_" +tr.getMethod().getMethodName() + "_" +System.currentTimeMillis() + ".jpeg");
		
		try {
      			FileUtils.copyFile(soruce, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	public void onTestStart(ITestResult arg0) {
		System.out.println("On starting of test --- onTestStart will be invoked. -----"+ arg0.getName());
		
	}
}
