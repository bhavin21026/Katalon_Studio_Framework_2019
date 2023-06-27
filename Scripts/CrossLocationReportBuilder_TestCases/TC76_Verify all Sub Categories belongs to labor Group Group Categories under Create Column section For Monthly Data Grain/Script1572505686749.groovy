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

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Hours/SubCategories/Actual/Total hours'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Hours/SubCategories/Actual/OT hours'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Collapse Button By Category/collapse_Actual'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Last Year'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Last Year/Labor Cost LY Dollor'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Last Year/Labor Cost LY Percent'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Last Year/Labor Cost vs LY Dollor'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Last Year/Labor Cost vs LY p.p'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Collapse Button By Category/collapse_Last Year'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_LastWeek'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Last Week/Labor Cost LW Dollor'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Last Week/Labor Cost LW Percent'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Last Week/Labor Cost vs LW Dollor'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Last Week/Labor Cost vs LW, p.p'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Collapse Button By Category/collapse_LastWeek'))

WebUI.delay(1)

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Budget'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Budget/Labor Cost Budget Percent'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Budget/Labor Cost Budget Dollor (actual sales)'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Budget/Labor Cost Budget Dollor (budgeted sales)'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Budget/Labor Cost vs Budget, p.p'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Budget/Labor Cost vs Budget, Dollor (actual sales)'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Labor Cost/Sub Categories/Budget/Labor Cost vs Budget Dollor (budgeted sales)'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/button_Cancel_CreateColumn'))

