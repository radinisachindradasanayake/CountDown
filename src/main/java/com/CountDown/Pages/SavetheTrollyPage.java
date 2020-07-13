package com.CountDown.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SavetheTrollyPage 
{
	//Declaring web driver
    WebDriver Driver;

public SavetheTrollyPage(WebDriver lDriver)
{
	 Driver	 =  lDriver;
	 PageFactory.initElements(lDriver, this);

}

//Trolly Image Button definition			
@FindBy(how = How.XPATH, using = "//img[contains(@alt,'Trolley')]")
@CacheLookup
static WebElement Trolly;
//////a[contains(@class,'clearfix')]

//ViewAll Button Definition
@FindBy(how = How.XPATH, using = "//a[contains(@class,'action-button-layout din-bold review-trolley close-trolley')]")
@CacheLookup
static WebElement ViewAll;

//Save Trolly Button Definition
@FindBy(how = How.XPATH, using = "//a[contains(@class,'action-button-layout din-bold save-trolley')]")
@CacheLookup
static WebElement SaveTrolly;

//Save List Text Field Definition
@FindBy(how = How.XPATH, using = "//input[contains(@name,'listName')]")
@CacheLookup
static WebElement SaveText;

//Save List Button Definition
@FindBy(how = How.XPATH, using = "//input[contains(@value,'Save')]")
@CacheLookup
static WebElement SaveButton;

//Method to save items
public void SaveItems() throws InterruptedException
{
	Trolly.click();
	ViewAll.click();
	Thread.sleep(1000);
	SaveTrolly.click();
	SaveText.sendKeys("TestList");
	SaveButton.click();
}

}
