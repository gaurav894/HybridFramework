package HybridFrameworkDesign.webpages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.demo.utility.BrowserFactory;
import com.demo.utility.ConfigReader;
import com.demo.utility.ExcelDataProvider;

public class Baseclass {
	
	protected WebDriver ldriver;
	public ExcelDataProvider excel;
	public ConfigReader config;
	
	@BeforeSuite
	public void setupSuite() {
		excel = new ExcelDataProvider();
		config = new ConfigReader();
	}
	
	@BeforeClass
	public void setup() {
		ldriver = BrowserFactory.openApplication(ldriver, config.getBrowser(), config.getAppURL());
	}
	
	@AfterSuite
	public void tearDown() {
		BrowserFactory.quitBrowser(ldriver);
	}
}
