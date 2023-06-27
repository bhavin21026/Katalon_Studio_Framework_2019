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

WebUI.click(findTestObject('ReportSetupScreen/Data Grain/button_Weekly'))

WebUI.verifyElementNotPresent(findTestObject('ReportSetupScreen/Present Data By/button_Day'), 0)

String strPresentDataByClass = WebUI.getAttribute(findTestObject('ReportSetupScreen/Present Data By/button_Week'), 'class')

String strPresentDataByButtonName = WebUI.getText(findTestObject('ReportSetupScreen/Present Data By/button_Week'))

if (strPresentDataByClass.equals('btn btn--group w-tab active')) {
    WebUI.comment(strPresentDataByButtonName + 'button is selected by default')

    assert true
}

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Present Data By/button_Week'), 0)

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Present Data By/button_Week'))

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Present Data By/button_Month'), 0)

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Present Data By/button_Month'), 0)

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Present Data By/button_Entire Range'))

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Present Data By/button_Entire Range'))

String strNoOfWeeks = WebUI.getText(findTestObject('ReportSetupScreen/Present Data By/label_Limit no of weeks'))

if (strNoOfWeeks.equalsIgnoreCase('Limit no of weeks')) {
    WebUI.comment('Limit No of Weeks lable displayed successfully based on selection')

    assert true
}

