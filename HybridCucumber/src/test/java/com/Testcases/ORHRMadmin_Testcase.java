package com.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.Pages.ORHRM_Admin_Pages;
import com.Pages.OrangeHRM_Pages;
import com.Reusablefunctions.SeleniumUtility;

public class ORHRMadmin_Testcase extends Library {
	OrangeHRM_Pages or;
	ORHRM_Admin_Pages ora;
	SeleniumUtility util;

	@BeforeTest
	public void beforeTest() throws IOException {
		System.out.println("beforetest");
		OHRM_launchApplication();
	}
	
	@Test(priority = 1)
	public void orange_login() {

		or = new OrangeHRM_Pages(driver);
		or.EnteruserName("Admin");
		or.Enterpassword("admin123");
		or.submitButton();

	}
	
		
	@Test(priority = 2)
	public void orange_admin() {
        ora=new ORHRM_Admin_Pages(driver);
		ora.AdminButton();
		ora.sysUserName("baba");
		ora.usertype("Admin");
		ora.Employeename("sheep");
		ora.userstatus("Enabled");
		ora.searchButton();

	}

	@AfterClass
	public void teardown() {
		util = new SeleniumUtility(driver);
		util.to_take_screenshot("src/test/resources/ScreenShots/OHRM_admin.png");
		util.getTitle();
		// quit(); {

	}
}
