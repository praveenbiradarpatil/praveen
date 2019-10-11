package Automation1.Phptravels;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Toursearch extends Launch {
static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
static By tourbutton= By.xpath("//div[@id='body-section']//li[3]//a[1]");
static By tourfield=By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
static By tourfields=By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']");
static By tournames=By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[1]/div");
static By departdate=By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
static By guesttours=By.xpath("//select[@id='adults']");
static By typetours=By.xpath("//select[@id='tourtype']");
static By typetours1=By.xpath("//option[contains(text(),'Couples')]");
static By SEARCH=By.xpath("//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]");
public static void Tours() throws InterruptedException
{
 driver.findElement(tourbutton).click();
 driver.findElement(cookies).click();
 Thread.sleep(1000);
 
 driver.findElement(tourfield).click();
 driver.findElement(tourfields).sendKeys(prop.getProperty("TOURSNAME"));
 driver.findElement(tourfields).sendKeys(Keys.DOWN);
 driver.findElement(tournames).click();
 
 //departure date
 driver.findElement(departdate).click();
 while(true)
     {
      String str1=driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[2]")).getText();
      if(str1.equals(prop.getProperty("tourMONTH")))
        {
       break;
        }
      else {
       driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[3]")).click();
      }
     }
     driver.findElement(By.xpath("//div[11]//tr//td[contains(text(),"+prop.getProperty("tday")+")]")).click();

     //guest
     driver.findElement(guesttours).click();
     driver.findElement(By.xpath("//select[@id='adults']//option[1]")).click();
     
     //select
     driver.findElement(typetours).click();
     driver.findElement(typetours1).click();
     
     //search button
     driver.findElement(SEARCH).click();
}



public static void main(String[] args) throws IOException, Exception {
 // TODO Auto-generated method stub
 Lounchbrowser();
 Tours();
 

}
}
