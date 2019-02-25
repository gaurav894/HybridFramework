package HybridFrameworkDesign.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	public WebDriver ldriver;
	
	public Loginpage(WebDriver driver) {
		this.ldriver = driver;
	}
	
	@FindBy(xpath = ".//span[@class='icon icon-xs mdi-chart-bar']") WebElement Login;
	@FindBy(name = "email") WebElement user;
	@FindBy(name = "password") WebElement pass;
	@FindBy(xpath = ".//div[@class='ui fluid large blue submit button']") WebElement submit;
	
	public void logintoapplication(String username, String password) {
		Login.click();
		user.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
	}
}
