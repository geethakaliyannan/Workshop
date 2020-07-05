package com.Reusablefunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {
	WebDriver driver = null;

	public SeleniumUtility(WebDriver driver) {
		this.driver = driver;

	}

	public void to_take_screenshot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void selectdropdown(String id, String vtxt) {
		Select month = new Select(driver.findElement(By.id(id)));
		month.selectByVisibleText(vtxt);
	}

	public void selectdropdown_xpath(String xpath, String vtxt) {
		Select month = new Select(driver.findElement(By.xpath(xpath)));
		month.selectByVisibleText(vtxt);
	}

	public void SelectDate(String id, String vtxt) {
		WebElement dateInput = driver.findElement(By.id("DepartDate"));
		dateInput.sendKeys("vtxt");
	}

	public void datepicker(String date, String id, String xpath_img) throws Exception {
		WebElement datepicker = driver.findElement(By.id(id));
		datepicker.clear();
		datepicker.sendKeys(date);
		// Thread.sleep(1000);
		driver.findElement(By.xpath(xpath_img)).click();

	}

	public void Auto_text_select_byid(String svalue, String id) throws Exception {
		
		driver.findElement(By.id(id)).sendKeys(svalue);
		Thread.sleep(1000);
		WebElement element_move = driver.findElement(By.xpath("//*[. = '" + svalue + "']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element_move).click().build().perform();
	}

	public void locateClickCheckbox(String value) {
		
		 String Xpath = "//input[.//label[contains(.,{'"+value+"'})]]";
		//*[@id="leaveList_chkSearchFilter_checkboxgroup"]/label[2]
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 System.out.println(Xpath);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox' and @value='" +value +"']"))).click(); 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath))).click(); 
        // System.out.println(2222);

	}

	public void getTitle() {

		System.out.println(driver.getTitle());

	}

	public void Explicitlywait(String Locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(By.xpath(Locator))));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locator)));

	}

	public void quit() {
		driver.close();

	}

}
