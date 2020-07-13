package com.CountDown.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CountDown.Utility.BaseClass;

public class LoginClass 
{
	    //Declaring web driver
	     WebDriver Driver;
	
	 public LoginClass(WebDriver lDriver)
	 {
		 Driver	 =  lDriver;
		 PageFactory.initElements(lDriver, this);
	 
	 }
	 
	 	//Webdriver wait
		//	WebDriverWait wait=new WebDriverWait(BaseClass.Driver, 5);
			
		//Login definition			
			@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]")
			@CacheLookup
			static WebElement login;
	 		
	 	//Email definition			
			@FindBy(how = How.ID, using = "Email")
			@CacheLookup
			static WebElement Email;
			
		//Password definition
			@FindBy(how = How.ID, using = "Password")	
			@CacheLookup
			static WebElement Password;
			
		//Login button definition
			@FindBy(how = How.XPATH, using ="//input[@value='Login']")
			@CacheLookup
			static WebElement LoginButton;
		//Method to send Email
			public void setEmail(String Email1)
			{
				login.click();
				Email.sendKeys(Email1);
				
			}
		//Method to send Password
			public void setPassword(String Password1)
			{
				Password.sendKeys(Password1);
				
			}
		//Method to click Login Button	
			public void ClickLoginButton()
			{
				LoginButton.click();
			}
}
