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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutorws
import reportbuildercustom.RB_Keywords as RB_Keywords

String DataGrain = GlobalVariable.DataGrain

String PresentBy = GlobalVariable.PresentBy

String SalesBudgetActualValue
String LaborBudgetActualValue

def CreatedReportValues = [:]

String Store='All';



CreatedReportValues = formulaValues
SalesBudgetActualValue=GlobalVariable.SalesBudget
LaborBudgetActualValue=GlobalVariable.LaborBudget


double dblSalesBudget = Double.parseDouble(SalesBudgetActualValue);
//double dblLaborBudget = Double.parseDouble(LaborBudgetActualValue);





//Grab NetSales Values
double NetSalesTY = CreatedReportValues.get('Net Sales $')

double NetSalesLY = CreatedReportValues.get('Net Sales LY $')

double NetSalesVSLY = CreatedReportValues.get('Net Sales vs LY $')

double NetSalesVSLYPercent = CreatedReportValues.get('Net Sales vs LY %')

println('Breaking point')

double NetSalesBudgetDollars

double NetSalesBudgetPercent

double SalesVSBudgetDollar

double SalesVSBudgetPercent

double LaborCostBudgetPercent 

double LaborCostBudget_ActualSales

double LaborCostBudget_BudgetSales 

double LaborCostBudgetVsBudgetPP_Dollar

double LaborCostVsBudget_ActualSales

double LaborCostVsBudget_BudgetSales



if (PresentBy.equalsIgnoreCase('Week') || PresentBy.equalsIgnoreCase('Month')|| PresentBy.equalsIgnoreCase('EntireRange')) {
	
     NetSalesBudgetDollars = CreatedReportValues.get('Sales Budget $')
	 
	 NetSalesBudgetPercent = CreatedReportValues.get('Sales Budget %')

     SalesVSBudgetDollar = CreatedReportValues.get('Sales vs Budget $')

     SalesVSBudgetPercent = CreatedReportValues.get('Sales vs Budget %')

    //Budget
     LaborCostBudgetPercent = CreatedReportValues.get('Labor Cost Budget, %')

     LaborCostBudget_ActualSales = CreatedReportValues.get('Labor Cost Budget, $ (actual sales)')

     LaborCostBudget_BudgetSales = CreatedReportValues.get('Labor Cost Budget, $ (budgeted sales)')

     LaborCostBudgetVsBudgetPP_Dollar = CreatedReportValues.get('Labor Cost vs Budget, p.p.')

     LaborCostVsBudget_ActualSales = CreatedReportValues.get('Labor Cost vs Budget, $ (actual sales)')

     LaborCostVsBudget_BudgetSales = CreatedReportValues.get('Labor Cost vs Budget, $ (budgeted sales)')
}

//Grab GuestCount Values
double GuestCountTY = CreatedReportValues.get('Guest Count')

double GuestCountLY = CreatedReportValues.get('Guest LY Count')

double GuestCountVsLYCountt = CreatedReportValues.get('Guest vs LY Count')

double GuestCountVsLYPercent = CreatedReportValues.get('Guest vs LY %')

//Grab AvgCheck Values
double AvgCheckTY = CreatedReportValues.get('Avg Check $')

double AvgCheckLY = CreatedReportValues.get('Avg Check LY $')

double AvgCheckVsLY = CreatedReportValues.get('Avg Check vs LY $')

double AvgCheckVsLYPercent = CreatedReportValues.get('Avg Check vs LY %')

//Grab LaborCost Values
double LaborCostTYDollar = CreatedReportValues.get('Labor Cost, $')

double LaborCostTYPercent = CreatedReportValues.get('Labor Cost, %')

//last year
double LaborCostLYDollar = CreatedReportValues.get('Labor Cost LY, $')

double LaborCostLYPercentReport = CreatedReportValues.get('Labor Cost LY, %')

double LaborCostVsLYDollar = CreatedReportValues.get('Labor Cost vs LY, $')

double LaborCostVsLY_PP = CreatedReportValues.get('Labor Cost vs LY, p.p.')

//last Week
//double LaborCostVsLWDollar = CreatedReportValues.get('Labor Cost LW, $')

//double LaborCostVsLWPercent = CreatedReportValues.get('Labor Cost LW, %')

//double LaborCostVsLW_PP = CreatedReportValues.get('Labor Cost vs LW, p.p.')

//******************************************************************************************************************************//





//Calculation of NetSales Formula


double NetSalesvsLY$ = CustomKeywords.'reportbuildercustom.NetSales_Formulas.calculate_NetSalesVsLastYear_Dollar'(NetSalesTY, 
    NetSalesLY)

double NetSalesvsLYPercent = CustomKeywords.'reportbuildercustom.NetSales_Formulas.calculate_NetSalesVsLastYear_Percent'(
    NetSalesTY, NetSalesLY)

//Calculation of NetSales Budget  Formula
double SalesBudgetPercent

