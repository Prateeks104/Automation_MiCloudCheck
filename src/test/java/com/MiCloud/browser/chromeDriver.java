package com.MiCloud.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromeDriver{

	static WebDriver driver=null;
	
	public static void getChromeDriver() {
		
		//System.setProperty("webdriver.gecko.driver", "C:/Users/prateek.sharma2/Downloads/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "/opt/drivers/geckodriver");
		driver=new FirefoxDriver();
		getToLink();
	}
	
	public static void getToLink() {
		driver.get("https://i.mi.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
}
