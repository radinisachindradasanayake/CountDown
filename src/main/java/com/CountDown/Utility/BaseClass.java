package com.CountDown.Utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass 
{
	//Initiating logger
		public static Logger logger;
	//Initiating Global WebDriver
		public static WebDriver Driver;
	//Initiating an Object for ReadConfig 
		ReadConfig readconfig = new ReadConfig();
	//Calling for method to get URL
		public String URL=readconfig.GetApplicationURL();
	//Calling for method to get Email
		public String Email =readconfig.GetEmail();
	//Calling for method to get Password
		public String Password=readconfig.GetPassword();
	//Webdriver wait
		//WebDriverWait wait=new WebDriverWait(BaseClass.Driver, 20);
		
	//Method to setup environment
	@BeforeClass	
    public void setup()
	{
	//Selecting a driver
		String br="chrome";
	//Creating a logger file
		logger = Logger.getLogger("CountDown_Test_Framework");
		PropertyConfigurator.configure("log4j.properties");
	//Selecting driver using if method
	if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.GetChromePath());
			Driver = new ChromeDriver();
		}
		
	else if (br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.GetIEPath());
			Driver = new InternetExplorerDriver();
		}
	else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.GetFireFoxPath());
			Driver = new FirefoxDriver();
		}	
	}
	
	
	//Method to teardown	
	@AfterClass
    public void teardown()
    {
    	Driver.quit();
    }
	
	
	//Method to capture the screenshots
    public void captureScreen(WebDriver driver, String tname) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
