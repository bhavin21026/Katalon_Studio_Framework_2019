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

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/link_Add Columns'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/drp_DataGroup'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/tupple_Net_Sales'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Actual'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Actual/Sctg_NetSalesDollor'))

String ColumnName = WebUI.getText(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Actual/Sctg_NetSalesDollor'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Actual/Sctg_NetSalesDollor'))


WebUI.click(findTestObject('ReportSetupScreen/Create Columns/button_Add Columns(s)'))

String xpath1 = '//span[contains(@class,"add-column-box-text pl-20") and text() ="' + ColumnName + '"]'



TestObject to = new TestObject('CreatedColumns')

to.addProperty('xpath', ConditionType.EQUALS, xpath1)

//WebUI.click(findTestObject('ReportSetupScreen/Name Your Report/drp_CategoryValue'))
WebUI.waitForElementVisible(to, 20)

WebUI.verifyElementVisible(to)

