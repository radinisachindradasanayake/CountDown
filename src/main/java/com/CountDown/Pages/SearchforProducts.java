package com.CountDown.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchforProducts 
{
	   //Declaring web driver
    WebDriver Driver;

	public SearchforProducts(WebDriver lDriver)
	{
	
		PageFactory.initElements(lDriver, this);

	}

	//Search field definition			
		@FindBy(how = How.ID, using = "search")
		@CacheLookup
		static WebElement search;
	
	//Shop from List definition			
		@FindBy(how = How.XPATH, using = "//span[@class='searchPanel-searchListLabel']")
		@CacheLookup
		static WebElement SFlist;
	
	//Note Pad Area definition	
		@FindBy(how = How.NAME, using = "searchList")
		@CacheLookup
		static WebElement NotePad;
	
	//Find Button definition
		@FindBy(how = How.XPATH, using = "//input[@value='Find products']")
		@CacheLookup
		static WebElement FindButton;
		
		
	//Method to Click on Find List
		public void SearchfromList() throws InterruptedException
		{
			search.click();
			Thread.sleep(1000);
			SFlist.click();
			
		}
		
	//Method to Write Shopping List
		public void WriteShoppingList(ArrayList<String>shoppinglist) throws InterruptedException
		{
			NotePad.click();
			
			for(int i=0;i<shoppinglist.size();i++)
			{
			Thread.sleep(1000);
			NotePad.sendKeys((shoppinglist.get(i)));
			NotePad.sendKeys(Keys.RETURN);
			System.out.println(shoppinglist.get(i));
			}
			Thread.sleep(1000);
			FindButton.click();
			Thread.sleep(1000);
		}
		
		
}
