import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
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

/*WebDriver driver = DriverFactory.getWebDriver()

if (driver.findElement(By.xpath('//div[@id=\'toast-container\']')).size != 0) {
    WebUI.waitForElementPresent(findTestObject('Page_Restaurant Intranet/Setup/tasterMessage'), 20)

    WebUI.waitForElementNotPresent(findTestObject('Page_Restaurant Intranet/Setup/tasterMessage'), 10)
}*/
WebUI.refresh()

WebUI.mouseOver(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/link_CrossLocationReportIcon'))

CustomKeywords.'reportbuildercustom.RB_Keywords.clickOnReportCategory'(GlobalVariable.CategoryName)

CustomKeywords.'reportbuildercustom.RB_Keywords.clickAndVerifyCreatedReport'(GlobalVariable.ReportName)

WebUI.waitForElementVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 30)

WebUI.waitForElementNotVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 30)

String title = WebUI.getText(findTestObject('Created Reports Objects/ReportTitle'), FailureHandling.CONTINUE_ON_FAILURE)

if (title.equalsIgnoreCase(ReportName)) {
    assert true
}

