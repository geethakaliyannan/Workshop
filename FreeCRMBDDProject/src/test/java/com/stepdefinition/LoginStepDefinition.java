package com.stepdefinition;

import com.baseclass.Library;
import com.pages.LoginPage;
//import com.resusblefunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends Library{
	
	//SeleniumUtility seleniumutility;
	//LoginPage homepage;
	
	
	private LoginPage login;

    private LoginPage getPage()
    {
        if (login == null) {
        	System.out.println("i am here in home  first time getpage :");
            login = new LoginPage(driver);
        }
        System.out.println("i am here in home not first time getpage :"+driver.toString());
        return login;
    }
	
	@Given("^User is on free crm login page$")
	public void user_is_on_free_crm_login_page() throws Exception  {
		launchApplication();
		System.out.println("user is on home page");
	    
	    
	}

	@When("^Title of the page is Free CRM$")
	public void title_of_the_page_is_Free_CRM()  {
		//homepage = new LoginPage(driver);
		getPage().getPageTitle();
		
	    
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		//homepage = new LoginPage(driver);
		getPage().Enteremail(username);
		getPage().Enterpassword(password);
		
	    
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button()  {
		//homepage = new LoginPage(driver);
		getPage().submitButton();
	   
	}

	@Then("^User is on home page$")
	public void user_is_on_home_page()  {
		System.out.println("user is on homepage");
	    
	}


	
	
	
	

}
