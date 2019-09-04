package com.MiCloud.runner;

import org.junit.Test;

import com.MiCloud.browser.chromeDriver;
import com.MiCloud.common.loginPage;
import com.MiCloud.verifications.loginPageVerification;


public class TestRunner {

	@Test
	public void RunnerTest() {
		chromeDriver.getChromeDriver();
		loginPage.loginWithCredentials();
		loginPageVerification.verifyUserName();
	}
	
}
