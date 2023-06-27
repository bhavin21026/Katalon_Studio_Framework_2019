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

WebUI.waitForElementVisible(findTestObject('Page_Restaurant Intranet/Setup/tasterMessage'), 5)

WebUI.waitForElementNotVisible(findTestObject('Page_Restaurant Intranet/Setup/tasterMessage'), 5)

not_run: WebUI.refresh()

//WebUI.verifyElementPresent(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/div_ReportBuilderLink'), 0)
//WebUI.click(findTestObject('Page_Restaurant Intranet/Left_Nav_Bar/div_ReportBuilderLink'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.waitForElementClickable(findTestObject('ReportBuilderUI/div_Report Setup'), GlobalVariable.ExplicitWait)
//WebUI.click(findTestObject('ReportBuilderUI/div_Report Setup'))
not_run: WebUI.waitForElementClickable(findTestObject('ReportSetupScreen/input_SearchReportFilter'), 20)

not_run: WebUI.click(findTestObject('ReportSetupScreen/input_SearchReportFilter'))

not_run: String reportName = SearchReport

not_run: WebUI.setText(findTestObject('ReportSetupScreen/input_SearchReportFilter'), reportName)

not_run: WebUI.click(findTestObject('ReportSetupScreen/Reports_header'))

not_run: WebUI.delay(2)

/*WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.xpath("//h2[text()='Reports']")).click()


WebElement Tabel = driver.findElement(By.xpath('//*[@id="main-field"]/div/div/div/app-reports/div/app-report-list/div/table/tbody'))

List<WebElement> Tabel1 = Tabel.findElements(By.tagName('tr'))

WebElement Tabel3 = Tabel1.get(0).findElements(By.tagName('td')).get(0)

String strReportName = Tabel3.getText()
WebElement strReportName1 = driver.findElement(By.xpath('//*[@id="main-field"]/div/div/div/app-reports/div/app-report-list/div/table/tbody[1]/tr/td[1]'))

strReportName1.click()*/
not_run: WebUI.click(findTestObject('ReportSetupScreen/tabel_SearchedReport'))

not_run: String strReportName = WebUI.getText(findTestObject('ReportSetupScreen/tabel_SearchedReport'))

not_run: if (strReportName.equalsIgnoreCase(reportName)) {
    WebUI.comment('Report  has been added to list of reports and can be searched.')
}

not_run: WebUI.waitForElementClickable(findTestObject('Page_Restaurant Intranet/link_ProfileIcon'), 0)

WebUI.delay(3)

