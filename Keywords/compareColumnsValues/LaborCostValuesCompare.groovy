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

public class LaborCostValuesCompare extends excelUtils.WriteExcelDailyFormula {




	@Keyword
	def  toVerifyLaborCostPercentColumnsValues(double LaborCostTYPercent,double LaborCostPercent,String store) {

		int Decison1=Double.compare(LaborCostTYPercent, LaborCostPercent)


		if(Decison1==0) {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelPassFormulaCheck('Labor Cost Percent TY',String.valueOf(LaborCostTYPercent),String.valueOf(LaborCostPercent))
			}
			else {
				writeExcelAllStorePass('Labor Cost Percent TY',String.valueOf(LaborCostTYPercent),String.valueOf(LaborCostPercent))
			}

			KeywordUtil.logInfo('Labor Cost Percent TY value found On Report is '+LaborCostTYPercent+'And Value derived using formula is'+LaborCostPercent)
			KeywordUtil.markPassed('Labor Cost Percent TY value found On Report is	'+LaborCostTYPercent+'And Value derived using formula is'+LaborCostPercent)
			KeywordUtil.markPassed('Labor Cost Percent TY----> Value derived using formula is matching with tabel value.')
		}

		else {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelDailyFormulaCheck('Labor Cost Percent TY',String.valueOf(LaborCostTYPercent),String.valueOf(LaborCostPercent))
			}
			else {
				writeExcelAllStoreFail('Labor Cost Percent TY',String.valueOf(LaborCostTYPercent),String.valueOf(LaborCostPercent))
			}



			KeywordUtil.logInfo('Labor Cost Percent TY value found On Report is'+LaborCostTYPercent+'And Value derived using formula is	'+LaborCostPercent)
			KeywordUtil.markError('Labor Cost Percent TY value found On Report is'+LaborCostTYPercent+' And Value derived using formula is'+LaborCostPercent)
			KeywordUtil.markError('Labor Cost Percent TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyLaborCostLYPercentColumnsValues(double LaborCostLYPercentReport,double LaborCostLYPercent,String store) {

		int Decison1=Double.compare(LaborCostLYPercentReport, LaborCostLYPercent)


		if(Decison1==0) {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelPassFormulaCheck('Labor Cost Percent LY',String.valueOf(LaborCostLYPercentReport),String.valueOf(LaborCostLYPercent))
			}
			else {
				writeExcelAllStorePass('Labor Cost Percent LY',String.valueOf(LaborCostLYPercentReport),String.valueOf(LaborCostLYPercent))
			}

			KeywordUtil.logInfo('Labor Cost Percent LY value found On Report is '+LaborCostLYPercentReport+'And Value derived using formula is'+LaborCostLYPercent)
			KeywordUtil.markPassed('Labor Cost Percent LY value found On Report is	'+LaborCostLYPercentReport+'And Value derived using formula is'+LaborCostLYPercent)
			KeywordUtil.markPassed('Labor Cost Percent LY----> Value derived using formula is matching with tabel value.')
		}

		else {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelDailyFormulaCheck('Labor Cost Percent LY',String.valueOf(LaborCostLYPercentReport),String.valueOf(LaborCostLYPercent))
			}
			else {
				writeExcelAllStoreFail('Labor Cost Percent LY',String.valueOf(LaborCostLYPercentReport),String.valueOf(LaborCostLYPercent))
			}

