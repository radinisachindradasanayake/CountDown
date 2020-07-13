package com.CountDown.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.CountDown.Pages.LoginClass;
import com.CountDown.Utility.BaseClass;
import com.CountDown.Utility.ExcelDataConfig;

@Test
public class LoginTestCase extends BaseClass
{
	
	public void LoginTest () throws IOException
		{
				ExcelDataConfig ExcelDataConfig = new ExcelDataConfig();
				logger.info("This Testcase runs using EXcel Data Reader");
				Driver.get(ExcelDataConfig.getData(0,1,0));
				logger.info("URL is Opened");
				
				LoginClass LoginPage=new LoginClass(Driver);
				
				String Email = ExcelDataConfig.getData(0, 1, 1);
				LoginPage.setEmail(Email);		
				logger.info("Entered Email Successfully");
				
				String Password = ExcelDataConfig.getData(0, 1, 2);
				LoginPage.setPassword(Password);
				logger.info("Entered Password Successfully");
				
				LoginPage.ClickLoginButton();
				logger.info("Click on Login Button Successfully");
				
				if (Driver.getTitle().equals("Online Supermarket: Online Grocery Shopping & Free Recipes at countdown.co.nz"))
				{
					Assert.assertTrue(true);
					logger.info("Login Test Passed");
				}
				else
				{
					captureScreen(Driver,"LoginTest" );
					Assert.assertFalse(false);
					logger.info("Login Test Failed");
				}
				}
}