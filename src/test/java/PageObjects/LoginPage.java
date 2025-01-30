package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver Driver) {
		this.driver = Driver;
	}
	
	//locators
	By EmailID = By.id("email");
	By Password = By.id("passwd");
	By SignIn = By.id("SubmitLogin");
	
	//Methods for operations
	public void AppLogin(String UserName, String Passw) {
		driver.findElement(EmailID).sendKeys(UserName);
		driver.findElement(Password).sendKeys(Passw);
		driver.findElement(SignIn).click();
	}

}
