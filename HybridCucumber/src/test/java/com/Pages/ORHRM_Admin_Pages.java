package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Library;

public class ORHRM_Admin_Pages extends Library{
	WebDriver driver;
	

	@FindBy(xpath="//*[@id=\'menu_admin_viewAdminModule\']")
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
	
	public ORHRM_Admin_Pages(WebDriver driver){
		this.driver=driver;
			System.out.println("Test111111111111111111111111111111");
			PageFactory.initElements(driver, this);
			
		}
	
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
	
	}
	

}
