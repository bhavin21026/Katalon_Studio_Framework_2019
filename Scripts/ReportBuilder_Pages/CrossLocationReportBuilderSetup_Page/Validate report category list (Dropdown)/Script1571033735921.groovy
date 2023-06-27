import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper as MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException as WebElementNotFoundException
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import internal.GlobalVariable as GlobalVariable


WebUI.callTestCase(findTestCase('ReportBuilder_Pages/ReportSetup_Page/Verify Add Report button and Click - Copy'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('ReportSetupScreen/Name Your Report/input_Report Name_form-item ng-untouched ng-pristine ng-invalid'), 
    30)

WebUI.click(findTestObject('ReportSetupScreen/Name Your Report/input_Report Name_form-item ng-untouched ng-pristine ng-invalid'))

WebUI.setText(findTestObject('ReportSetupScreen/Name Your Report/input_SelectCategory'), ReportCategoryName)

String CategoryName = ReportCategoryName
String xpath = ('//span[text()="' + CategoryName + '"]')

WebDriver driver = DriverFactory.getWebDriver()
WebElement fields = driver.findElement(By.xpath('//span[text()="' + CategoryName + '"]'))


WebUI.delay(1)

//println xpath

//TestObject to = new TestObject('TuppleValue')

//to.addProperty('xpath', ConditionType.EQUALS, xpath)

//WebUI.click(findTestObject('ReportSetupScreen/Name Your Report/drp_CategoryValue'))
fields.click()

WebUI.delay(1)


