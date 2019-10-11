package Automation1.Phptravels;

import java.io.FileInputStream;


import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static WebDriver driver;
	public static  Properties prop=new Properties();

	
	 public static  void Lounchbrowser() throws Exception {
		
		 FileInputStream f1=new  FileInputStream("C:\\Praveen\\Phptravels\\src\\main\\java\\files\\data.properties");
		 prop.load(f1);
		System.setProperty("webdriver.chrome.driver","C:/Praveen/Chrome/chromedriver.exe" );
		 driver=new ChromeDriver();
		 driver.get(prop.getProperty("url"));
	     driver.manage().window().maximize();
	}
	 

	/* public static void main(String[] args) throws IOException {
		Lounchbrowser();
	 }*/

}