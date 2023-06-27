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

public class AvgTicketValuesCompare extends excelUtils.WriteExcelDailyFormula
{


	@Keyword
	def  toVerifyAvgCheckvsLYDollarColumnsValues(double AvgCheckVsLY,double AvgCheckvsLY$,String store)
	{

		int Decison1=Double.compare(AvgCheckVsLY, AvgCheckvsLY$)


		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Avg Check vs LY $ ',String.valueOf(AvgCheckVsLY),String.valueOf(AvgCheckvsLY$))
			}
			else
			{
				writeExcelAllStorePass('Avg Check vs LY $ ',String.valueOf(AvgCheckVsLY),String.valueOf(AvgCheckvsLY$))
			}

			KeywordUtil.logInfo('Avg Check vs LY $ value found On Report is '+AvgCheckVsLY+'And Value derived using formula is	'+AvgCheckvsLY$)
			KeywordUtil.markPassed('Avg Check vs LY $ value found On Report is	'+AvgCheckVsLY+'And Value derived using formula is	'+AvgCheckvsLY$)
			KeywordUtil.markPassed('Avg Check vs LY $----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Avg Check vs LY $ ',String.valueOf(AvgCheckVsLY),String.valueOf(AvgCheckvsLY$))
			}
			else
			{
				writeExcelAllStoreFail('Avg Check vs LY $ ',String.valueOf(AvgCheckVsLY),String.valueOf(AvgCheckvsLY$))
			}


			KeywordUtil.logInfo('Avg Check vs LY $ value found On Report is'+AvgCheckVsLY+'And Value derived using formula is	'+AvgCheckvsLY$)
			KeywordUtil.markError('Avg Check vs LY $ value found On Report is'+AvgCheckVsLY+' And Value derived using formula is	'+AvgCheckvsLY$)
			KeywordUtil.markError('Avg Check vs LY $ ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyAvgCheckvsLYPercentColumnsValues(double AvgCheckVsLYPercent,double AvgCheckvsLYPercent,String store)
	{

		int Decison2=Double.compare(AvgCheckVsLYPercent, AvgCheckvsLYPercent)



		if(Decison2==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Avg Check vs LY % ',String.valueOf(AvgCheckVsLYPercent),String.valueOf(AvgCheckvsLYPercent))
			}
			else
			{
				writeExcelAllStorePass('Avg Check vs LY % ',String.valueOf(AvgCheckVsLYPercent),String.valueOf(AvgCheckvsLYPercent))
			}
			KeywordUtil.logInfo('Avg Check vs LY % Count value found On Report is'+AvgCheckVsLYPercent+ 'And Value derived using formula is	'+AvgCheckvsLYPercent)
			KeywordUtil.markPassed('Avg Check vs LY % Count value found On Report is'+AvgCheckVsLYPercent+ 'And Value derived using formula is	'+AvgCheckvsLYPercent)
			KeywordUtil.markPassed('Avg Check vs LY % ----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Avg Check vs LY % ',String.valueOf(AvgCheckVsLYPercent),String.valueOf(AvgCheckvsLYPercent))
			}
			else
			{
				writeExcelAllStoreFail('Avg Check vs LY % ',String.valueOf(AvgCheckVsLYPercent),String.valueOf(AvgCheckvsLYPercent))
			}


			KeywordUtil.logInfo('Avg Check vs LY %Count value found On Report is	'+AvgCheckVsLYPercent+ 'And Value derived using formula is'+AvgCheckvsLYPercent)
			KeywordUtil.markError('Avg Check vs LY % Count value found On Report is	'+AvgCheckVsLYPercent+ 'And Value derived using formula is'+AvgCheckvsLYPercent)
			KeywordUtil.markError('Avg Check vs LY %----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}

	@Keyword
	def toVerifyAvgCheckTYDollorValues(double AvgCheckTY,double AvgCheckTY$,String store)
	{

		int Decison2=Double.compare(AvgCheckTY, AvgCheckTY$)



		if(Decison2==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('AvgCheckvsTY$ ',String.valueOf(AvgCheckTY),String.valueOf(AvgCheckTY$))
			}
			else
			{
				writeExcelAllStorePass('AvgCheckvsTY$ ',String.valueOf(AvgCheckTY),String.valueOf(AvgCheckTY$))
			}

			KeywordUtil.logInfo('AvgCheckvsTY$ value found On Report is'+AvgCheckTY+ 'And Value derived using formula is	'+AvgCheckTY$)
			KeywordUtil.markPassed('AAvgCheckvsTY$  value found On Report is'+AvgCheckTY+ 'And Value derived using formula is	'+AvgCheckTY$)
			KeywordUtil.markPassed('AvgCheckvsTY$ ----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('AvgCheckvsTY$ ',String.valueOf(AvgCheckTY),String.valueOf(AvgCheckTY$))
			}
			else
			{
				writeExcelAllStoreFail('AvgCheckvsTY$ ',String.valueOf(AvgCheckTY),String.valueOf(AvgCheckTY$))
			}

			KeywordUtil.logInfo('AvgCheckvsTY$ value found On Report is	'+AvgCheckTY+ 'And Value derived using formula is'+AvgCheckTY$)
			KeywordUtil.markError('AvgCheckvsTY$ Count value found On Report is	'+AvgCheckTY+ 'And Value derived using formula is'+AvgCheckTY$)
			KeywordUtil.markError('AvgCheckvsTY$---> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def toVerifyAvgCheckLYDollorValues(double AvgCheckLY,double AvgCheckLY$,String store)
	{

		int Decison2=Double.compare(AvgCheckLY, AvgCheckLY$)



		if(Decison2==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('AvgCheckvsLY$',String.valueOf(AvgCheckLY),String.valueOf(AvgCheckLY$))
			}
			else
			{
				writeExcelAllStorePass('AvgCheckvsLY$',String.valueOf(AvgCheckLY),String.valueOf(AvgCheckLY$))
			}
			KeywordUtil.logInfo('AvgCheckvsLY$ Count value found On Report is'+AvgCheckLY+ 'And Value derived using formula is	'+AvgCheckLY$)
			KeywordUtil.markPassed('AvgCheckvsLY$ value found On Report is'+AvgCheckLY+ 'And Value derived using formula is	'+AvgCheckLY$)
			KeywordUtil.markPassed('AvgCheckvsLY$----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('AvgCheckvsLY$',String.valueOf(AvgCheckLY),String.valueOf(AvgCheckLY$))
			}
			else
			{
				writeExcelAllStoreFail('AvgCheckvsLY$',String.valueOf(AvgCheckLY),String.valueOf(AvgCheckLY$))
			}


			KeywordUtil.logInfo('AvgCheckvsLY$ value found On Report is	'+AvgCheckLY+ 'And Value derived using formula is'+AvgCheckLY$)
			KeywordUtil.markError('AvgCheckvsLY$ value found On Report is	'+AvgCheckLY+ 'And Value derived using formula is'+AvgCheckLY$)
			KeywordUtil.markError('AvgCheckvsLY$---> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}
}
