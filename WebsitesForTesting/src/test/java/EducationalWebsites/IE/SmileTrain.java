package EducationalWebsites.IE;

import java.io.IOException;
import org.testng.annotations.Test;
import EducationalWebsites.Base.TestBase;

public class SmileTrain extends TestBase{
	
     @Test
     public static void smileTrain() throws InterruptedException, IOException 
     { 
    	 driver.get("https://smiletrain.org.uk");
    	 Thread.sleep(15000);
    	 System.out.println("Smile Train Application Launched Successfully");
     }
}