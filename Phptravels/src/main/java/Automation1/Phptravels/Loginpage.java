package Automation1.Phptravels;

import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Loginpage extends Homepage {
	
		By Email=By.xpath("//input[@placeholder='Email']");
		By Password=By.xpath("//input[@placeholder='Password']");
		By cookies=By.xpath("//button[@id='cookyGotItBtn']");
		
	
	public void register() throws InterruptedException, Exception
	{ 
		driver.findElement(Myaccount).click();
		driver.findElement(loginbutton).click();
		
		driver.findElement(Email).sendKeys(prop.getProperty("E"));
		driver.findElement(Password).sendKeys(prop.getProperty("PASS"));
	
		driver.findElement(cookies).click();
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
		
		 Thread.sleep(8000);
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFileToDirectory(src, new File("C:\\pj"));
	}

}
