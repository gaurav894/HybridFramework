package com.demo.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	private static String chromePath = "./Drivers/chromedriver.exe";
	public static WebDriver openApplication(WebDriver ldriver, String browser, String appUrl) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", chromePath);
			ldriver = new ChromeDriver();
			ldriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", chromePath);
			ldriver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", chromePath);
			ldriver = new InternetExplorerDriver();
		}
		else {
			System.out.println("No Valid Browser found!");
		}
		ldriver.manage().window().maximize();
		ldriver.get(appUrl);
		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return ldriver;	
	}
	
	public static void quitBrowser(WebDriver ldriver) {
		ldriver.quit();
	}
	
}
