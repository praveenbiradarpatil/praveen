package Automation1.Phptravels;

import org.testng.annotations.Test;

public class Testcase1 extends Homepage {
	Launch l1=new Launch();
	
	Registrationpage r1=new Registrationpage();
 
	@Test
	public void test1() throws Exception  {
		
		 l1.Lounchbrowser();	
	 r1. register();
	
	
	}

}
