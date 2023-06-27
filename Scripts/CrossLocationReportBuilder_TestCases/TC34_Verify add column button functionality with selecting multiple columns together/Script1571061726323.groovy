import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/link_Add Columns'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/drp_DataGroup'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/tupple_Net_Sales'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Last Year'))

String ColumnName1 = WebUI.getText(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Last Year/Sctg_NetSalesLYDollor'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Last Year/Sctg_NetSalesLYDollor'))

String ColumnName2 = WebUI.getText(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Last Year/Sctg_NetSales_Vs_LYDollor'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Last Year/Sctg_NetSales_Vs_LYDollor'))

String ColumnName3 = WebUI.getText(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Last Year/Sctg_NetSales_Vs_LYPercent'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Last Year/Sctg_NetSales_Vs_LYPercent'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Collapse Button By Category/collapse_Last Year'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Budget'), 
    0)

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Budget'))

String ColumnName4 = WebUI.getText(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/Sctg_SalesBudgetDollor'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/Sctg_SalesBudgetDollor'))

String ColumnName5 = WebUI.getText(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/Sctg_SalesBudgetPercent'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/Sctg_SalesBudgetPercent'))

String ColumnName6 = WebUI.getText(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/SalesVsBudgetDollor'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/SalesVsBudgetDollor'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/SalesVsBudgetPercent'))

String ColumnName7 = WebUI.getText(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/SalesVsBudgetPercent'))

def list = [ColumnName1, ColumnName2, ColumnName3, ColumnName4, ColumnName5, ColumnName6, ColumnName7]

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/button_Add Columns(s)'))


for (int i = 0; i < list.size(); i++) {
    CustomKeywords.'reportbuildercustom.RB_Keywords.verifyAddedColumn'(list[i])
	
	
	
	println list[i]
	
	
	WebUI.delay(1)
}

