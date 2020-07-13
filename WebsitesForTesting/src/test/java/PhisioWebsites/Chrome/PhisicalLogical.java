package PhisioWebsites.Chrome;

import org.testng.annotations.Test;

import PhisioWebsites.Base.TestBase;

public class PhisicalLogical extends TestBase{
	
     @Test
     public void phisioLogical() throws InterruptedException 
     {
    	 driver.get("https://physio-logical.net/");
    	 Thread.sleep(5000);
    	 System.out.println("Phisical Logical Site Launched Successfully");
     }
}	

