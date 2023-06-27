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

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Hours/SubCategories/Actual/OT hours'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Hours/SubCategories/Actual/Total hours'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Collapse Button By Category/collapse_Actual'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Last Year'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Hours/SubCategories/Last Year/Sctg_OT hours LY'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Hours/SubCategories/Last Year/Sctg_OT hours vs LY'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Hours/SubCategories/Last Year/Sctg_Total hours LY'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Hours/SubCategories/Last Year/Sctg_Total hours vs LY'))

