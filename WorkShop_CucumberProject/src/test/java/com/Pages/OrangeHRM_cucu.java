package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.LibraryClass;

public class OrangeHRM_cucu extends LibraryClass {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement submit;
	
	

/*	@FindBy(id="menu_admin_viewAdminModule")
	WebElement submit1;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement systemuser;
	
	@FindBy(id="searchSystemUser_userType")
	WebElement usertype;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement employeename;
	
	@FindBy(id="searchSystemUser_status")
	WebElement userstatus;
	
	@FindBy(id="searchBtn")
	WebElement search;
	
	public void usertype(String type) {

		Select mm = new Select(usertype);
		mm.selectByVisibleText(type);

	}

	public void userstatus(String status) {

		Select mm = new Select(userstatus);
		mm.selectByVisibleText(status);

	}
	public void sysUserName(String uName){
		 systemuser.sendKeys(uName);
			
	}
	public void Employeename(String uName){
		employeename.sendKeys(uName);
			
	}
	public void AdminButton(){
		submit1.click();
			
	}
	public void searchButton(){
		search.click();
	
	}*/
	
public OrangeHRM_cucu(WebDriver driver){
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


	


