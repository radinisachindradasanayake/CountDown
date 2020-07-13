package com.CountDown.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CountDown.Pages.SavetheTrollyPage;
import com.CountDown.TestCases.LoginTestCase1;


public class SaveTrollyTestCase extends LoginTestCase1
{
	@Test
	public void SaveTrollyTestCase() throws IOException, InterruptedException
	{
			SavetheTrollyPage STrolly= new SavetheTrollyPage(Driver);
			logger.info("Save the items in the trolly successfully");
			STrolly.SaveItems();
			//Check for title
			if (Driver.getTitle().equals("My Saved Lists"))
			{
				captureScreen(Driver,"Saved Trolly Items" );
				Assert.assertTrue(true);
				logger.info("Save Trolly Test Case Passed");
			}
			else
			{
				captureScreen(Driver,"Save Trolly Items failed" );
				Assert.assertFalse(false);
				logger.info("Save Trolly Test Case Falied");
			}
	}
}
