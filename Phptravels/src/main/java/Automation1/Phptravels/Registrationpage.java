package Automation1.Phptravels;



import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;


public class Registrationpage extends  Homepage {
	static By FirstName=By.xpath("//input[@placeholder='First Name']");
	static By LastName=By.xpath("//input[@placeholder='Last Name']");
	static By MobileNumber=By.xpath("//input[@placeholder='Mobile Number']");
	static By Email=By.xpath("//input[@placeholder='Email']");
	static By Password=By.xpath("//input[@placeholder='Password']");
	static By ConfirmPassword=By.xpath("//input[@placeholder='Confirm Password']");
	static By cookies=By.xpath("//*[@id='cookyGotItBtnBox']/div/button");
	static By submit=By.xpath("//*[@id=\"headersignupform\"]/div[9]/button");
	
	public static  void register() throws Exception
	
	{
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\praveen\\Phptravels\\src\\main\\resource\\log4j.properties");
		//driver.findElement(Myaccount).click();
		//driver.findElement(Signupbutton).click();
		//System.out.println(prop.getProperty("FN1"));
		//Thread.sleep(100);
		//driver.findElement(cookies).click();
		driver.findElement(FirstName).sendKeys(prop.getProperty("FN1"));
		
		driver.findElement(LastName).sendKeys(prop.getProperty("LN"));
		driver.findElement(MobileNumber).sendKeys(prop.getProperty("MN"));
		driver.findElement(Email).sendKeys(prop.getProperty("E"));
		driver.findElement(Password).sendKeys(prop.getProperty("PASS"));
		driver.findElement(ConfirmPassword).sendKeys(prop.getProperty("CONFIRMPASS"));
		//driver.findElement(cookies).click();
		driver.findElement(submit).sendKeys(Keys.ENTER);
		log.info("trying to do registration  through signup");
		
		//TO VERIFY  THE RESULT
		  /* String Verify=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div[1]/div/div[2]/h3")).getText();
           System.out.println(Verify);
           if(Verify.equalsIgnoreCase(prop.getProperty("TNAme")))
           {
           	System.out.println("pass");
           }
              
           else
           {
           	System.out.println("fail");
           }*/
		
		
	}
   

	
	
	}
	


