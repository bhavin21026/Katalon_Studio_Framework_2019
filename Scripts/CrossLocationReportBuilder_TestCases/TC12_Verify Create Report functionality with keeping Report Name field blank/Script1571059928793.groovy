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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('ReportSetupScreen/Name Your Report/input_Reports_form-item'))

WebUI.sendKeys(findTestObject('ReportSetupScreen/Name Your Report/input_Reports_form-item'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('ReportSetupScreen/Name Your Report/input_Reports_form-item'), Keys.chord(Keys.BACK_SPACE))



not_run: WebUI.clearText(findTestObject('ReportSetupScreen/Name Your Report/input_Reports_form-item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ReportSetupScreen/Name Your Report/p_Name Your report'))

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Select Report Category'), [('ReportCategory') : CategoryName], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ReportSetupScreen/Present Data By/input_Limit no of days_form-item ng-untouched ng-pristine ng-invalid'), 
    NoOfdays)

WebUI.click(findTestObject('ReportSetupScreen/button_Create report'))

WebUI.verifyTextPresent('Report Name is required.', false)

