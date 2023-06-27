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






public class ExcelsCustom {

	@Keyword
	def createCell(Workbook wb, Row row, int column,String Date,Sheet sheet) {

		Cell cell = row.createCell(column);
		CellStyle style = wb.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setVerticalAlignment(VerticalAlignment.CENTER);
		style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setBorderBottom(BorderStyle.THIN);
		style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		style.setBorderLeft(BorderStyle.THIN);
		style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		style.setBorderRight(BorderStyle.THIN);
		style.setRightBorderColor(IndexedColors.BLACK.getIndex());
		style.setBorderTop(BorderStyle.THIN);
		style.setTopBorderColor(IndexedColors.BLACK.getIndex());
		XSSFFont font = wb.createFont();
		font.setFontHeightInPoints((short) 12);
		font.setFontName("Calibri");
		font.setColor(IndexedColors.BLACK.getIndex());
		font.setBold(true);
		font.setItalic(false);
		style.setFont(font);

		cell.setCellStyle(style);
		cell.setCellValue(Date);
		sheet.autoSizeColumn(column)
	}


	@Keyword
	def createDataCell(Workbook wb, Row row, int column,String Date,Sheet sheet) {

		Cell cell = row.createCell(column);
		CellStyle style = wb.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setVerticalAlignment(VerticalAlignment.CENTER);
		style.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setBorderBottom(BorderStyle.THIN);
		style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		style.setBorderLeft(BorderStyle.THIN);
		style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		style.setBorderRight(BorderStyle.THIN);
		style.setRightBorderColor(IndexedColors.BLACK.getIndex());
		style.setBorderTop(BorderStyle.THIN);
		style.setTopBorderColor(IndexedColors.BLACK.getIndex());
		XSSFFont font = wb.createFont();
		font.setFontHeightInPoints((short) 11);
		font.setFontName("Calibri");
		font.setColor(IndexedColors.BLACK.getIndex());
		font.setBold(true);
		font.setItalic(false);
		style.setFont(font);

		cell.setCellStyle(style);
		cell.setCellValue(Date);
		sheet.autoSizeColumn(column)
	}



	@Keyword
	def deleteCalFile() {

		String PresentBy= GlobalVariable.PresentBy

		if(PresentBy.equalsIgnoreCase("Day")) {

			File file = new File(GlobalVariable.Path_CompareWithCalendar+'\\'+GlobalVariable.FileName_compareWithCalWeekly)

			if(file.delete()) {
				System.out.println("File deleted successfully");
			}
			else {
				System.out.println("Failed to delete the file");
			}
		}
		else if(PresentBy.equalsIgnoreCase("Week")) {

			File file = new File(GlobalVariable.Path_CompareWithCalendar+'\\'+GlobalVariable.FileName_compareWithCalWeekly)

			if(file.delete()) {
				System.out.println("File deleted successfully");
			}
			else {
				System.out.println("Failed to delete the file");
			}
		}
	}



@Keyword
def deleteFile() {

	String PresentBy= GlobalVariable.PresentBy

	if(PresentBy.equalsIgnoreCase("Day")) {
		File file = new File(GlobalVariable.Path_CompareWithCalendar+'\\'+GlobalVariable.FileName_DailyFormula);

		if(file.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}
	else if(PresentBy.equalsIgnoreCase("Week")) {

		File file = new File(GlobalVariable.Path_CompareWithCalendar+'\\'+GlobalVariable.FileName_WeeklyFormula);

		if(file.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}
	else if(PresentBy.equalsIgnoreCase("Month")) {
		File file = new File(GlobalVariable.Path_CompareWithCalendar+'\\'+GlobalVariable.FileName_Monthlyormula);

		if(file.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}
	else if(PresentBy.equalsIgnoreCase("EntireRange")) {
		File file = new File(GlobalVariable.Path_CompareWithCalendar+'\\'+GlobalVariable.FileName_EntireRange);

		if(file.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}
}

@Keyword
def deleteFileLossPrevention() {

	String PresentBy= GlobalVariable.PresentBy

	if(PresentBy.equalsIgnoreCase("Day")) {
		File file = new File(GlobalVariable.Path_CompareWithCalendar+'\\LossPrevention'+GlobalVariable.FileName_DailyFormula);

		if(file.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}
	else if(PresentBy.equalsIgnoreCase("Week")) {

		File file = new File(GlobalVariable.Path_CompareWithCalendar+'\\LossPrevention'+GlobalVariable.FileName_WeeklyFormula);

		if(file.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}
	else if(PresentBy.equalsIgnoreCase("Month")) {
		File file = new File(GlobalVariable.Path_CompareWithCalendar+'\\LossPrevention'+GlobalVariable.FileName_Monthlyormula);

		if(file.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}
	else if(PresentBy.equalsIgnoreCase("EntireRange")) {
		File file = new File(GlobalVariable.Path_CompareWithCalendar+'\\LossPrevention'+GlobalVariable.FileName_EntireRange);

		if(file.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}
}
}
