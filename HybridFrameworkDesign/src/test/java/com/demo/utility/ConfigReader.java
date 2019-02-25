package com.demo.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties pro;
	
	public ConfigReader() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(String keyName) {
		return pro.getProperty(keyName);
	}
	
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	
	public String getAppURL() {
		return pro.getProperty("AppUrl");
	}
}
