package BankingWebsites.Firefox;

import java.io.IOException;
import org.testng.annotations.Test;
import BankingWebsites.Base.TestBase;

public class CitiBank extends TestBase{
	
     @Test
     public static void citiBank() throws InterruptedException, IOException 
     {
		 driver.get("https://www.citibank.co.uk/");
    	 Thread.sleep(5000);
    	 System.out.println("Citi Bank Website Launched Successfully");
     }
}