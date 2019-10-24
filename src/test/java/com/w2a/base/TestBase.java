package com.w2a.base;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	
	/*
	 * Webdriver
	 * properties
	 * logs
	 * extent reports
	 * DB
	 * excel
	 * mail
	 */
	
		 public static WebDriver driver;
		 public static Properties config = new Properties();
		 public static Properties OR = new Properties();
		 public static FileInputStream fis ;
		
	
	
		@BeforeSuite
		public void setUp() {
		//we initialize everything	
			
			try {
				fis = new FileInputStream("/Users/amamilapally/Desktop/FE-autoamtion/src/test/resources/properties/Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				fis = new FileInputStream("/Users/amamilapally/Desktop/FE-autoamtion/src/test/resources/properties/OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/Users/amamilapally/Desktop/FE-autoamtion/src/test/resources/executables/chromedriver");
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				
			}
			
			if (config.getProperty("browser").equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/amamilapally/Desktop/FE-autoamtion/src/test/resources/executables/geckodriver");
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
				
			}
			driver.get(config.getProperty("testsiteurl"));
			System.out.println("open browser");
		}
		
		public boolean isElementPresent(By by) {
			
			try {
				
				driver.findElement(by);
				return true;
			}catch (NoSuchElementException e) {
				return false;
			}
		}
		
/*		@AfterSuite
		public void tearDown() {
			//we quit/close everything
			if (driver!=null) {
				driver.quit();	
			}
			
		}
	*/

	
}
