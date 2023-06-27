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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/label_Rule1'))

ColumnName = WebUI.getText(findTestObject('ReportSetupScreen/Edit Columns/label_openColumnsName'))

WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/input_ColumnName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ReportSetupScreen/Edit Columns/input_ColumnName'), ColumnName)

WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/btn_ok'))

WebUI.verifyTextPresent('Threshold Value is required.', false)

