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

String DataGrain = GlobalVariable.DataGrain

String PresentBy = GlobalVariable.PresentBy

if (DataGrain.equalsIgnoreCase('Daily') && PresentBy.equalsIgnoreCase('Day')) {
    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Grain By Daily with Present By Day'), 
        [('NoOfdays') : GlobalVariable.NoOfDays], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Net Sales - Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Guest Count- Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Loss Prevention -Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (DataGrain.equalsIgnoreCase('Daily') && PresentBy.equalsIgnoreCase('Week')) {
    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Grain By Daily with Present By Week'), 
        [('NoOfWeeks') : GlobalVariable.NoOfWeeks], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Net Sales - Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Guest Count- Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Loss Prevention -Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (DataGrain.equalsIgnoreCase('Daily') && PresentBy.equalsIgnoreCase('Month')) {
    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Grain By Daily with Present By Month'), 
        [('NoOfMonths') : GlobalVariable.NoOfMonths], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Net Sales - Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Guest Count- Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Loss Prevention -Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (DataGrain.equalsIgnoreCase('Daily') && PresentBy.equalsIgnoreCase('EntireRange')) {
    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Grain By Daily with Present By Entire range'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Net Sales - Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Guest Count- Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Daily Data Grain/Loss Prevention -Daily Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (DataGrain.equalsIgnoreCase('Weekly') && PresentBy.equalsIgnoreCase('Week')) {
    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Grain By Weekly with Present By Week'), 
        [('NoOfWeeks') : GlobalVariable.NoOfWeeks], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Weekly Data Grain/Net Sales - Weekly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Weekly Data Grain/Guest Count- Weekly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Weekly Data Grain/Loss Prevention -Weekly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (DataGrain.equalsIgnoreCase('Weekly') && PresentBy.equalsIgnoreCase('Month')) {
    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Grain By Weekly with Present By Month'), 
        [('NoOfMonths') : GlobalVariable.NoOfMonths], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Weekly Data Grain/Net Sales - Weekly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Weekly Data Grain/Guest Count- Weekly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Weekly Data Grain/Loss Prevention -Weekly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (DataGrain.equalsIgnoreCase('Weekly') && PresentBy.equalsIgnoreCase('EntireRange')) {
    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Grain By Weekly with Present By Entire Range'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Weekly Data Grain/Net Sales - Weekly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Weekly Data Grain/Guest Count- Weekly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Weekly Data Grain/Loss Prevention -Weekly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (DataGrain.equalsIgnoreCase('Monthly') && PresentBy.equalsIgnoreCase('Month')) {
    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Grain By Monthly with Present By Month'), 
        [('NoOfMonths') : GlobalVariable.NoOfMonths], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Monthly Data Grain/Net Sales - Monthly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Monthly Data Grain/Guest Count- Monthly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Monthly Data Grain/Loss Prevention -Monthly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (DataGrain.equalsIgnoreCase('Monthly') && PresentBy.equalsIgnoreCase('EntireRange')) {
    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Data Grain with Present Data By/Grain By Monthly with Present By Entire Range'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Monthly Data Grain/Net Sales - Monthly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Monthly Data Grain/Guest Count- Monthly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Column Selection By Data Grain/Monthly Data Grain/Loss Prevention -Monthly Data Grain'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
}

