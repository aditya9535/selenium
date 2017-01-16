package com.slokam.moodle.test.scripts;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class Gmail {

	@Test
	public void test1(){
		File dir = new File("C:\\Users\\asus\\AppData\\Local\\Temp");
		cleanDir(dir);
	/*	File file = new File("C:\\Users\\asus\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\qwosuesm.selenium22");
		FirefoxProfile profile = new FirefoxProfile(file);*/
		WebDriver driver;
		driver  =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://gmail.com/");
		driver.findElement(By.id("Email")).sendKeys("bharath.selenium22@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("selenium123");
		driver.findElement(By.id("signIn")).click();
		
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		
		
		
		sleep(3);
		
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Number of cookies are : " + cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println("Name : "  + cookie.getName() + "    value  :: " + cookie.getValue());
		}
		driver.quit();
		String fileName = getLatestProfileName(dir);
		System.out.println(fileName);
		File file = new File(fileName);
		FirefoxProfile profile = new FirefoxProfile(file);
		
		driver = new FirefoxDriver(profile);
		driver.get("https://gmail.com/");
		sleep(3);
		
		cookies = driver.manage().getCookies();
		System.out.println("Number of cookies are : " + cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println("Name : "  + cookie.getName() + "    value  :: " + cookie.getValue());
		}
	//	driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		System.out.println();
	}

	
	public void cleanDir(File dir){
		try {
			FileUtils.cleanDirectory(dir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
		} 
	}
	
	public String getLatestProfileName(File dir){
		
		File[] files = dir.listFiles(new FileFilter() {
		    public boolean accept(File file) {
		        return file.getName().startsWith("anonymous");
		    }
		});
		if(files.length>0){
			return files[0].getAbsolutePath();
		}else{
			return "";
		}
		
	}
	private void sleep(int i) {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static File[] listFilesMatching(File root, String regex) {
	    if(!root.isDirectory()) {
	        throw new IllegalArgumentException(root+" is no directory.");
	    }
	    final Pattern p = Pattern.compile(regex); // careful: could also throw an exception!
	    return root.listFiles(new FileFilter(){
	        public boolean accept(File file) {
	            return p.matcher(file.getName()).matches();
	        }
	    });
	}
	//@Test
	public void test2(){
		
	/*	File file = new File("C:\\Users\\asus\\AppData\\Local\\Temp");
		
		File[] arr= Gmail.listFilesMatching(file, "anonymous*");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}*/
		
	
	
	// list the files using a anonymous FileFilter
	/*File[] files = dir.listFiles(new FileFilter() {

	    public boolean accept(File file) {
	        return file.getName().startsWith("anonymous");
	    }
	});
	
	for (int i = 0; i < files.length; i++) {
		System.out.println(files[i]);
	}*/
	
	}
	
	
	@Test
	public  void prefs(){
		FirefoxProfile profile  = new FirefoxProfile();
		File file = new File("D:\\firebug-2.0.18-fx.xpi");
		try {
			//profile.addExtension(file);
			profile.setPreference("browser.download.useDownloadDir", false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriver driver;
		driver  =new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://gmail.com/");
	}
	
	
	
	
}
