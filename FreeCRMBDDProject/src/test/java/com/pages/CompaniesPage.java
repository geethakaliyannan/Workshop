package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage {
WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id=\'main-nav\']/a[4]/span")
	WebElement company;

	@FindBy(xpath = "//*[@id=\'dashboard-toolbar\']/div[2]/div/a/button")
	WebElement newbutton;

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/input")
	WebElement companyname;

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[2]/div/div/div/input")
	WebElement companyurl;

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[1]/div/input")
	WebElement Addstreet;

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[2]/div/input")
	WebElement Addcity;

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[3]/div/input")
	WebElement Addstate;

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[4]/div/input")
	WebElement Addzipcode;

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[5]/div/div[1]")
	WebElement Selectcountry;

	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[2]/input")
	WebElement phonenumber;
	
	@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[6]/div/div/textarea")
	WebElement Description;
	
	@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[12]/div[2]/div/div/div/input")
	WebElement Upload;

	@FindBy(xpath="	//*[@id=\'dashboard-toolbar\']/div[2]/div/button[2]")
	WebElement NewSave;

	@FindBy(xpath = "//*[@id=\'dashboard-toolbar\']/div[2]/div/a[2]/button/i")
	WebElement Addcontact;
	
	@FindBy(xpath = "//input[@type='text' and @name=\'first_name\']\r\n" )
	WebElement Firstname;


	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/input")
	WebElement Lastname;


	@FindBy(xpath = "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[14]/div[1]/div/div/input")
	WebElement Donottext;
	

	@FindBy(xpath = "//*[@id=\'dashboard-toolbar\']/div[2]/div/button[2]")
	WebElement Newcontactsave;
	

	@FindBy(xpath = "//*[@id=\'dashboard-toolbar\']/div[2]/div/button[2]/i")
	WebElement Export;
	
	@FindBy(xpath ="/html/body/div[3]/div/div[2]/button[1]")

	WebElement AlertOk;
	
public  CompaniesPage(WebDriver driver){
	this.driver=driver;
	
		PageFactory.initElements(driver, this);
		//System.out.println("CompaniesPage  :"+driver.toString());
		
	}
	
	public void AlertButton() {
		AlertOk.click();

	}
	public void ExportButton() {
		Export.click();

	}
	
	public void Newcontactsave() {
		Newcontactsave.click();

	}
	
	public void Donottext() {
		Donottext.click();

	}

	
	public void EnterLname(String str1){
		Lastname.sendKeys(str1);
			
	}
	

	public void EnterFname(String str1){
		Firstname.sendKeys(str1);
			
	}
	

	public void Addcontact() {
		Addcontact.click();

	}
	
	public void Clickcompany(){
	company.click();	
	}
	public void Clicknewbutton(){
		 newbutton.click();
			
	}
	public void NewSave(){
		 NewSave.click();
			
	}
	public void Entercompanname(String str1){
		companyname.sendKeys(str1);
			
	}
	
	
	public void Entercompanyurl(String str1){
		companyurl.sendKeys(str1);
			
	}
	public void EnterAddstreet(String str1){
		Addstreet.sendKeys(str1);
			
	}
	public void EnterAddstate(String str1){
		Addstate.sendKeys(str1);
			
	}
	public void Enterphonenumber(String str1){
		phonenumber.sendKeys(str1);
			
	}
	public void EnterDescription(String str1){
		Description.sendKeys(str1);
			
	}
	public void EnterAddzipcode(String str1){
		Addzipcode.sendKeys(str1);
			
	}
	public void Newupload(String str1){
		Upload.sendKeys(str1);
			
	}

	}

