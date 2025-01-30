package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver Driver) {
		this.driver = Driver;
	}
	
	By Login = By.xpath("//a[@class='login']");
	
	
	public void clickLogin() {
		driver.findElement(Login).click();
	}

	
	

}
