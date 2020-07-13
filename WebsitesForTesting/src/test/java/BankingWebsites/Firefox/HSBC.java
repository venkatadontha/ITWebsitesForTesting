package BankingWebsites.Firefox;

import java.io.IOException;
import org.testng.annotations.Test;
import BankingWebsites.Base.TestBase;

public class HSBC extends TestBase{
	
     @Test
     public static void hsbcBank() throws InterruptedException, IOException 
     {
    	 driver.get("https://www.hsbc.co.uk");
    	 Thread.sleep(5000);
    	 System.out.println("HSBC Bank Website Launched Successfully");
     }
}

