package mavenprojectprototype;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.DesiredCapabilities;





public class BrowserSelection {
	WebDriver driver;
	public WebDriver initiateBrowserBasedOnInput(String browserName) {
		
		try {
			if (browserName.equals("FF")) {
				System.out.println("In Firefox");
				//System.setProperty("webdriver.firefox.marionette","D:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);				
				driver=new FirefoxDriver();
								
			}
			else if(browserName.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\latest19\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();			
			}
			else if(browserName.equals("Edge")) {
				System.out.println("In Edge");
				System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebdriver\\edgedriver_win32\\msedgedriver.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.edge();
				capabilities.setCapability("marionette", true);
				driver= new EdgeDriver();
			}
		}
		catch (Exception e)
		{
			System.out.println("Error During broswer initiation" + e.getStackTrace());
			//e.getStackTrace();
			
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://den00bzb.us.oracle.com:7802/em");
		driver.manage().window().maximize();
		System.out.println("Successfully intiate browser");
		return driver;
	}
	
}
