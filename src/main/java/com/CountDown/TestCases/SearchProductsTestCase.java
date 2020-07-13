package com.CountDown.TestCases;


import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CountDown.Pages.SearchforProducts;

public class SearchProductsTestCase extends LoginTestCase1
{
@Test
	public void SearchProductsTestCase() throws InterruptedException, IOException
	{
		
		SearchforProducts SP=new SearchforProducts (Driver);
		SP.SearchfromList();
		//Writing logger information 		
		logger.info("Click on Search Field");
		//Declaring the array
		ArrayList<String>shoppinglist= new ArrayList<String>();
		//Adding data to the Array
		shoppinglist.add("Milk");
		shoppinglist.add("Flour");
		shoppinglist.add("Sugar");
		shoppinglist.add("Tea");
		shoppinglist.add("Bread");
		
		//Send Data as an Array
		logger.info("Data Reading");
		//Search for Items
		SP.WriteShoppingList(shoppinglist);
		//Check for title
				if (Driver.getTitle().equals("Search from your list"))
						
				{
					captureScreen(Driver,"SearchProducts displayed" );
					Assert.assertTrue(true);
					logger.info("Search Items Test case Passed");
				}
				else
				{
					captureScreen(Driver,"SearchProducts Failed" );
					Assert.assertFalse(false);
					logger.info("Search Items Test case Failed");
				}
		
		}
			
		
	}

