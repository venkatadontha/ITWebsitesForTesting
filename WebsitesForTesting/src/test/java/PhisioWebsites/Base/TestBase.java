package PhisioWebsites.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestBase 
{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void Initialise() throws IOException 
		{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\GITProjects\\WebsitesForTesting\\Drivers\\chromedriver.exe");
		 		driver = new ChromeDriver();
		 		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}