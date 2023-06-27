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

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/link_Add Columns'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/drp_DataGroup'))

WebUI.click(findTestObject('ReportSetupScreen/DataGroupValues/Net Sales(DWM)/tupple_Net_Sales'))

WebUI.click(findTestObject('ReportSetupScreen/Create Columns/Expand Button By Category/expand_Actual'))


WebUI.verifyElementChecked(findTestObject('div.containers:nth-child(2) div.main-field div.main-field__right:nth-child(2) div.main-field__content.mt-30 form.ng-untouched.ng-pristine.ng-invalid div.boxes-wraper.ui-kit-row:nth-child(3) div.boxws-wraper-box.ui-kit-cell.p-18.CreateColumns_wrpr div.createcol-drop-div.box.border.p-15 div.ui-kit-row1.mt-15 div.ui-kit-cell.mt-0 app-checkable-treeview.tree-component div.ui-kit-row.mt-10 div.ui-kit-cell div.accordion.type-1.w-accord.active:nth-child(1) div.accordion__body.w-accord-body div.accordion.type-2.w-accord div.ui-kit-row.mt-10 div.ui-kit-cell div.accordion.type-1.w-accord div.childdd label.checkbox.mb-0 > span.checkbox__pseudo-check'),0)



