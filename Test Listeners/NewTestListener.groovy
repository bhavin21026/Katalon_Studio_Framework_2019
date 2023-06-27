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


import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.logging.KeywordLogger
import org.openqa.selenium.Dimension

class NewTestListener {
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	KeywordUtil log = new KeywordUtil()

	static cnt = 0
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestSuite
	def beforeTestSuit(TestCaseContext testCaseContext) {
		WebUI.openBrowser('');
		WebDriver driver = DriverFactory.getWebDriver()
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		WebUI.maximizeWindow();
		WebUI.deleteAllCookies();
		WebUI.navigateToUrl(GlobalVariable.url_Login);
		
		
	}

	
	/*@BeforeTestCase
	def beforeTestcase(TestCaseContext testCaseContext) {
		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.deleteAllCookies();
		WebUI.navigateToUrl(GlobalVariable.url_Login);
		WebUI.setText(findTestObject('Object Repository/Page_Dunkin Donuts - Executive Dashboard/input_Login_textBoxEmailAddress'),
			GlobalVariable.username)
		
		WebUI.setText(findTestObject('Object Repository/Page_Dunkin Donuts - Executive Dashboard/input_Login_textBoxPassword'),
			GlobalVariable.password)
		
		WebUI.click(findTestObject('Object Repository/Page_Dunkin Donuts - Executive Dashboard/input_Login_buttonLogin'))
		
		WebUI.waitForElementClickable(findTestObject('Page_Dunkin Donuts - Executive Dashboard/a_Try our Calendar ViewNew'), 60)
		
		
	}*/
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def afterTestcase(TestCaseContext testCaseContext) {
	}

	@AfterTestSuite
	def afterTestsuite(TestSuiteContext testSuiteContext) {
		
		
		log.logInfo("*****************************")
		log.logInfo(testSuiteContext.getStatus())
		if (testSuiteContext.getStatus().equals("ERROR")){
			cnt ++
		}

		log.logInfo(cnt as String)
		log.logInfo("*****************************")
		
		
		WebUI.closeBrowser();
		
	}
	
	
}