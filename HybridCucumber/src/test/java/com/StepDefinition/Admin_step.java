package com.StepDefinition;

import java.io.IOException;

import com.Pages.ORHRM_Admin_Pages;
import com.Pages.OrangeHRM_Pages;
import com.Reusablefunctions.SeleniumUtility;
import com.baseclass.Library;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Admin_step extends Library {
	
	SeleniumUtility seleniumutility;
	OrangeHRM_Pages orangelogin;
	ORHRM_Admin_Pages ora;
	
	 @Given("^To open browser and navigate to the OHRM_url $")
	    public void to_open_browser_and_navigate_to_the_ohrmurl()throws IOException {
		 System.out.println("Goinnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn here");
		 OHRM_launchApplication();
	    }

	  

	    @When("^To get the title of the page $")
	    public void to_get_the_title_of_the_page()  {
	    	seleniumutility = new SeleniumUtility(driver);
			seleniumutility.getTitle();
	    }

	@Then("^Enter user login info \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_user_login_info_and(String arg1, String arg2)  {
		orangelogin = new OrangeHRM_Pages(driver);
		System.out.println(arg1);
		System.out.println(arg2);
		orangelogin.EnteruserName(arg1);
		orangelogin.Enterpassword(arg2);
		
	}

	@Given("^click Admin page$")
	public void click_Admin_page() {
		orangelogin.submitButton();
	}

	@Then("^Enter sysuser info \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_sysuser_info(String arg1, String arg2, String arg3, String arg4)  {
		ora.sysUserName(arg1);
		ora.usertype(arg2);
		ora.Employeename(arg3);
		ora.userstatus(arg4);
	}

	@Then("^Click search button$")
	public void click_search_button()  {
		ora.searchButton();
	}

}
