package com.MiCloud.common;

import org.openqa.selenium.By;

import com.MiCloud.browser.chromeDriver;

public class loginPage extends chromeDriver{
	
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
}
