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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException as WebElementNotFoundException
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

WebUI.click(findTestObject('Page_Restaurant Intranet/Dashboard/btn_DashboardCalender'))

String OC1 = GlobalVariable.OperationalCalender

String OY1 = GlobalVariable.SalesBudgetYear

WebDriver driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Page_Restaurant Intranet/Dashboard/drp_YearPeriod'))

WebElement yearfiled = driver.findElement(By.xpath(('//option[contains(text(),"' + OY1) + '")]'))

yearfiled.click()


WebUI.waitForElementVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 50)

WebUI.waitForElementNotVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 50)


WebUI.click(findTestObject('Page_Restaurant Intranet/Dashboard/drp_calender'))

WebElement fields = driver.findElement(By.xpath(('//option[contains(text(),"' + OC1) + '")]'))

fields.click()

WebUI.waitForElementVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 50)

WebUI.waitForElementNotVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 50)

if (driver.findElement(By.xpath('//div[@class=\'popover__cross\']')).isDisplayed()) {
    WebUI.click(findTestObject('Page_Restaurant Intranet/Dashboard/btn_ClosePeriod'))

    println('Calendar year selected')

    WebUI.delay(3)

}




KeywordUtil.markPassed('Clicking on Dates of dashbord calender')

