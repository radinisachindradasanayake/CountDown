package com.CountDown.TestCases;

import java.io.IOException;
import com.CountDown.Pages.AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTestCase extends SearchProductsTestCase 
{
	

	@Test
	public void AddToCart()throws InterruptedException, IOException
	{
		AddToCart AC = new AddToCart(Driver);
		logger.info("Adding the quantity of products");
		AC.AddItems();
		//WebElement Element= Driver.findElement(By.xpath("//span[contains(@class,'trolley-panel-total din') and (text()='0 items - $0.00')]"));
		
		boolean jr1=(Boolean) null;
		if (jr1 = isElementPresent(By.xpath("//span[contains(@class,'trolley-panel-total din') and (text()='0 items - $0.00')]")) )
		{	
			captureScreen(Driver,"Item has not included into Cart" );
			Assert.assertTrue(true);
			logger.info("Add to cart test case failed");
		}
		else
		{
			captureScreen(Driver,"Item has included into Cart" );
			Assert.assertFalse(false);
			logger.info("Add to cart test case passed");
		}
	}

	private boolean isElementPresent(By xpath) {
		// TODO Auto-generated method stub
		return false;
	}

}
