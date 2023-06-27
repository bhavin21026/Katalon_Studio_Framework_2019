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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver

WebUI.waitForElementPresent(findTestObject('Created Reports Objects/StartDate'), 0)

WebUI.waitForElementPresent(findTestObject('Created Reports Objects/EndDate'), 0)

String StartDate = WebUI.getText(findTestObject('Created Reports Objects/StartDate'))

String EndDate = WebUI.getText(findTestObject('Created Reports Objects/EndDate'))

String presentBy = GlobalVariable.PresentBy

if (presentBy.equalsIgnoreCase('Day')) {
    if (StartDate.equalsIgnoreCase('Start Date:') && EndDate.equalsIgnoreCase('End Date:')) {
        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/setStartDate - Copy'), [('StartMonthYear') : GlobalVariable.stCalStartMonthYear
                , ('StartDate') : GlobalVariable.stCalStartDate], FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/setEndDate - Copy'), [('EndMonthYear') : GlobalVariable.stCalEndMonthYear
                , ('EndDate') : GlobalVariable.stCalEndDate], FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Select stores'), [('StoreName') : GlobalVariable.PCName], 
            FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/HitRefresh'), [:], FailureHandling.CONTINUE_ON_FAILURE)

		
		
		WebUI.waitForElementVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 30)
	
		WebUI.waitForElementNotVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 30)
        assert true
    } else {
        assert false
    }
} else if (presentBy.equalsIgnoreCase('Week') || presentBy.equalsIgnoreCase('EntireRange')) {
    if (StartDate.equalsIgnoreCase('Start Week:') && EndDate.equalsIgnoreCase('End Week:')) {
        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/setStartDate'), [('StartMonthYear') : GlobalVariable.MonthYear
                , ('StartDate') : GlobalVariable.StartDate], FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/setEndDate'), [('EndMonthYear') : GlobalVariable.EndMonthYear
                , ('EndDate') : GlobalVariable.EndDate], FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Select stores 2'), [('StoreName') : GlobalVariable.PCName], 
            FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/HitRefresh'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		
		
		WebUI.waitForElementVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 30)
	
		WebUI.waitForElementNotVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 30)

        assert true
    } else {
        assert false
    }
} else if (presentBy.equalsIgnoreCase('Month')) {
    if (StartDate.equalsIgnoreCase('Start Month:') && EndDate.equalsIgnoreCase('End Month:')) {
        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/setStartMonth'), [:], FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/setEndMonth'), [:], FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Select stores 2'), [('StoreName') : GlobalVariable.PCName], 
            FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/HitRefresh'), [:], FailureHandling.CONTINUE_ON_FAILURE)

		
		
		WebUI.waitForElementVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 30)
	
		WebUI.waitForElementNotVisible(findTestObject('ReportBuilderUI/Progress_Bar'), 30)
        assert true
    } else {
        assert false
    }
}

