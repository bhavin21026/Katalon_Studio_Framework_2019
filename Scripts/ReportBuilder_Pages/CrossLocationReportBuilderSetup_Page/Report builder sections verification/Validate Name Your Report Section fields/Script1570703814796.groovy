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

WebUI.verifyTextPresent('Report Name', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Select Report Category', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Name Your Report/input_Reports_form-item'), 10)

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Name Your Report/input_Report Name_form-item ng-untouched ng-pristine ng-invalid'), 
    10)

String strNameReportPlaceHolder = WebUI.getAttribute(findTestObject('ReportSetupScreen/Name Your Report/input_Reports_form-item'), 
    'placeholder')

if (strNameReportPlaceHolder.equalsIgnoreCase('Enter Report Name')) {
    WebUI.comment('Enter Report Name\'s Place Holder value is same as Expected')

    assert true
}

String strReportCategoryPlaceHolder = WebUI.getAttribute(findTestObject('Object Repository/ReportSetupScreen/Name Your Report/input_Report Name_form-item ng-untouched ng-pristine ng-invalid'), 
    'placeholder')

if (strReportCategoryPlaceHolder.equalsIgnoreCase('Select Report Category')) {
    WebUI.comment('Select Report Category\'s Place Holder value is same as Expected')

    assert true
}

