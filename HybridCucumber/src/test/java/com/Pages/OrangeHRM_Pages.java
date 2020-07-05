package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.Library;

public class OrangeHRM_Pages extends Library {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement submit;
	
	
public OrangeHRM_Pages(WebDriver driver){
	this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	public void EnteruserName(String uName){
		userName.sendKeys(uName);
			
	}

	public void Enterpassword(String pass){
		password.sendKeys(pass);
			
	}
	public void submitButton(){
		submit.click();
			
	}

			
	}


	


