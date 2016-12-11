package com.slokam.selenium.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.calculator.transactions.Add;

public class TestAdd {

	
	@Test
	public void verifyAddFunctionwithPositiveNumbers(){
		
	//Input data 
		int a  = 30;
		int b = 20;
		int expected  = 50;
		
		Add add1 = new Add();
		int actual = add1.add(a, b);
		Assert.assertEquals(actual, expected);
	}	
	
	@Test
	public void verifyAddFunctionwithNegetiveNumbers(){
		
	//Input data 
		int a  = -30;
		int b = -40;
		int expected  = -70;
		
		Add add1 = new Add();
		int actual = add1.add(a, b);
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyAddFunctionwithPositiveNegetiveNumbers(){
		
	//Input data 
		int a  = -30;
		int b = 40;
		int expected  = 10;
		
		Add add1 = new Add();
		int actual = add1.add(a, b);
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyAddFunctionwithZeroNumbers(){
		
	//Input data 
		int a  = 0;
		int b = 0;
		int expected  = 0;
		
		Add add1 = new Add();
		int actual = add1.add(a, b);
		Assert.assertEquals(actual, expected);
	}
	
	
	@Test
	public void testadd(int a , int b , int expected){
	
		Add add1 = new Add();
		int actual = add1.add(a, b);
		if(a==41){
			Assert.fail();
		}
		Assert.assertEquals(actual, expected);
	}
	
	/*@Test
	public void test1(){
		int b =30;
		int a = 40;
		for (int i = 0; i < 4; i++) {
			testadd(a, b, a+b);
			a = a + i;
			b= b+i;
		}
	}*/
}
