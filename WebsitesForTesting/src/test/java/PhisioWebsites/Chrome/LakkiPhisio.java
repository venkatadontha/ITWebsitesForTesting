package PhisioWebsites.Chrome;

import org.testng.annotations.Test;

import PhisioWebsites.Base.TestBase;

public class LakkiPhisio extends TestBase{
	
     @Test
     public void lakkiPhisio() throws InterruptedException 
     {
    	 driver.get("https://www.lakkyphysio.co.uk/");
    	 Thread.sleep(2500);
    	 System.out.println("Lakky Phisio Site Launched Successfully");
     }
}	