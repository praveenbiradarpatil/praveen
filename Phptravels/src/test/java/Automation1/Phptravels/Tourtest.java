package Automation1.Phptravels;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Tourtest extends Toursearch {
	Launch l1=new Launch();
	Toursearch t1=new Toursearch();
  
	@Test
	public void test() throws Exception
	{
		Lounchbrowser();	
		TourSearch();
	}
	
	
	 @AfterTest
	 public void close() throws Exception
	 {
		 
		 driver.close();
	 }
}
