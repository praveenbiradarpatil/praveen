package Automation1.Phptravels;

import java.io.FileInputStream;


import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static WebDriver driver;
	public static  Properties prop=new Properties();
	static Logger log=Logger.getLogger("Launch");   

	
	 public static  void Lounchbrowser() throws Exception {
		
		 FileInputStream f1=new  FileInputStream("C:\\Users\\Online Test\\git\\praveen\\Phptravels\\src\\main\\java\\Automation1\\Phptravels\\data1.properties");
		 PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\praveen\\Phptravels\\src\\main\\resource\\log4j.properties");
		 prop.load(f1);
		System.setProperty("webdriver.chrome.driver","C:/Praveen/Chrome/chromedriver.exe" );
		 driver=new ChromeDriver();
		 log.info("lounching browser");
		 driver.get(prop.getProperty("url"));
	     driver.manage().window().maximize();
	     log.info("entering URL");
	}
	 

	/* public static void main(String[] args) throws IOException {
		Lounchbrowser();
	 }*/

}