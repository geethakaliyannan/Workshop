package com.stepdefinition;

import org.openqa.selenium.Alert;

import com.baseclass.Library;
import com.pages.CompaniesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CompaniesStepDefinition extends Library{
	//SeleniumUtility seleniumutility;
   // CompaniesPage company;
    
    private CompaniesPage company;

    private CompaniesPage getPage()
    {
        if (company == null) {
        	company = new CompaniesPage(driver);
        }
        return company;
    }
	

@Given("^: To open companies page$")
public void to_open_companies_page() {
	// System.out.println("to_open_companies_page :"+driver.toString());
	//company=new CompaniesPage(driver);
	 getPage().Clickcompany();
	
}


@Then("^: Add new company details$")
public void add_new_company_details()  {
	//company=new CompaniesPage(driver);
	getPage().Clicknewbutton();
	getPage().Entercompanname("nalammedical");
	getPage().Entercompanyurl("www.nalammedicals.com");
	getPage().EnterAddstate("tx");
	getPage().EnterAddzipcode("75024");
}

@Then("^: user click save button$")
public void user_click_save_button()  throws Exception {
	//company=new CompaniesPage(driver);
	getPage().NewSave();
	Thread.sleep(2000);
	
}

@Then("^: close the browser$")
public void close_the_browser() {
    driver.close();
}


@Given("^: Click Company button$")
public void click_Company_button()  {
	//company=new CompaniesPage(driver);
	getPage().Clickcompany();
    
}
@Then("^: Click EXPORT button$")
public void click_EXPORT_button()  {
	//company=new CompaniesPage(driver);
	getPage().ExportButton();
    
}

@Then("^: Handle ALERT popup$")
public void handle_ALERT_popup() throws InterruptedException  {
	Thread.sleep(5000);
	Alert alert = driver.switchTo().alert();
	alert.accept();

}

@Then("^: Close the browser$")
public void Close_the_browser() {
    driver.close();
}


}




