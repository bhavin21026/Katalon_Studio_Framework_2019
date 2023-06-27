package excelUtils;

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
import com.kms.katalon.core.annotation.Keyword
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;



public class WriteExcel
{

	String filePath=GlobalVariable.Path_CompareWithCalendar
	String fileName=GlobalVariable.FileName_compareWithCal
	String sheetName='Fail-Compare Result'
	String sheetName1='Pass-Compare Result'


	@Keyword
	public void writeExcel(String[] dataToWrite) throws IOException
	{

		//Create an object of File class to open xlsx file

		File file =    new File(filePath+'\\'+fileName);

		//Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook wb = null;

		//Find the file extension by splitting  file name in substring and getting only extension name

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		//Check condition if the file is xlsx file

		if(fileExtensionName.equals(".xlsx")){

			//If it is xlsx file then create object of XSSFWorkbook class

			wb = new XSSFWorkbook(inputStream);

		}

		//Check condition if the file is xls file

		else if(fileExtensionName.equals(".xls")){

			//If it is xls file then create object of XSSFWorkbook class

			wb = new HSSFWorkbook(inputStream);

		}

		//Read excel sheet by sheet name

		Sheet sheet = wb.getSheet(sheetName);

		//Get the current count of rows in excel file

		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();  //5
		//println rowCount

		//Get the first row from the sheet

		Row row = sheet.getRow(0);
		//println row

		int lrow=rowCount
		Row Lastrow = sheet.getRow(lrow);
		//println Lastrow


		//Create a new row and append it at last of sheet

		Row newRow = sheet.createRow(rowCount+1);
		//println newRow

		//Create a loop over the cell of newly created Row

		int LastCellNumber= Lastrow.getLastCellNum()
		//println LastCellNumber

		for(int j = 0; j < Lastrow.getLastCellNum(); j++){

			//Fill data in row

			Cell cell = newRow.createCell(j);

			CellStyle style = wb.createCellStyle();
			//style.setAlignment(HorizontalAlignment.CENTER);
			style.setAlignment(HorizontalAlignment.CENTER);
			style.setVerticalAlignment(VerticalAlignment.CENTER);
			//style.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
			//style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			style.setBorderBottom(BorderStyle.THIN);
			style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
			style.setBorderLeft(BorderStyle.THIN);
			style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
			style.setBorderRight(BorderStyle.THIN);
			style.setRightBorderColor(IndexedColors.BLACK.getIndex());
			style.setBorderTop(BorderStyle.THIN);
			style.setTopBorderColor(IndexedColors.BLACK.getIndex());
			XSSFFont font = wb.createFont();
			font.setFontHeightInPoints((short) 10);
			font.setFontName("Arial");
			font.setColor(IndexedColors.BLACK.getIndex());
			font.setBold(false);
			font.setItalic(false);
			style.setFont(font);

			cell.setCellStyle(style);

			cell.setCellValue(dataToWrite[j]);

		}

		//Close input stream

		inputStream.close();

		//Create an object of FileOutputStream class to create write data in excel file

		FileOutputStream outputStream = new FileOutputStream(file);

		//write data in the excel file

		wb.write(outputStream);

		//close output stream

		outputStream.close();

	}

	@Keyword
	public void writeExcelForPass(String[] dataToWrite) throws IOException
	{

		//Create an object of File class to open xlsx file

		File file =    new File(filePath+'\\'+fileName);

		//Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook wb = null;

		//Find the file extension by splitting  file name in substring and getting only extension name

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		//Check condition if the file is xlsx file

		if(fileExtensionName.equals(".xlsx")){

			//If it is xlsx file then create object of XSSFWorkbook class

			wb = new XSSFWorkbook(inputStream);

		}

		//Check condition if the file is xls file

		else if(fileExtensionName.equals(".xls")){

			//If it is xls file then create object of XSSFWorkbook class

			wb = new HSSFWorkbook(inputStream);

		}

		//Read excel sheet by sheet name

		Sheet sheet = wb.getSheet(sheetName1);

		//Get the current count of rows in excel file

		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();  //5
		//println rowCount

		//Get the first row from the sheet

		Row row = sheet.getRow(0);
		//println row

		int lrow=rowCount
		Row Lastrow = sheet.getRow(lrow);
		//println Lastrow


		//Create a new row and append it at last of sheet

		Row newRow = sheet.createRow(rowCount+1);
		//println newRow

		//Create a loop over the cell of newly created Row

		int LastCellNumber= Lastrow.getLastCellNum()
		//println LastCellNumber

		for(int j = 0; j < Lastrow.getLastCellNum(); j++){

			//Fill data in row

			Cell cell = newRow.createCell(j);

			CellStyle style = wb.createCellStyle();
			//style.setAlignment(HorizontalAlignment.CENTER);
			style.setAlignment(HorizontalAlignment.CENTER);
			style.setVerticalAlignment(VerticalAlignment.CENTER);
			//style.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
			//style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			style.setBorderBottom(BorderStyle.THIN);
			style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
			style.setBorderLeft(BorderStyle.THIN);
			style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
			style.setBorderRight(BorderStyle.THIN);
			style.setRightBorderColor(IndexedColors.BLACK.getIndex());
			style.setBorderTop(BorderStyle.THIN);
			style.setTopBorderColor(IndexedColors.BLACK.getIndex());
			XSSFFont font = wb.createFont();
			font.setFontHeightInPoints((short) 10);
			font.setFontName("Arial");
			font.setColor(IndexedColors.BLACK.getIndex());
			font.setBold(false);
			font.setItalic(false);
			style.setFont(font);

			cell.setCellStyle(style);

			cell.setCellValue(dataToWrite[j]);

		}

		//Close input stream

		inputStream.close();

		//Create an object of FileOutputStream class to create write data in excel file

		FileOutputStream outputStream = new FileOutputStream(file);

		//write data in the excel file

		wb.write(outputStream);

		//close output stream

		outputStream.close();

	}


}
