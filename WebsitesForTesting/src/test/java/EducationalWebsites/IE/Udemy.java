package EducationalWebsites.IE;

import java.io.IOException;
import org.testng.annotations.Test;
import EducationalWebsites.Base.TestBase;

public class Udemy extends TestBase{
	
     @Test
     public static void udemy() throws InterruptedException, IOException 
     { 
    	 driver.get("https://www.udemy.com");
    	 Thread.sleep(15000);
    	 System.out.println("Udemy Site Launched Successfully");
     }
}
    