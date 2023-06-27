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
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.math.RoundingMode;
import reportbuildercustom.RB_Keywords


import internal.GlobalVariable

public class NetSales_Formulas extends RB_Keywords
{




	@Keyword
	def double calculate_NetSalesVsLastYear_Dollar(double ActualSalesTY, double ActualSalesLY)
	{


		double NetSalesVsLastYear_DollarNew=ActualSalesTY-ActualSalesLY
		double NetSalesVsLastYear_Dollar= Math.round(NetSalesVsLastYear_DollarNew * 100) / 100
		return NetSalesVsLastYear_Dollar
	}



	@Keyword
	def double calculate_NetSalesVsLastYear_Percent(double ActualSalesTY, double ActualSalesLY)
	{

		double NetSalesVsLastYear_DollarNew=ActualSalesLY == 0 ? 0 :(ActualSalesTY-ActualSalesLY)/ActualSalesLY*100;
		double NetSalesVsLastYear_Dollar= Math.round(NetSalesVsLastYear_DollarNew * 100) / 100
		return NetSalesVsLastYear_Dollar
	}



	//Net Sales Budget Formulas


	@Keyword
	def double calculate_NetSalesBudget_Dollor(double SalesBudgetPercent, double NetSalesLY)

	{


		double NetSalesBudget_DollarNew=(NetSalesLY*SalesBudgetPercent/100)+NetSalesLY;
		double NetSalesBudget_Dollar= Math.round(NetSalesBudget_DollarNew * 100) / 100
		return NetSalesBudget_Dollar


	}



	@Keyword
	def double calculate_NetSalesBudgetPercent(double SalesBudget, double NetSalesLY)

	{

		String DataGrain = GlobalVariable.DataGrain

		String PresentBy = GlobalVariable.PresentBy

		double NoOfWeeksInMonth=noOfWeeksBasedOnDate()



		if (PresentBy.equalsIgnoreCase('Week')) {


			//double WeeklySalesBudget=SalesBudget/NoOfWeeksInMonth
			double dblNetSalesBudgetPercent=NetSalesLY == 0 ? 0 :(SalesBudget-NetSalesLY)/NetSalesLY*100;
			double NetSalesBudgetPercent= Math.round(dblNetSalesBudgetPercent * 100) / 100
			return NetSalesBudgetPercent
		}

		else if(PresentBy.equalsIgnoreCase('Month'))


		{
			double dblNetSalesBudgetPercent=NetSalesLY == 0 ? 0 :(SalesBudget-NetSalesLY)/NetSalesLY*100;
			double NetSalesBudgetPercent= Math.round(dblNetSalesBudgetPercent * 100) / 100
			return NetSalesBudgetPercent

		}

		else if(PresentBy.equalsIgnoreCase('EntireRange'))


		{
			double dblNetSalesBudgetPercent=NetSalesLY == 0 ? 0 :(SalesBudget-NetSalesLY)/NetSalesLY*100;
			double NetSalesBudgetPercent= Math.round(dblNetSalesBudgetPercent * 100) / 100
			return NetSalesBudgetPercent

		}

	}


	@Keyword
	def double calculate_SalesVsBudget(double SalesBudgetTY, double ActualSalesTY)

	{


		String DataGrain = GlobalVariable.DataGrain

		String PresentBy = GlobalVariable.PresentBy



		double NoOfWeeksInMonth=noOfWeeksBasedOnDate()


		if (PresentBy.equalsIgnoreCase('Week')) {

			//double WeeklySalesBudget=SalesBudgetTY/NoOfWeeksInMonth
			double dblSalesVsBudget=ActualSalesTY-SalesBudgetTY
			double SalesVsBudget= Math.round(dblSalesVsBudget * 100) / 100
			return SalesVsBudget
		}
		else if(PresentBy.equalsIgnoreCase('Month'))


		{
			double dblSalesVsBudget=ActualSalesTY-SalesBudgetTY
			double SalesVsBudget= Math.round(dblSalesVsBudget * 100) / 100
			return SalesVsBudget

		}


		else if(PresentBy.equalsIgnoreCase('EntireRange'))


		{
			double dblSalesVsBudget=ActualSalesTY-SalesBudgetTY
			double SalesVsBudget= Math.round(dblSalesVsBudget * 100) / 100
			return SalesVsBudget

		}


	}

	@Keyword
	def double calculate_SalesVsBudgetPercent(double SalesBudgetTY, double ActualSalesTY)

	{
		String DataGrain = GlobalVariable.DataGrain

		String PresentBy = GlobalVariable.PresentBy



		double NoOfWeeksInMonth=noOfWeeksBasedOnDate()

		if (PresentBy.equalsIgnoreCase('Week')) {


			double dblSalesVsBudgetPercent=SalesBudgetTY == 0 ? 0 :((ActualSalesTY-SalesBudgetTY)/SalesBudgetTY)*100;
			double SalesVsBudgetPercent= Math.round(dblSalesVsBudgetPercent * 100) / 100
			return SalesVsBudgetPercent

		}


		else if(PresentBy.equalsIgnoreCase('Month'))


		{
			double dblSalesVsBudgetPercent=SalesBudgetTY == 0 ? 0 :((ActualSalesTY-SalesBudgetTY)/SalesBudgetTY)*100;
			double SalesVsBudgetPercent= Math.round(dblSalesVsBudgetPercent * 100) / 100
			return SalesVsBudgetPercent

		}

		else if(PresentBy.equalsIgnoreCase('EntireRange'))


		{
			double dblSalesVsBudgetPercent=SalesBudgetTY == 0 ? 0 :((ActualSalesTY-SalesBudgetTY)/SalesBudgetTY)*100;
			double SalesVsBudgetPercent= Math.round(dblSalesVsBudgetPercent * 100) / 100
			return SalesVsBudgetPercent

		}


	}













}
