package PhisioWebsites.Chrome;

import org.testng.annotations.Test;

import PhisioWebsites.Base.TestBase;

public class BMIHealthCare extends TestBase{
	
     @Test
     public void bMIHealthCare() throws InterruptedException 
     {
    	driver.get("https://www.bmihealthcare.co.uk");
    	Thread.sleep(2500);
    	System.out.println("BMI HealthCare Site Launched Successfully");
     }
}