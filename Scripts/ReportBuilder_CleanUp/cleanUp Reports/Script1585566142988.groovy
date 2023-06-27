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

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/link_CrossLocationReportIcon'))

WebUI.click(findTestObject('Left Nav Bar/Back_Btn'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/link_Setup'), GlobalVariable.ExplicitWait)

WebUI.click(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/link_Setup'))

WebUI.waitForElementClickable(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/div_ReportBuilderLink'), GlobalVariable.ExplicitWait)

WebUI.click(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/div_ReportBuilderLink'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('ReportBuilderUI/div_Report Setup'), GlobalVariable.ExplicitWait)

WebUI.click(findTestObject('ReportBuilderUI/div_Report Setup'))

WebUI.waitForElementClickable(findTestObject('ReportSetupScreen/input_SearchReportFilter'), 20)

WebUI.click(findTestObject('ReportSetupScreen/input_SearchReportFilter'))

String reportName = SearchReport

WebUI.setText(findTestObject('ReportSetupScreen/input_SearchReportFilter'), reportName)

WebUI.click(findTestObject('ReportSetupScreen/Reports_header'))

WebUI.delay(2)

WebUI.click(findTestObject('Left Nav Bar/delete_report'))

WebUI.acceptAlert()

