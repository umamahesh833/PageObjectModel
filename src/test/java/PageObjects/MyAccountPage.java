package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
	WebDriver driver;
	
	public MyAccountPage(WebDriver Driver) {
		this.driver = Driver;
	}
	
	By OrderHistory = By.xpath("//a[@title='Orders']");
	
	
	public void ClickMyOrders() {
		driver.findElement(OrderHistory).click();
	}
}
