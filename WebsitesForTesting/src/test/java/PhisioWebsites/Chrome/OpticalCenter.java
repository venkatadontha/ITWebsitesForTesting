package PhisioWebsites.Chrome;

import org.testng.annotations.Test;

import PhisioWebsites.Base.TestBase;

public class OpticalCenter extends TestBase{
	
     @Test
     public void optimalCentre() throws InterruptedException 
     {
    	 driver.get("http://www.optimalcentre.co.uk/");
    	 Thread.sleep(5000);
    	 System.out.println("Optical Centre Site Launched Successfully");
     }
}	