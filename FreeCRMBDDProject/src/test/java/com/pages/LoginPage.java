package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(name = "email")
	 WebElement emailId;

	@FindBy(name = "password")
	 WebElement password;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement submit;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		 System.out.println("LoginPage  :"+driver.toString());
		PageFactory.initElements(driver, this);

	}
	 public String getPageTitle()
	    {
	        return driver.getTitle();
	    }


	public void Enteremail(String email) {
		
		emailId.sendKeys(email);

	}

	public void Enterpassword(String pass) {
		password.sendKeys(pass);
		

	}
	public void submitButton() {
		submit.click();

	}

}
