package Automation1.Phptravels;

import org.testng.annotations.Test;

public class Flighttest extends Flightsearch {
	Launch l1=new Launch();
	Flightsearch f1=new Flightsearch();
	
	
      @Test
	public static void test() throws Exception{
		Lounchbrowser();
		Fillflightdetails();
		

	}

}
