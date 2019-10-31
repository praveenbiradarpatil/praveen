package Automation1.Phptravels;

 

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

 

    public class Toursearch extends Launch
{
    
        static By Tour=By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[3]/a");
        static By Tour_Search=By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
        static By Select_City=By.xpath("//div[contains(text(),'Hurghada Sunset Desert Safari')]");
    
        static By Tour_Type=By.xpath("//span[contains(text(),'Select')]");
        static By Select_Type=By.xpath("//li[contains(text(),'Private')]");
    
        static By Check_In=By.xpath("//input[@id='DateTours']");
        static By Date=By.xpath("//div[6]//div[1]//div[1]//div[2]//div[18]");
        static By Next=By.xpath("//body[@class='with-waypoint-sticky']/div[@id='datepickers-container']/div[6]/nav[1]/div[3]/*[1]");
    
        static By Adults=By.xpath("//div[contains(@class,'col-md-12')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]");
        static By Search_Button=By.xpath("//div[contains(@class,'ftab-inner menu-horizontal-content')]//button[contains(@class,'btn btn-primary btn-block')][contains(text(),'Search')]");
    
    
        public static void TourSearch() throws Exception
     {
        	PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\praveen\\Phptravels\\src\\main\\resource\\log4j.properties");
            Thread.sleep(2000);
            driver.findElement(Tour).click();
            
        
// CITY NAME FIELD
            
            driver.findElement(Tour_Search).click();
            driver.findElement(Select_City).click();
            log.info("entering city name field");
           
// TOUR TYPE FIELD
            
            driver.findElement(Tour_Type).click();
            driver.findElement(Select_Type).click();
            log.info("entering tour field ");
           
// CHECK IN DATE FIELD
           
            driver.findElement(By.xpath("//input[@id='DateTours']")).click();
            driver.findElement(By.xpath("//div[6]//nav[1]//div[2]")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Nov')]")).click();
                                  
            for(int i = 1 ; i<=35 ; i++) 
            {            
                 String str1 = driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[2]//div["+i+"]")).getText();            
                 if(str1.equals("1")) 
                {                
                     for(int j = i ; j<=35 ; j++) 
                     {                    
                         str1 = driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                        
                         if(str1.equals(prop.getProperty("TDay"))) 
                         {                        
                             driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[2]//div["+j+"]")).click();                        
                             break;
                         }     
                     }
                 }
            }
            log.info("check in date field");

 

// NO OF ADULTS
                   
           driver.findElement(Adults).click();
           log.info("no of adults");
           
// SEARCH BUTTON
              
           driver.findElement(Search_Button).click();    
           log.info("click search");
           
//TO VERIFY  THE RESULT
        String Verify=driver.findElement(By.xpath("//*[@id=\"detail-content-sticky-nav-00\"]")).getText();
        System.out.println(Verify);
        if(Verify.equalsIgnoreCase(prop.getProperty("Tname")))
        {
        	System.out.println("pass");
        }
           
        else
        {
        	System.out.println("fail");
        }
           
     }
}