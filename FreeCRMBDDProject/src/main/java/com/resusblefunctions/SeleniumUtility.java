package com.resusblefunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;

public class SeleniumUtility extends Library {

	private WebDriver driver;

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

	public void getTitle() {

		System.out.println(driver.getTitle());

	}

	public void Explicitlywait(String Locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));

	}

	// Use these methods if required
	public void calenderFromPick(String val1, String val2) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(val1)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(val2)).click();

	}

	// use these methods if required
	public void calenderToPick(String val1, String val2) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(val1)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(val2)).click();

	}
	// use these methods if required

	public void checkBox(String val1) {
		driver.findElement(By.xpath(val1)).click();
	}

}
