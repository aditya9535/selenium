package com.slokam.moodle.test.scripts;

import org.testng.annotations.Test;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class AutoItExample {

	//@Test
	public void testUpload(){
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, "D:\\DUMP\\Downloads\\jacob-1.18 (1)\\jacob-1.18\\jacob-1.18-x64.dll");
		AutoItX auto = new AutoItX();
		auto.winWait("Open","",10);
		auto.winActivate("Open");
		
		auto.controlSend("Open", "", "[CLASS:Edit; INSTANCE:1]", "bharath.jpeg");
		auto.controlClick("Open", "", "[CLASS:Button; INSTANCE:1]");
	}
	
	
	@Test
	public void testNotepad(){
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, "D:\\DUMP\\Downloads\\jacob-1.18 (1)\\jacob-1.18\\jacob-1.18-x64.dll");
		AutoItX auto = new AutoItX();
		
		 auto.send("{#r}" ,false);
		 
		/*auto.winWait("Open","",10);
		auto.winActivate("Open");
		
		auto.controlSend("Open", "", "[CLASS:Edit; INSTANCE:1]", "bharath.jpeg");
		auto.controlClick("Open", "", "[CLASS:Button; INSTANCE:1]");*/
	}
}