			KeywordUtil.logInfo('Labor Cost Percent LY value found On Report is'+LaborCostLYPercentReport+'And Value derived using formula is	'+LaborCostLYPercent)
			KeywordUtil.markError('Labor Cost Percent LY value found On Report is'+LaborCostLYPercentReport+' And Value derived using formula is'+LaborCostLYPercent)
			KeywordUtil.markError('Labor Cost Percent LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyLaborCost_VS_LY_Dollar_ColumnsValues(double LaborCostVsLYDollar,double LaborCostvsLY$,String store) {

		int Decison1=Double.compare(LaborCostVsLYDollar, LaborCostvsLY$)


		if(Decison1==0) {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelPassFormulaCheck('Labor Cost vs LY, $',String.valueOf(LaborCostVsLYDollar),String.valueOf(LaborCostvsLY$))
			}
			else {
				writeExcelAllStorePass('Labor Cost vs LY, $',String.valueOf(LaborCostVsLYDollar),String.valueOf(LaborCostvsLY$))
			}

			KeywordUtil.logInfo('Labor Cost vs LY, $ value found On Report is '+LaborCostVsLYDollar+'And Value derived using formula is'+LaborCostvsLY$)
			KeywordUtil.markPassed('Labor Cost vs LY, $ value found On Report is	'+LaborCostVsLYDollar+'And Value derived using formula is'+LaborCostvsLY$)
			KeywordUtil.markPassed('Labor Cost vs LY, $----> Value derived using formula is matching with tabel value.')
		}

