package Automation1.Phptravels;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;

public class Loginpage extends Homepage {
	
	By Email=By.xpath("//input[@placeholder='Email']");
	By Password=By.xpath("//input[@placeholder='Password']");
	By cookies=By.xpath("//button[@class='cc-btn cc-dismiss']");
	

public void register() throws InterruptedException, Exception
{ 
	PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\praveen\\Phptravels\\src\\main\\resource\\log4j.properties");
	
	//driver.findElement(cookies).click();
	driver.findElement(Email).sendKeys(prop.getProperty("E"));
	driver.findElement(Password).sendKeys(prop.getProperty("PASS"));

	//driver.findElement(cookies).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']")).click();
	log.info("registration done through login");
	 Thread.sleep(8000);
	// File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
	// FileUtils.copyFileToDirectory(src, new File("C:\\pj"));
	
	 
	//TO VERIFY  THE RESULT
        String Verify=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div[1]/div/div[2]/h3")).getText();
        System.out.println(Verify);
        if(Verify.equalsIgnoreCase(prop.getProperty("TNAme")))
        {
        	System.out.println("pass");
        }
           
        else
        {
        	System.out.println("fail");
        }
	 
} 

}
