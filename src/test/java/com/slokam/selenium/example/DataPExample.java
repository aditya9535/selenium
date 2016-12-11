package com.slokam.selenium.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.slokam.calculator.transactions.Add;
import com.slokam.moodle.test.commons.utils.ExcelManager;

public class DataPExample {

	
	
	@Test(dataProvider="bharath")
	public void testadd(int a , int b , int expected){
	
		Add add1 = new Add();
		int actual = add1.add(a, b);
		if(a==3){
			Assert.fail();
		}
		Assert.assertEquals(actual, expected);
	}
	
	
	@DataProvider(name="bharath")
	public Object[][] datap(){
		
		Object[][] obj = new Object[4][3];
		obj[0][0] = 1;
		obj[0][1] = 2;
		obj[0][2] = 3;
	
		obj[1][0] = 2;
		obj[1][1] = 3;
		obj[1][2] = 5;
		
		obj[2][0] = 3;
		obj[2][1] =4;
		obj[2][2] = 7;
		
		obj[3][0] = 4;
		obj[3][1] = 5;
		obj[3][2] = 9;
		
		
		return obj;
	}
	
	
	
	
	@Test(dataProvider = "loginData")
	public void login(String username, String password){
		System.out.println("Username : " + username + " : Password : " + password);
	}
	
	@DataProvider(name="loginData")
	public Object[][] dataLoginP(){
		
		ExcelManager manager = new ExcelManager();
		int size = manager.getNumberofRows();
		size = size -1;
		Object[][] obj = new Object[size][2];
		
		for (int i = 0; i < size; i++) {
			obj[i][0] = manager.getCellData(i+1, 1);
			obj[i][1] = manager.getCellData(i+1, 2);
		}
		
		return obj;
	}
	
	
}
