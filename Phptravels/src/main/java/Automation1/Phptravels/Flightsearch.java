package Automation1.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Flightsearch extends Launch {
   static By Flight=By.xpath("//span[contains(text(),'Flights')]");
   static By From_city=By.xpath("//div[@id='s2id_origin']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
   static By From_city1=By.xpath("//*[@id=\"select2-drop\"]/div/input");
   static By To_city=By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
   static By To_city1=By.xpath("//div[@id='s2id_destination']//a[@class='select2-choice select2-default']");
   static By check_in=By.xpath("//input[@id='departure']");
   static By guest=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
   
   public static void Fillflightdetails() throws InterruptedException
   {
	   //fromcity
	   driver.findElement(Flight).click();
	   driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
	   driver.findElement( From_city).click();
	   
	   driver.findElement( From_city1).sendKeys(prop.getProperty("CITYNAME1"));
	   driver.findElement(From_city1).sendKeys((Keys.DOWN));
	   Thread.sleep(1000);
	   driver.findElement(From_city1).sendKeys(Keys.ENTER);
	   
	   
	 //tocity
	   driver.findElement(To_city).click();
	   driver.findElement(To_city1).sendKeys(prop.getProperty("CITYNAME2"));
	   driver.findElement(To_city1).sendKeys((Keys.DOWN));
	   Thread.sleep(1000);
	   driver.findElement(To_city1).sendKeys(Keys.ENTER);
	   
	 //check_in
	   driver.findElement(check_in).click();
		
		//String month="December 2019";
		//String day="20";
	
		Thread.sleep(2000);
	while(true)	
	{
	String text=driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[2]")).getText();
	if(text.equals(prop.getProperty("checkin_month1")))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[3]")).click();
	}
	}
		
		driver.findElement(By.xpath("//div[16]//tr//td[contains(text(),"+prop.getProperty("checkin_day1")+")]")).click();
		//driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
        
		//guest
		driver.findElement(guest).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='madult']")).click();
		driver.findElement(By.xpath("//select[@id='madult']//option[contains(text(),"+prop.getProperty("adultno")+")]")).click();
		driver.findElement(By.xpath("//select[@id='mchildren']")).click();
		driver.findElement(By.xpath("//select[@id='mchildren']//option[contains(text(),"+prop.getProperty("childrenno")+")]")).click();
		//driver.findElement(By.xpath("//select[@id='minfant']")).click();
		//driver.findElement(By.xpath("//select[@id='minfant']//option[contains(text(),"+prop.getProperty("infant")+")]")).click();
		driver.findElement(By.xpath("//button[@id='sumManualPassenger']")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']")).click();
		
		
	   
	   
	 
   }
	
	

	/*public static void main(String[] args) throws Exception {
	  Lounchbrowser();
      Fillflightdetails();
	}*/

}
