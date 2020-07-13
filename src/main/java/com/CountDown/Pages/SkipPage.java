package com.CountDown.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.CountDown.Utility.BaseClass;

public class SkipPage 
{
	//Declaring web driver
	    WebDriver Driver;
		public SkipPage(WebDriver lDriver)
		{
			Driver	 =  lDriver;
			PageFactory.initElements(lDriver, this);
			//PageFactory.initElements(BaseClass.Driver, this);
		}
		
		//Click on skip button	
				@FindBy(how=How.ID, using = "body-container")
				@CacheLookup
				static WebElement SkipButton;
				
				
		public void ClickSkip() throws InterruptedException 
		{
			Thread.sleep(1000);	
			SkipButton.click();
		}
}
