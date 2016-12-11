package com.slokam.selenium.example;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class ExeInvoker {

	//@Test
	public void test1() throws IOException{
		
		ProcessBuilder  builder =  new ProcessBuilder("D:\\selenium_classes\\autoit\\batch22_download.exe" , "Save As" , "mnl");
		builder.start();
		
		//Runtime.getRuntime().exec("D:\\selenium_classes\\autoit\\batch22_download.exe");
	}
	
	@Test
	//System.setProperty(LibraryLoader.JACOB_DLL_PATH, "./src/test/resources/jacob-1.14.3-x64.dll");
	public void test2(){
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, new File("./src/test/resources/jacob-1.14.3-x64.dll").getAbsolutePath());
		AutoItX  auto  = new AutoItX();
		System.out.println(auto.winWait("Save As" ,"" ,10));
		auto.winActivate("Save As" );
		auto.controlClick("Save As", "", "[CLASS:Button; TEXT:&Save]");
	}
}
