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

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/link_Add Columns'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/drp_DataGroup'))

WebUI.verifyElementClickable(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/tupple_Net_Sales'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/tupple_Net_Sales'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Categories/Ctg_Actual'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Categories/Ctg_LastYear'))

//WebUI.waitForElementClickable(findTestObject('ReportSetupScreen/Create Columns/button_Add Columns(s)'), 5)
WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()
WebElement element = driver.findElement(By.xpath("//button[text()='Add Columns(s)']"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", element);


//WebElement AddColumnLink=driver.findElement(By.xpath("//span[text()='Add Columns']"));


if(!(driver.findElements(By.xpath("//span[text()='Add Columns']")).size()!=0))
{
 JavascriptExecutor executor1 = (JavascriptExecutor)driver;
 WebElement element1 = driver.findElement(By.xpath("//button[text()='Add Columns(s)']"));
 
 executor1.executeScript("arguments[0].click();", element1);
	
}
//WebUI.click(findTestObject('ReportSetupScreen/Create Columns/button_Add Columns(s)'))

