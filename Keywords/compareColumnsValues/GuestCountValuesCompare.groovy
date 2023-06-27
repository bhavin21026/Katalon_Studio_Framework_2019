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

public class GuestCountValuesCompare extends excelUtils.WriteExcelDailyFormula
{




	@Keyword
	def  toVerifyGuestVsLYCountColumnsValues(double GuestCountVsLYCountt,double GuestvsLYCount,String store)
	{

		int Decison1=Double.compare(GuestCountVsLYCountt, GuestvsLYCount)


		if(Decison1==0)
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Guest vs LY Count',String.valueOf(GuestCountVsLYCountt),String.valueOf(GuestvsLYCount))
			}
			else
			{
				writeExcelAllStorePass('Guest vs LY Count',String.valueOf(GuestCountVsLYCountt),String.valueOf(GuestvsLYCount))
			}

			KeywordUtil.logInfo('Guest vs LY Count value found On Report is '+GuestCountVsLYCountt+'And Value derived using formula is	'+GuestvsLYCount)
			KeywordUtil.markPassed('Guest vs LY Count value found On Report is	'+GuestCountVsLYCountt+'And Value derived using formula is	'+GuestvsLYCount)
			KeywordUtil.markPassed('Guest vs LY Count----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Guest vs LY Count',String.valueOf(GuestCountVsLYCountt),String.valueOf(GuestvsLYCount))
			}
			else
			{
				writeExcelAllStoreFail('Guest vs LY Count',String.valueOf(GuestCountVsLYCountt),String.valueOf(GuestvsLYCount))
			}


			KeywordUtil.logInfo('Guest vs LY Count value found On Report is'+GuestCountVsLYCountt+'And Value derived using formula is	'+GuestvsLYCount)
			KeywordUtil.markError('Guest vs LY Count value found On Report is'+GuestCountVsLYCountt+' And Value derived using formula is	'+GuestvsLYCount)
			KeywordUtil.markError('Guest vs LY Count ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyGuestVsLYPercentCountColumnsValues(double GuestCountVsLYPercent,double GuestvsLYCountPercent,String store)
	{

		int Decison2=Double.compare(GuestCountVsLYPercent, GuestvsLYCountPercent)



		if(Decison2==0)
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Guest vs LY %',String.valueOf(GuestCountVsLYPercent),String.valueOf(GuestvsLYCountPercent))
			}
			else
			{
				writeExcelAllStorePass('Guest vs LY %',String.valueOf(GuestCountVsLYPercent),String.valueOf(GuestvsLYCountPercent))
			}
			KeywordUtil.logInfo('Guest vs LY % Count value found On Report is	'+GuestCountVsLYPercent+ '	And Value derived using formula is	'+GuestvsLYCountPercent)
			KeywordUtil.markPassed('Guest vs LY % Count value found On Report is	'+GuestCountVsLYPercent+ '	And Value derived using formula is	'+GuestvsLYCountPercent)
			KeywordUtil.markPassed('Guest vs LY %	 ----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Guest vs LY %',String.valueOf(GuestCountVsLYPercent),String.valueOf(GuestvsLYCountPercent))
			}
			else
			{
				writeExcelAllStoreFail('Guest vs LY %',String.valueOf(GuestCountVsLYPercent),String.valueOf(GuestvsLYCountPercent))
			}



			KeywordUtil.logInfo('Guest vs LY % Count value found On Report is	'+GuestCountVsLYPercent+ '	And Value derived using formula is'+GuestvsLYCountPercent)
			KeywordUtil.markError('Guest vs LY % Count value found On Report is	'+GuestCountVsLYPercent+ '	And Value derived using formula is'+GuestvsLYCountPercent)
			KeywordUtil.markError('Guest vs LY %	----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}
}
