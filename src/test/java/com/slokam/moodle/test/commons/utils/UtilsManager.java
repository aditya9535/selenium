package com.slokam.moodle.test.commons.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class UtilsManager {

	
	

	static Properties props =null;
	
	private static void init(){
		File file  =new File("./src/test/resources/app.properties");
		FileInputStream fis ;
		try {
			fis = new FileInputStream(file);
			props = new Properties();
			props.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String getValue(String key){
		if(props==null){
			init();
		}
		return props.getProperty(key);
	}
	public static void main(String[] args) {
		
		System.out.println(randomString(5));
	}
	
	
	
	public static String randomString(int length){
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < length) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
		
	}
}
