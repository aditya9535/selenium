package com.slokam.selenium.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class A {

	@Test
	public void test1() {

		int i[] = { 10, 20, 40, 45 };
		System.out.println(i[2]);
		int j[][] = { { 30, 4, 3, 4, 2 }, 
					{ 30, 4, 3, 4, 2 }, 
					i,
					{3,4,3,4,5},
					{3}};

		int jj[] = j[1];
		int val = jj[2];
		val = j[1][2];

		String st[][] = { { "ad", "df" }, { "sdf", "fff" }  };
		
		
		
		int a[] = new int[5];
		a[0] = 33;
		a[1] = 22;
		a[2] = 344;
		
		
		int d2[][] = new int[4][3];
		
		d2[0][0] = 10;
		d2[4][2] = 30;
				
	}
}
