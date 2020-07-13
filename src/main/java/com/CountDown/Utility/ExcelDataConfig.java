package com.CountDown.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelDataConfig 
{
	static XSSFWorkbook wb=null;
	static XSSFSheet sheet=null;
	public static String cellValue;
	ReadConfig readconfig = new ReadConfig();
	public String excelPath = readconfig.GetExcelPath();

	//Method to load the workbook
	public ExcelDataConfig() throws IOException
	{
		String excelPath = "C:\\Users\\Radini Dasanayake\\workspace\\CountDown\\src\\main\\java\\com\\CountDown\\TestData\\TestData.xlsx";
		FileInputStream fis = new FileInputStream(excelPath);
		wb = new XSSFWorkbook(fis);		
		
	}
	
	//Method to read a value from a cell in the spreadsheet
	public String getData(int sheetName,int rowNumber,int columnNumber)
	{
		sheet = wb.getSheetAt(sheetName);
		try
		{	
			String i = sheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
			return i;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return e.getMessage();
		}
		
	}
}