		else {

			if(store.equalsIgnoreCase('Single')) {
				writeExcelDailyFormulaCheck('Labor Cost vs LY, $',String.valueOf(LaborCostVsLYDollar),String.valueOf(LaborCostvsLY$))
			}
			else {
				writeExcelAllStoreFail('Labor Cost vs LY, $',String.valueOf(LaborCostVsLYDollar),String.valueOf(LaborCostvsLY$))
			}


			KeywordUtil.logInfo('Labor Cost vs LY, $ value found On Report is'+LaborCostVsLYDollar+'And Value derived using formula is	'+LaborCostvsLY$)
			KeywordUtil.markError('Labor Cost vs LY, $ value found On Report is'+LaborCostVsLYDollar+' And Value derived using formula is'+LaborCostvsLY$)
			KeywordUtil.markError('Labor Cost vs LY, $ ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyLaborCost_VS_LY_PP_ColumnsValues(double LaborCostVsLY_PP,double LaborCostvsLYpp,String store) {

		int Decison1=Double.compare(LaborCostVsLY_PP, LaborCostvsLYpp)


		if(Decison1==0) {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelPassFormulaCheck('Labor Cost vs LY, PP',String.valueOf(LaborCostVsLY_PP),String.valueOf(LaborCostvsLYpp))
			}
			else {
				writeExcelAllStorePass('Labor Cost vs LY, PP',String.valueOf(LaborCostVsLY_PP),String.valueOf(LaborCostvsLYpp))
			}

			KeywordUtil.logInfo('Labor Cost vs LY, PP value found On Report is '+LaborCostVsLY_PP+'And Value derived using formula is'+LaborCostvsLYpp)
			KeywordUtil.markPassed('Labor Cost vs LY, PP value found On Report is	'+LaborCostVsLY_PP+'And Value derived using formula is'+LaborCostvsLYpp)
			KeywordUtil.markPassed('Labor Cost vs LY, PP----> Value derived using formula is matching with tabel value.')
		}

		else {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelDailyFormulaCheck('Labor Cost vs LY, PP',String.valueOf(LaborCostVsLY_PP),String.valueOf(LaborCostvsLYpp))
			}
			else {
				writeExcelAllStoreFail('Labor Cost vs LY, PP',String.valueOf(LaborCostVsLY_PP),String.valueOf(LaborCostvsLYpp))
			}


			KeywordUtil.logInfo('Labor Cost vs LY, PP value found On Report is'+LaborCostVsLY_PP+'And Value derived using formula is	'+LaborCostvsLYpp)
			KeywordUtil.markError('Labor Cost vs LY, PP value found On Report is'+LaborCostVsLY_PP+' And Value derived using formula is'+LaborCostvsLYpp)
			KeywordUtil.markError('Labor Cost vs LY, PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyLaborCostLW_PercentColumnsValues(double LaborCostVsLWPercent,double LaborCostLWPercent,String store) {

		int Decison1=Double.compare(LaborCostVsLWPercent, LaborCostLWPercent)


		if(Decison1==0) {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelPassFormulaCheck('Labor Cost LW, $',String.valueOf(LaborCostVsLWPercent),String.valueOf(LaborCostLWPercent))
			}
			else {
				writeExcelAllStorePass('Labor Cost LW, $',String.valueOf(LaborCostVsLWPercent),String.valueOf(LaborCostLWPercent))
			}

			KeywordUtil.logInfo('Labor Cost LW, $  value found On Report is '+LaborCostVsLWPercent+'And Value derived using formula is'+LaborCostLWPercent)
			KeywordUtil.markPassed('Labor Cost LW, $ value found On Report is	'+LaborCostVsLWPercent+'And Value derived using formula is'+LaborCostLWPercent)
			KeywordUtil.markPassed('Labor Cost LW, $----> Value derived using formula is matching with tabel value.')
		}

		else {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelDailyFormulaCheck('Labor Cost LW, $',String.valueOf(LaborCostVsLWPercent),String.valueOf(LaborCostLWPercent))
			}
			else {
				writeExcelAllStoreFail('Labor Cost LW, $',String.valueOf(LaborCostVsLWPercent),String.valueOf(LaborCostLWPercent))
			}

			KeywordUtil.logInfo('Labor Cost LW, $ value found On Report is'+LaborCostVsLWPercent+'And Value derived using formula is	'+LaborCostLWPercent)
			KeywordUtil.markError('Labor Cost LW, $ value found On Report is'+LaborCostVsLWPercent+' And Value derived using formula is'+LaborCostLWPercent)
			KeywordUtil.markError('Labor Cost LW, $ ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyLaborCostVsLW_DollarColumnsValues(double LaborCostVsLWDollar,double LaborCostvsLW$,String store) {

		int Decison1=Double.compare(LaborCostVsLWDollar, LaborCostvsLW$)


		if(Decison1==0) {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelPassFormulaCheck('Labor Cost vs LW, $',String.valueOf(LaborCostVsLWDollar),String.valueOf(LaborCostvsLW$))
			}
			else {
				writeExcelAllStorePass('Labor Cost vs LW, $',String.valueOf(LaborCostVsLWDollar),String.valueOf(LaborCostvsLW$))
			}

			KeywordUtil.logInfo('Labor Cost vs LW, $ value found On Report is '+LaborCostVsLWDollar+'And Value derived using formula is'+LaborCostvsLW$)
			KeywordUtil.markPassed('Labor Cost vs LW, $value found On Report is	'+LaborCostVsLWDollar+'And Value derived using formula is'+LaborCostvsLW$)
			KeywordUtil.markPassed('Labor Cost vs LW, $$----> Value derived using formula is matching with tabel value.')
		}

		else {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelDailyFormulaCheck('Labor Cost vs LW, $',String.valueOf(LaborCostVsLWDollar),String.valueOf(LaborCostvsLW$))
			}
			else {
				writeExcelAllStoreFail('Labor Cost vs LW, $',String.valueOf(LaborCostVsLWDollar),String.valueOf(LaborCostvsLW$))
			}

			KeywordUtil.logInfo('Labor Cost vs LW, $ value found On Report is'+LaborCostVsLWDollar+'And Value derived using formula is	'+LaborCostvsLW$)
			KeywordUtil.markError('Labor Cost vs LW, $ value found On Report is'+LaborCostVsLWDollar+' And Value derived using formula is'+LaborCostvsLW$)
			KeywordUtil.markError('Labor Cost vs LW, $----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyLaborCostVsLW_PPColumnsValues(double LaborCostVsLW_PP,double LaborCostvsLWpp,String store) {

		int Decison1=Double.compare(LaborCostVsLW_PP, LaborCostvsLWpp)


		if(Decison1==0) {
			if(store.equalsIgnoreCase('Single')) {
				writeExcelPassFormulaCheck('Labor Cost vs LW, p.p.',String.valueOf(LaborCostVsLW_PP),String.valueOf(LaborCostvsLWpp))
			}
			else {
				writeExcelAllStorePass('Labor Cost vs LW, p.p.',String.valueOf(LaborCostVsLW_PP),String.valueOf(LaborCostvsLWpp))
			}

			KeywordUtil.logInfo('Labor Cost vs LW, p.p. value found On Report is '+LaborCostVsLW_PP+'And Value derived using formula is'+LaborCostvsLWpp)
			KeywordUtil.markPassed('Labor Cost vs LW, p.p., $value found On Report is	'+LaborCostVsLW_PP+'And Value derived using formula is'+LaborCostvsLWpp)
			KeywordUtil.markPassed('Labor Cost vs LW, p.p.----> Value derived using formula is matching with tabel value.')
		}

		else {

			if(store.equalsIgnoreCase('Single')) {
				writeExcelDailyFormulaCheck('Labor Cost vs LW, p.p.',String.valueOf(LaborCostVsLW_PP),String.valueOf(LaborCostvsLWpp))
			}
			else {
				writeExcelAllStoreFail('Labor Cost vs LW, p.p.',String.valueOf(LaborCostVsLW_PP),String.valueOf(LaborCostvsLWpp))
			}


			KeywordUtil.logInfo('Labor Cost vs LW, p.p. value found On Report is'+LaborCostVsLW_PP+'And Value derived using formula is	'+LaborCostvsLWpp)
			KeywordUtil.markError('Labor Cost vs LW, p.p. value found On Report is'+LaborCostVsLW_PP+' And Value derived using formula is'+LaborCostvsLWpp)
			KeywordUtil.markError('Labor Cost vs LW, p.p.----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	//BUDGET CALCULATION OF LABOR


	@Keyword
	def  toVerifyLaborCostBudgetPercentColumnsValues(double LaborCostBudgetPercent,double LaborCostBudgetPercentage,String store)
	{

		int Decison1=Double.compare(LaborCostBudgetPercent, LaborCostBudgetPercentage)


		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Labor Cost Budget, %',String.valueOf(LaborCostBudgetPercent),String.valueOf(LaborCostBudgetPercentage))
			}
			else
			{
				writeExcelAllStorePass('Labor Cost Budget, %',String.valueOf(LaborCostBudgetPercent),String.valueOf(LaborCostBudgetPercentage))
			}

			KeywordUtil.logInfo('Labor Cost Budget, %  value found On Report is '+LaborCostBudgetPercent+'And Value derived using formula is'+LaborCostBudgetPercentage)
			KeywordUtil.markPassed('Labor Cost Budget, %, $value found On Report is	'+LaborCostBudgetPercent+'And Value derived using formula is'+LaborCostBudgetPercentage)
			KeywordUtil.markPassed('Labor Cost Budget, %----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Labor Cost Budget, %',String.valueOf(LaborCostBudgetPercent),String.valueOf(LaborCostBudgetPercentage))

			}
			else
			{
				writeExcelAllStoreFail('Labor Cost Budget, %',String.valueOf(LaborCostBudgetPercent),String.valueOf(LaborCostBudgetPercentage))

			}



			KeywordUtil.logInfo('Labor Cost Budget, % value found On Report is'+LaborCostBudgetPercent+'And Value derived using formula is	'+LaborCostBudgetPercentage)
			KeywordUtil.markError('Labor Cost Budget, % value found On Report is'+LaborCostBudgetPercent+' And Value derived using formula is'+LaborCostBudgetPercentage)
			KeywordUtil.markError('Labor Cost Budget, %----> Value derived using formula is NOT MATCHING with tabel value.')

		}
	}



	@Keyword
	def  toVerifyLaborCostBudgetDollarsactualsalesColumnsValues(double LaborCostBudget_ActualSales,double LaborCostBudgetDollarActualsales,String store)
	{

		int Decison1=Double.compare(LaborCostBudget_ActualSales, LaborCostBudgetDollarActualsales)


		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Labor Cost Budget, $ (actual sales)',String.valueOf(LaborCostBudget_ActualSales),String.valueOf(LaborCostBudgetDollarActualsales))
			}
			else
			{
				writeExcelAllStorePass('Labor Cost Budget, $ (actual sales)',String.valueOf(LaborCostBudget_ActualSales),String.valueOf(LaborCostBudgetDollarActualsales))
			}

			KeywordUtil.logInfo('Labor Cost Budget, $ (actual sales)  value found On Report is '+LaborCostBudget_ActualSales+'And Value derived using formula is'+LaborCostBudgetDollarActualsales)
			KeywordUtil.markPassed('Labor Cost Budget, $ (actual sales) value found On Report is	'+LaborCostBudget_ActualSales+'And Value derived using formula is'+LaborCostBudgetDollarActualsales)
			KeywordUtil.markPassed('Labor Cost Budget, $ (actual sales)----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Labor Cost Budget, $ (actual sales)',String.valueOf(LaborCostBudget_ActualSales),String.valueOf(LaborCostBudgetDollarActualsales))

			}
			else
			{
				writeExcelAllStoreFail('Labor Cost Budget, $ (actual sales)',String.valueOf(LaborCostBudget_ActualSales),String.valueOf(LaborCostBudgetDollarActualsales))

			}


