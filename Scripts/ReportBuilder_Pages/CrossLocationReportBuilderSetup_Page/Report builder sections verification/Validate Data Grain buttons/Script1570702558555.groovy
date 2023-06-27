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

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Data Grain/button_Daily'), 0)

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Data Grain/button_Daily'))

String strDataGrainClass = WebUI.getAttribute(findTestObject('ReportSetupScreen/Data Grain/button_Daily'), 'class')

String strDataGrainButtonName = WebUI.getText(findTestObject('ReportSetupScreen/Data Grain/button_Daily'))

if (strDataGrainClass.equals('btn btn--group w-tab active')) {
    WebUI.comment(strDataGrainButtonName + 'button is selected by default')

    assert true
}

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Data Grain/button_Weekly'), 0)

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Data Grain/button_Weekly'))

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Data Grain/button_Monthly'), 0)

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Data Grain/button_Monthly'))

