package Automation1.Phptravels;



import org.openqa.selenium.By;


public class Homepage extends Launch {
	
	
         By Myaccount=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
       By Signupbutton=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
        By loginbutton=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
       
 /* public void Signup()
    {
      driver.findElement(Myaccount).click();
      driver.findElement(Signupbutton).click();
    }
  
  public  void login()
  {
	  driver.findElement(Myaccount).click();
	  driver.findElement(loginbutton).click();
  }*/
   
}
