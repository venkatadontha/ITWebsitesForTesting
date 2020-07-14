package AlertsTesting;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC002_AlertTwo {
	
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
		
		System.out.println("Selenium Script for testing second type of Alert");
		dr.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		Thread.sleep(3000);
		
		dr.switchTo().frame("iframeResult");
		WebElement confirmButton = dr.findElement(By.cssSelector("html>body>button"));
		WebElement actualConfirmMessage = dr.findElement(By.cssSelector("#demo"));
		confirmButton.click();
		dr.switchTo().alert().accept();
		Thread.sleep(3000);
		assertEquals("You pressed OK!", actualConfirmMessage.getText());	
		confirmButton.click();
		dr.switchTo().alert().dismiss();
		assertEquals("You pressed Cancel!",actualConfirmMessage.getText());
		 
		Thread.sleep(3000);

		dr.quit();
	}

}
