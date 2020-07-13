package BankingWebsites.Firefox;

import java.io.IOException;
import org.testng.annotations.Test;
import BankingWebsites.Base.TestBase;

public class Santander extends TestBase{
	
     @Test
     public static void santanderBank() throws InterruptedException, IOException 
     {
    	 driver.get("http://www.santander.co.uk");
    	 Thread.sleep(5000);
    	 System.out.println("Santander Bank Website Launched Successfully");
     }
}



