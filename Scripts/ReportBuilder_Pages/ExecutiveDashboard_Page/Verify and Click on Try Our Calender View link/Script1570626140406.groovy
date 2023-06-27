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

WebUI.waitForElementClickable(findTestObject('Page_Dunkin Donuts - Executive Dashboard/a_Try our Calendar ViewNew'), 60)

WebUI.verifyElementPresent(findTestObject('Page_Dunkin Donuts - Executive Dashboard/a_Try our Calendar ViewNew'), 20)

WebUI.click(findTestObject('Page_Dunkin Donuts - Executive Dashboard/a_Try our Calendar ViewNew'))

WebUI.switchToWindowIndex(1)

String title = WebUI.getWindowTitle()

println('Title is:' + title)

WebUI.waitForElementPresent(findTestObject('Page_Restaurant Intranet/spinner'), 30)

WebUI.waitForElementNotVisible(findTestObject('Page_Restaurant Intranet/spinner'), 60)

