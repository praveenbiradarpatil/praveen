package Automation1.Phptravels;

import org.testng.annotations.Test;

public class Testcase2 extends Homepage {
		Launch l1=new Launch();
		Loginpage log=new Loginpage();
				
	

	@Test
	public void test1() throws Exception  {
		
		 l1.Lounchbrowser();	
	      log.register();
	
	}
	}
	


