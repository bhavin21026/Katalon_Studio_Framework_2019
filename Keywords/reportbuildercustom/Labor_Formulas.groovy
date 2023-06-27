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

public class Labor_Formulas
{



	//Last Year Compare

	@Keyword
	def double calculate_LaborCost_Percent(double ActualLaborCostTY, double NetSalesTY)

	{


		double dblLaborCostTY=NetSalesTY == 0 ? 0 :ActualLaborCostTY/NetSalesTY*100;
		double LaborCostTYPercent= Math.round(dblLaborCostTY * 100) / 100
		return LaborCostTYPercent


	}

	@Keyword
	def double calculate_LaborCost_LY__Percent(double ActualLaborCostLY, double NetSalesLY)

	{


		double dblLaborCostLY=NetSalesLY == 0 ? 0 :ActualLaborCostLY/NetSalesLY*100;
		double LaborCostLYPercent= Math.round(dblLaborCostLY * 100) / 100
		return LaborCostLYPercent


	}




	@Keyword
	def double calculate_LaborCost_Vs_LY__Dollar(double ActualLaborCostTY, double ActualLaborCostLY)

	{



		double dblLaborCostTY_vs_LY=ActualLaborCostTY-ActualLaborCostLY
		double LaborCostVsLY= Math.round(dblLaborCostTY_vs_LY * 100) / 100
		return LaborCostVsLY


	}

	@Keyword
	def double calculate_LaborCost_Vs_LY__PP(double ActualLaborCostTYPercent, double ActualLaborCostLYPercent)

	{


		double dblLaborCostTY_vs_LY_PP=ActualLaborCostTYPercent-ActualLaborCostLYPercent
		double LaborCostVsLY_PP= Math.round(dblLaborCostTY_vs_LY_PP * 100) / 100
		return LaborCostVsLY_PP


	}

	//Last Week Compare

	@Keyword
	def double calculate_LaborCostLW_Percent(double ActualLaborCostLW, double ActualNetSalesLW)

	{


		double dblLaborCostLWPercentage=ActualNetSalesLW == 0 ? 0 :(ActualLaborCostLW/ActualNetSalesLW)*100
		double LaborCostVsLYLW= Math.round(dblLaborCostLWPercentage * 100) / 100
		return LaborCostVsLYLW


	}

	@Keyword
	def double calculate_LaborCost_VS_LW_PP(double ActualLaborCostTWPercent, double ActualLaborCostLWPercent)

	{


		double dblLaborCostLWPP=ActualLaborCostTWPercent-ActualLaborCostLWPercent
		double LaborCostVsLYLW_PP= Math.round(dblLaborCostLWPP * 100) / 100
		return LaborCostVsLYLW_PP


	}

	@Keyword
	def double calculate_LaborCost_VS_LW_Dollar(double ActualLaborCostTW, double ActualLaborCostLW)

	{


		double dblLaborCostVsLastWeek=ActualLaborCostTW-ActualLaborCostLW
		double LaborCostVsLW= Math.round(dblLaborCostVsLastWeek * 100) / 100
		return LaborCostVsLW


	}



	//Labor Budget Formulas


	@Keyword
	def double calculate_LaborCostBudget_Percentage(double LaborCostBudgetBasedOnActualSales_dollar, double NetSalesTY)

	{


		double dblLaborCostBudgetPercent=NetSalesTY == 0 ? 0 :(LaborCostBudgetBasedOnActualSales_dollar/NetSalesTY)*100
		double LaborCostBudgetPercent= Math.round(dblLaborCostBudgetPercent * 100) / 100
		return LaborCostBudgetPercent


	}





	@Keyword
	def double calculate_LaborCostBudgetBasedOnActualSales_dollar(double ActualSalesTY, double LaborCostBudgetPercent)

	{


		double dblLaborCostBudgetForActualSales=(ActualSalesTY*LaborCostBudgetPercent)/100
		double LaborCostBudgetForActualSales= Math.round(dblLaborCostBudgetForActualSales * 100) / 100
		return LaborCostBudgetForActualSales


	}

	@Keyword
	def double calculate_LaborCostBudgetBasedOnBudgetedSales_dollar(double BudgetedSalesTY, double LaborCostBudgetPercent)

	{


		double dblLaborCostBudgetForBudgetedSales=(BudgetedSalesTY*LaborCostBudgetPercent)/100
		double LaborCostBudgetForBudgetedSales= Math.round(dblLaborCostBudgetForBudgetedSales * 100) / 100
		return LaborCostBudgetForBudgetedSales


	}


	@Keyword
	def double calculate_LaborCostVsBudget_PP(double LaborCostPercent, double LaborCostBudgetPercent)

	{


		double dblLaborCostVsBudget_PP=LaborCostPercent-LaborCostBudgetPercent
		double LaborCostVsBudget_PP= Math.round(dblLaborCostVsBudget_PP * 100) / 100
		return LaborCostVsBudget_PP


	}


	@Keyword
	def double calculate_LaborCostVsBudgetForActualSales_Dollar(double LaborCostDollar, double LaborCostBudgetForActualSales)

	{


		double dblLaborCostVsBudget_Dollar=LaborCostDollar-LaborCostBudgetForActualSales
		double LaborCostVsBudget_Dollar= Math.round(dblLaborCostVsBudget_Dollar * 100) / 100
		return LaborCostVsBudget_Dollar


	}

	@Keyword
	def double calculate_LaborCostVsBudgetForBudgetSales_Dollar(double LaborCostDollar, double LaborCostBudgetForBudgetSales)

	{


		double dblLaborCostVsBudgeted_Dollar=LaborCostDollar-LaborCostBudgetForBudgetSales
		double LaborCostVsBudgeted_Dollar= Math.round(dblLaborCostVsBudgeted_Dollar * 100) / 100
		return LaborCostVsBudgeted_Dollar


	}




}
