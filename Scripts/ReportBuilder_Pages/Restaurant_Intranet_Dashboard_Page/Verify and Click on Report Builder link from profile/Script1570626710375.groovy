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

not_run: WebUI.waitForElementPresent(findTestObject('Page_Restaurant Intranet/Setup/tasterMessage'), 20)

not_run: WebUI.waitForElementNotPresent(findTestObject('Page_Restaurant Intranet/Setup/tasterMessage'), 10)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/link_CrossLocationReportIcon'))

WebUI.waitForElementClickable(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/link_Setup'), GlobalVariable.ExplicitWait)

WebUI.verifyElementPresent(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/link_Setup'), 0)

WebUI.click(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/link_Setup'))

WebUI.waitForElementClickable(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/div_ReportBuilderLink'), GlobalVariable.ExplicitWait)

WebUI.verifyElementPresent(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/div_ReportBuilderLink'), 0)

WebUI.click(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/div_ReportBuilderLink'), FailureHandling.CONTINUE_ON_FAILURE)

