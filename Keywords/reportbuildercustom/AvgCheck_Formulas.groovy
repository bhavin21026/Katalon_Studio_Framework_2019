package reportbuildercustom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class AvgCheck_Formulas {

	@Keyword
	def double calculate_AvgCheckTYDollar(double NetSalesTY, double GuestCountTY) {

		double dblAvgCheckTYDollar=GuestCountTY == 0 ? 0 :(NetSalesTY/GuestCountTY)
		//double AvgCheckTYDollar= Math.round(dblAvgCheckTYDollar * 100) / 100
		return dblAvgCheckTYDollar
	}

	@Keyword
	def double calculate_AvgCheckLYDollar(double NetSalesLY, double GuestCountLY) {

		double dblAvgCheckLYDollar=GuestCountLY == 0 ? 0 :(NetSalesLY/GuestCountLY)
		//double AvgCheckLYDollar= Math.round(dblAvgCheckLYDollar * 100) / 100
		return dblAvgCheckLYDollar
	}

	@Keyword
	def double calculate_AvgCheck_Vs_LY_Count_Dollar(double AvgTicketTY, double AvgTicketLY) {

		double dblAvgCheckLY=AvgTicketTY-AvgTicketLY
		double AvgChecktLYValue= Math.round(dblAvgCheckLY * 100) / 100
		return AvgChecktLYValue
	}

	@Keyword
	def double calculate_AvgCheck_Vs_LY_Count_Percent(double AvgTicketTY, double AvgTicketLY) {

		double dblAvgCheckLY=AvgTicketLY == 0 ? 0 :((AvgTicketTY-AvgTicketLY)/AvgTicketLY)*100
		double AvgChecktLYPercentValue= Math.round(dblAvgCheckLY * 100) / 100
		return AvgChecktLYPercentValue
	}
}
