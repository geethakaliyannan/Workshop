package com.StepDefinition;
	import java.io.IOException;

	import org.openqa.selenium.WebDriver;

import com.Pages.OrangeHRM_Pages;
import com.Reusablefunctions.SeleniumUtility;
import com.baseclass.Library;
	import cucumber.api.java.After;
	import cucumber.api.java.Before;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	public class Hookstepsteps  extends Library{
	
		WebDriver driver;
		SeleniumUtility utility;
		OrangeHRM_Pages orangelogin;
		
		@Before
		public void setup() throws IOException{
			//WebDriverManager.chromedriver().setup();
			//driver =new ChromeDriver();
			//driver.get("https://opensource-demo.orangehrmlive.com/");
			OHRM_launchApplication();
		}
		
		
		
		@When("^enter username and password$")
		public void enter_username_and_password()  {
			orangelogin = new OrangeHRM_Pages(driver);
			orangelogin.EnteruserName("Admin");
			orangelogin.Enterpassword("admin123");
			
		    
		   
		}

		@Then("^click submit button$")
		public void click_submit_button()  {
			orangelogin.submitButton();
		    
		   
		}
		@After
		public void closebrowser(){
			quit();
		}


	}


