package com.slokam.moodle.test.scripts;

public class SingletonExample {

	
	private SingletonExample(){
		
	}
	
	private static SingletonExample obj;
	
	public static SingletonExample getInstance(){
		
		if(obj==null){
			obj = new SingletonExample();
		}
		return obj;
	}
}
