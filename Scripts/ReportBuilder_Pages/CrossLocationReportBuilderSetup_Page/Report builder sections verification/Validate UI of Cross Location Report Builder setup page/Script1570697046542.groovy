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

WebUI.verifyElementText(findTestObject('ReportSetupScreen/Name Your Report/p_Name Your report'), 'Name Your Report', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ReportSetupScreen/Data Grain/p_Data Grain'), 'Data Grain', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ReportSetupScreen/Present Data By/p_Present Data by'), 'Present Data by', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ReportSetupScreen/Grouping/p_Grouping'), 'Grouping', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ReportSetupScreen/Options/p_Options'), 'Options', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ReportSetupScreen/Quick Selects/p_Quick Selects'), 'Quick Selects', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Create Columns/p_Create Columns'))

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Create Columns/span_Add Columns'))

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/button_Create report'))

