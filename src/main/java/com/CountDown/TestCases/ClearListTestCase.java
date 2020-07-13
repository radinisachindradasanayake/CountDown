package com.CountDown.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CountDown.Pages.ClearList;
import com.CountDown.Utility.BaseClass;

@Test
public class ClearListTestCase extends LoginTestCase1
{
	public void ClearTest() throws InterruptedException, IOException
	{
		ClearList CL= new ClearList(Driver);
		logger.info("Clear the List");
		CL.ClearText();
	
	//Check for title
			if (Driver.navigate().equals("https://shop.countdown.co.nz/shop/editsearchlist?showEmptyList=True"))
			{
				Assert.assertTrue(true);
				logger.info("Cleared the List");
			}
			else
			{
				captureScreen(Driver,"LoginTest" );
				Assert.assertFalse(false);
				logger.info("Not Cleared te List");
			}

	}
}
