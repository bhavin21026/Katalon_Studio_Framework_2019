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

WebUI.callTestCase(findTestCase('CrossLocationReportBuilder_TestCases/TC2_Verify fucntionality of Try Our Calender View button'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Restaurant_Intranet_Dashboard_Page/Click on Dashboard Link'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Restaurant_Intranet_Dashboard_Page/Click on dashbord calender button and select operational calender'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Restaurant_Intranet_Dashboard_Page/Select PC name'), [('PCName') : GlobalVariable.PCName], 
    FailureHandling.CONTINUE_ON_FAILURE)

def valuesFromCalendarDashboard = []

valuesFromCalendarDashboard = WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Restaurant_Intranet_Dashboard_Page/Get all available variable values from calender view for one month'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CrossLocationReportBuilder_TestCases/TC77_Verify Created Report is displaying same as per the set configuration in report setup'), 
    [('ReportName') : GlobalVariable.ReportName], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Verify Date Picker is displayed as defined Data Grain'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

def NoOfDaysFromReports = []

NoOfDaysFromReports = WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Verify Dates on report based on selected present data by'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Verify all added columns in report is same as added during set up'), 
    [('AddedColumnsSize') : '', ('SetUpList') : [:]], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Restaurant_Intranet_Dashboard_Page/Fetch variable values from created report and do comapre with calendar values'), 
    [('SetUpListToGetData') : valuesFromCalendarDashboard, ('DayWiseDates') : NoOfDaysFromReports], FailureHandling.CONTINUE_ON_FAILURE)

