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

String ColumnName = WebUI.getText(findTestObject('ReportSetupScreen/Create Columns/sec_AddedColumn'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/btn_Edit'))

String OpenColumnName = WebUI.getAttribute(findTestObject('ReportSetupScreen/Edit Columns/input_ColumnName'), 'value')

String ColumnName2 = WebUI.getAttribute(findTestObject('ReportSetupScreen/Edit Columns/label_openColumnsName'), 'value')

WebUI.verifyEqual(ColumnName, OpenColumnName, FailureHandling.CONTINUE_ON_FAILURE)


WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/label_Rule2'))

WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/input_ColumnName'))

WebUI.sendKeys(findTestObject('ReportSetupScreen/Edit Columns/input_ColumnName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('ReportSetupScreen/Edit Columns/input_ColumnName'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/input_ColumnName'))

WebUI.setText(findTestObject('ReportSetupScreen/Edit Columns/input_ColumnName'), updatedColumnName)

WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/input_FromRange'))

WebUI.setText(findTestObject('ReportSetupScreen/Edit Columns/input_FromRange'), WithinRange)

WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/input_ToRange'))

WebUI.setText(findTestObject('ReportSetupScreen/Edit Columns/input_ToRange'), OutsideRange)

WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/chk_doNotFormatTotal'))

WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/btn_ok'))

CustomKeywords.'reportbuildercustom.RB_Keywords.verifyAddedColumn'(updatedColumnName)

