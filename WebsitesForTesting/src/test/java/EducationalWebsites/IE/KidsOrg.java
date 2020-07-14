package EducationalWebsites.IE;

import java.io.IOException;
import org.testng.annotations.Test;
import EducationalWebsites.Base.TestBase;

public class KidsOrg extends TestBase{
	
     @Test
     public static void kidsOrg() throws InterruptedException, IOException 
     { 
    	 driver.get("https://www.kids.org.uk");
    	 Thread.sleep(15000);
    	 System.out.println("Kids Org Site Launched Successfully");
    	 driver.quit();
     }
}

