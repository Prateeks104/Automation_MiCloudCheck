package com.MiCloud.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class chromeDriver{

	static WebDriver driver=null;
	
	public static void getChromeDriver() {
		
		//For Windows, as windows is using chromedriver. The chrome driver path is mentioned of project
		/*System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver=new ChromeDriver();*/
		
		
		//For Linux Cent OS machine, as Cent OS is using Firefox driver and the path of driver mentioned is of Cent OS machine  
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		   
		System.setProperty("webdriver.gecko.driver", "/opt/drivers/geckodriver");
		   
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setBinary(firefoxBinary);
		
		driver = new FirefoxDriver(firefoxOptions);
		
		getToLink();
	}
	
	public static void getToLink() {
		driver.get("https://i.mi.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void closeDriver() {
		driver.quit();
	}
}
