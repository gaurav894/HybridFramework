package com.demo.utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static void takeScreenshot(WebDriver driver, String name) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		try {
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./Screenshots/"+name+".png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public static void handleAlerts() {
		
	}
	
	public static void handleWindows() {
		
	}
	
	public static void handleframes() {
		
	}
	
	public static void handlehiddenElemnts() {
		
	}
}
