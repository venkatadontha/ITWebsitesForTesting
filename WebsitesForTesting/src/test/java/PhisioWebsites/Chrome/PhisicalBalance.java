package PhisioWebsites.Chrome;

import org.testng.annotations.Test;

import PhisioWebsites.Base.TestBase;

public class PhisicalBalance extends TestBase{
	
     @Test
     public void phisicalBalance() throws InterruptedException 
     {
    	 driver.get("https://physicalbalance.com/");
    	 Thread.sleep(5000);
    	 System.out.println("Phisical Balance Site Launched Successfully");
     }
}	