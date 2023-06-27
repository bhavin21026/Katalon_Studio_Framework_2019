package excelUtils;
import java.io.*;
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.CellStyle;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import reportbuildercustom.RB_Keywords

import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper as MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException as WebElementNotFoundException
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutorws
import excelUtils.ExcelsCustom
import com.kms.katalon.core.annotation.Keyword
import org.apache.poi.ss.util.CellRangeAddress;


public class CreateSheet extends ExcelsCustom {

	
	
	String PresentBy= GlobalVariable.PresentBy
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String dateNow = dtf.format(now);
	

	@Keyword
	def createExcel() throws FileNotFoundException, IOException {

		if(PresentBy.equalsIgnoreCase("Day")) {
		
		Workbook wb = new XSSFWorkbook();

		OutputStream fileOut = new FileOutputStream(GlobalVariable.Path_CompareWithCalendar+'\\'+GlobalVariable.FileName_compareWithCal)


		// Creating Sheets using sheet object
		Sheet sheet = wb.createSheet("Fail-Compare Result");
		Sheet sheet1 = wb.createSheet("Pass-Compare Result");




		System.out.println("Sheets Has been Created successfully");


		Row row = sheet.createRow(0);
		Row row1 = sheet.createRow(2);
		Row row2 = sheet.createRow(5);
		sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));

		//CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)


		// Create a cell and put a value in it.
		createCell(wb, row, 0,'Test Objective',sheet)
		createDataCell(wb, row, 1, "To compare Calendar and Report values", sheet)
		createCell(wb, row1, 0,'Date OF Execution',sheet)
		createDataCell(wb, row1, 1, dateNow, sheet)

		createCell(wb, row2, 0,'Name OF Variable',sheet)
		createCell(wb, row2, 1,'Date',sheet)
		createCell(wb, row2, 2,'Values At Calendar',sheet)
		createCell(wb, row2, 3,'Values At Report',sheet)

		//Fail Case

		Row row3 = sheet1.createRow(0);
		Row row4 = sheet1.createRow(2);
		Row row5 = sheet1.createRow(5);
		sheet1.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));

		//CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)


		// Create a cell and put a value in it.
		createCell(wb, row3, 0,'Test Objective',sheet1)
		createDataCell(wb, row3, 1, "To compare Calendar and Report for daily values", sheet1)
		createCell(wb, row4, 0,'Date OF Execution',sheet1)
		createDataCell(wb, row4, 1, dateNow, sheet1)

		createCell(wb, row5, 0,'Name OF Variable',sheet1)
		createCell(wb, row5, 1,'Date',sheet1)
		createCell(wb, row5, 2,'Values At Calendar',sheet1)
		createCell(wb, row5, 3,'Values At Report',sheet1)




		wb.write(fileOut);

	}
		

	
	else if(PresentBy.equalsIgnoreCase("Week")) {
		
		
		Workbook wb = new XSSFWorkbook();
		
				OutputStream fileOut = new FileOutputStream(GlobalVariable.Path_CompareWithCalendar+'\\'+GlobalVariable.FileName_compareWithCalWeekly)
		
		
				// Creating Sheets using sheet object
				Sheet sheet = wb.createSheet("Fail-Compare Result");
				Sheet sheet1 = wb.createSheet("Pass-Compare Result");
		
		
		
		
				System.out.println("Sheets Has been Created successfully");
		
		
				Row row = sheet.createRow(0);
				Row row1 = sheet.createRow(2);
				Row row2 = sheet.createRow(5);
				sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));
		
				//CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)
		
		
				// Create a cell and put a value in it.
				createCell(wb, row, 0,'Test Objective',sheet)
				createDataCell(wb, row, 1, "To compare Calendar and Report values for weekly values", sheet)
				createCell(wb, row1, 0,'Date OF Execution',sheet)
				createDataCell(wb, row1, 1, dateNow, sheet)
		
				createCell(wb, row2, 0,'Name OF Variable',sheet)
				createCell(wb, row2, 1,'Date',sheet)
				createCell(wb, row2, 2,'Values At Calendar',sheet)
				createCell(wb, row2, 3,'Values At Report',sheet)
		
				//Fail Case
		
				Row row3 = sheet1.createRow(0);
				Row row4 = sheet1.createRow(2);
				Row row5 = sheet1.createRow(5);
				sheet1.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));
		
				//CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)
		
		
				// Create a cell and put a value in it.
				createCell(wb, row3, 0,'Test Objective',sheet1)
				createDataCell(wb, row3, 1, "To compare Calendar and Report values", sheet1)
				createCell(wb, row4, 0,'Date OF Execution',sheet1)
				createDataCell(wb, row4, 1, dateNow, sheet1)
		
				createCell(wb, row5, 0,'Name OF Variable',sheet1)
				createCell(wb, row5, 1,'Date',sheet1)
				createCell(wb, row5, 2,'Values At Calendar',sheet1)
				createCell(wb, row5, 3,'Values At Report',sheet1)
		
		
		
		
				wb.write(fileOut);
		
		
	}
	}
}