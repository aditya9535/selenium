package com.slokam.moodle.test.commons.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener1 implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("On completing of tests --- "+ arg0.getName()+ "onFinish will be invoked. -----");
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("On starting of tests --- onStart will be invoked. -----" + arg0.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("On failure of of test --- onTestFailure will be invoked. -----" + arg0.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("On skipping of of test --- onTestSkipped will be invoked. -----" + arg0.getName());
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("On starting of test --- onTestStart will be invoked. -----"+ arg0.getName());
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
