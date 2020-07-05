package com.otherTestcase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.OrangeHRM_Pages;
import com.Reusablefunctions.SeleniumUtility;
import com.baseclass.Library;
import com.ecelutility.ExcelUtility;


public class OrangeHRM_excel extends Library {
	OrangeHRM_Pages or;
	SeleniumUtility util;

	@BeforeClass
	public void beforeTest() throws IOException {
		System.out.println("beforetest");
		OHRM_launchApplication();

	}
	public Object[][] passData() throws IOException{
		ExcelUtility read=new ExcelUtility();
		Object[][] data = read.readData("src/test/resources/TestData/cucuexcel.xlsx", "sheet1");
		return data; 
		
	}
	

	@Test(priority = 1,dataProvider="OrangeHRM")
	public void orange_login(String username,String password) {
		or = new OrangeHRM_Pages(driver);
		or.EnteruserName("username");
		or.Enterpassword("password");
		or.submitButton();
         quit();
	}
	
}
