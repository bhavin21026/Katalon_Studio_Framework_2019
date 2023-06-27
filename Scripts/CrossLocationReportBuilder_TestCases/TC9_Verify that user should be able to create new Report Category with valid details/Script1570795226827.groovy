import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Reports Categories_Page/Open Report Categories link'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Reports Categories_Page/Give Report Category Name'), [('CategoryName') : CategoryName], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Reports Categories_Page/Give Report Category Display Order'), [('DisplayOrder') : GlobalVariable.DisplayOrder
        , ('IconName') : GlobalVariable.IconName], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Reports Categories_Page/Create Report Category and mark as active'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/Reports Categories_Page/Searched created Report Category from list and verify'), 
    [('SearchCategory') : GlobalVariable.CategoryName], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ReportBuilder_Pages/CrossLocationReportBuilderSetup_Page/Validate report category list (Dropdown)'), 
    [('ReportCategoryName') : GlobalVariable.CategoryName], FailureHandling.CONTINUE_ON_FAILURE)

