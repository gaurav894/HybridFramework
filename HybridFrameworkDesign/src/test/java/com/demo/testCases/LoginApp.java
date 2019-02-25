package com.demo.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import HybridFrameworkDesign.webpages.Baseclass;
import HybridFrameworkDesign.webpages.Loginpage;

public class LoginApp extends Baseclass{
	
	
	@Test
	public void logntoApp() throws InterruptedException {
		
		Loginpage login = PageFactory.initElements(ldriver, Loginpage.class);
		login.logintoapplication(excel.getStringData("Login", 1, 0),excel.getStringData("Login", 1, 1));
		System.out.println(ldriver.getTitle());
		
	}
}
