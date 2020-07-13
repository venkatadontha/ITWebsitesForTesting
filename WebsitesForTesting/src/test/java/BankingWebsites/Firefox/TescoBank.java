package BankingWebsites.Firefox;

import java.io.IOException;
import org.testng.annotations.Test;
import BankingWebsites.Base.TestBase;

public class TescoBank extends TestBase{
	
     @Test
     public static void tescoBank() throws InterruptedException, IOException 
     {
    	 driver.get("http://www.tescobank.com/");
    	 Thread.sleep(5000);
    	 System.out.println("Tesco Bank Website Launched Successfully");
     }
}
