package Automation1.Phptravels;

import org.testng.annotations.Test;

public class Cartest extends Carsearch{
    Launch l1=new Launch();
    Carsearch c1=new Carsearch();
    
     @Test
     public void test() throws Exception
     {
    	 Lounchbrowser();
    	 Fillcardetails();
     }
}
