package com.CountDown.TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.CountDown.Pages.LoginClass;
import com.CountDown.Pages.SkipPage;
import com.CountDown.Utility.BaseClass;



public class LoginTestCase1 extends BaseClass
{

	//Test Case for Login Using Properties file
	@Test
	public void LoginTest() throws IOException, InterruptedException
	{
		//Passing the URL
			Driver.get(URL);
		//Writing logger information 
			logger.info("URL is Opened");
		//Calling method to close pop up window	
			SkipPage SP = new SkipPage(Driver);
			SP.ClickSkip();
		//Create an object for Login Page
			LoginClass LoginPage=new LoginClass(Driver);
		//Passing Email address by calling setEmail method in Login Page
			LoginPage.setEmail(Email);
		//Writing logger information 		
			logger.info("Entered Email Successfully");
		//Passing password by calling setEmail method in Login Page
			LoginPage.setPassword(Password);
		//Writing logger information 
			logger.info("Entered Password Successfully");
		//Calling click login button method
			LoginPage.ClickLoginButton();
		//Writing logger information 
			logger.info("Click on Login Button Successfully");
		//Check for title
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
