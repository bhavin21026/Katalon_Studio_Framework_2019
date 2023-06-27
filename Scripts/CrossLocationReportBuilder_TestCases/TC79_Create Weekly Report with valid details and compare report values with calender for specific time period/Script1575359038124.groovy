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

WebUI.callTestCase(findTestCase('CrossLocationReportBuilder_TestCases/TC3_Verify Report Builder Link functionality'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/ReportSetup_Page/Verify Add Report button and Click'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Give Report Name'), [('ReportName') : GlobalVariable.ReportName], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Select Report Category'), [('ReportCategory') : GlobalVariable.CategoryName], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Select Data Grain And Present Data By options for Report'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

ColumnListNew = []

ColumnListNew = CustomKeywords.'reportbuildercustom.RB_Keywords.verifyTotalAddedColumns'()

int TotalNoOfColumnsAdded = ColumnListNew.size()

println(TotalNoOfColumnsAdded)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Select Grouping By Hierarchy'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Click on Create Report Button'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Search and validate created report from list of reports'), 
    [('SearchCategory') : GlobalVariable.CategoryName, ('SearchReport') : GlobalVariable.ReportName], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Restaurant_Intranet_Dashboard_Page/Click on Dashboard Link'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Restaurant_Intranet_Dashboard_Page/Select PC name'), [('PCName') : GlobalVariable.PCName], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Restaurant_Intranet_Dashboard_Page/Click on dashbord calender button and select operational calender'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

def valuesFromCalendarDashboard = [:]

valuesFromCalendarDashboard = WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Restaurant_Intranet_Dashboard_Page/Get all available variable values from calender view for all weeks of one month'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CrossLocationReportBuilder_TestCases/TC77_Verify Created Report is displaying same as per the set configuration in report setup'), 
    [('ReportName') : GlobalVariable.ReportName], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Verify Date Picker is displayed as defined Data Grain'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

def NoOfDaysFromReports = []

NoOfDaysFromReports = WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Verify Dates on report based on selected present data by'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CreatedReports/Verify all added columns in report is same as added during set up'), 
    [('AddedColumnsSize') : TotalNoOfColumnsAdded, ('SetUpList') : ColumnListNew], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Restaurant_Intranet_Dashboard_Page/Fetch variable values from created report and do comapre with calendar values for each week'), 
    [('SetUpListToGetData') : valuesFromCalendarDashboard, ('DayWiseDates') : NoOfDaysFromReports, ('NoOfAddedColumns') : TotalNoOfColumnsAdded], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_CleanUp/cleanUp Reports'), [('SearchReport') : GlobalVariable.ReportName], 
    FailureHandling.CONTINUE_ON_FAILURE)

