/*package com.slokam.moodle.test.scripts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus;
import br.eti.kinoshita.testlinkjavaapi.model.ReportTCResultResponse;

public class CustomList implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		int id = Integer.parseInt(result.getTestClass().getTestName());
		System.out.println(id);
		ReportTCResultResponse  res = 	TestLinkExample.api.setTestCaseExecutionResult(id, null, 175, ExecutionStatus.PASSED, TestLinkExample.build.getId(), TestLinkExample.build.getName(), "", true, "", null, "", null, true);
		System.out.println(res.getMessage());;
	}

	public void onTestFailure(ITestResult result) {
		
		int id = Integer.parseInt(result.getTestClass().getTestName());
		System.out.println(id);
		ReportTCResultResponse  res = 	TestLinkExample.api.setTestCaseExecutionResult(id, null, 175, ExecutionStatus.FAILED, TestLinkExample.build.getId(), TestLinkExample.build.getName(), "", true, "", null, "", null, true);
		System.out.println(res.getMessage());;
		
	}

	public void onTestSkipped(ITestResult result) {
		int id = Integer.parseInt(result.getTestClass().getTestName());
		System.out.println(id);
		ReportTCResultResponse  res = 	TestLinkExample.api.setTestCaseExecutionResult(id, null, 175, ExecutionStatus.BLOCKED, TestLinkExample.build.getId(), TestLinkExample.build.getName(), "", true, "", null, "", null, true);
		System.out.println(res.getMessage());;
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
}
*/