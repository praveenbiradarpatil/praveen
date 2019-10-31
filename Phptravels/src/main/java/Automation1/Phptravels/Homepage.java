package Automation1.Phptravels;



import org.openqa.selenium.By;


public class Homepage extends Launch {
	
	//public static  Properties prop=new Properties();
         static By Myaccount=By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
       static By Signupbutton=By.xpath("//a[@class='dropdown-item tr']");
      static  By loginbutton=By.xpath("//a[@class='dropdown-item active tr']");
      
        
      //a[@class='dropdown-item tr
     public static void Signup()
    {
      driver.findElement(Myaccount).click();
      driver.findElement(Signupbutton).click();
    }
     
  
  public  void login()
  {
	  driver.findElement(Myaccount).click();
	  driver.findElement(loginbutton).click();
  }
   
}
