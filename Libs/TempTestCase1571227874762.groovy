import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('D:\\Users\\bksangani\\AppData\\Local\\Temp\\Katalon\\Test Cases\\CrossLocationReportBuilder_TestCases\\TC20_Verify if Create Report button becomes enable when minimum one column is selected from list of availble column\\20191016_174114\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/CrossLocationReportBuilder_TestCases/TC20_Verify if Create Report button becomes enable when minimum one column is selected from list of availble column', new TestCaseBinding('Test Cases/CrossLocationReportBuilder_TestCases/TC20_Verify if Create Report button becomes enable when minimum one column is selected from list of availble column',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
