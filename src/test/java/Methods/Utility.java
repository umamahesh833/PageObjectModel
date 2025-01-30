package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Utility {
	WebDriver Driver;
	
	public WebDriver  LaunchBrowser(String BrowserName) {

		
		if(BrowserName == "CHROME") {
			//Give the path of the browser driver
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Dec 2024\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			//Launch the browser
			 Driver = new ChromeDriver();
		}else if(BrowserName == "EDGE") {
			//Give path of edge driver
			System.setProperty("webdriver.edge.driver", "C:\\Selenium Dec 2024\\edgedriver_win64\\msedgedriver.exe");
			//Launch the browser
			 Driver = new EdgeDriver();
		}

		//Maximize the browser
		Driver.manage().window().maximize();
		Driver.get("http://www.automationpractice.pl/index.php");
		
		
		//Page load time of 20 seconds
		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Implicit wait time of 30 seconds
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return Driver;
	}
	
	public void BrowserCLose() {
		Driver.close();
	}

}
