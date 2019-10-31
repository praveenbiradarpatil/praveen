
package Automation1.Phptravels;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import Automation1.Phptravels.Launch;


public class Flightsearch extends Launch{
      static By Flight=By.xpath("//a[contains(@class,'text-center flights')]");
       static By From_city=By.xpath("//div[@id='s2id_location_from']");
       static By From_city1=By.xpath("//div[@id='s2id_location_from']//a[@class='select2-choice']");
       static By To_city=By.xpath("//div[@id='s2id_location_to']");
       static By To_city1=By.xpath("//div[@id='s2id_location_to']//a[@class='select2-choice']");
       static By check_in=By.xpath("//input[@id='departure']");
      
       public static void Fillflightdetails() throws InterruptedException
       {
    	   PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\praveen\\Phptravels\\src\\main\\resource\\log4j.properties");
           //fromcity
         
           driver.findElement(Flight).click();
           //driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
           driver.findElement(From_city).click();
           
           driver.findElement( From_city1).sendKeys(prop.getProperty("CITYNAME1"));
           driver.findElement(From_city1).sendKeys((Keys.DOWN));
           Thread.sleep(1000);
           driver.findElement(From_city1).sendKeys(Keys.ENTER);
           log.info("enterinng from city field");
           
         //tocity
           driver.findElement(To_city).click();
           driver.findElement(To_city1).sendKeys(prop.getProperty("CITYNAME2"));
           driver.findElement(To_city1).sendKeys((Keys.DOWN));
           Thread.sleep(1000);
           driver.findElement(To_city1).sendKeys(Keys.ENTER);
           log.info("enterinng to city field");
           
           
           //date
           driver.findElement(By.xpath("//input[@id='FlightsDateStart']")).click();
           driver.findElement(By.xpath("//div[7]//nav[1]//div[2]")).click();
           driver.findElement(By.xpath("//div[contains(text(),'Nov')]")).click();
           for(int i = 1 ; i<=35 ; i++) {           
                String str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+i+"]")).getText();           
                if(str1.equals("1")) {               
                    for(int j = i ; j<=35 ; j++) {                   
                        str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                       
                        if(str1.equals(prop.getProperty("Tday"))) {                       
                            driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).click();                       
                            break;
                            }    
                        }
                    }
               }
           log.info("enterinng checkin date field");
           
           //adult,child,infant
           driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//span[3]//button[1]")).click();    
           driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-10 mb-15 align-items-end')]//div[2]//div[1]//div[2]//div[1]//span[3]//button[1]")).click(); 
           driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[2]/div[3]/div/div/div[3]/div/div[2]/div/span[3]/button[1]")).click(); 
           driver.findElement(By.xpath("//button[contains(@class,'btn-primary btn btn-block')]")).click(); 
           log.info("clicking on adult,child,infant");
           
           //TO VERIFY  THE RESULT
           String Verify=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/section/div/div[2]/div/div/div/div[1]/h3")).getText();
           System.out.println(Verify);
           if(Verify.equalsIgnoreCase(prop.getProperty("TName")))
           {
           	System.out.println("pass");
           }
              
           else
           {
           	System.out.println("fail");
           }
           
       }
}
           
           
                                 
          
        





