/*package com.slokam.moodle.test.scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import br.eti.kinoshita.testlinkjavaapi.TestLinkAPI;
import br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus;
import br.eti.kinoshita.testlinkjavaapi.model.Build;
import br.eti.kinoshita.testlinkjavaapi.model.ReportTCResultResponse;
import br.eti.kinoshita.testlinkjavaapi.model.TestProject;
@Listeners(value=CustomList.class)
public class TestLinkExample {

	public static TestLinkAPI api = null;
	String testlinkUrl = "http://localhost:85/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
	String devKey = "d55fadfb88fd5991bcf7c94a76f82556";
	public static Build build = null;
	@BeforeClass
	public void init(){
		URL url=null;
		try {
			url = new URL(testlinkUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		api=new TestLinkAPI( url,devKey);
		build = api.createBuild(175, "Automation_"+System.currentTimeMillis(), "Executed on so and so time need to be executed.");
	}


	
	
	@Test()
	
	public void test1(){
		System.out.println("I am test1");
		Assert.fail("This is failed");
		ReportTCResultResponse  res = 	api.setTestCaseExecutionResult(163, null, 175, ExecutionStatus.PASSED, build.getId(), build.getName(), "", true, "", null, "", null, true);
		System.out.println(res.getMessage());;
	}
	
	@Test(testName="166")
	public void test2(){
		System.out.println("I am test2");
		ReportTCResultResponse  res = 	api.setTestCaseExecutionResult(166, null, 175, ExecutionStatus.PASSED, build.getId(), build.getName(), "", true, "", null, "", null, true);
		System.out.println(res.getMessage());;
	}
	
	@Test(description="ID 169" ,testName="169")
	public void test3(){
		System.out.println("I am test3");
		ReportTCResultResponse  res = 	api.setTestCaseExecutionResult(169, null, 175, ExecutionStatus.PASSED, build.getId(), build.getName(), "", true, "", null, "", null, true);
		System.out.println(res.getMessage());;
	}
	
	@Test(dependsOnMethods="test1" ,testName="172")
	public void test4(){
		System.out.println("I am test4");
		ReportTCResultResponse  res = 	api.setTestCaseExecutionResult(172, null, 175, ExecutionStatus.PASSED, build.getId(), build.getName(), "", true, "", null, "", null, true);
		System.out.println(res.getMessage());;
	}
	
	//@Test
	public void testConnection(){
		TestProject[] projs = 	api.getProjects();
		System.out.println(projs[0].getName());
		ReportTCResultResponse  res = 	api.setTestCaseExecutionResult(163, null, 175, ExecutionStatus.PASSED, build.getId(), build.getName(), "", true, "", null, "", null, true);
		System.out.println(res.getMessage());;
	}
	
	public int createBuild(){
		
		return 1;
	}
	
	
}
*/