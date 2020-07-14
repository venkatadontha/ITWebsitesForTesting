package AllBrowsers_AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TC003_LaunchAutomationPracticeApplication_IEBrowser {
	
	public static WebDriver dr = null;
	
	@Test
	public static void BrowserLaunch_ApplicationLaunch() throws InterruptedException
	{
		System.out.println("Initializing the browser");
		System.out.println("Launching Internet Explorer Browser");
		System.setProperty("webdriver.ie.driver","C:\\Users\\admin\\git\\ITWebsitesForTesting\\WebsitesForTesting\\IEDriverServer.exe");
		dr = new InternetExplorerDriver();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		System.out.println("Internet Explorer Browser launched successfully and maximized successfully");
		
		System.out.println("Launching Automation Practice Application");
		dr.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		dr.quit();
	}

}
