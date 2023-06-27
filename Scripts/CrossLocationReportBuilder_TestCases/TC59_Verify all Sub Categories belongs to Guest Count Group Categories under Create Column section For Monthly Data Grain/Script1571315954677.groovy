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

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Guest Count/SubCategories/Actual/Sctg_GuestCount'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Collapse Button By Category/collapse_Actual'))

WebUI.waitForElementClickable(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Last Year'), 
    5)

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Last Year'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Guest Count/SubCategories/Last Year/Sctg_GuestLYCount'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Guest Count/SubCategories/Last Year/Sctg_Guest_vs_LYCount'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Guest Count/SubCategories/Last Year/Sctg_Guest_Vs_LYPercent'))

