package com.Pages;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.LibraryClass;
import com.SeleniumUtility.Selenium_Utitlity;

public class OrangeHRM_cucuTestcase extends LibraryClass {
	OrangeHRM_cucu or;
	Selenium_Utitlity util;

	@BeforeTest
	public void beforeTest() throws IOException {
		System.out.println("beforetest");
		LaunchApplication();

	}

	@Test(priority = 1)
	public void orange_login() {

		or = new OrangeHRM_cucu(driver);
		or.EnteruserName("Admin");
		or.Enterpassword("admin123");
		or.submitButton();

	}
	/*
	 * @Test(priority = 2) public void orange_admin() { ora = new ORHRM_Admin();
	 * ora.AdminButton(); ora.sysUserName("baba"); ora.usertype("Admin");
	 * ora.Employeename("sheep"); ora.userstatus("Enabled"); ora.searchButton();
	 * 
	 * }
	 * 
	 * @AfterClass public void teardown() { util = new SeleniumUtility(driver);
	 * util.to_take_screenshot("src/test/resources/ScreenShots/OHRM_admin.png");
	 * util.getTitle(); //quit();
	 * 
	 * }
	 */
}
