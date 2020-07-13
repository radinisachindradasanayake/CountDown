package com.CountDown.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddToCart 
{

	//Declaring web driver
    WebDriver Driver;

public AddToCart(WebDriver lDriver)
{
	 Driver	 =  lDriver;
	 PageFactory.initElements(lDriver, this);

}

		//Add Quantity definition			
			@FindBy(how = How.XPATH, using = "//*[@id='product-list']/div[24]/div[2]/div/div[2]/div[2]/form/label/input")
			@CacheLookup
			static WebElement QTY;
			
		//Add to Cart Button definition			
			@FindBy(how = How.XPATH, using = "//*[@id='product-list']/div[1]/div[2]/div/div[2]/div[2]/form/button[1]")
			@CacheLookup
			static WebElement AddButton;
			
			
			
		public void AddItems() throws InterruptedException
		{
			QTY.click();
			Thread.sleep(1000);
			QTY.clear();
			Thread.sleep(1000);
			QTY.sendKeys("2");
			AddButton.click();
		}
		}
