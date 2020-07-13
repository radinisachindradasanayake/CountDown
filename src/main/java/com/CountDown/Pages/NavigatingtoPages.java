package com.CountDown.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NavigatingtoPages 
{
	//Declaring web driver
    WebDriver Driver;

	public NavigatingtoPages(WebDriver lDriver)
	{
	
		PageFactory.initElements(lDriver, this);

	}
	
	//Search field definition			
			@FindBy(how = How.XPATH, using = "//*[@id='content-panel']/div/div[2]/div[1]/div[1]/div/ul/li[2]/a")
			@CacheLookup
			static WebElement PageNumber;
			//*[@id="content-panel"]/div/div[2]/div[1]/div[1]/div/ul/li[2]/a
			//*[@id="content-panel"]/div/div[2]/div[1]/div[1]/div/ul/li[3]/a
			
	/*public void ClickonPages()
	{
		PageNumber.click();
		int i = 1;
		while(i>1)
		{
			WebElement Page =Driver.findElement(By.xpath("//a[contains(@href='/shop/searchfromlist?page=i')]"));
			Page.click();
			i++;
	
		}
		}*/
	
	
	public void Navigation() {

		PageNumber.click();
		Driver.navigate().forward();
		
	}
}
