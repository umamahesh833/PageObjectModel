package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Methods.Utility;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;

public class HomePageTests {
	WebDriver Driver;

	@Test
	public void TestLogin() {
			Utility ObjUtill = new Utility();
			//Launching Browser
			Driver = ObjUtill.LaunchBrowser("EDGE");
			
			HomePage ObjHomePage = new HomePage(Driver);
			LoginPage ObjLoginPage = new LoginPage(Driver);
			
			//CLick on SignIn
			ObjHomePage.clickLogin();
			
			//Login to application
			ObjLoginPage.AppLogin("umamahesh833@gmail.com", "Mother@123");
			
			ObjUtill.BrowserCLose();
	}
	
	
	@Test
	public void TestFirstOrderPrice() {
		Utility ObjUtill = new Utility();
		//Launching Browser
		Driver = ObjUtill.LaunchBrowser("CHROME");
		
		HomePage ObjHomePage = new HomePage(Driver);
		LoginPage ObjLoginPage = new LoginPage(Driver);
		MyAccountPage ObjMyAccPage = new MyAccountPage(Driver);
		
		//CLick on SignIn
		ObjHomePage.clickLogin();
		
		//Login to application
		ObjLoginPage.AppLogin("umamahesh833@gmail.com", "Mother@123");
		
		//CLick on order History
		ObjMyAccPage.ClickMyOrders();
	}
	
	@Test
	public void TestLastOrderPrice() {
		Utility ObjUtill = new Utility();
		//Launching Browser
		Driver = ObjUtill.LaunchBrowser("CHROME");
		
		HomePage ObjHomePage = new HomePage(Driver);
		LoginPage ObjLoginPage = new LoginPage(Driver);
		MyAccountPage ObjMyAccPage = new MyAccountPage(Driver);
		
		//CLick on SignIn
		ObjHomePage.clickLogin();
		
		//Login to application
		ObjLoginPage.AppLogin("umamahesh833@gmail.com", "Mother@123");
		
		//CLick on order History
		ObjMyAccPage.ClickMyOrders();

		//Added more tests in report
	}


}
