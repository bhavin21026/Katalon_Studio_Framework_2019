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

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Actual'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Actual/Sctg_NetSalesDollor'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Collapse Button By Category/collapse_Actual'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Last Year'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Last Year/Sctg_NetSalesLYDollor'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Last Year/Sctg_NetSales_Vs_LYDollor'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Last Year/Sctg_NetSalesLYDollor'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Collapse Button By Category/collapse_Last Year'))

WebUI.waitForElementClickable(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Budget'), 
    10)

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Budget'))

WebUI.delay(1)

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/Sctg_SalesBudgetDollor'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/Sctg_SalesBudgetPercent'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/SalesVsBudgetDollor'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Budget/SalesVsBudgetPercent'))

