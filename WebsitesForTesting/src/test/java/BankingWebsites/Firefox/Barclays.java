package BankingWebsites.Firefox;

import java.io.IOException;
import org.testng.annotations.Test;
import BankingWebsites.Base.TestBase;

public class Barclays extends TestBase{
	
     @Test
     public static void barclaysBank() throws InterruptedException, IOException 
     {
    	 driver.get("https://www.barclays.co.uk/");
    	 Thread.sleep(5000);
    	 System.out.println("Barclays Bank Website Launched Successfully");
     }
}