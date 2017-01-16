/*package com.slokam.moodle.test.scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import br.eti.kinoshita.testlinkjavaapi.TestLinkAPI;
import br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus;
import br.eti.kinoshita.testlinkjavaapi.model.Build;
import br.eti.kinoshita.testlinkjavaapi.model.ReportTCResultResponse;
import br.eti.kinoshita.testlinkjavaapi.model.TestCase;
import br.eti.kinoshita.testlinkjavaapi.model.TestPlan;
import br.eti.kinoshita.testlinkjavaapi.model.TestProject;
import br.eti.kinoshita.testlinkjavaapi.model.TestSuite;
import br.eti.kinoshita.testlinkjavaapi.util.TestLinkAPIException;

public class SampleTestLink {
	public static String DEVKEY="d55fadfb88fd5991bcf7c94a76f82556";
	
	@Test
	public static void reportResult() throws TestLinkAPIException{
		URL url=null;
		try {
			url = new URL("http://localhost:85/testlink/lib/api/xmlrpc/v1/xmlrpc.php");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestLinkAPI api=new TestLinkAPI( url,DEVKEY);
		 XmlRpcClient  rpc = api.getXmlRpcClient();
		 TestPlan tp = api.createTestPlan("EciP", "OpenCart", "From Eclipse", true, true);
		System.out.println(tp.isActive());
		
		
		TestProject[] tps = api.getProjects();
		for (int i = 0; i < tps.length; i++) {
			TestProject testProject = tps[i];
			System.out.println("Name : " + testProject.getName() + ";   ID : " + testProject.getId());
			
			System.out.println(testProject.isEnableAutomation());
			
		}
		//api.getTestCase(testCaseId, testCaseExternalId, version)
		
		TestPlan  tp = api.getTestPlanByName("automation_tp", "OpenCart");
		System.out.println(tp.getId());
		
		List<CustomField> cc =  tp.getCustomFields();
		Map<String, Object> map = api.getTotalsForTestPlan(158);
		
		Set<String> se = map.keySet();
		for (String object : se) {
			System.out.println("key : " + object + "Value : " + map.get(object) );
		}
		for (CustomField customField : cc) {
		System.out.println( "Name " + 	customField.getName()  + "   --- ID " + customField.getId() + " Value : " + customField.getValue()); 
		}
		
		TestSuite[] ts1  =api.getTestSuitesForTestPlan(tp.getId());
		
		for (int i = 0; i < ts1.length; i++) {
			System.out.println("Test Suite ID " + ts1[i].getId() + " Name : " + ts1[i].getName());
		}
		TestCase[] tcl  = api.getTestCasesForTestSuite(ts1[0].getId() , true, null);
		
		for (int i = 0; i < tcl.length; i++) {
			System.out.println("ID "  + tcl[i].getId());
			System.out.println("Name : " + tcl[i].getName());
			System.out.println("Name : " + tcl[i].getExecutionType());
			System.out.println("Internal ID : " + tcl[i].getInternalId());
		}
		
		ReportTCResultResponse  res = 	api.setTestCaseExecutionResult(148, null, 158, ExecutionStatus.PASSED, 4, "build1", "", true, "", null, "", null, true);
		
	
	}

}
*/