import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/link_Add Columns'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/drp_DataGroup'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Average Check/Tpl_AvrgCheck'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Average Check/Tpl_AvrgCheck'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Categories/Ctg_Actual'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Categories/Ctg_LastYear'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/button_Add Columns(s)'))

