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

public class NetSalesValuesCompare extends excelUtils.WriteExcelDailyFormula
{


	@Keyword
	def  toVerifyNetSalesVsLyDollarColumnsValues(double NetSalesVSLY,double NetSalesvsLY$,String store)
	{

		int Decison1=Double.compare(NetSalesvsLY$, NetSalesVSLY)


		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Net Sales vs LY $',String.valueOf(NetSalesVSLY),String.valueOf(NetSalesvsLY$))
			}
			else
			{
				writeExcelAllStorePass('Net Sales vs LY $',String.valueOf(NetSalesVSLY),String.valueOf(NetSalesvsLY$))
			}
			KeywordUtil.logInfo('Net Sales vs LY $ value found On Report is'+  NetSalesVSLY  +'And Value derived using formula is'+ NetSalesvsLY$)
			KeywordUtil.markPassed('Net Sales vs LY $ value found On Report is'+  NetSalesVSLY  +'And Value derived using formula is'+ NetSalesvsLY$)
			KeywordUtil.markPassed('Net Sales vs LY $ ----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Net Sales vs LY $',String.valueOf(NetSalesVSLY),String.valueOf(NetSalesvsLY$))
			}
			else
			{
				writeExcelAllStoreFail('Net Sales vs LY $',String.valueOf(NetSalesVSLY),String.valueOf(NetSalesvsLY$))
			}


			KeywordUtil.logInfo('Net Sales vs LY $ value found On Report is '+NetSalesVSLY+' And Value derived using formula is '+NetSalesvsLY$)
			KeywordUtil.markError('Net Sales vs LY $ value found On Report is '+NetSalesVSLY+'	 And Value derived using formula is '+NetSalesvsLY$)
			KeywordUtil.markError('Net Sales vs LY $ ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}




	@Keyword
	def  toVerifyNetSalesVsLYPercentColumnValues(double NetSalesVSLYPercent,double NetSalesvsLYPercent,String store)
	{


		int Decison2=Double.compare(NetSalesvsLYPercent, NetSalesVSLYPercent)





		if(Decison2==0)
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Net Sales vs LY %',String.valueOf(NetSalesVSLYPercent),String.valueOf(NetSalesvsLYPercent))
			}
			else
			{
				writeExcelAllStorePass('Net Sales vs LY %',String.valueOf(NetSalesVSLYPercent),String.valueOf(NetSalesvsLYPercent))
			}
			KeywordUtil.logInfo('Net Sales vs LY % value found On Report is'+NetSalesVSLYPercent+'	And Value derived using formula is		'+NetSalesvsLYPercent)
			KeywordUtil.markPassed('Net Sales vs LY % value found On Report is'+NetSalesVSLYPercent+'	 And Value derived using formula is		'+NetSalesvsLYPercent)
			KeywordUtil.markPassed('Net Sales vs LY % ----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Net Sales vs LY %',String.valueOf(NetSalesVSLYPercent),String.valueOf(NetSalesvsLYPercent))
			}
			else
			{
				writeExcelAllStoreFail('Net Sales vs LY %',String.valueOf(NetSalesVSLYPercent),String.valueOf(NetSalesvsLYPercent))
			}



			KeywordUtil.logInfo('Net Sales vs LY % value found On Report is	'+NetSalesVSLYPercent+' And Value derived using formula is	'+NetSalesvsLYPercent)
			KeywordUtil.markError('Net Sales vs LY % value found On Report is	'+NetSalesVSLYPercent+' And Value derived using formula is	'+NetSalesvsLYPercent)
			KeywordUtil.markError('Net Sales vs LY % ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	//BUDGET


	@Keyword
	def  toVerifySalesBudgetDollorColumnValues(double NetSalesBudgetDollars,double SalesBudgetedDollor,String store)
	{


		int Decison2=Double.compare(NetSalesBudgetDollars, SalesBudgetedDollor)





		if(Decison2==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Sales Budget $',String.valueOf(NetSalesBudgetDollars),String.valueOf(SalesBudgetedDollor))
			}
			else
			{
				writeExcelAllStorePass('Sales Budget $',String.valueOf(NetSalesBudgetDollars),String.valueOf(SalesBudgetedDollor))
			}
			KeywordUtil.logInfo('Sales Budget $ value found On Report is'+NetSalesBudgetDollars+'	And Value derived using formula is'+SalesBudgetedDollor)
			KeywordUtil.markPassed('Sales Budget $ value found On Report is'+NetSalesBudgetDollars+'	 And Value derived using formula is'+SalesBudgetedDollor)
			KeywordUtil.markPassed('Sales Budget $----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Sales Budget $',String.valueOf(NetSalesBudgetDollars),String.valueOf(SalesBudgetedDollor))
			}
			else
			{
				writeExcelAllStoreFail('Sales Budget $',String.valueOf(NetSalesBudgetDollars),String.valueOf(SalesBudgetedDollor))

			}


			KeywordUtil.logInfo('Sales Budget $ value found On Report is	'+NetSalesBudgetDollars+' And Value derived using formula is'+SalesBudgetedDollor)
			KeywordUtil.markError('Sales Budget $ value found On Report is	'+NetSalesBudgetDollars+' And Value derived using formula is'+SalesBudgetedDollor)
			KeywordUtil.markError('Sales Budget $ ----> Value derived using formula is NOT MATCHING with tabel value.')

		}
	}



	@Keyword
	def  toVerifySalesBudgetPercentColumnValues(double NetSalesBudgetPercent,double SalesBudgetPercent,String store)
	{


		int Decison2=Double.compare(NetSalesBudgetPercent, SalesBudgetPercent)





		if(Decison2==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Sales Budget %',String.valueOf(NetSalesBudgetPercent),String.valueOf(SalesBudgetPercent))
			}
			else
			{
				writeExcelAllStorePass('Sales Budget %',String.valueOf(NetSalesBudgetPercent),String.valueOf(SalesBudgetPercent))
			}
			KeywordUtil.logInfo('Sales Budget % value found On Report is'+NetSalesBudgetPercent+'	And Value derived using formula is'+SalesBudgetPercent)
			KeywordUtil.markPassed('Sales Budget % value found On Report is'+NetSalesBudgetPercent+'	 And Value derived using formula is'+SalesBudgetPercent)
			KeywordUtil.markPassed('Sales Budget %----> Value derived using formula is matching with tabel value.')
		}

		else
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Sales Budget %',String.valueOf(NetSalesBudgetPercent),String.valueOf(SalesBudgetPercent))
			}
			else
			{
				writeExcelAllStoreFail('Sales Budget %',String.valueOf(NetSalesBudgetPercent),String.valueOf(SalesBudgetPercent))

			}

			KeywordUtil.logInfo('Sales Budget % value found On Report is	'+NetSalesBudgetPercent+' And Value derived using formula is'+SalesBudgetPercent)
			KeywordUtil.markError('Sales Budget % value found On Report is	'+NetSalesBudgetPercent+' And Value derived using formula is'+SalesBudgetPercent)
			KeywordUtil.markError('Sales Budget % ----> Value derived using formula is NOT MATCHING with tabel value.')

		}
	}


	@Keyword
	def  toVerifySalesvsBudgetDollarsColumnValues(double SalesVSBudgetDollar,double SalesvsBudgetDollar,String store)
	{


		int Decison2=Double.compare(SalesVSBudgetDollar, SalesvsBudgetDollar)





		if(Decison2==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Sales vs Budget $ ',String.valueOf(SalesVSBudgetDollar),String.valueOf(SalesvsBudgetDollar))
			}
			else
			{
				writeExcelAllStorePass('Sales vs Budget $ ',String.valueOf(SalesVSBudgetDollar),String.valueOf(SalesvsBudgetDollar))
			}

			KeywordUtil.logInfo('Sales vs Budget $ value found On Report is'+SalesVSBudgetDollar+'	And Value derived using formula is'+SalesvsBudgetDollar)
			KeywordUtil.markPassed('Sales vs Budget $value found On Report is'+SalesVSBudgetDollar+'	 And Value derived using formula is'+SalesvsBudgetDollar)
			KeywordUtil.markPassed('Sales vs Budget $----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Sales vs Budget $ ',String.valueOf(SalesVSBudgetDollar),String.valueOf(SalesvsBudgetDollar))
			}
			else
			{
				writeExcelAllStoreFail('Sales vs Budget $ ',String.valueOf(SalesVSBudgetDollar),String.valueOf(SalesvsBudgetDollar))

			}


			KeywordUtil.logInfo('Sales vs Budget $ value found On Report is	'+SalesVSBudgetDollar+' And Value derived using formula is'+SalesvsBudgetDollar)
			KeywordUtil.markError('Sales vs Budget $ value found On Report is	'+SalesVSBudgetDollar+' And Value derived using formula is'+SalesvsBudgetDollar)
			KeywordUtil.markError('Sales vs Budget $ ----> Value derived using formula is NOT MATCHING with tabel value.')

		}
	}


	@Keyword
	def  toVerifySalesvsBudgetPercentColumnValues(double SalesVSBudgetPercent,double SalesvsBudgetPercent,String store)
	{


		int Decison2=Double.compare(SalesVSBudgetPercent, SalesvsBudgetPercent)





		if(Decison2==0)
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Sales vs Budget %',String.valueOf(SalesVSBudgetPercent),String.valueOf(SalesvsBudgetPercent))
			}
			else
			{
				writeExcelAllStorePass('Sales vs Budget %',String.valueOf(SalesVSBudgetPercent),String.valueOf(SalesvsBudgetPercent))
			}
			KeywordUtil.logInfo('Sales vs Budget % value found On Report is'+SalesVSBudgetPercent+'	And Value derived using formula is'+SalesvsBudgetPercent)
			KeywordUtil.markPassed('Sales vs Budget % value found On Report is'+SalesVSBudgetPercent+'	 And Value derived using formula is'+SalesvsBudgetPercent)
			KeywordUtil.markPassed('Sales vs Budget % ----> Value derived using formula is matching with tabel value.')
		}

		else
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Sales vs Budget %',String.valueOf(SalesVSBudgetPercent),String.valueOf(SalesvsBudgetPercent))
			}
			else
			{
				writeExcelAllStoreFail('Sales vs Budget %',String.valueOf(SalesVSBudgetPercent),String.valueOf(SalesvsBudgetPercent))

			}


			KeywordUtil.logInfo('Sales vs Budget % value found On Report is	'+SalesVSBudgetPercent+' And Value derived using formula is'+SalesvsBudgetPercent)
			KeywordUtil.markError('Sales vs Budget % value found On Report is	'+SalesVSBudgetPercent+' And Value derived using formula is'+SalesvsBudgetPercent)
			KeywordUtil.markError('Sales vs Budget % ----> Value derived using formula is NOT MATCHING with tabel value.')

		}
	}


}
