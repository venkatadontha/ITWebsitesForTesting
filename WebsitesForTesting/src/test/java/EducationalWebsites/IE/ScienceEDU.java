package EducationalWebsites.IE;

import java.io.IOException;
import org.testng.annotations.Test;
import EducationalWebsites.Base.TestBase;

public class ScienceEDU extends TestBase{
	
     @Test
     public static void scienceEDU() throws InterruptedException, IOException 
     { 
    	 driver.get("https://www.science.edu");
    	 Thread.sleep(15000);
    	 System.out.println("Science EDU Site Launched Successfully");
     }
}
