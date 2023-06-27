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

WebUI.click(findTestObject('ReportSetupScreen/Edit Columns/label_Rule1'))

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Edit Columns/btn_decimal1'), 0)

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/btn_decimal1'))

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Edit Columns/btn_decimal2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/btn_decimal2'))

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Edit Columns/btn_decimal3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/btn_decimal3'))

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Edit Columns/btn_decimal4'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/btn_decimal4'))

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Edit Columns/btn_decimal5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/btn_decimal5'))

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Edit Columns/label_Rule1'), 0)

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Edit Columns/label_Rule2'), 0)

WebUI.verifyElementPresent(findTestObject('ReportSetupScreen/Edit Columns/label_Rule3'), 0)

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/btn_CancelEditColumn'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/btn_ok'))

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Edit Columns/input_FromRange'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Edit Columns/label_AboveValue'))

WebUI.verifyElementVisible(findTestObject('ReportSetupScreen/Edit Columns/label_BelowValue'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/btn_radio1'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/btn_radio2'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/btn_radio3'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/Edit Columns/chk_doNotFormatTotal'))

