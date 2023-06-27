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

WebUI.click(findTestObject('Page_Restaurant Intranet/Data Entry Forms/SalesBudget/input_SalesBudgetPercent'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Restaurant Intranet/Data Entry Forms/SalesBudget/input_SalesBudgetPercent'), GlobalVariable.SalesBudget)

WebUI.click(findTestObject('Page_Restaurant Intranet/Setup/btn_save'))

WebUI.waitForElementClickable(findTestObject('Page_Restaurant Intranet/Data Entry Forms/SalesBudget/input_SalesBudgetedDollor'), 
    20)

String SalesBudgetActual = WebUI.getAttribute(findTestObject('Page_Restaurant Intranet/Data Entry Forms/SalesBudget/input_SalesBudgetedDollor'), 
    'value')

WebUI.waitForElementVisible(findTestObject('Page_Restaurant Intranet/Setup/tasterMessage'), 5)

WebUI.waitForElementNotVisible(findTestObject('Page_Restaurant Intranet/Setup/tasterMessage'), 5)

return SalesBudgetActual

