package com.slokam.selenium.example;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

public class TestParllel {
	public static Logger log = LogManager.getLogger(TestParllel.class);
	@Test
	public void test1() {
		
		
		log.info("Test1 started at " + System.currentTimeMillis());
		//sleep(10);
		log.info("Test1 Ends at " + System.currentTimeMillis());
	}
	@Test
	public void test2() {

		log.info("Test2 started at " + System.currentTimeMillis());
		//sleep(5);
		log.info("Test2 Ends at " + System.currentTimeMillis());
	}
	@Test
	public void test3() {

		log.debug("Test3 started at " + System.currentTimeMillis());
		//sleep(20);
		log.debug("Test3 Ends at " + System.currentTimeMillis());
	}
	@Test
	public void test4() {

		log.debug("Test4 started at " + System.currentTimeMillis());
		//sleep(8);
		log.debug("Test4 Ends at " + System.currentTimeMillis());
	}

	public void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
