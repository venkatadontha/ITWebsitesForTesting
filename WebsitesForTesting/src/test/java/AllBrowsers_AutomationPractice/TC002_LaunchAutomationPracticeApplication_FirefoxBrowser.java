package AllBrowsers_AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC002_LaunchAutomationPracticeApplication_FirefoxBrowser {
	
	public static WebDriver dr = null;
	
	@Test
	public static void BrowserLaunch_ApplicationLaunch() throws InterruptedException
	{
		System.out.println("Initializing the browser");
		System.out.println("Launching FireFox Browser");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\git\\ITWebsitesForTesting\\WebsitesForTesting\\Drivers\\geckodriver.exe");
		dr = new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		System.out.println("Firefox Browser launched successfully and maximized successfully");
		
		System.out.println("Launching Automation Practice Application");
		dr.get("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(5000);
		
		dr.quit();
	}

}
