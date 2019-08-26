package com.MiCloud.runner;

import org.junit.Test;

import com.MiCloud.browser.chromeDriver;
import com.MiCloud.common.loginPage;


public class TestRunner {

	@Test
	public void RunnerTest() {
		chromeDriver.getChromeDriver();
		loginPage.loginWithCredentials();
	
	}
	
}
