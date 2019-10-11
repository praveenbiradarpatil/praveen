package Automation1.Phptravels;

import org.testng.annotations.Test;

public class hotelsearchtest3 extends Hotelsearch {
	Launch l1=new Launch();
	Hotelsearch h1=new Hotelsearch();


@Test
public void test1() throws Exception 
{
	l1.Lounchbrowser();
	h1.Fillhoteldetails();
}

}
