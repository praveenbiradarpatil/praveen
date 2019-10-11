package Automation1.Phptravels;



import org.openqa.selenium.By;


public class Registrationpage extends  Homepage {
	static By FirstName=By.xpath("//input[@placeholder='First Name']");
	static By LastName=By.xpath("//input[@placeholder='Last Name']");
	static By MobileNumber=By.xpath("//input[@placeholder='Mobile Number']");
	static By Email=By.xpath("//input[@placeholder='Email']");
	static By Password=By.xpath("//input[@placeholder='Password']");
	static By ConfirmPassword=By.xpath("//input[@placeholder='Confirm Password']");
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By submit=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[9]/button[1]");
	
	public  void register()
	
	{
		driver.findElement(Myaccount).click();
		driver.findElement(Signupbutton).click();
		driver.findElement(FirstName).sendKeys(prop.getProperty("FN"));
		driver.findElement(LastName).sendKeys(prop.getProperty("LN"));
		driver.findElement(MobileNumber).sendKeys(prop.getProperty("MN"));
		driver.findElement(Email).sendKeys(prop.getProperty("E"));
		driver.findElement(Password).sendKeys(prop.getProperty("PASS"));
		driver.findElement(ConfirmPassword).sendKeys(prop.getProperty("CONFIRMPASS"));
		driver.findElement(cookies).click();
		driver.findElement(submit).click();
		
		
	}
   

	/*public static void main(String[] args) throws Exception  {
		Lounchbrowser();
		Signup();
		register()*/
	

	}


