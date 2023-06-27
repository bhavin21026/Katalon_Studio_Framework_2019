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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.verifyElementText(findTestObject('ReportBuilderUI/div_Report Setup'), 'Reports Setup')

WebUI.verifyElementPresent(findTestObject('ReportBuilderUI/div_Report Setup'), 0)

WebUI.verifyElementPresent(findTestObject('ReportBuilderUI/a_Reports Categories'), 0)

WebUI.verifyElementText(findTestObject('ReportBuilderUI/a_Reports Categories'), 'Reports Categories')

WebUI.verifyElementPresent(findTestObject('ReportBuilderUI/a_Reports Setup'), 0)

WebUI.verifyElementText(findTestObject('ReportBuilderUI/a_Reports Setup'), 'Formula Setup')

