package AlertsTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_AlertOne {
	
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
		
		System.out.println("Selenium Script for testing first type of Alert");
		dr.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);
		
		dr.switchTo().frame("iframeResult");
		WebElement alertButton = dr.findElement(By.cssSelector("html>body>button"));
		alertButton.click();
		Thread.sleep(3000);
		String expectedAlertMessage = "I am an alert box!";
		String actualAlertMessage = dr.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
		dr.switchTo().alert().accept();
		 
		Thread.sleep(3000);

		dr.quit();
	}

}
