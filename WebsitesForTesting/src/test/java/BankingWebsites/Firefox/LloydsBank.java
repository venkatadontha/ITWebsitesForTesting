package BankingWebsites.Firefox;

import java.io.IOException;
import org.testng.annotations.Test;
import BankingWebsites.Base.TestBase;

public class LloydsBank extends TestBase{
	
     @Test
     public static void lloydsBank() throws InterruptedException, IOException 
     {
    	 driver.get("http://www.lloydsbank.com/");
    	 Thread.sleep(5000);
    	 System.out.println("Lloyds Bank Website Launched Successfully");
     }
}
