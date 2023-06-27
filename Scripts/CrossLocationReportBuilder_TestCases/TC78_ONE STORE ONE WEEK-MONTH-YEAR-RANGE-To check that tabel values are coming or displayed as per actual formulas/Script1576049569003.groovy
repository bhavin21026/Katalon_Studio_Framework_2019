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

WebUI.callTestCase(findTestCase('CrossLocationReportBuilder_TestCases/TC1_Verify successfull login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Click on Data Entry Form'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Sales Budget/Select Location from dropdown For Sales budget'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Sales Budget/Select Month From Dropdown For Sales budget'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Sales Budget/Select Year from dropdown For Sales budget'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Hit Refresh'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: String SalesBudgets = WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Sales Budget/Get And Set Sales Budget'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Left nav Bar/Click On Link Budget'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Left nav Bar/Click on Labor Budget link'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Labor Budget/Select Location from dropdown For Labor Budget'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Labor Budget/Select Month From Dropdown For Labor Budget'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Labor Budget/Select Year from dropdown For Labor Budget'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Hit Refresh'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: String LaborBudgets = WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Data Entry Form TestCases/Labor Budget/Get And Set Labor Budget'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Delete and Create Excels for results'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CrossLocationReportBuilder_TestCases/TC77_Verify Created Report is displaying same as per the set configuration in report setup'), 
    [('ReportName') : GlobalVariable.ReportName], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Verify Date Picker is displayed as defined Data Grain'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

def ValuesForFormula = [:]

ValuesForFormula = WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/To get all added column values from report- ONE STORE'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/To map and compare all report values coming as per formula'), 
    [('formulaValues') : ValuesForFormula], FailureHandling.CONTINUE_ON_FAILURE)

