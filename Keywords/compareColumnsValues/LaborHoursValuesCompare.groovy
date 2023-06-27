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

public class LaborHoursValuesCompare extends excelUtils.WriteExcelDailyFormula
{




	@Keyword
	def  toVerifyTotalhoursvsLYReportColumnsValues(double TotalhoursvsLYReport1,double TotalhoursvsLYReport,String store)
	{

		int Decison1=Double.compare(TotalhoursvsLYReport1, TotalhoursvsLYReport)


		if(Decison1==0)
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Total hours vs LY',String.valueOf(TotalhoursvsLYReport1),String.valueOf(TotalhoursvsLYReport))
			}
			else
			{
				writeExcelAllStorePass('Total hours vs LY',String.valueOf(TotalhoursvsLYReport1),String.valueOf(TotalhoursvsLYReport))
			}

			KeywordUtil.logInfo('Total hours vs LY value found On Report is '+TotalhoursvsLYReport1+'And Value derived using formula is	'+TotalhoursvsLYReport)
			KeywordUtil.markPassed('Total hours vs LY value found On Report is	'+TotalhoursvsLYReport1+'And Value derived using formula is	'+TotalhoursvsLYReport)
			KeywordUtil.markPassed('Total hours vs LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Total hours vs LY',String.valueOf(TotalhoursvsLYReport1),String.valueOf(TotalhoursvsLYReport))
			}
			else
			{
				writeExcelAllStoreFail('Total hours vs LY',String.valueOf(TotalhoursvsLYReport1),String.valueOf(TotalhoursvsLYReport))
			}


			KeywordUtil.logInfo('Total hours vs LY value found On Report is'+TotalhoursvsLYReport1+'And Value derived using formula is	'+TotalhoursvsLYReport)
			KeywordUtil.markError('Total hours vs LY value found On Report is'+TotalhoursvsLYReport1+' And Value derived using formula is	'+TotalhoursvsLYReport)
			KeywordUtil.markError('Total hours vs LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyOThoursvsLYReportColumnsValues(double OThoursvsLYReport1,double OThoursvsLYReport,String store)
	{

		int Decison1=Double.compare(OThoursvsLYReport1, OThoursvsLYReport)


		if(Decison1==0)
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('OT hours vs LY',String.valueOf(OThoursvsLYReport1),String.valueOf(OThoursvsLYReport))
			}
			else
			{
				writeExcelAllStorePass('OT hours vs LY',String.valueOf(OThoursvsLYReport1),String.valueOf(OThoursvsLYReport))
			}

			KeywordUtil.logInfo('OT hours vs LY value found On Report is '+OThoursvsLYReport1+'And Value derived using formula is	'+OThoursvsLYReport)
			KeywordUtil.markPassed('OT hours vs LY value found On Report is	'+OThoursvsLYReport1+'And Value derived using formula is	'+OThoursvsLYReport)
			KeywordUtil.markPassed('OT hours vs LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('OT hours vs LY',String.valueOf(OThoursvsLYReport1),String.valueOf(OThoursvsLYReport))
			}
			else
			{
				writeExcelAllStoreFail('OT hours vs LY',String.valueOf(OThoursvsLYReport1),String.valueOf(OThoursvsLYReport))
			}


			KeywordUtil.logInfo('OT hours vs LY value found On Report is'+OThoursvsLYReport1+'And Value derived using formula is	'+OThoursvsLYReport)
			KeywordUtil.markError('OT hours vs LY value found On Report is'+OThoursvsLYReport1+' And Value derived using formula is	'+OThoursvsLYReport)
			KeywordUtil.markError('OT hours vs LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}
}
