package com.otherTestcase;


import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pages.OrangeHRM_Pages;
import com.Reusablefunctions.SeleniumUtility;
import com.baseclass.Library;
import com.ecelutility.ExcelUtility;

public class ORHRM_DAtaprovider extends Library{
	
	OrangeHRM_Pages or;
	SeleniumUtility utility;
	@BeforeClass
	public void setup() throws IOException{
		OHRM_launchApplication();
		
	}
	
	@DataProvider(name="orangehrm")
	public Object[][] passData() throws IOException, InterruptedException{
		ExcelUtility read=new ExcelUtility();
		Thread.sleep(2000);	
		Object[][] data = read.readData("src/test/resources/TestData/cucuexcel.xlsx", "Sheet1");
		return data;
	}
	@Test(dataProvider="orangehrm")
	public void orange_login(String username,String password) throws IOException, InterruptedException {
		or = new OrangeHRM_Pages(driver);
		or.EnteruserName(username);
		Thread.sleep(1000);	
		or.Enterpassword(password);
		Thread.sleep(1000);	
		or.submitButton();
         quit();
		
	}
	
	@AfterClass
	public void teardown(){
		utility= new SeleniumUtility(driver);
		utility.to_take_screenshot("src/test/resources/ScreenShots/ORHRM_DAtaprovider.png");
		utility.getTitle();
		quit();
	}


}


