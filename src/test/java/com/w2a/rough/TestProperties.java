package com.w2a.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties config = new Properties();
		FileInputStream fis = new FileInputStream("/Users/amamilapally/Desktop/FE-autoamtion/src/test/resources/properties/Config.properties");
		config.load(fis);
		//System.out.println( System.getProperty("user.dir"));
		///Users/amamilapally/Desktop/FE-autoamtion
		//System.out.println(config.getProperty("browser"));
		
		Properties OR = new Properties();
		fis = new FileInputStream("/Users/amamilapally/Desktop/FE-autoamtion/src/test/resources/properties/OR.properties");
		OR.load(fis);
		//System.out.println(OR.getProperty("maleoption"));
		
		
		/*driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("continue")));
		
		//driver.findElement(By.cssSelector(OR.getProperty("child"))).click();
		//driver.findElement(By.cssSelector(OR.getProperty("child"))).sendKeys("2");
		//driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector(OR.getProperty("continue"))).click();
		WebElement element= driver.findElement(By.xpath(OR.getProperty("Child_continue_xpath")));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		
		
		System.out.println("************");
		System.out.println("Clicked on no.of_child_Continue");
		System.out.println("************");
		
		
		

		//driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
		//Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("live_continue_xpath"))));
		//Thread.sleep(3000);
		WebElement element1= driver.findElement(By.xpath(OR.getProperty("live_continue_xpath")));
		System.out.println(element1);
		
		//WebElement element1=driver.findElement(By.xpath("/html[1]/body[1]/section[2]/main[1]/footer[1]/button[2]"));
		//new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(element1));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(element1).click().build().perform();
		//driver.findElement(By.className(OR.getProperty("continue_class"))).click();
		
		System.out.println("************");
		System.out.println("Clicked on city_live_Continue");
		System.out.println("************");
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		//Thread.sleep(3000);
		Select dob_month = new Select(driver.findElement(By.xpath(OR.getProperty("month"))));
		
		//dob_month.selectByValue("03");
		dob_month.selectByIndex(4);
		
		
		Select dob_dd = new Select(driver.findElement(By.xpath(OR.getProperty("DD"))));
		dob_dd.selectByIndex(4);
		
		Select dob_YYYY = new Select(driver.findElement(By.xpath(OR.getProperty("YYYY"))));
		dob_YYYY.selectByIndex(4);
		
		driver.findElement(By.xpath(OR.getProperty("DOB_continue"))).click();
		
		System.out.println("************");
		System.out.println("Clicked on dob_Continue");
		System.out.println("************");
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(OR.getProperty("ethnic_white"))).click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
		System.out.println("************");
		System.out.println("Clicked on ethnic_white");
		System.out.println("************");
		
		//driver.findElement(By.xpath(OR.getProperty("spirit_christian"))).click();	
		WebElement element2 = driver.findElement(By.xpath(OR.getProperty("spirit_christian")));
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		
		wait.until(ExpectedConditions.visibilityOf(element2)); //this will wait for elememt to be visible for 20 seconds
		element2.click(); //now it clicks on element
		
		System.out.println("************");
		System.out.println("Clicked on spirit_christian");
		System.out.println("************");
		
		
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		driver.findElement(By.xpath(OR.getProperty("denom_pefer_not_to_specify"))).click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
		System.out.println("************");
		System.out.println("Clicked on denom_pefer_not_to_specify");
		System.out.println("************");
		
		driver.findElement(By.xpath(OR.getProperty("education_Masters"))).click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		driver.findElement(By.xpath(OR.getProperty("occupation"))).sendKeys("Software");
		driver.findElement(By.xpath(OR.getProperty("occupation"))).click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		System.out.println("************");
		System.out.println("Clicked on occupation");
		System.out.println("************");
		driver.findElement(By.xpath(OR.getProperty("income"))).click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		driver.findElement(By.xpath(OR.getProperty("Smoke"))).click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		driver.findElement(By.xpath(OR.getProperty("drink"))).click();
		System.out.println("************");
		System.out.println("Clicked on drinks");
		System.out.println("************");

		WebElement element2 =driver.findElement(By.cssSelector(OR.getProperty("main")));
		System.out.println(element2);
		element2.click();
		
		WebElement element2=driver.findElement(By.cssSelector(OR.getProperty("month")));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(element2).click().build().perform();
		
		//driver.findElement(By.xpath(OR.getProperty("month"))).click();
		

		
		
		System.out.println("************");
		System.out.println("Clicked on month_dob");
		System.out.println("************");
		
	Thread.sleep(3000);*/
		
	
	}

}
