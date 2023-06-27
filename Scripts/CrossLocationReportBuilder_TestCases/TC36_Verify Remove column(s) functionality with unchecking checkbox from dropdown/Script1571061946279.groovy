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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/link_Add Columns'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/drp_DataGroup'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/tupple_Net_Sales'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Actual'))

String ColumnName = WebUI.getText(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Actual/Sctg_NetSalesDollor'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/SubCategories/Actual/Sctg_NetSalesDollor'))

println('*****************')

println(ColumnName)

println('*****************')

WebDriver driver = DriverFactory.getWebDriver()

'Getting the text from the alert and storing it in Variable'
String AlertText = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
println(AlertText)

WebUI.acceptAlert()

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/button_Add Columns(s)'))

WebUI.waitForElementClickable(findTestObject('ReportSetupScreen/Create Columns/link_Add Columns'), 20)

String xpath1 = ('//span[contains(@class,"add-column-box-text pl-20") and text() ="' + ColumnName) + '"]'

println('********///////////*********')

println(xpath1)

println('***********///////////////////******')

TestObject to = new TestObject('CreatedColumns')

to.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.verifyElementNotPresent(to, 0)

