package com.slokam.moodle.test.commons.utils;

import org.testng.annotations.DataProvider;

public class DataProviderManager {

	
	
	@DataProvider(name="loginData")
	public static Object[][] dataLoginP(){
		
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
	
	
	@DataProvider(name="loginData3")
	public static Object[][] dataLoginP3(){
		
		ExcelManager manager = new ExcelManager();
		int size = manager.getNumberofRows();
		size = size -1;
		Object[][] obj = new Object[size][3];
		
		for (int i = 0; i < size; i++) {
			obj[i][0] = manager.getCellData(i+1, 1);
			obj[i][1] = manager.getCellData(i+1, 2);
			obj[i][2] = manager.getCellData(i+1, 3);
		}
		
		return obj;
	}
}
