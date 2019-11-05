package com.w2a.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.w2a.base.TestBase;

public class regTest extends TestBase {

	@Test
	public void regtest() throws Throwable {
		
			driver.findElement(By.cssSelector(OR.getProperty("maleoption"))).click();
			driver.findElement(By.cssSelector(OR.getProperty("nameInput"))).sendKeys("Melissa");
			driver.findElement(By.cssSelector(OR.getProperty("zipInput"))).sendKeys("90024");//K1A 0B1
			driver.findElement(By.xpath(OR.getProperty("submit"))).click();
			System.out.println("************");
			System.out.println("Clicked on Lets go button");
			System.out.println("************");
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector(OR.getProperty("emailid"))).sendKeys("testprod.maggie4@mailinator.com");
			driver.findElement(By.cssSelector(OR.getProperty("password"))).sendKeys("password123");
			driver.findElement(By.cssSelector(OR.getProperty("select"))).click();
			driver.findElement(By.cssSelector(OR.getProperty("Regsubmit"))).click();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
			
			//Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("sharebtn"))));
			
			WebDriverWait wait1 = new WebDriverWait(driver, 60);// 1 minute 
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(OR.getProperty("sharebtn"))));
						
			driver.findElement(By.cssSelector(OR.getProperty("sharebtn"))).click();
			
			//driver.findElement(By.linkText(OR.getProperty("sharebtn_link"))).click();
			
			System.out.println("************");
			System.out.println("Clicked on Share Button");
			System.out.println("************");
			
			//How many children do you have?
			WebElement element= driver.findElement(By.xpath(OR.getProperty("Child_continue_xpath")));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			
			System.out.println("************");
			System.out.println("navigating from How many children do you have?");
			System.out.println("************");
			
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
			
			WebElement element1= driver.findElement(By.xpath(OR.getProperty("live_continue_xpath")));
			Actions actions1 = new Actions(driver);
			actions1.moveToElement(element1).click().build().perform();
			//driver.findElement(By.className(OR.getProperty("continue_class"))).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Enter your city here']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Enter your city here']")).sendKeys("Los Angeles");
			
			/*//driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
			WebElement element2=driver.findElement(By.xpath(OR.getProperty("live_continue_xpath")));
			new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element2));
			Actions actions2 = new Actions(driver);
			actions2.moveToElement(element2).click().build().perform();*/
			
			WebElement element2= driver.findElement(By.xpath(OR.getProperty("live_continue_xpath")));
			Actions actions2 = new Actions(driver);
			actions2.moveToElement(element2).click().perform();
			
			
			//driver.findElement(By.className(OR.getProperty("continue_class"))).click();
			
			System.out.println("************");
			System.out.println("navigating from Where do you live?");
			System.out.println("************");
			
			Select dob_month = new Select(driver.findElement(By.xpath(OR.getProperty("month"))));
			
			//dob_month.selectByValue("03");
			dob_month.selectByIndex(4);
			
			
			Select dob_dd = new Select(driver.findElement(By.xpath(OR.getProperty("DD"))));
			dob_dd.selectByIndex(4);
			
			Select dob_YYYY = new Select(driver.findElement(By.xpath(OR.getProperty("YYYY"))));
			dob_YYYY.selectByIndex(36);
			System.out.println(dob_YYYY);
			
			
			driver.findElement(By.xpath(OR.getProperty("DOB_continue"))).click();
			
			System.out.println("************");
			System.out.println("navigating from DOB");
			System.out.println("************");
			
			//driver.findElement(By.xpath(OR.getProperty("ethnic_white"))).click();
			
			WebElement element3 = driver.findElement(By.xpath(OR.getProperty("ethnic_white")));
			WebDriverWait wait2 = new WebDriverWait(driver, 10);
			wait2.until(ExpectedConditions.visibilityOf(element3)); //this will wait for elememt to be visible for 20 seconds
			element3.click(); //now it clicks on element
			
			//System.out.println(element3);
			
			WebElement element4 = driver.findElement(By.xpath(OR.getProperty("spirit_christian")));
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element4)); //this will wait for elememt to be visible for 20 seconds
			element4.click(); //now it clicks on element
			
			
			WebElement element5 = driver.findElement(By.xpath(OR.getProperty("denom_pefer_not_to_specify")));
			WebDriverWait wait3 = new WebDriverWait(driver, 20);
			wait3.until(ExpectedConditions.visibilityOf(element5)); //this will wait for elememt to be visible for 20 seconds
			element5.click(); //now it clicks on element
			
			WebElement element6 = driver.findElement(By.xpath(OR.getProperty("education_Masters")));
			WebDriverWait wait4 = new WebDriverWait(driver, 20);
			wait4.until(ExpectedConditions.visibilityOf(element6)); //this will wait for elememt to be visible for 20 seconds
			element6.click(); //now it clicks on element
			
			WebElement element7 = driver.findElement(By.xpath(OR.getProperty("occupation")));
			WebDriverWait wait5 = new WebDriverWait(driver, 20);
			wait5.until(ExpectedConditions.visibilityOf(element7)); //this will wait for elememt to be visible for 20 seconds
			element7.sendKeys("Software");
			
			
			WebElement element8= driver.findElement(By.xpath(OR.getProperty("Occu_continue")));
			Actions actions3 = new Actions(driver);
			actions3.moveToElement(element8).click().perform();
			
			WebElement element9 = driver.findElement(By.xpath(OR.getProperty("income")));
			WebDriverWait wait6 = new WebDriverWait(driver, 20);
			wait6.until(ExpectedConditions.visibilityOf(element9)); //this will wait for elememt to be visible for 20 seconds
			element9.click(); //now it clicks on element
			
			WebElement element10 = driver.findElement(By.xpath(OR.getProperty("Smoke")));
			WebDriverWait wait7 = new WebDriverWait(driver, 20);
			wait7.until(ExpectedConditions.visibilityOf(element10)); //this will wait for elememt to be visible for 20 seconds
			element10.click(); //now it clicks on element
			
			WebElement element11 = driver.findElement(By.xpath(OR.getProperty("drink")));
			WebDriverWait wait8 = new WebDriverWait(driver, 30);
			wait8.until(ExpectedConditions.visibilityOf(element11)); //this will wait for elememt to be visible for 20 seconds
			element11.click(); //now it clicks on element
			
			WebElement element12 = driver.findElement(By.xpath(OR.getProperty("Tall_ft")));
			WebDriverWait wait9 = new WebDriverWait(driver, 20);
			wait9.until(ExpectedConditions.visibilityOf(element12)); //this will wait for elememt to be visible for 20 seconds
			element12.sendKeys("6");
			
			WebElement element13= driver.findElement(By.xpath(OR.getProperty("height_continue")));
			Actions actions4 = new Actions(driver);
			actions4.moveToElement(element13).click().perform();
			
			WebElement element14 = driver.findElement(By.xpath(OR.getProperty("passionate")));
			WebDriverWait wait10 = new WebDriverWait(driver, 20);
			wait10.until(ExpectedConditions.visibilityOf(element14)); //this will wait for elememt to be visible for 20 seconds
			element14.sendKeys("passionate");
			
			WebElement element15= driver.findElement(By.xpath(OR.getProperty("pass_continue")));
			Actions actions5 = new Actions(driver);
			actions5.moveToElement(element15).click().perform();
			
			WebElement element16 = driver.findElement(By.xpath(OR.getProperty("leisure")));
			WebDriverWait wait11 = new WebDriverWait(driver, 20);
			wait11.until(ExpectedConditions.visibilityOf(element16)); //this will wait for elememt to be visible for 20 seconds
			element16.sendKeys("Leisure");
			
			WebElement element17= driver.findElement(By.xpath(OR.getProperty("leisure_continue")));
			Actions actions6 = new Actions(driver);
			actions6.moveToElement(element17).click().perform();
			
			WebElement element18 = driver.findElement(By.xpath(OR.getProperty("thankful_1")));
			WebDriverWait wait12 = new WebDriverWait(driver, 20);
			wait12.until(ExpectedConditions.visibilityOf(element18)); //this will wait for elememt to be visible for 20 seconds
			element18.sendKeys("God Thankful");
			
			WebElement element19 = driver.findElement(By.xpath(OR.getProperty("thankful_2")));
			WebDriverWait wait13 = new WebDriverWait(driver, 20);
			wait13.until(ExpectedConditions.visibilityOf(element19)); //this will wait for elememt to be visible for 20 seconds
			element19.sendKeys("Family Thankful");
			
			WebElement element20 = driver.findElement(By.xpath(OR.getProperty("thankful_3")));
			WebDriverWait wait14 = new WebDriverWait(driver, 20);
			wait14.until(ExpectedConditions.visibilityOf(element20)); //this will wait for elememt to be visible for 20 seconds
			element20.sendKeys("Parents Thankful");
			
			
			WebElement element21= driver.findElement(By.xpath(OR.getProperty("thank_continue")));
			Actions actions7 = new Actions(driver);
			actions7.moveToElement(element21).click().perform();
			
			
			WebElement element22= driver.findElement(By.linkText("Tell us who you're looking for"));
			Actions actions8= new Actions(driver);
			actions8.moveToElement(element22).click().perform();
			
			
			/*WebElement element23= driver.findElement(By.xpath(OR.getProperty("match_pref_tell_us")));
			Actions actions9= new Actions(driver);
			actions9.moveToElement(element23).click().perform();
			System.out.println(element23);*/
			
			/*WebElement element24= driver.findElement(By.xpath(OR.getProperty("looking_continue")));
			Actions actions10 = new Actions(driver);
			actions10.moveToElement(element24).click().perform();*/
			
			Select btw_max_age = new Select(driver.findElement(By.xpath(OR.getProperty("btw_max_age"))));
			btw_max_age.selectByIndex(33);
			//System.out.println(dob_YYYY);
			
			WebElement element24 = driver.findElement(By.xpath(OR.getProperty("looking_continue")));
			WebDriverWait wait15 = new WebDriverWait(driver, 20);
			wait15.until(ExpectedConditions.visibilityOf(element24)); //this will wait for elememt to be visible for 20 seconds
			element24.click();
			//*[@id="buttons"]/button[2]
			
			WebElement element25 = driver.findElement(By.xpath(OR.getProperty("how_far")));
			WebDriverWait wait16 = new WebDriverWait(driver, 20);
			wait16.until(ExpectedConditions.visibilityOf(element25)); //this will wait for elememt to be visible for 20 seconds
			element25.click();
			
			WebElement element26 = driver.findElement(By.xpath(OR.getProperty("match_distance")));
			WebDriverWait wait17 = new WebDriverWait(driver, 20);
			wait17.until(ExpectedConditions.visibilityOf(element26)); //this will wait for elememt to be visible for 20 seconds
			element26.click();
			
			WebElement element27= driver.findElement(By.linkText("Take the compatibility quiz"));
			Actions actions9= new Actions(driver);
			actions9.moveToElement(element27).click().perform();
			
			WebElement element28 = driver.findElement(By.cssSelector(OR.getProperty("warm_css")));
			/*WebDriverWait wait18 = new WebDriverWait(driver, 20);
			wait18.until(ExpectedConditions.visibilityOf(element28)); //this will wait for elememt to be visible for 20 seconds*/
			safeJavaScriptClick(element28);
			
			
			WebElement element29 = driver.findElement(By.cssSelector(OR.getProperty("clever_css")));
			/*WebDriverWait wait19 = new WebDriverWait(driver, 20);
			wait19.until(ExpectedConditions.visibilityOf(element29)); //this will wait for elememt to be visible for 20 seconds
			element29.isSelected();*/
			safeJavaScriptClick(element29);
			
			WebElement element30 = driver.findElement(By.xpath(OR.getProperty("dominant")));
			/*WebDriverWait wait20 = new WebDriverWait(driver, 20);
			wait20.until(ExpectedConditions.visibilityOf(element30)); //this will wait for elememt to be visible for 20 seconds
			element30.isSelected();*/
			safeJavaScriptClick(element30);
			
			WebElement element31 = driver.findElement(By.xpath(OR.getProperty("outgoing")));
			/*WebDriverWait wait21 = new WebDriverWait(driver, 20);
			wait21.until(ExpectedConditions.visibilityOf(element31)); //this will wait for elememt to be visible for 20 seconds
			element31.isSelected();*/
			safeJavaScriptClick(element31);
		
			WebElement element32 = driver.findElement(By.xpath(OR.getProperty("quarreelsome")));
			/*WebDriverWait wait22 = new WebDriverWait(driver, 20);
			wait22.until(ExpectedConditions.visibilityOf(element32)); //this will wait for elememt to be visible for 20 seconds
			element32.isSelected();*/
			safeJavaScriptClick(element32);
			
			WebElement element33 = driver.findElement(By.xpath(OR.getProperty("stable")));
			safeJavaScriptClick(element33);
			
			WebElement element34 = driver.findElement(By.xpath(OR.getProperty("energitic")));
			safeJavaScriptClick(element34);
			
			WebElement element35 = driver.findElement(By.xpath(OR.getProperty("predictable")));
			safeJavaScriptClick(element35);
			
			WebElement element36 = driver.findElement(By.xpath(OR.getProperty("affectionate")));
			safeJavaScriptClick(element36);
			
			WebElement element37 = driver.findElement(By.xpath(OR.getProperty("intelligent")));
			safeJavaScriptClick(element37);
			
			WebElement element38 = driver.findElement(By.xpath(OR.getProperty("attractive")));
			safeJavaScriptClick(element38);
			
			WebElement element39 = driver.findElement(By.xpath(OR.getProperty("compassionate")));
			safeJavaScriptClick(element39);
			
			WebElement element40 = driver.findElement(By.xpath(OR.getProperty("loyal")));
			safeJavaScriptClick(element40);
			
			WebElement element41 = driver.findElement(By.xpath(OR.getProperty("witty")));
			safeJavaScriptClick(element41);
			
			WebElement element42 = driver.findElement(By.xpath(OR.getProperty("sensitive")));
			safeJavaScriptClick(element42);
			
			WebElement element43 = driver.findElement(By.xpath(OR.getProperty("generous")));
			safeJavaScriptClick(element43);
			
			WebElement element44 = driver.findElement(By.xpath(OR.getProperty("sensual")));
			safeJavaScriptClick(element44);
			
			WebElement element45 = driver.findElement(By.xpath(OR.getProperty("stylish")));
			safeJavaScriptClick(element45);
			
			WebElement element46 = driver.findElement(By.xpath(OR.getProperty("athletic")));
			safeJavaScriptClick(element46);
			
			WebElement element47 = driver.findElement(By.xpath(OR.getProperty("overweight")));
			safeJavaScriptClick(element47);
			
			WebElement element48 = driver.findElement(By.xpath(OR.getProperty("plain")));
			safeJavaScriptClick(element48);
			
			WebElement element49 = driver.findElement(By.xpath(OR.getProperty("healthy")));
			safeJavaScriptClick(element49);
			
			WebElement element50 = driver.findElement(By.xpath(OR.getProperty("sexy")));
			safeJavaScriptClick(element50);
			
			WebElement element51 = driver.findElement(By.xpath(OR.getProperty("apperance")));
			safeJavaScriptClick(element51);
			
			WebElement element52= driver.findElement(By.linkText("Give us a glimpse of who you are"));
			Actions actions10= new Actions(driver);
			actions10.moveToElement(element52).click().perform();
			
			System.out.println("*************");
			System.out.println(element52);
			
			System.out.println("*************");
			
			WebElement element53 = driver.findElement(By.xpath(OR.getProperty("content")));
			safeJavaScriptClick(element53);
			
			
			WebElement element54 = driver.findElement(By.xpath(OR.getProperty("patient")));
			safeJavaScriptClick(element54);
			
			WebElement element55 = driver.findElement(By.xpath(OR.getProperty("passionate_1")));
			safeJavaScriptClick(element55);
			
			WebElement element56 = driver.findElement(By.xpath(OR.getProperty("caring")));
			safeJavaScriptClick(element56);
			
			WebElement element57 = driver.findElement(By.xpath(OR.getProperty("genuine")));
			safeJavaScriptClick(element57);
			
			WebElement element58 = driver.findElement(By.xpath(OR.getProperty("vivacious")));
			safeJavaScriptClick(element58);
			
			WebElement element59 = driver.findElement(By.xpath(OR.getProperty("wise")));
			safeJavaScriptClick(element59);
			
			WebElement element60 = driver.findElement(By.xpath(OR.getProperty("bossy")));
			safeJavaScriptClick(element60);
			
			WebElement element61 = driver.findElement(By.xpath(OR.getProperty("leader")));
			safeJavaScriptClick(element61);
			
			WebElement element62 = driver.findElement(By.xpath(OR.getProperty("irritable")));
			safeJavaScriptClick(element62);
			
			WebElement element63 = driver.findElement(By.xpath(OR.getProperty("kind")));
			safeJavaScriptClick(element63);
			
			WebElement element64 = driver.findElement(By.xpath(OR.getProperty("aggressive")));
			safeJavaScriptClick(element64);
			
			WebElement element65 = driver.findElement(By.xpath(OR.getProperty("outspoken")));
			safeJavaScriptClick(element65);
			
			WebElement element66 = driver.findElement(By.xpath(OR.getProperty("opinionated")));
			safeJavaScriptClick(element66);
			
			WebElement element67 = driver.findElement(By.xpath(OR.getProperty("restless")));
			safeJavaScriptClick(element67);
			
			WebElement element68 = driver.findElement(By.xpath(OR.getProperty("romantic")));
			safeJavaScriptClick(element68);
			
			WebElement element69 = driver.findElement(By.xpath(OR.getProperty("selfish")));
			safeJavaScriptClick(element69);
			
			WebElement element70 = driver.findElement(By.xpath(OR.getProperty("stubborn")));
			safeJavaScriptClick(element70);
			
			
			WebElement element71 = driver.findElement(By.xpath(OR.getProperty("work_pick_1")));
			WebDriverWait wait18 = new WebDriverWait(driver, 10);
			wait18.until(ExpectedConditions.visibilityOf(element71)); //this will wait for elememt to be visible for 20 seconds
			element71.click(); //now it clicks on element
			
			WebElement element72 = driver.findElement(By.xpath(OR.getProperty("work_pick_2")));
			WebDriverWait wait19 = new WebDriverWait(driver, 10);
			wait19.until(ExpectedConditions.visibilityOf(element72)); //this will wait for elememt to be visible for 20 seconds
			element72.click();
			
			WebElement element73 = driver.findElement(By.xpath(OR.getProperty("work_pick_3")));
			WebDriverWait wait20 = new WebDriverWait(driver, 10);
			wait20.until(ExpectedConditions.visibilityOf(element73)); //this will wait for elememt to be visible for 20 seconds
			element73.click();
			
			WebElement element74 = driver.findElement(By.xpath(OR.getProperty("work_pick_4")));
			WebDriverWait wait21 = new WebDriverWait(driver, 10);
			wait21.until(ExpectedConditions.visibilityOf(element74)); //this will wait for elememt to be visible for 20 seconds
			element74.click();
			

			WebElement element75 = driver.findElement(By.xpath(OR.getProperty("good_continue")));
			WebDriverWait wait22 = new WebDriverWait(driver, 20);
			wait22.until(ExpectedConditions.visibilityOf(element75)); //this will wait for elememt to be visible for 20 seconds
			element75.click();
			
			WebElement element76= driver.findElement(By.linkText("Tell us how you live your life"));
			Actions actions11= new Actions(driver);
			actions11.moveToElement(element76).click().perform();
			
			System.out.println("*************");
			System.out.println(element76);
			System.out.println("*************");
		
			
			WebElement element77 = driver.findElement(By.xpath(OR.getProperty("accor_plan")));
			safeJavaScriptClick(element77);
			WebElement element78 = driver.findElement(By.xpath(OR.getProperty("others")));
			safeJavaScriptClick(element78);
			WebElement element79 = driver.findElement(By.xpath(OR.getProperty("unable_things")));
			safeJavaScriptClick(element79);
			WebElement element80 = driver.findElement(By.xpath(OR.getProperty("help_others")));
			safeJavaScriptClick(element80);
			WebElement element81 = driver.findElement(By.xpath(OR.getProperty("adventure")));
			safeJavaScriptClick(element81);
			WebElement element82 = driver.findElement(By.xpath(OR.getProperty("sexual")));
			safeJavaScriptClick(element82);
			WebElement element83 = driver.findElement(By.xpath(OR.getProperty("room")));
			safeJavaScriptClick(element83);
			WebElement element84 = driver.findElement(By.xpath(OR.getProperty("higher_level")));
			safeJavaScriptClick(element84);
			WebElement element85 = driver.findElement(By.xpath(OR.getProperty("stressed")));
			safeJavaScriptClick(element85);
			WebElement element86 = driver.findElement(By.xpath(OR.getProperty("feel_good")));
			safeJavaScriptClick(element86);
			WebElement element87 = driver.findElement(By.xpath(OR.getProperty("analyzing")));
			safeJavaScriptClick(element87);
			WebElement element88 = driver.findElement(By.xpath(OR.getProperty("myself")));
			safeJavaScriptClick(element88);
			WebElement element89 = driver.findElement(By.xpath(OR.getProperty("discouraged")));
			safeJavaScriptClick(element89);
			WebElement element90 = driver.findElement(By.xpath(OR.getProperty("information")));
			safeJavaScriptClick(element90);
			WebElement element91 = driver.findElement(By.xpath(OR.getProperty("waste_time")));
			safeJavaScriptClick(element91);
			WebElement element92 = driver.findElement(By.xpath(OR.getProperty("quickly")));
			safeJavaScriptClick(element92);
			WebElement element93 = driver.findElement(By.xpath(OR.getProperty("lead")));
			safeJavaScriptClick(element93);
			WebElement element94 = driver.findElement(By.xpath(OR.getProperty("regularity")));
			safeJavaScriptClick(element94);
			WebElement element95= driver.findElement(By.xpath(OR.getProperty("people_often")));
			safeJavaScriptClick(element95);
			WebElement element96 = driver.findElement(By.xpath(OR.getProperty("angry")));
			safeJavaScriptClick(element96);
			WebElement element97 = driver.findElement(By.xpath(OR.getProperty("religious")));
			safeJavaScriptClick(element97);
			WebElement element98 = driver.findElement(By.xpath(OR.getProperty("search_info")));
			safeJavaScriptClick(element98);
			WebElement element99 = driver.findElement(By.xpath(OR.getProperty("improve_myself")));
			safeJavaScriptClick(element99);
			WebElement element100 = driver.findElement(By.xpath(OR.getProperty("physical_shape")));
			safeJavaScriptClick(element100);
			WebElement element101 = driver.findElement(By.xpath(OR.getProperty("better_people")));
			safeJavaScriptClick(element101);
			
			
			
			WebElement element102= driver.findElement(By.linkText("Talk to us about your feelings"));
			Actions actions12= new Actions(driver);
			actions12.moveToElement(element102).click().perform();
			
			System.out.println("*************");
			System.out.println(element102);			
			System.out.println("*************");
			
			WebElement element103 = driver.findElement(By.xpath(OR.getProperty("felt_happy")));
			safeJavaScriptClick(element103);
			WebElement element104 = driver.findElement(By.xpath(OR.getProperty("felt_sad")));
			safeJavaScriptClick(element104);
			WebElement element105 = driver.findElement(By.xpath(OR.getProperty("felt_anxious")));
			safeJavaScriptClick(element105);
			WebElement element106 = driver.findElement(By.xpath(OR.getProperty("felt_confident")));
			safeJavaScriptClick(element106);
			WebElement element107 = driver.findElement(By.xpath(OR.getProperty("felt_hopeful")));
			safeJavaScriptClick(element107);
			WebElement element108 = driver.findElement(By.xpath(OR.getProperty("felt_fear")));
			safeJavaScriptClick(element108);
			WebElement element109 = driver.findElement(By.xpath(OR.getProperty("felt_angry")));
			safeJavaScriptClick(element109);
			WebElement element110 = driver.findElement(By.xpath(OR.getProperty("felt_calm")));
			safeJavaScriptClick(element110);
			WebElement element111 = driver.findElement(By.xpath(OR.getProperty("felt_fortunate")));
			safeJavaScriptClick(element111);
			WebElement element112 = driver.findElement(By.xpath(OR.getProperty("felt_out_control")));
			safeJavaScriptClick(element112);
			WebElement element113 = driver.findElement(By.xpath(OR.getProperty("felt_fullfilled")));
			safeJavaScriptClick(element113);
			WebElement element114 = driver.findElement(By.xpath(OR.getProperty("felt_depressed")));
			safeJavaScriptClick(element114);
			WebElement element115 = driver.findElement(By.xpath(OR.getProperty("felt_unabletocope")));
			safeJavaScriptClick(element115);
			WebElement element116 = driver.findElement(By.xpath(OR.getProperty("felt_satisfied")));
			safeJavaScriptClick(element116);
			WebElement element117 = driver.findElement(By.xpath(OR.getProperty("felt_misunderstood")));
			safeJavaScriptClick(element117);
			WebElement element118 = driver.findElement(By.xpath(OR.getProperty("felt_plottedagainst")));
			safeJavaScriptClick(element118);
			
			
			
			
			
			
			WebElement element119= driver.findElement(By.linkText("Tell us about your interests"));
			Actions actions13= new Actions(driver);
			actions13.moveToElement(element119).click().perform();
			
			System.out.println("*************");
			System.out.println(element119);			
			System.out.println("*************");
			
			
			
			WebElement element120 = driver.findElement(By.xpath(OR.getProperty("interest_romance")));
			safeJavaScriptClick(element120);
			WebElement element121 = driver.findElement(By.xpath(OR.getProperty("interest_physical")));
			safeJavaScriptClick(element121);
			WebElement element122 = driver.findElement(By.xpath(OR.getProperty("interest_activities")));
			safeJavaScriptClick(element122);
			WebElement element123 = driver.findElement(By.xpath(OR.getProperty("interest_movies")));
			safeJavaScriptClick(element123);
			WebElement element124 = driver.findElement(By.xpath(OR.getProperty("interest_music")));
			safeJavaScriptClick(element124);
			WebElement element125 = driver.findElement(By.xpath(OR.getProperty("interest_tv")));
			safeJavaScriptClick(element125);
			WebElement element126 = driver.findElement(By.xpath(OR.getProperty("interest_reading")));
			safeJavaScriptClick(element126);
			WebElement element127 = driver.findElement(By.xpath(OR.getProperty("interest_parties")));
			safeJavaScriptClick(element127);
			WebElement element128 = driver.findElement(By.xpath(OR.getProperty("interest_dining")));
			safeJavaScriptClick(element128);
			WebElement element129= driver.findElement(By.xpath(OR.getProperty("interest_traveling")));
			safeJavaScriptClick(element129);
			WebElement element130 = driver.findElement(By.xpath(OR.getProperty("interest_shopping")));
			safeJavaScriptClick(element130);
			WebElement element131 = driver.findElement(By.xpath(OR.getProperty("interest_family")));
			safeJavaScriptClick(element131);
			WebElement element132 = driver.findElement(By.xpath(OR.getProperty("interest_friends")));
			safeJavaScriptClick(element132);
			WebElement element133 = driver.findElement(By.xpath(OR.getProperty("interest_religious")));
			safeJavaScriptClick(element133);
			WebElement element134 = driver.findElement(By.xpath(OR.getProperty("interest_religious_community")));
			safeJavaScriptClick(element134);
			WebElement element135 = driver.findElement(By.xpath(OR.getProperty("interest_religious_faith")));
			safeJavaScriptClick(element135);
			WebElement element136 = driver.findElement(By.xpath(OR.getProperty("interest_conversation")));
			safeJavaScriptClick(element136);
			WebElement element137 = driver.findElement(By.xpath(OR.getProperty("interest_hosting")));
			safeJavaScriptClick(element137);
			WebElement element138 = driver.findElement(By.xpath(OR.getProperty("interest_involvement")));
			safeJavaScriptClick(element138);
			
			
			
			WebElement element139= driver.findElement(By.linkText("Share your relationship values"));
			Actions actions14= new Actions(driver);
			actions14.moveToElement(element139).click().perform();
			
			System.out.println("*************");
			System.out.println(element139);			
			System.out.println("*************");
			
			WebElement element140 = driver.findElement(By.xpath(OR.getProperty("well_postion")));
			safeJavaScriptClick(element140);
			WebElement element141 = driver.findElement(By.xpath(OR.getProperty("well_other")));
			safeJavaScriptClick(element141);
			WebElement element142 = driver.findElement(By.xpath(OR.getProperty("well_respectful")));
			safeJavaScriptClick(element142);
			
			
			WebElement element143 = driver.findElement(By.xpath(OR.getProperty("well_conflict")));
			safeJavaScriptClick(element143);
			WebElement element144 = driver.findElement(By.xpath(OR.getProperty("well_marriage")));
			safeJavaScriptClick(element144);
			WebElement element145 = driver.findElement(By.xpath(OR.getProperty("well_involved")));
			safeJavaScriptClick(element145);
			WebElement element146 = driver.findElement(By.xpath(OR.getProperty("well_emotionally")));
			safeJavaScriptClick(element146);
			
			
			WebElement element147 = driver.findElement(By.xpath(OR.getProperty("well_serious")));
			safeJavaScriptClick(element147);
			WebElement element148 = driver.findElement(By.xpath(OR.getProperty("well_count")));
			safeJavaScriptClick(element148);
			
			WebElement element149 = driver.findElement(By.xpath(OR.getProperty("well_realtionship")));
			safeJavaScriptClick(element149);
			WebElement element150 = driver.findElement(By.xpath(OR.getProperty("well_intimacu")));
			safeJavaScriptClick(element150);
			WebElement element151 = driver.findElement(By.xpath(OR.getProperty("well_people")));
			safeJavaScriptClick(element151);
			WebElement element152 = driver.findElement(By.xpath(OR.getProperty("well_friends")));
			safeJavaScriptClick(element152);
			WebElement element153= driver.findElement(By.xpath(OR.getProperty("well_benefits")));
			safeJavaScriptClick(element153);
			WebElement element154 = driver.findElement(By.xpath(OR.getProperty("well_difficult")));
			safeJavaScriptClick(element154);
			WebElement element155 = driver.findElement(By.xpath(OR.getProperty("well_emotional")));
			safeJavaScriptClick(element155);
			WebElement element156 = driver.findElement(By.xpath(OR.getProperty("well_partner")));
			safeJavaScriptClick(element156);
			WebElement element157 = driver.findElement(By.xpath(OR.getProperty("well_sexappeal")));
			safeJavaScriptClick(element157);
			WebElement element158 = driver.findElement(By.xpath(OR.getProperty("well_partnerappearance")));
			safeJavaScriptClick(element158);
			WebElement element159 = driver.findElement(By.xpath(OR.getProperty("well_aroundmypartner")));
			safeJavaScriptClick(element159);
			WebElement element160 = driver.findElement(By.xpath(OR.getProperty("well_sexualcompatibility")));
			safeJavaScriptClick(element160);
			WebElement element161= driver.findElement(By.xpath(OR.getProperty("well_friendship")));
			safeJavaScriptClick(element161);
			WebElement element162 = driver.findElement(By.xpath(OR.getProperty("well_closeness")));
			safeJavaScriptClick(element162);
			WebElement element163 = driver.findElement(By.xpath(OR.getProperty("well_spendasmuchtime")));
			safeJavaScriptClick(element163);
			WebElement element164 = driver.findElement(By.xpath(OR.getProperty("well_specialimportant")));
			safeJavaScriptClick(element164);
			
			
			WebElement element165= driver.findElement(By.linkText("Skip"));
			Actions actions17= new Actions(driver);
			actions17.moveToElement(element165).click().perform();
			
	}
	
	
	public void safeJavaScriptClick(WebElement element) throws Exception {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Clicking on element with using java script click" + element);

				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} else {
				System.out.println("Unable to click on element");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM "+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to click on element "+ e.getStackTrace());
		}
	}



}

	

