package com.CountDown.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	
	//Method to Read Configuration file
	public ReadConfig()
	{
		File src  = new File("C:\\Users\\Radini Dasanayake\\workspace\\CountDown\\Configuration\\config.properties");
	try 
	{
		FileInputStream fis = new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}
	catch(Exception e)
	{
		System.out.println("Exception is"+e.getMessage());
	}
	}
	
	//Method to get Application URL
	public String GetApplicationURL()
	{
		String URL = pro.getProperty("URL");
		return URL;	
	}
	
	//Method to get Email Address
	public String GetEmail()
	{
		String Email = pro.getProperty("Email");
		return Email;	
	}
	
	//Method to get Password
	public String GetPassword()
	{
		String Passowrd = pro.getProperty("Password");
		return Passowrd;
	}
	
	//Method to get ChromePath
	public String GetChromePath()
	{
		String ChromePath = pro.getProperty("chromepath");
		return ChromePath;
	}
	
	//Method to get Internet Explorer Path
	public String GetIEPath()
	{
		String IEPath = pro.getProperty("iepath");
		return IEPath;
	}
	
	//Method to get Fire Fox Path
	public String GetFireFoxPath()
	{
		String FireFoxPath = pro.getProperty("firefoxpath");
		return FireFoxPath;
	}
	
	//Method to get Excel Path
	public String GetExcelPath()
	{
		String ExcelPath = pro.getProperty("ExcelPath");
		return ExcelPath;
		
	}

}