double SalesvsBudgetDollar

double SalesvsBudgetPercent

double SalesBudgetedDollor

if (PresentBy.equalsIgnoreCase('Week') || PresentBy.equalsIgnoreCase('Month')|| PresentBy.equalsIgnoreCase('EntireRange')) {
	
	
	SalesBudgetedDollor=CustomKeywords.'reportbuildercustom.NetSales_Formulas.calculate_NetSalesBudget_Dollor'(dblSalesBudget, NetSalesLY)
	
    SalesBudgetPercent = CustomKeywords.'reportbuildercustom.NetSales_Formulas.calculate_NetSalesBudgetPercent'(NetSalesBudgetDollars, 
        NetSalesLY)

    SalesvsBudgetDollar = CustomKeywords.'reportbuildercustom.NetSales_Formulas.calculate_SalesVsBudget'(NetSalesBudgetDollars, 
        NetSalesTY)

    SalesvsBudgetPercent = CustomKeywords.'reportbuildercustom.NetSales_Formulas.calculate_SalesVsBudgetPercent'(NetSalesBudgetDollars, 
        NetSalesTY)
}

//Calculation of GuestCount Formula
double GuestvsLYCount = CustomKeywords.'reportbuildercustom.GuestCount_Formulas.calculate_Guest_LY_Count'(GuestCountTY, 
    GuestCountLY)

double GuestvsLYCountPercent = CustomKeywords.'reportbuildercustom.GuestCount_Formulas.calculate_GuestCountvsLY_Percent'(
    GuestCountTY, GuestCountLY)

//Calculation of AvgCheck Formula


double AvgCheckTY$= CustomKeywords.'reportbuildercustom.AvgCheck_Formulas.calculate_AvgCheckTYDollar'(NetSalesTY, GuestCountTY)

double AvgCheckLY$= CustomKeywords.'reportbuildercustom.AvgCheck_Formulas.calculate_AvgCheckLYDollar'(NetSalesLY, GuestCountLY)

double AvgCheckvsLY$ = CustomKeywords.'reportbuildercustom.AvgCheck_Formulas.calculate_AvgCheck_Vs_LY_Count_Dollar'(AvgCheckTY$, 
    AvgCheckLY$)

double AvgCheckvsLYPercent = CustomKeywords.'reportbuildercustom.AvgCheck_Formulas.calculate_AvgCheck_Vs_LY_Count_Percent'(
    AvgCheckTY$, AvgCheckLY$)

//Calculation of LaborCost Formula
double LaborCostPercent = CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCost_Percent'(LaborCostTYDollar, 
    NetSalesTY)

double LaborCostLYPercent = CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCost_LY__Percent'(LaborCostLYDollar, 
    NetSalesLY)

double LaborCostvsLY$ = CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCost_Vs_LY__Dollar'(LaborCostTYDollar, 
    LaborCostLYDollar)

double LaborCostvsLYpp = CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCost_Vs_LY__PP'(LaborCostPercent, 
    LaborCostLYPercent)



//Calculation of LaborCost Last Week Formula
//********************************************************/////////////////////
//double LaborCostLWPercent=CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCostLW_Percent'(AvgCheckTY, AvgCheckLY)
//double LaborCostvsLW$=CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCost_VS_LW_Dollar'(AvgCheckTY, AvgCheckLY)
//double LaborCostvsLWpp=CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCost_VS_LW_PP'(AvgCheckTY, AvgCheckLY)
//********************************************************/////////////////////
//Calculation of LaborCost Budget Formula
double LaborCostBudgetPercentage

double LaborCostBudgetDollarActualsales

double LaborCostBudgetDollarBudgetsales

double LaborCostvsBudgetPP

double LaborCostVsBudgetDollarActualsales

double LaborCostVsBudgetDollarBudgetsales

if (PresentBy.equalsIgnoreCase('Week') || PresentBy.equalsIgnoreCase('Month')|| PresentBy.equalsIgnoreCase('EntireRange')) {
	
    LaborCostBudgetPercentage = CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCostBudget_Percentage'(
       LaborCostBudget_ActualSales,NetSalesTY)

    LaborCostBudgetDollarActualsales = CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCostBudgetBasedOnActualSales_dollar'(
        NetSalesTY, LaborCostBudgetPercent)

    LaborCostBudgetDollarBudgetsales = CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCostBudgetBasedOnBudgetedSales_dollar'(
        NetSalesBudgetDollars, LaborCostBudgetPercent)

    LaborCostvsBudgetPP = CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCostVsBudget_PP'(LaborCostPercent, 
        LaborCostBudgetPercent)

    LaborCostVsBudgetDollarActualsales = CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCostVsBudgetForActualSales_Dollar'(
        LaborCostTYDollar, LaborCostBudget_ActualSales)

    LaborCostVsBudgetDollarBudgetsales = CustomKeywords.'reportbuildercustom.Labor_Formulas.calculate_LaborCostVsBudgetForBudgetSales_Dollar'(
        LaborCostTYDollar, LaborCostBudget_BudgetSales)
}



