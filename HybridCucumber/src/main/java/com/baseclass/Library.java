package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	protected WebDriver driver;
	public static Properties prop;
	//public static Logger logger = LogManager.getLogger(Library.class.getName());
	public static Logger logger = Logger.getLogger(Library.class);
	public void OHRM_launchApplication() throws IOException {
		
		Logger log = Logger.getLogger(Library.class);
		
		//Logger logger = LogManager.getLogger(Library.class.getName());
				FileInputStream file=new FileInputStream("src/test/resources/Configuration_Property/Config.properties");
				
				prop=new Properties();
				prop.load(file);
				log.info("Property file is loaded");
				String browser = prop.getProperty("browser");
				String url = prop.getProperty("OHRM_url");
				try {
					
					if (browser.equalsIgnoreCase("firefox")) {
						driver = new FirefoxDriver();

					} else if (browser.equalsIgnoreCase("chrome")) {
						WebDriverManager.chromedriver().setup();
						driver = new ChromeDriver();
						log.info("chrome Browser is launched ");


					}

					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.get(url);
					
				} catch (WebDriverException e) {
					System.out.println("browser could not be launched");
				}

			}
	

		public void quit() {
			driver.close();
			
		}



	
	
	

}
