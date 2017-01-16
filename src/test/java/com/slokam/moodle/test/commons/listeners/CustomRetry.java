package com.slokam.moodle.test.commons.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetry  implements IRetryAnalyzer{

	int count = 3;
	public boolean retry(ITestResult result) {
		count--;
		if(count!=0){
			return true;
		}else 
			return false;
		
	}

}