//**********************************************COMPARE STARTS********************************************************************************//



//Net Sales Compare
CustomKeywords.'compareColumnsValues.NetSalesValuesCompare.toVerifyNetSalesVsLyDollarColumnsValues'(NetSalesVSLY, NetSalesvsLY$,Store)

CustomKeywords.'compareColumnsValues.NetSalesValuesCompare.toVerifyNetSalesVsLYPercentColumnValues'(NetSalesVSLYPercent, 
    NetSalesvsLYPercent,Store)

if (PresentBy.equalsIgnoreCase('Week') || PresentBy.equalsIgnoreCase('Month')|| PresentBy.equalsIgnoreCase('EntireRange')) {
	
    CustomKeywords.'compareColumnsValues.NetSalesValuesCompare.toVerifySalesBudgetPercentColumnValues'(NetSalesBudgetPercent, 
        SalesBudgetPercent,Store)

    CustomKeywords.'compareColumnsValues.NetSalesValuesCompare.toVerifySalesvsBudgetDollarsColumnValues'(SalesVSBudgetDollar, 
        SalesvsBudgetDollar,Store)

    CustomKeywords.'compareColumnsValues.NetSalesValuesCompare.toVerifySalesvsBudgetPercentColumnValues'(SalesVSBudgetPercent, 
        SalesvsBudgetPercent,Store)
}

//GuestCount Compare
CustomKeywords.'compareColumnsValues.GuestCountValuesCompare.toVerifyGuestVsLYCountColumnsValues'(GuestCountVsLYCountt, 
    GuestvsLYCount,Store)

CustomKeywords.'compareColumnsValues.GuestCountValuesCompare.toVerifyGuestVsLYPercentCountColumnsValues'(GuestCountVsLYPercent, 
    GuestvsLYCountPercent,Store)

//Average Check Compare


CustomKeywords.'compareColumnsValues.AvgTicketValuesCompare.toVerifyAvgCheckTYDollorValues'(AvgCheckTY, AvgCheckTY$,Store)

CustomKeywords.'compareColumnsValues.AvgTicketValuesCompare.toVerifyAvgCheckLYDollorValues'(AvgCheckLY, AvgCheckLY$,Store)

CustomKeywords.'compareColumnsValues.AvgTicketValuesCompare.toVerifyAvgCheckvsLYDollarColumnsValues'(AvgCheckVsLY, AvgCheckvsLY$,Store)

CustomKeywords.'compareColumnsValues.AvgTicketValuesCompare.toVerifyAvgCheckvsLYPercentColumnsValues'(AvgCheckVsLYPercent, 
    AvgCheckvsLYPercent,Store)


    //Labor cost Compare
    CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostPercentColumnsValues'(LaborCostTYPercent, 
        LaborCostPercent,Store)

    CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostLYPercentColumnsValues'(LaborCostLYPercentReport, 
        LaborCostLYPercent,Store)

    CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCost_VS_LY_Dollar_ColumnsValues'(LaborCostVsLYDollar, 
        LaborCostvsLY$,Store)

    CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCost_VS_LY_PP_ColumnsValues'(LaborCostVsLY_PP, 
        LaborCostvsLYpp,Store)

   // CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostLW_PercentColumnsValues'(LaborCostVsLWPercent, LaborCostLWPercent,Store)

   // CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostVsLW_DollarColumnsValues'(LaborCostVsLWDollar, LaborCostvsLW$,Store)

    //CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostVsLW_PPColumnsValues'(LaborCostVsLW_PP,LaborCostvsLWpp,Store)

    //Labor cost Budget Compare
	
	if (PresentBy.equalsIgnoreCase('Week') || PresentBy.equalsIgnoreCase('Month')|| PresentBy.equalsIgnoreCase('EntireRange')) {
		
	
    CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostBudgetPercentColumnsValues'(LaborCostBudgetPercent, 
        LaborCostBudgetPercentage,Store)

    
	CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostBudgetDollarsactualsalesColumnsValues'(LaborCostBudget_ActualSales, LaborCostBudgetDollarActualsales,Store)
	
	CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostBudgetDollarsBudgetedsalesColumnsValues'(LaborCostBudget_BudgetSales, LaborCostBudgetDollarBudgetsales,Store)



    CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostvsBudgetppColumnsValues'(LaborCostBudgetVsBudgetPP_Dollar, 
        LaborCostvsBudgetPP,Store)

    CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostvsBudgetDollarsactualsalesColumnsValues'(
        LaborCostVsBudget_ActualSales, LaborCostVsBudgetDollarActualsales,Store)

    CustomKeywords.'compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostvsBudgetDollarsbudgetedsalesColumnsValues'(
        LaborCostVsBudget_BudgetSales, LaborCostVsBudgetDollarBudgetsales,Store)
}