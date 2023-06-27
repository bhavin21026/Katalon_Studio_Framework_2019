package excelUtils;
import java.io.*;
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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;


public class DailyFormulaLossPrevention extends ExcelsCustom {

	String PresentBy= GlobalVariable.PresentBy

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	String dateNow = dtf.format(now);


	@Keyword
	def dailyFormulaCheckLossPrevention() throws FileNotFoundException, IOException {

		if(PresentBy.equalsIgnoreCase("Day")) {
			Workbook wb = new XSSFWorkbook();

			OutputStream fileOut = new FileOutputStream(GlobalVariable.Path_CompareWithCalendar+'\\LossPrevention'+GlobalVariable.FileName_DailyFormula)


			// Creating Sheets using sheet object
			Sheet sheet = wb.createSheet("Fail-Single Store");
			Sheet sheet1 = wb.createSheet("Pass-Single Store");
			Sheet sheet2 = wb.createSheet("Fail-All Store");
			Sheet sheet3 = wb.createSheet("Pass-All Store");
			Sheet sheet4 = wb.createSheet("Raw Values From Portal");

			System.out.println("Sheets Has been Created successfully");





			ExcelColumnDesign(sheet,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT- SINGLE STORE")
			ExcelColumnDesign(sheet1,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-SINGLE STORE")
			ExcelColumnDesignAllStore(sheet2,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-MULTISTORE")
			ExcelColumnDesignAllStore(sheet3,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-MULTISTORE")
			ExcelColumnDesignAllStore(sheet4,wb,"ALL FETCHED LOSS PREVENTION COLUMNS VALUES FROM PORTAL")

			wb.write(fileOut);








			/*Row row = sheet.createRow(0);
			 Row row1 = sheet.createRow(2);
			 Row row2 = sheet.createRow(5);
			 Row row3 = sheet.createRow(7);
			 Row row4 = sheet.createRow(9);
			 sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));
			 //CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)
			 // Create a cell and put a value in it.
			 createCell(wb, row, 0,'Test Objective',sheet)
			 createDataCell(wb, row, 1, "CHECKING FORMULA CALCULATIONS FOR DAILY PRESENT REPORT", sheet)
			 createCell(wb, row1, 0,'Date OF Execution',sheet)
			 createDataCell(wb, row1, 1, dateNow, sheet)
			 createCell(wb, row1, 2,'Store Name',sheet)
			 createDataCell(wb, row1, 3,GlobalVariable.PCName, sheet)
			 createCell(wb, row2, 0,'Start Date',sheet)
			 createDataCell(wb, row2, 1,GlobalVariable.StartDate+' '+GlobalVariable.MonthYear, sheet)
			 createCell(wb, row2, 2,'End Date',sheet)
			 createDataCell(wb, row2, 3,GlobalVariable.EndDate+' '+GlobalVariable.EndMonthYear, sheet)
			 createCell(wb, row4, 0,'Name OF Variable',sheet)
			 createCell(wb, row4, 1,'Values On Portal',sheet)
			 createCell(wb, row4, 2,'Values By Calculation',sheet)
			 //Fail Result
			 Row row5 = sheet1.createRow(0);
			 Row row6 = sheet1.createRow(2);
			 Row row7 = sheet1.createRow(5);
			 Row row8 = sheet1.createRow(7);
			 Row row9 = sheet1.createRow(9);
			 sheet1.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));
			 //CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)
			 // Create a cell and put a value in it.
			 createCell(wb, row5, 0,'Test Objective',sheet1)
			 createDataCell(wb, row5, 1, "CHECKING FORMULA CALCULATIONS FOR DAILY PRESENT REPORT", sheet1)
			 createCell(wb, row6, 0,'Date OF Execution',sheet1)
			 createDataCell(wb, row6, 1, dateNow, sheet1)
			 createCell(wb, row6, 2,'Store Name',sheet1)
			 createDataCell(wb, row6, 3,GlobalVariable.PCName, sheet1)
			 createCell(wb, row7, 0,'Start Date',sheet1)
			 createDataCell(wb, row7, 1,GlobalVariable.StartDate+' '+GlobalVariable.MonthYear, sheet1)
			 createCell(wb, row7, 2,'End Date',sheet1)
			 createDataCell(wb, row7, 3,GlobalVariable.EndDate+' '+GlobalVariable.EndMonthYear, sheet1)
			 createCell(wb, row9, 0,'Name OF Variable',sheet1)
			 createCell(wb, row9, 1,'Values On Portal',sheet1)
			 createCell(wb, row9, 2,'Values By Calculation',sheet1)*/






		}
		else if(PresentBy.equalsIgnoreCase("Week")) {

			Workbook wb = new XSSFWorkbook();

			OutputStream fileOut = new FileOutputStream(GlobalVariable.Path_CompareWithCalendar+'\\LossPrevention'+GlobalVariable.FileName_WeeklyFormula)


			// Creating Sheets using sheet object
			Sheet sheet = wb.createSheet("Fail-Single Store");
			Sheet sheet1 = wb.createSheet("Pass-Single Store");
			Sheet sheet2 = wb.createSheet("Fail-All Store");
			Sheet sheet3 = wb.createSheet("Pass-All Store");
			Sheet sheet4 = wb.createSheet("Raw Values From Portal");

			System.out.println("Sheets Has been Created successfully");


			ExcelColumnDesign(sheet,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT- SINGLE STORE")
			ExcelColumnDesign(sheet1,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-SINGLE STORE")
			ExcelColumnDesignAllStore(sheet2,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-MULTISTORE")
			ExcelColumnDesignAllStore(sheet3,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-MULTISTORE")
			ExcelColumnDesignAllStore(sheet4,wb,"ALL FETCHED LOSS PREVENTION COLUMNS VALUES FROM PORTAL")

			wb.write(fileOut);



			/*Row row = sheet.createRow(0);
			 Row row1 = sheet.createRow(2);
			 Row row2 = sheet.createRow(5);
			 Row row3 = sheet.createRow(7);
			 Row row4 = sheet.createRow(9);
			 sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));
			 //CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)
			 // Create a cell and put a value in it.
			 createCell(wb, row, 0,'Test Objective',sheet)
			 createDataCell(wb, row, 1, "CHECKING FORMULA CALCULATIONS FOR WEEKLY PRESENT REPORT", sheet)
			 createCell(wb, row1, 0,'Date OF Execution',sheet)
			 createDataCell(wb, row1, 1, dateNow, sheet)
			 createCell(wb, row1, 2,'Store Name',sheet)
			 createDataCell(wb, row1, 3,GlobalVariable.PCName, sheet)
			 createCell(wb, row2, 0,'Start Date',sheet)
			 createDataCell(wb, row2, 1,GlobalVariable.StartDate+' '+GlobalVariable.MonthYear, sheet)
			 createCell(wb, row2, 2,'End Date',sheet)
			 createDataCell(wb, row2, 3,GlobalVariable.EndDate+' '+GlobalVariable.EndMonthYear, sheet)
			 createCell(wb, row4, 0,'Name OF Variable',sheet)
			 createCell(wb, row4, 1,'Values On Portal',sheet)
			 createCell(wb, row4, 2,'Values By Calculation',sheet)
			 //Fail Result
			 Row row5 = sheet1.createRow(0);
			 Row row6 = sheet1.createRow(2);
			 Row row7 = sheet1.createRow(5);
			 Row row8 = sheet1.createRow(7);
			 Row row9 = sheet1.createRow(9);
			 sheet1.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));
			 //CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)
			 // Create a cell and put a value in it.
			 createCell(wb, row5, 0,'Test Objective',sheet1)
			 createDataCell(wb, row5, 1, "CHECKING FORMULA CALCULATIONS FOR WEEKLY PRESENT REPORT", sheet1)
			 createCell(wb, row6, 0,'Date OF Execution',sheet1)
			 createDataCell(wb, row6, 1, dateNow, sheet1)
			 createCell(wb, row6, 2,'Store Name',sheet1)
			 createDataCell(wb, row6, 3,GlobalVariable.PCName, sheet1)
			 createCell(wb, row7, 0,'Start Date',sheet1)
			 createDataCell(wb, row7, 1,GlobalVariable.StartDate+' '+GlobalVariable.MonthYear, sheet1)
			 createCell(wb, row7, 2,'End Date',sheet1)
			 createDataCell(wb, row7, 3,GlobalVariable.EndDate+' '+GlobalVariable.EndMonthYear, sheet1)
			 createCell(wb, row9, 0,'Name OF Variable',sheet1)
			 createCell(wb, row9, 1,'Values On Portal',sheet1)
			 createCell(wb, row9, 2,'Values By Calculation',sheet1)*/







		}

		else if(PresentBy.equalsIgnoreCase("Month")) {

			Workbook wb = new XSSFWorkbook();

			OutputStream fileOut = new FileOutputStream(GlobalVariable.Path_CompareWithCalendar+'\\LossPrevention'+GlobalVariable.FileName_Monthlyormula)


			// Creating Sheets using sheet object
			Sheet sheet = wb.createSheet("Fail-Single Store");
			Sheet sheet1 = wb.createSheet("Pass-Single Store");
			Sheet sheet2 = wb.createSheet("Fail-All Store");
			Sheet sheet3 = wb.createSheet("Pass-All Store");
			Sheet sheet4 = wb.createSheet("Raw Values From Portal");

			System.out.println("Sheets Has been Created successfully");


			ExcelColumnDesign(sheet,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT- SINGLE STORE")
			ExcelColumnDesign(sheet1,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-SINGLE STORE")
			ExcelColumnDesignAllStore(sheet2,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-MULTISTORE")
			ExcelColumnDesignAllStore(sheet3,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-MULTISTORE")
			ExcelColumnDesignAllStore(sheet4,wb,"ALL FETCHED LOSS PREVENTION COLUMNS VALUES FROM PORTAL")
			wb.write(fileOut);



			/*Row row = sheet.createRow(0);
			 Row row1 = sheet.createRow(2);
			 Row row2 = sheet.createRow(5);
			 Row row3 = sheet.createRow(7);
			 Row row4 = sheet.createRow(9);
			 sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));
			 //CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)
			 // Create a cell and put a value in it.
			 createCell(wb, row, 0,'Test Objective',sheet)
			 createDataCell(wb, row, 1, "CHECKING FORMULA CALCULATIONS FOR MONTHLY PRESENT REPORT", sheet)
			 createCell(wb, row1, 0,'Date OF Execution',sheet)
			 createDataCell(wb, row1, 1, dateNow, sheet)
			 createCell(wb, row1, 2,'Store Name',sheet)
			 createDataCell(wb, row1, 3,GlobalVariable.PCName, sheet)
			 createCell(wb, row2, 0,'Start Date',sheet)
			 createDataCell(wb, row2, 1,GlobalVariable.MonthYear, sheet)
			 createCell(wb, row2, 2,'End Date',sheet)
			 createDataCell(wb, row2, 3,GlobalVariable.EndMonthYear, sheet)
			 createCell(wb, row4, 0,'Name OF Variable',sheet)
			 createCell(wb, row4, 1,'Values On Portal',sheet)
			 createCell(wb, row4, 2,'Values By Calculation',sheet)
			 //Fail Result
			 Row row5 = sheet1.createRow(0);
			 Row row6 = sheet1.createRow(2);
			 Row row7 = sheet1.createRow(5);
			 Row row8 = sheet1.createRow(7);
			 Row row9 = sheet1.createRow(9);
			 sheet1.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));
			 //CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)
			 // Create a cell and put a value in it.
			 createCell(wb, row5, 0,'Test Objective',sheet1)
			 createDataCell(wb, row5, 1, "CHECKING FORMULA CALCULATIONS FOR MONTHLY PRESENT REPORT", sheet1)
			 createCell(wb, row6, 0,'Date OF Execution',sheet1)
			 createDataCell(wb, row6, 1, dateNow, sheet1)
			 createCell(wb, row6, 2,'Store Name',sheet1)
			 createDataCell(wb, row6, 3,GlobalVariable.PCName, sheet1)
			 createCell(wb, row7, 0,'Start Date',sheet1)
			 createDataCell(wb, row7, 1,GlobalVariable.MonthYear, sheet1)
			 createCell(wb, row7, 2,'End Date',sheet1)
			 createDataCell(wb, row7, 3,GlobalVariable.EndMonthYear, sheet1)
			 createCell(wb, row9, 0,'Name OF Variable',sheet1)
			 createCell(wb, row9, 1,'Values On Portal',sheet1)
			 createCell(wb, row9, 2,'Values By Calculation',sheet1)
			 wb.write(fileOut);*/




		}

		else if(PresentBy.equalsIgnoreCase("EntireRange")) {


			Workbook wb = new XSSFWorkbook();

			OutputStream fileOut = new FileOutputStream(GlobalVariable.Path_CompareWithCalendar+'\\LossPrevention'+GlobalVariable.FileName_EntireRange)


			// Creating Sheets using sheet object
			Sheet sheet = wb.createSheet("Fail-Single Store");
			Sheet sheet1 = wb.createSheet("Pass-Single Store");
			Sheet sheet2 = wb.createSheet("Fail-All Store");
			Sheet sheet3 = wb.createSheet("Pass-All Store");
			Sheet sheet4 = wb.createSheet("Raw Values From Portal");

			System.out.println("Sheets Has been Created successfully");

			ExcelColumnDesign(sheet,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT- SINGLE STORE")
			ExcelColumnDesign(sheet1,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-SINGLE STORE")
			ExcelColumnDesignAllStore(sheet2,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-MULTISTORE")
			ExcelColumnDesignAllStore(sheet3,wb,"CHECKING LOSS PREVENTION FORMULA CALCULATIONS FOR DAILY PRESENT REPORT-MULTISTORE")
			ExcelColumnDesignAllStore(sheet4,wb,"ALL FETCHED LOSS PREVENTION COLUMNS VALUES FROM PORTAL")
			wb.write(fileOut);


			/*Row row = sheet.createRow(0);
			 Row row1 = sheet.createRow(2);
			 Row row2 = sheet.createRow(5);
			 Row row3 = sheet.createRow(7);
			 Row row4 = sheet.createRow(9);
			 sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));
			 //CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)
			 // Create a cell and put a value in it.
			 createCell(wb, row, 0,'Test Objective',sheet)
			 createDataCell(wb, row, 1, "CHECKING FORMULA CALCULATIONS FOR NETWORK REPORT", sheet)
			 createCell(wb, row1, 0,'Date OF Execution',sheet)
			 createDataCell(wb, row1, 1, dateNow, sheet)
			 createCell(wb, row1, 2,'Store Name',sheet)
			 createDataCell(wb, row1, 3,GlobalVariable.PCName, sheet)
			 createCell(wb, row2, 0,'Start Date',sheet)
			 createDataCell(wb, row2, 1,GlobalVariable.StartDate+' '+GlobalVariable.MonthYear, sheet)
			 createCell(wb, row2, 2,'End Date',sheet)
			 createDataCell(wb, row2, 3,GlobalVariable.EndDate+' '+GlobalVariable.EndMonthYear, sheet)
			 createCell(wb, row4, 0,'Name OF Variable',sheet)
			 createCell(wb, row4, 1,'Values On Portal',sheet)
			 createCell(wb, row4, 2,'Values By Calculation',sheet)
			 //Fail Result
			 Row row5 = sheet1.createRow(0);
			 Row row6 = sheet1.createRow(2);
			 Row row7 = sheet1.createRow(5);
			 Row row8 = sheet1.createRow(7);
			 Row row9 = sheet1.createRow(9);
			 sheet1.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));
			 //CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)
			 // Create a cell and put a value in it.
			 createCell(wb, row5, 0,'Test Objective',sheet1)
			 createDataCell(wb, row5, 1, "CHECKING FORMULA CALCULATIONS FOR NETWORK REPORT", sheet1)
			 createCell(wb, row6, 0,'Date OF Execution',sheet1)
			 createDataCell(wb, row6, 1, dateNow, sheet1)
			 createCell(wb, row6, 2,'Store Name',sheet1)
			 createDataCell(wb, row6, 3,GlobalVariable.PCName, sheet1)
			 createCell(wb, row7, 0,'Start Date',sheet1)
			 createDataCell(wb, row7, 1,GlobalVariable.StartDate+' '+GlobalVariable.MonthYear, sheet1)
			 createCell(wb, row7, 2,'End Date',sheet1)
			 createDataCell(wb, row7, 3,GlobalVariable.EndDate+' '+GlobalVariable.EndMonthYear, sheet1)
			 createCell(wb, row9, 0,'Name OF Variable',sheet1)
			 createCell(wb, row9, 1,'Values On Portal',sheet1)
			 createCell(wb, row9, 2,'Values By Calculation',sheet1)
			 wb.write(fileOut);*/



		}
	}


	@Keyword
	def ExcelColumnDesign(Sheet sheet,Workbook wb,String objective) throws FileNotFoundException, IOException {

		Row row = sheet.createRow(0);
		Row row1 = sheet.createRow(2);
		Row row2 = sheet.createRow(5);
		Row row3 = sheet.createRow(7);
		Row row4 = sheet.createRow(9);
		sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));



		//CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)


		// Create a cell and put a value in it.
		createCell(wb, row, 0,'Test Objective',sheet)
		createDataCell(wb, row, 1,objective, sheet)
		createCell(wb, row1, 0,'Date OF Execution',sheet)
		createDataCell(wb, row1, 1, dateNow, sheet)
		createCell(wb, row1, 2,'Store Name',sheet)
		createDataCell(wb, row1, 3,GlobalVariable.PCName, sheet)
		createCell(wb, row2, 0,'Start Date',sheet)
		createDataCell(wb, row2, 1,GlobalVariable.StartDate+' '+GlobalVariable.MonthYear, sheet)
		createCell(wb, row2, 2,'End Date',sheet)
		createDataCell(wb, row2, 3,GlobalVariable.EndDate+' '+GlobalVariable.EndMonthYear, sheet)


		createCell(wb, row4, 0,'Name OF Variable',sheet)
		createCell(wb, row4, 1,'Values On Portal',sheet)
		createCell(wb, row4, 2,'Values By Calculation',sheet)




	}

	@Keyword
	def ExcelColumnDesignAllStore(Sheet sheet,Workbook wb,String objective) throws FileNotFoundException, IOException {

		Row row = sheet.createRow(0);
		Row row1 = sheet.createRow(2);
		Row row2 = sheet.createRow(5);
		Row row3 = sheet.createRow(7);
		Row row4 = sheet.createRow(9);
		sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 8));



		//CustomKeywords.'excelUtils.CreateSheet.createCell'(wb, row, 1, HorizontalAlignment.JUSTIFY, VerticalAlignment.JUSTIFY)


		// Create a cell and put a value in it.
		createCell(wb, row, 0,'Test Objective',sheet)
		createDataCell(wb, row, 1,objective, sheet)
		createCell(wb, row1, 0,'Date OF Execution',sheet)
		createDataCell(wb, row1, 1, dateNow, sheet)
		createCell(wb, row1, 2,'Store Name',sheet)
		createDataCell(wb, row1, 3,GlobalVariable.State, sheet)
		createCell(wb, row2, 0,'Start Date',sheet)
		createDataCell(wb, row2, 1,GlobalVariable.StartDate+' '+GlobalVariable.MonthYear, sheet)
		createCell(wb, row2, 2,'End Date',sheet)
		createDataCell(wb, row2, 3,GlobalVariable.EndDate+' '+GlobalVariable.EndMonthYear, sheet)


		createCell(wb, row4, 0,'Name OF Variable',sheet)
		createCell(wb, row4, 1,'Values On Portal',sheet)
		createCell(wb, row4, 2,'Values By Calculation',sheet)




	}
}

