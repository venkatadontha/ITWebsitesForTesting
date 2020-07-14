package AllBrowsers_AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001_LaunchAutomationPracticeApplication_ChromeBrowser {
	
	public static WebDriver dr = null;
	
	@Test
	public static void BrowserLaunch_ApplicationLaunch() throws InterruptedException
	{
		System.out.println("Initializing the browser");
		System.out.println("Launching Chrome Browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\git\\ITWebsitesForTesting\\WebsitesForTesting\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		System.out.println("Chrome Browser launched successfully and maximized successfully");
		
		System.out.println("Launching Automation Practice Application");
		dr.get("http://automationpractice.com/index.php");
		Thread.sleep(5000);
		
		dr.quit();
	}

}
