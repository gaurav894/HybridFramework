package com.demo.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.utility.BrowserFactory;

import HybridFrameworkDesign.webpages.Loginpage;

public class LoginApp {
	WebDriver ldriver;
	@BeforeClass
	public void setup() {
		ldriver = BrowserFactory.openApplication(ldriver, "Chrome", "https://freecrm.com/index.html");
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(ldriver);
	}
	
	@Test
	public void logntoApp() {
		
		Loginpage login = PageFactory.initElements(ldriver, Loginpage.class);
		login.logintoapplication("uiautomation1991@gmail.com", "gaurav@123");
		System.out.println(ldriver.getTitle());
		
	}
}
