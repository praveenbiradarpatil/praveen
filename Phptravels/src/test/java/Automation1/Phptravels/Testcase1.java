package Automation1.Phptravels;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testcase1 extends Launch {
	Launch l1=new Launch();
	Homepage h1=new Homepage();
	Registrationpage r1=new Registrationpage();
	
		 
	@Test
	public void test1() throws Exception  {
		 Lounchbrowser();
		 Homepage.Signup();
	 Registrationpage. register();
	}
	 
	 @AfterTest
	 public void close() throws Exception
	 {
		 
		 driver.close();
	 }
	 
	
	
	}


