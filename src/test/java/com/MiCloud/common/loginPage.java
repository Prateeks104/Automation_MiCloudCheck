package com.MiCloud.common;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.MiCloud.browser.chromeDriver;

public class loginPage extends chromeDriver{
	
		static Actions act=new Actions(getDriver());
		
	
		public static void navigateToSignInWithMiAccount() {
			getDriver().findElement(By.xpath("//span[text()='Sign in with Mi Account']")).click();
			try {
			Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		public static void navigateToEmailIdAuthenticationPage() {
			getDriver().findElement(By.xpath("//a[text()='Sign in with password']")).click();
			try {
			Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		public static void username() {
			getDriver().findElement(By.id("username")).click();
			getDriver().findElement(By.id("username")).sendKeys("prateek.amazon.webservices@gmail.com");
		}
		
		public static void password() {
			getDriver().findElement(By.id("pwd")).sendKeys("sher.singham18");
		}

		public static void login() {
			getDriver().findElement(By.id("login-button")).click();
		}
		
		public static void loginWithCredentials() {
			navigateToSignInWithMiAccount();
			navigateToEmailIdAuthenticationPage();
			username();
			password();
			login();
		}
		
		public static void hoverToUserImageIcon() {
			WebElement el=getDriver().findElement(By.xpath("//a[contains(@class,'avatar')]"));
			act.moveToElement(el).click().build().perform();
		}
		
		public static void verifyUserName() {
			String uname=getDriver().findElement(By.xpath("//span[contains(@class,'name')]")).getAttribute("class");
			System.out.println("The attribute value is "+uname);
			boolean val=uname.contains("name");
			System.out.println("This is a basic verification of login successfull is "+val);
			Assert.assertTrue(val);
			
		}
}
