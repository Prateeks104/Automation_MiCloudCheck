package com.MiCloud.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver{

	static WebDriver driver=null;
	
	public static void getChromeDriver() {
		
		System.setProperty("webdriver.chrome.driver", "D:/PersonalPractise/ProjectY3/ProjectMiCloudCheck/chromedriver.exe");
		driver=new ChromeDriver();
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
