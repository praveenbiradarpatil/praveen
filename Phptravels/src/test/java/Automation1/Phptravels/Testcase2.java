package Automation1.Phptravels;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testcase2 extends Launch {
		Launch l1=new Launch();
		Homepage h1=new Homepage();
		Loginpage log1=new Loginpage();
					
	   @Test
	    public void test1() throws Exception  {
		   l1.Lounchbrowser();
		 h1.login();
		 log1.register();
	     
	   }
	   
		 @AfterTest
		 public void close() throws Exception
		 {
			 
			 driver.close();
		 }
	}

	


