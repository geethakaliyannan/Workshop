package com.StepDefinition;

import java.io.IOException;

import com.Pages.ORHRM_Admin_Pages;
import com.Pages.OrangeHRM_Pages;
import com.Reusablefunctions.SeleniumUtility;
import com.baseclass.Library;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_step extends Library {

	SeleniumUtility seleniumutility;
	OrangeHRM_Pages orangelogin;
	ORHRM_Admin_Pages ora;

	@Given("^To open browser and navigate to the OHRM_url$")
	public void to_open_browser_and_navigate_to_the_OHRM_url() throws IOException {

		OHRM_launchApplication();

	}

	@When("^To get the title of the page$")
	public void to_get_the_title_of_the_page() {
		seleniumutility = new SeleniumUtility(driver);
		seleniumutility.getTitle();

	}

	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String username, String password) {
		orangelogin = new OrangeHRM_Pages(driver);
		orangelogin.EnteruserName(username);
		orangelogin.Enterpassword(password);

	}

	@Then("^Click submit button$")
	public void click_submit_button() {
		orangelogin.submitButton();

	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		seleniumutility = new SeleniumUtility(driver);
		seleniumutility.to_take_screenshot("src/test/resources/ScreenShort/Admin_step.png");

	}

}
