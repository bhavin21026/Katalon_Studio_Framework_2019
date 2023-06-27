package compareColumnsValues

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
import com.kms.katalon.core.util.KeywordUtil


import internal.GlobalVariable

public class GrossSalesValuesCompare extends excelUtils.WriteExcelDailyFormula
{



	@Keyword
	def  toVerifyGrossSalesvsLYDollorReportColumnsValues(double GrossSalesvsLYDollorReport1,double GrossSalesvsLYDollorReport,String store)
	{

		int Decison1=Double.compare(GrossSalesvsLYDollorReport1, GrossSalesvsLYDollorReport)


		if(Decison1==0)
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Gross Sales vs LY $',String.valueOf(GrossSalesvsLYDollorReport1),String.valueOf(GrossSalesvsLYDollorReport))
			}
			else
			{
				writeExcelAllStorePass('Gross Sales vs LY $',String.valueOf(GrossSalesvsLYDollorReport1),String.valueOf(GrossSalesvsLYDollorReport))
			}

			KeywordUtil.logInfo('Gross Sales vs LY $ value found On Report is '+GrossSalesvsLYDollorReport1+'And Value derived using formula is	'+GrossSalesvsLYDollorReport)
			KeywordUtil.markPassed('Gross Sales vs LY $ value found On Report is	'+GrossSalesvsLYDollorReport1+'And Value derived using formula is	'+GrossSalesvsLYDollorReport)
			KeywordUtil.markPassed('Gross Sales vs LY $----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Gross Sales vs LY $',String.valueOf(GrossSalesvsLYDollorReport1),String.valueOf(GrossSalesvsLYDollorReport))
			}
			else
			{
				writeExcelAllStoreFail('Gross Sales vs LY $',String.valueOf(GrossSalesvsLYDollorReport1),String.valueOf(GrossSalesvsLYDollorReport))
			}


			KeywordUtil.logInfo('Gross Sales vs LY $ value found On Report is'+GrossSalesvsLYDollorReport1+'And Value derived using formula is	'+GrossSalesvsLYDollorReport)
			KeywordUtil.markError('Gross Sales vs LY $ value found On Report is'+GrossSalesvsLYDollorReport1+' And Value derived using formula is	'+GrossSalesvsLYDollorReport)
			KeywordUtil.markError('Gross Sales vs LY $ ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyGrossSalesvsLYPercentReportColumnsValues(double GrossSalesvsLYPercentReport1,double GrossSalesvsLYPercentReport,String store)
	{

		int Decison1=Double.compare(GrossSalesvsLYPercentReport1, GrossSalesvsLYPercentReport)


		if(Decison1==0)
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Gross Sales vs LY %',String.valueOf(GrossSalesvsLYPercentReport1),String.valueOf(GrossSalesvsLYPercentReport))
			}
			else
			{
				writeExcelAllStorePass('Gross Sales vs LY %',String.valueOf(GrossSalesvsLYPercentReport1),String.valueOf(GrossSalesvsLYPercentReport))
			}

			KeywordUtil.logInfo('Gross Sales vs LY % value found On Report is '+GrossSalesvsLYPercentReport1+'And Value derived using formula is	'+GrossSalesvsLYPercentReport)
			KeywordUtil.markPassed('Gross Sales vs LY % value found On Report is	'+GrossSalesvsLYPercentReport1+'And Value derived using formula is	'+GrossSalesvsLYPercentReport)
			KeywordUtil.markPassed('Gross Sales vs LY %----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Gross Sales vs LY %',String.valueOf(GrossSalesvsLYPercentReport1),String.valueOf(GrossSalesvsLYPercentReport))
			}
			else
			{
				writeExcelAllStoreFail('Gross Sales vs LY %',String.valueOf(GrossSalesvsLYPercentReport1),String.valueOf(GrossSalesvsLYPercentReport))
			}


			KeywordUtil.logInfo('Gross Sales vs LY % value found On Report is'+GrossSalesvsLYPercentReport1+'And Value derived using formula is	'+GrossSalesvsLYPercentReport)
			KeywordUtil.markError('Gross Sales vs LY % value found On Report is'+GrossSalesvsLYPercentReport1+' And Value derived using formula is	'+GrossSalesvsLYPercentReport)
			KeywordUtil.markError('Gross Sales vs LY % ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}
}
