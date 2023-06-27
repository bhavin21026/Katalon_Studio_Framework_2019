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

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Grain By Daily with Present By Month'), 
    [('NoOfMonths') : NoOfMonths], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('ReportSetupScreen/Present Data By/input_Limit no of months_form-item ng-untouched ng-pristine ng-invalid'))

WebUI.click(findTestObject('ReportSetupScreen/button_Create report'))

WebUI.waitForElementPresent(findTestObject('Report Categories/Category Alert'), 50)

String strAlert = WebUI.getText(findTestObject('Report Categories/Category Alert'))

if (strAlert.equalsIgnoreCase('At least one column must be added/selected.')) {
    WebUI.comment('Alert validation displayed')

    assert true
}

