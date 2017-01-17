package com.slokam.moodle.test.scripts;

import org.testng.annotations.Test;

public class ReportsExample {

	@Test
	public void test1(){
		System.out.println(SingletonExample.getInstance());
		System.out.println(SingletonExample.getInstance());
		System.out.println(SingletonExample.getInstance());
		System.out.println(SingletonExample.getInstance());
		
		System.out.println(new ReportsExample());
		System.out.println(new ReportsExample());
		System.out.println(new ReportsExample());
		System.out.println(new ReportsExample());
		
	}
	
}
