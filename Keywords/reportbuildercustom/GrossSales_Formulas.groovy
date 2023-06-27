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



public class GrossSales_Formulas
{

	@Keyword
	def double calculate_GrossSalesvsLYDollor(double GrossSalesTY, double GrossSalesLY)
	{

		double dblGrossSalesLYLY=GrossSalesTY-GrossSalesLY
		double GrossSalesvsLYValue= Math.round(dblGrossSalesLYLY * 100) / 100
		return GrossSalesvsLYValue
	}

	@Keyword
	def double calculate_GrossSalesvsLYPercent(double GrossSalesTY, double GrossSalesLY)
	{

		double GrossSalesVsLastYear_DollarNew=GrossSalesLY == 0 ? 0 :(GrossSalesTY-GrossSalesLY)/GrossSalesLY*100;
		double GrossSalesVsLastYear_Dollar= Math.round(GrossSalesVsLastYear_DollarNew * 100) / 100
		return GrossSalesVsLastYear_Dollar
	}
}
