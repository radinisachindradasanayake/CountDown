package com.CountDown.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ClearList 
{
	 //Declaring web driver
    WebDriver Driver;

	public ClearList(WebDriver lDriver)
	{
	
		PageFactory.initElements(lDriver, this);

	}

	//Search field definition			
			@FindBy(how = How.XPATH, using = "//*[@id='search']")
			@CacheLookup
			static WebElement SearchToClear;
			
	//Shop from List definition			
			@FindBy(how = How.XPATH, using = "//img[contains(@class,'searchPanel-searchListIcon')]")
			@CacheLookup
			static WebElement ListToClear;
			
	//Clear Button definition
		@FindBy(how = How.XPATH, using = "//*[@id='content-panel']/div/form/div[2]/a")
		@CacheLookup
		static WebElement ClearButton;
		
		public void ClearText() throws InterruptedException 
		{
			
			SearchToClear.click();
			Thread.sleep(1000);
			ListToClear.click();
			
			ClearButton.click();
		}

}
