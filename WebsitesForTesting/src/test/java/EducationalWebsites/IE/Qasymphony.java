package EducationalWebsites.IE;

import java.io.IOException;
import org.testng.annotations.Test;
import EducationalWebsites.Base.TestBase;

public class Qasymphony extends TestBase{
	
     @Test
     public static void qaSymphoney() throws InterruptedException, IOException 
     { 
    	 driver.get("https://www.qasymphony.com/");
    	 Thread.sleep(15000);
    	 System.out.println("QA Symphony Site Launched Successfully");
     }
}
    	 