			KeywordUtil.logInfo('Labor Cost Budget, $ (actual sales)value found On Report is'+LaborCostBudget_ActualSales+'And Value derived using formula is	'+LaborCostBudgetDollarActualsales)
			KeywordUtil.markError('Labor Cost Budget, $ (actual sales) value found On Report is'+LaborCostBudget_ActualSales+' And Value derived using formula is'+LaborCostBudgetDollarActualsales)
			KeywordUtil.markError('Labor Cost Budget, $ (actual sales)----> Value derived using formula is NOT MATCHING with tabel value.')

		}
	}


	@Keyword
	def  toVerifyLaborCostBudgetDollarsBudgetedsalesColumnsValues(double LaborCostBudget_BudgetSales,double LaborCostBudgetDollarBudgetsales,String store)
	{

		int Decison1=Double.compare(LaborCostBudget_BudgetSales, LaborCostBudgetDollarBudgetsales)


		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Labor Cost Budget, $ (budgeted sales)',String.valueOf(LaborCostBudget_BudgetSales),String.valueOf(LaborCostBudgetDollarBudgetsales))
			}
			else
			{
				writeExcelAllStorePass('Labor Cost Budget, $ (budgeted sales)',String.valueOf(LaborCostBudget_BudgetSales),String.valueOf(LaborCostBudgetDollarBudgetsales))
			}

			KeywordUtil.logInfo('Labor Cost Budget, $ (budgeted sales) value found On Report is '+LaborCostBudget_BudgetSales+'And Value derived using formula is'+LaborCostBudgetDollarBudgetsales)
			KeywordUtil.markPassed('Labor Cost Budget, $ (budgeted sales) value found On Report is	'+LaborCostBudget_BudgetSales+'And Value derived using formula is'+LaborCostBudgetDollarBudgetsales)
			KeywordUtil.markPassed('Labor Cost Budget, $ (budgeted sales)----> Value derived using formula is matching with tabel value.')
		}

		else
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Labor Cost Budget, $ (budgeted sales)',String.valueOf(LaborCostBudget_BudgetSales),String.valueOf(LaborCostBudgetDollarBudgetsales))

			}
			else
			{
				writeExcelAllStoreFail('Labor Cost Budget, $ (budgeted sales)',String.valueOf(LaborCostBudget_BudgetSales),String.valueOf(LaborCostBudgetDollarBudgetsales))

			}



			KeywordUtil.logInfo('Labor Cost Budget, $ (budgeted sales) value found On Report is'+LaborCostBudget_BudgetSales+'And Value derived using formula is	'+LaborCostBudgetDollarBudgetsales)
			KeywordUtil.markError('Labor Cost Budget, $ (budgeted sales) value found On Report is'+LaborCostBudget_BudgetSales+' And Value derived using formula is'+LaborCostBudgetDollarBudgetsales)
			KeywordUtil.markError('Labor Cost Budget, $ (budgeted sales)----> Value derived using formula is NOT MATCHING with tabel value.')

		}
	}

	@Keyword
	def  toVerifyLaborCostvsBudgetppColumnsValues(double LaborCostBudgetVsBudgetPP_Dollar,double LaborCostvsBudgetPP,String store)
	{

		int Decison1=Double.compare(LaborCostBudgetVsBudgetPP_Dollar, LaborCostvsBudgetPP)


		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Labor Cost vs Budget, p.p.',String.valueOf(LaborCostBudgetVsBudgetPP_Dollar),String.valueOf(LaborCostvsBudgetPP))
			}
			else
			{
				writeExcelAllStorePass('Labor Cost vs Budget, p.p.',String.valueOf(LaborCostBudgetVsBudgetPP_Dollar),String.valueOf(LaborCostvsBudgetPP))
			}

			KeywordUtil.logInfo('Labor Cost vs Budget, p.p. value found On Report is '+LaborCostBudgetVsBudgetPP_Dollar+'And Value derived using formula is'+LaborCostvsBudgetPP)
			KeywordUtil.markPassed('Labor Cost vs Budget, p.p. value found On Report is	'+LaborCostBudgetVsBudgetPP_Dollar+'And Value derived using formula is'+LaborCostvsBudgetPP)
			KeywordUtil.markPassed('Labor Cost vs Budget, p.p.----> Value derived using formula is matching with tabel value.')
		}

		else
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Labor Cost vs Budget, p.p.',String.valueOf(LaborCostBudgetVsBudgetPP_Dollar),String.valueOf(LaborCostvsBudgetPP))

			}
			else
			{
				writeExcelAllStoreFail('Labor Cost vs Budget, p.p.',String.valueOf(LaborCostBudgetVsBudgetPP_Dollar),String.valueOf(LaborCostvsBudgetPP))

			}

			KeywordUtil.logInfo('Labor Cost vs Budget, p.p. value found On Report is'+LaborCostBudgetVsBudgetPP_Dollar+'And Value derived using formula is	'+LaborCostvsBudgetPP)
			KeywordUtil.markError('Labor Cost vs Budget, p.p. value found On Report is'+LaborCostBudgetVsBudgetPP_Dollar+' And Value derived using formula is'+LaborCostvsBudgetPP)
			KeywordUtil.markError('Labor Cost vs Budget, p.p. ----> Value derived using formula is NOT MATCHING with tabel value.')

		}
	}

	@Keyword
	def  toVerifyLaborCostvsBudgetDollarsactualsalesColumnsValues(double LaborCostVsBudget_ActualSales,double LaborCostVsBudgetDollarActualsales,String store)
	{

		int Decison1=Double.compare(LaborCostVsBudget_ActualSales, LaborCostVsBudgetDollarActualsales)


		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Labor Cost vs Budget, $ (actual sales)',String.valueOf(LaborCostVsBudget_ActualSales),String.valueOf(LaborCostVsBudgetDollarActualsales))
			}
			else
			{
				writeExcelAllStorePass('Labor Cost vs Budget, $ (actual sales)',String.valueOf(LaborCostVsBudget_ActualSales),String.valueOf(LaborCostVsBudgetDollarActualsales))
			}

			KeywordUtil.logInfo('Labor Cost vs Budget, $ (actual sales) value found On Report is '+LaborCostVsBudget_ActualSales+'And Value derived using formula is'+LaborCostVsBudgetDollarActualsales)
			KeywordUtil.markPassed('Labor Cost vs Budget, $ (actual sales) value found On Report is	'+LaborCostVsBudget_ActualSales+'And Value derived using formula is'+LaborCostVsBudgetDollarActualsales)
			KeywordUtil.markPassed('Labor Cost vs Budget, $ (actual sales) ----> Value derived using formula is matching with tabel value.')
		}

		else
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Labor Cost vs Budget, $ (actual sales)',String.valueOf(LaborCostVsBudget_ActualSales),String.valueOf(LaborCostVsBudgetDollarActualsales))

			}
			else
			{
				writeExcelAllStoreFail('Labor Cost vs Budget, $ (actual sales)',String.valueOf(LaborCostVsBudget_ActualSales),String.valueOf(LaborCostVsBudgetDollarActualsales))

			}

			KeywordUtil.logInfo('Labor Cost vs Budget, $ (actual sales) value found On Report is'+LaborCostVsBudget_ActualSales+'And Value derived using formula is	'+LaborCostVsBudgetDollarActualsales)
			KeywordUtil.markError('Labor Cost vs Budget, $ (actual sales) value found On Report is'+LaborCostVsBudget_ActualSales+' And Value derived using formula is'+LaborCostVsBudgetDollarActualsales)
			KeywordUtil.markError('Labor Cost vs Budget, $ (actual sales) ----> Value derived using formula is NOT MATCHING with tabel value.')

		}
	}




	@Keyword
	def  toVerifyLaborCostvsBudgetDollarsbudgetedsalesColumnsValues(double LaborCostVsBudget_BudgetSales,double LaborCostVsBudgetDollarBudgetsales,String store)
	{

		int Decison1=Double.compare(LaborCostVsBudget_BudgetSales, LaborCostVsBudgetDollarBudgetsales)


		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Labor Cost vs Budget, $ (budgeted sales)',String.valueOf(LaborCostVsBudget_BudgetSales),String.valueOf(LaborCostVsBudgetDollarBudgetsales))
			}
			else
			{
				writeExcelAllStorePass('Labor Cost vs Budget, $ (budgeted sales)',String.valueOf(LaborCostVsBudget_BudgetSales),String.valueOf(LaborCostVsBudgetDollarBudgetsales))
			}

			KeywordUtil.logInfo('Labor Cost vs Budget, $ (budgeted sales) value found On Report is '+LaborCostVsBudget_BudgetSales+'And Value derived using formula is'+LaborCostVsBudgetDollarBudgetsales)
			KeywordUtil.markPassed('Labor Cost vs Budget, $ (budgeted sales) value found On Report is	'+LaborCostVsBudget_BudgetSales+'And Value derived using formula is'+LaborCostVsBudgetDollarBudgetsales)
			KeywordUtil.markPassed('Labor Cost vs Budget, $ (budgeted sales) ----> Value derived using formula is matching with tabel value.')
		}

		else
		{

			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Labor Cost vs Budget, $ (budgeted sales)',String.valueOf(LaborCostVsBudget_BudgetSales),String.valueOf(LaborCostVsBudgetDollarBudgetsales))

			}
			else
			{
				writeExcelAllStoreFail('Labor Cost vs Budget, $ (budgeted sales)',String.valueOf(LaborCostVsBudget_BudgetSales),String.valueOf(LaborCostVsBudgetDollarBudgetsales))

			}

			KeywordUtil.logInfo('Labor Cost vs Budget, $ (budgeted sales) value found On Report is'+LaborCostVsBudget_BudgetSales+'And Value derived using formula is	'+LaborCostVsBudgetDollarBudgetsales)
			KeywordUtil.markError('Labor Cost vs Budget, $ (budgeted sales) value found On Report is'+LaborCostVsBudget_BudgetSales+' And Value derived using formula is'+LaborCostVsBudgetDollarBudgetsales)
			KeywordUtil.markError('Labor Cost vs Budget, $ (budgeted sales) ----> Value derived using formula is NOT MATCHING with tabel value.')

		}
	}

}














