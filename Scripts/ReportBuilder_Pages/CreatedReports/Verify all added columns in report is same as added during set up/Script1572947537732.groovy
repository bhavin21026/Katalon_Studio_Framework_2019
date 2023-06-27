import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

not_run: WebUI.click(findTestObject('Created Reports Objects/btn_collapseSidebar'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement HeaderRow = driver.findElement(By.xpath('(//thead[@class="ui-table-thead"])[2]'))

List<WebElement> Headers = HeaderRow.findElements(By.tagName('tr'))

List<WebElement> TotalAddedColumns = Headers.get(1).findElements(By.tagName('th'))

int NoOfdaysSelected = TotalAddedColumns.size()

def ColumnListFromReport = []

int AddedColumns = AddedColumnsSize

for (int i = 0; i < AddedColumns; i++) {
    WebElement AddedColumnNameOnReport = TotalAddedColumns.get(i)

    JavascriptExecutor je = ((driver) as JavascriptExecutor)

    je.executeScript('arguments[0].scrollIntoView()', AddedColumnNameOnReport)

    String AddedColumnNameReport = AddedColumnNameOnReport.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
        '\n', ' ')

    ColumnListFromReport.add(i, AddedColumnNameReport)

    println('*************ON REPORT******************')

    println(ColumnListFromReport[i])

    println('*************ON REPORT******************')
}

def setupListNew = SetUpList

if (ColumnListFromReport.equals(setupListNew)) {
	println 'colums matched'
    assert true
} else {
    assert false
}

