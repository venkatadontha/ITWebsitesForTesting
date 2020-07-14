package AlertsTesting;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003_AlertThree {
	
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
		
		System.out.println("Selenium Script for testing third type of Alert");
		dr.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(3000);
		
		dr.switchTo().frame("iframeResult");
		WebElement promptButton = dr.findElement(By.cssSelector("html>body>button"));
		WebElement actualPromptMessage = dr.findElement(By.cssSelector("#demo"));
		promptButton.click();
		dr.switchTo().alert().sendKeys("SW Test Academy");
		Thread.sleep(3000);
		dr.switchTo().alert().accept();
		assertEquals("Hello SW Test Academy! How are you today?",actualPromptMessage.getText());
		 
		Thread.sleep(3000);

		dr.quit();
	}

}
