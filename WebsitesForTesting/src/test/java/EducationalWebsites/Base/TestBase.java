package EducationalWebsites.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestBase 
{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void Initialise() throws IOException 
		{
				System.setProperty("webdriver.ie.driver","C:\\Users\\admin\\git\\ITWebsitesForTesting\\WebsitesForTesting\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
		}
	
	//THIS BELOW CODE IS TO HIGHLIGHT THE ELEMENT
	public static WebElement elementHighlight(WebElement element) throws InterruptedException 
	{
		for (int i=0; i<2; i++) 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "border: 3px solid red;");
			Thread.sleep(50);
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "");
		}
		return element;
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}