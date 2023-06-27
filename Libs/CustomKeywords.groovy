
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import org.apache.poi.ss.usermodel.Sheet

import org.apache.poi.ss.usermodel.Workbook

import java.lang.Object

import java.util.Map

import java.util.List

import org.apache.poi.ss.usermodel.Cell

import org.apache.poi.ss.usermodel.Row

import com.kms.katalon.core.testobject.TestObject


def static "excelUtils.WriteExcelLossPreventionFormula.writeExcelDailyFormulaCheck"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcelLossPreventionFormula()).writeExcelDailyFormulaCheck(
        	dataToWrite)
}

def static "excelUtils.WriteExcelLossPreventionFormula.writeExcelPassFormulaCheck"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcelLossPreventionFormula()).writeExcelPassFormulaCheck(
        	dataToWrite)
}

def static "excelUtils.WriteExcelLossPreventionFormula.writeExcelAllStorePass"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcelLossPreventionFormula()).writeExcelAllStorePass(
        	dataToWrite)
}

def static "excelUtils.WriteExcelLossPreventionFormula.writeExcelAllStoreFail"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcelLossPreventionFormula()).writeExcelAllStoreFail(
        	dataToWrite)
}

def static "excelUtils.WriteExcelLossPreventionFormula.writeRawValues"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcelLossPreventionFormula()).writeRawValues(
        	dataToWrite)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostPercentColumnsValues"(
    	double LaborCostTYPercent	
     , 	double LaborCostPercent	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostPercentColumnsValues(
        	LaborCostTYPercent
         , 	LaborCostPercent
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostLYPercentColumnsValues"(
    	double LaborCostLYPercentReport	
     , 	double LaborCostLYPercent	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostLYPercentColumnsValues(
        	LaborCostLYPercentReport
         , 	LaborCostLYPercent
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCost_VS_LY_Dollar_ColumnsValues"(
    	double LaborCostVsLYDollar	
     , 	double LaborCostvsLY$	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCost_VS_LY_Dollar_ColumnsValues(
        	LaborCostVsLYDollar
         , 	LaborCostvsLY$
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCost_VS_LY_PP_ColumnsValues"(
    	double LaborCostVsLY_PP	
     , 	double LaborCostvsLYpp	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCost_VS_LY_PP_ColumnsValues(
        	LaborCostVsLY_PP
         , 	LaborCostvsLYpp
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostLW_PercentColumnsValues"(
    	double LaborCostVsLWPercent	
     , 	double LaborCostLWPercent	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostLW_PercentColumnsValues(
        	LaborCostVsLWPercent
         , 	LaborCostLWPercent
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostVsLW_DollarColumnsValues"(
    	double LaborCostVsLWDollar	
     , 	double LaborCostvsLW$	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostVsLW_DollarColumnsValues(
        	LaborCostVsLWDollar
         , 	LaborCostvsLW$
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostVsLW_PPColumnsValues"(
    	double LaborCostVsLW_PP	
     , 	double LaborCostvsLWpp	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostVsLW_PPColumnsValues(
        	LaborCostVsLW_PP
         , 	LaborCostvsLWpp
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostBudgetPercentColumnsValues"(
    	double LaborCostBudgetPercent	
     , 	double LaborCostBudgetPercentage	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostBudgetPercentColumnsValues(
        	LaborCostBudgetPercent
         , 	LaborCostBudgetPercentage
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostBudgetDollarsactualsalesColumnsValues"(
    	double LaborCostBudget_ActualSales	
     , 	double LaborCostBudgetDollarActualsales	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostBudgetDollarsactualsalesColumnsValues(
        	LaborCostBudget_ActualSales
         , 	LaborCostBudgetDollarActualsales
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostBudgetDollarsBudgetedsalesColumnsValues"(
    	double LaborCostBudget_BudgetSales	
     , 	double LaborCostBudgetDollarBudgetsales	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostBudgetDollarsBudgetedsalesColumnsValues(
        	LaborCostBudget_BudgetSales
         , 	LaborCostBudgetDollarBudgetsales
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostvsBudgetppColumnsValues"(
    	double LaborCostBudgetVsBudgetPP_Dollar	
     , 	double LaborCostvsBudgetPP	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostvsBudgetppColumnsValues(
        	LaborCostBudgetVsBudgetPP_Dollar
         , 	LaborCostvsBudgetPP
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostvsBudgetDollarsactualsalesColumnsValues"(
    	double LaborCostVsBudget_ActualSales	
     , 	double LaborCostVsBudgetDollarActualsales	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostvsBudgetDollarsactualsalesColumnsValues(
        	LaborCostVsBudget_ActualSales
         , 	LaborCostVsBudgetDollarActualsales
         , 	store)
}

def static "compareColumnsValues.LaborCostValuesCompare.toVerifyLaborCostvsBudgetDollarsbudgetedsalesColumnsValues"(
    	double LaborCostVsBudget_BudgetSales	
     , 	double LaborCostVsBudgetDollarBudgetsales	
     , 	String store	) {
    (new compareColumnsValues.LaborCostValuesCompare()).toVerifyLaborCostvsBudgetDollarsbudgetedsalesColumnsValues(
        	LaborCostVsBudget_BudgetSales
         , 	LaborCostVsBudgetDollarBudgetsales
         , 	store)
}

def static "compareColumnsValues.LaborHoursValuesCompare.toVerifyTotalhoursvsLYReportColumnsValues"(
    	double TotalhoursvsLYReport1	
     , 	double TotalhoursvsLYReport	
     , 	String store	) {
    (new compareColumnsValues.LaborHoursValuesCompare()).toVerifyTotalhoursvsLYReportColumnsValues(
        	TotalhoursvsLYReport1
         , 	TotalhoursvsLYReport
         , 	store)
}

def static "compareColumnsValues.LaborHoursValuesCompare.toVerifyOThoursvsLYReportColumnsValues"(
    	double OThoursvsLYReport1	
     , 	double OThoursvsLYReport	
     , 	String store	) {
    (new compareColumnsValues.LaborHoursValuesCompare()).toVerifyOThoursvsLYReportColumnsValues(
        	OThoursvsLYReport1
         , 	OThoursvsLYReport
         , 	store)
}

def static "excelUtils.DailyFormulaLossPrevention.dailyFormulaCheckLossPrevention"() {
    (new excelUtils.DailyFormulaLossPrevention()).dailyFormulaCheckLossPrevention()
}

def static "excelUtils.DailyFormulaLossPrevention.ExcelColumnDesign"(
    	Sheet sheet	
     , 	Workbook wb	
     , 	String objective	) {
    (new excelUtils.DailyFormulaLossPrevention()).ExcelColumnDesign(
        	sheet
         , 	wb
         , 	objective)
}

def static "excelUtils.DailyFormulaLossPrevention.ExcelColumnDesignAllStore"(
    	Sheet sheet	
     , 	Workbook wb	
     , 	String objective	) {
    (new excelUtils.DailyFormulaLossPrevention()).ExcelColumnDesignAllStore(
        	sheet
         , 	wb
         , 	objective)
}

def static "RB_fetchVariablesFromLossPreventionMultipleStores.fetchVariablevaluesFromReportForMultipleStores"() {
    (new RB_fetchVariablesFromLossPreventionMultipleStores()).fetchVariablevaluesFromReportForMultipleStores()
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CashOverShortPercentofSalesTY"(
    	double CashOverShortDollorTY	
     , 	double NetSalesTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CashOverShortPercentofSalesTY(
        	CashOverShortDollorTY
         , 	NetSalesTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionPercentOfSalesTY"(
    	double ItemDeletionDollorTY	
     , 	double NetSalesTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionPercentOfSalesTY(
        	ItemDeletionDollorTY
         , 	NetSalesTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionBeforePercentOfSalesTY"(
    	double ItemDeletionBeforeDollorTY	
     , 	double NetSalesTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionBeforePercentOfSalesTY(
        	ItemDeletionBeforeDollorTY
         , 	NetSalesTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionAfterPercentOfSalesTY"(
    	double ItemDeletionBeforeDollorTY	
     , 	double NetSalesTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionAfterPercentOfSalesTY(
        	ItemDeletionBeforeDollorTY
         , 	NetSalesTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_RefundPercentOfSalesTY"(
    	double RefundDollorTY	
     , 	double NetSalesTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_RefundPercentOfSalesTY(
        	RefundDollorTY
         , 	NetSalesTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CancelledTransactionPercentOfSalesTY"(
    	double CancelledTransactionDollorTY	
     , 	double NetSalesTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CancelledTransactionPercentOfSalesTY(
        	CancelledTransactionDollorTY
         , 	NetSalesTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_VoidTransactionPercentOfSalesTY"(
    	double VoidTransactionDollorTY	
     , 	double NetSalesTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_VoidTransactionPercentOfSalesTY(
        	VoidTransactionDollorTY
         , 	NetSalesTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CashOverShortPercentofSalesLY"(
    	double CashOverShortDollorLY	
     , 	double NetSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CashOverShortPercentofSalesLY(
        	CashOverShortDollorLY
         , 	NetSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionPercentOfSalesLY"(
    	double ItemDeletionDollorLY	
     , 	double NetSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionPercentOfSalesLY(
        	ItemDeletionDollorLY
         , 	NetSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionBeforePercentOfSalesLY"(
    	double ItemDeletionBeforeDollorLY	
     , 	double NetSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionBeforePercentOfSalesLY(
        	ItemDeletionBeforeDollorLY
         , 	NetSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionAfterPercentOfSalesLY"(
    	double ItemDeletionBeforeDollorLY	
     , 	double NetSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionAfterPercentOfSalesLY(
        	ItemDeletionBeforeDollorLY
         , 	NetSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_RefundPercentOfSalesLY"(
    	double RefundDollorLY	
     , 	double NetSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_RefundPercentOfSalesLY(
        	RefundDollorLY
         , 	NetSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CancelledTransactionPercentOfSalesLY"(
    	double CancelledTransactionDollorLY	
     , 	double NetSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CancelledTransactionPercentOfSalesLY(
        	CancelledTransactionDollorLY
         , 	NetSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_VoidTransactionPercentOfSalesLY"(
    	double VoidTransactionDollorLY	
     , 	double NetSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_VoidTransactionPercentOfSalesLY(
        	VoidTransactionDollorLY
         , 	NetSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionCountPercentofTotalTransactionsTY"(
    	double ItemDeletionCountTY	
     , 	double GuestCountTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionCountPercentofTotalTransactionsTY(
        	ItemDeletionCountTY
         , 	GuestCountTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CancelledTransCountPercentofTotalTransactionsTY"(
    	double CancelledTransCountTY	
     , 	double GuestCountTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CancelledTransCountPercentofTotalTransactionsTY(
        	CancelledTransCountTY
         , 	GuestCountTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionBeforeTotalCountPercentofTotalTransactionsTY"(
    	double ItemDeletionBeforeCountTY	
     , 	double GuestCountTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionBeforeTotalCountPercentofTotalTransactionsTY(
        	ItemDeletionBeforeCountTY
         , 	GuestCountTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionAfterTotalCountPercentofTotalTransactionsTY"(
    	double ItemDeletionAfterCountTY	
     , 	double GuestCountTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionAfterTotalCountPercentofTotalTransactionsTY(
        	ItemDeletionAfterCountTY
         , 	GuestCountTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_VoidTransactionCountPercentofTotalTransactionsTY"(
    	double VoidTransactionCountTY	
     , 	double GuestCountTY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_VoidTransactionCountPercentofTotalTransactionsTY(
        	VoidTransactionCountTY
         , 	GuestCountTY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionCountPercentofTotalTransactionsLY"(
    	double ItemDeletionCountLY	
     , 	double GuestCountLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionCountPercentofTotalTransactionsLY(
        	ItemDeletionCountLY
         , 	GuestCountLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CancelledTransCountPercentofTotalTransactionsLY"(
    	double CancelledTransCountLY	
     , 	double GuestCountLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CancelledTransCountPercentofTotalTransactionsLY(
        	CancelledTransCountLY
         , 	GuestCountLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionBeforeTotalCountPercentofTotalTransactionsLY"(
    	double ItemDeletionBeforeCountLY	
     , 	double GuestCountLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionBeforeTotalCountPercentofTotalTransactionsLY(
        	ItemDeletionBeforeCountLY
         , 	GuestCountLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionAfterTotalCountPercentofTotalTransactionsLY"(
    	double ItemDeletionAfterCountLY	
     , 	double GuestCountLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionAfterTotalCountPercentofTotalTransactionsLY(
        	ItemDeletionAfterCountLY
         , 	GuestCountLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_VoidTransactionCountPercentofTotalTransactionsLY"(
    	double VoidTransactionCountLY	
     , 	double GuestCountLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_VoidTransactionCountPercentofTotalTransactionsLY(
        	VoidTransactionCountLY
         , 	GuestCountLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CashOverShortDollorTYvsLY"(
    	double CashOverShortTY	
     , 	double CashOverShortLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CashOverShortDollorTYvsLY(
        	CashOverShortTY
         , 	CashOverShortLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionTYvsLY"(
    	double ItemDeletionTY	
     , 	double ItemDeletionLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionTYvsLY(
        	ItemDeletionTY
         , 	ItemDeletionLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionBeforeTotalTYvsLY"(
    	double ItemDeletionBeforeTotalTY	
     , 	double ItemDeletionBeforeTotalLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionBeforeTotalTYvsLY(
        	ItemDeletionBeforeTotalTY
         , 	ItemDeletionBeforeTotalLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionAfterTotalTYvsLY"(
    	double ItemDeletionAfterTotalTY	
     , 	double ItemDeletionAfterTotalLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionAfterTotalTYvsLY(
        	ItemDeletionAfterTotalTY
         , 	ItemDeletionAfterTotalLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_RefundTYvsLY"(
    	double RefundTY	
     , 	double RefundLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_RefundTYvsLY(
        	RefundTY
         , 	RefundLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CancelledTransactionTYvsLY"(
    	double CancelledTransactionTY	
     , 	double CancelledTransactionLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CancelledTransactionTYvsLY(
        	CancelledTransactionTY
         , 	CancelledTransactionLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_VoidTransactionTYvsLY"(
    	double VoidTransactionTY	
     , 	double VoidTransactionLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_VoidTransactionTYvsLY(
        	VoidTransactionTY
         , 	VoidTransactionLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CashOverShortPercentOfSalesTYvsLY_PP"(
    	double CashOverShortPercentOfSalesTY	
     , 	double CashOverShortPercentOfSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CashOverShortPercentOfSalesTYvsLY_PP(
        	CashOverShortPercentOfSalesTY
         , 	CashOverShortPercentOfSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionPercentOfSalesTYvsLY_PP"(
    	double ItemDeletionPercentOfSalesTY	
     , 	double ItemDeletionPercentOfSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionPercentOfSalesTYvsLY_PP(
        	ItemDeletionPercentOfSalesTY
         , 	ItemDeletionPercentOfSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP"(
    	double ItemDeletionBeforeTotalPercentOfSalesTY	
     , 	double ItemDeletionBeforeTotalPercentOfSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP(
        	ItemDeletionBeforeTotalPercentOfSalesTY
         , 	ItemDeletionBeforeTotalPercentOfSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP"(
    	double ItemDeletionAfterTotalPercentOfSalesTY	
     , 	double ItemDeletionAfterTotalPercentOfSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP(
        	ItemDeletionAfterTotalPercentOfSalesTY
         , 	ItemDeletionAfterTotalPercentOfSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_RefundPercentOfSalesTYvsLY_PP"(
    	double RefundPercentOfSalesTY	
     , 	double RefundPercentOfSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_RefundPercentOfSalesTYvsLY_PP(
        	RefundPercentOfSalesTY
         , 	RefundPercentOfSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CancelledTransactionPercentOfSalesTYvsLY_PP"(
    	double CancelledTransactionPercentOfSalesTY	
     , 	double CancelledTransactionPercentOfSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CancelledTransactionPercentOfSalesTYvsLY_PP(
        	CancelledTransactionPercentOfSalesTY
         , 	CancelledTransactionPercentOfSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_VoidTransactionPercentOfSalesTYvsLY_PP"(
    	double VoidTransactionPercentOfSalesTY	
     , 	double VoidTransactionPercentOfSalesLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_VoidTransactionPercentOfSalesTYvsLY_PP(
        	VoidTransactionPercentOfSalesTY
         , 	VoidTransactionPercentOfSalesLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionCountTyvsLY"(
    	double ItemDeletionCountTY	
     , 	double ItemDeletionCountLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionCountTyvsLY(
        	ItemDeletionCountTY
         , 	ItemDeletionCountLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CancelledTransactionCountTyvsLY"(
    	double CancelledTransactionCountTY	
     , 	double CancelledTransactionCountLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CancelledTransactionCountTyvsLY(
        	CancelledTransactionCountTY
         , 	CancelledTransactionCountLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionBeforeTotalCountTyvsLY"(
    	double ItemDeletionBeforeTotalCountTY	
     , 	double ItemDeletionBeforeTotalCountLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionBeforeTotalCountTyvsLY(
        	ItemDeletionBeforeTotalCountTY
         , 	ItemDeletionBeforeTotalCountLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionAfterTotalCountTyvsLY"(
    	double ItemDeletionAfterTotalCountTY	
     , 	double ItemDeletionAfterTotalCountLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionAfterTotalCountTyvsLY(
        	ItemDeletionAfterTotalCountTY
         , 	ItemDeletionAfterTotalCountLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_VoidTransactionCountTyvsLY"(
    	double VoidTransactionCountTY	
     , 	double VoidTransactionCountLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_VoidTransactionCountTyvsLY(
        	VoidTransactionCountTY
         , 	VoidTransactionCountLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_CancelledTransactionCountPercentOftotalTransactionsTYvsLY_PP"(
    	double CancelledTransactionPercentOftotalTransactionsTY	
     , 	double CancelledTransactionPercentOftotalTransactionsLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_CancelledTransactionCountPercentOftotalTransactionsTYvsLY_PP(
        	CancelledTransactionPercentOftotalTransactionsTY
         , 	CancelledTransactionPercentOftotalTransactionsLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_VoidTransactionCountPercentOftotalTransactionsTYvsLY_PP"(
    	double VoidTransactionPercentOftotalTransactionsTY	
     , 	double VoidTransactionPercentOftotalTransactionsLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_VoidTransactionCountPercentOftotalTransactionsTYvsLY_PP(
        	VoidTransactionPercentOftotalTransactionsTY
         , 	VoidTransactionPercentOftotalTransactionsLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionCountPercentOftotalTransactionsTYvsLY_PP"(
    	double ItemDeletionPercentOftotalTransactionsTY	
     , 	double ItemDeletionPercentOftotalTransactionsLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionCountPercentOftotalTransactionsTYvsLY_PP(
        	ItemDeletionPercentOftotalTransactionsTY
         , 	ItemDeletionPercentOftotalTransactionsLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionBeforeTotalCountPercentOftotalTransactionsTYvsLY_PP"(
    	double ItemDeletionBeforeTotalPercentOftotalTransactionsTY	
     , 	double ItemDeletionBeforeTotalPercentOftotalTransactionsLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionBeforeTotalCountPercentOftotalTransactionsTYvsLY_PP(
        	ItemDeletionBeforeTotalPercentOftotalTransactionsTY
         , 	ItemDeletionBeforeTotalPercentOftotalTransactionsLY)
}

def static "reportbuildercustom.LossPrevention_Formulas.calculate_ItemDeletionAfterTotalCountPercentOftotalTransactionsTYvsLY_PP"(
    	double ItemDeletionAfterTotalPercentOftotalTransactionsTY	
     , 	double ItemDeletionAfterTotalPercentOftotalTransactionsLY	) {
    (new reportbuildercustom.LossPrevention_Formulas()).calculate_ItemDeletionAfterTotalCountPercentOftotalTransactionsTYvsLY_PP(
        	ItemDeletionAfterTotalPercentOftotalTransactionsTY
         , 	ItemDeletionAfterTotalPercentOftotalTransactionsLY)
}

def static "excelUtils.DailyFormula.dailyFormulaCheck"() {
    (new excelUtils.DailyFormula()).dailyFormulaCheck()
}

def static "excelUtils.DailyFormula.ExcelColumnDesign"(
    	Sheet sheet	
     , 	Workbook wb	
     , 	String objective	) {
    (new excelUtils.DailyFormula()).ExcelColumnDesign(
        	sheet
         , 	wb
         , 	objective)
}

def static "excelUtils.DailyFormula.ExcelColumnDesignAllStore"(
    	Sheet sheet	
     , 	Workbook wb	
     , 	String objective	) {
    (new excelUtils.DailyFormula()).ExcelColumnDesignAllStore(
        	sheet
         , 	wb
         , 	objective)
}

def static "reportbuildercustom.GrossSales_Formulas.calculate_GrossSalesvsLYDollor"(
    	double GrossSalesTY	
     , 	double GrossSalesLY	) {
    (new reportbuildercustom.GrossSales_Formulas()).calculate_GrossSalesvsLYDollor(
        	GrossSalesTY
         , 	GrossSalesLY)
}

def static "reportbuildercustom.GrossSales_Formulas.calculate_GrossSalesvsLYPercent"(
    	double GrossSalesTY	
     , 	double GrossSalesLY	) {
    (new reportbuildercustom.GrossSales_Formulas()).calculate_GrossSalesvsLYPercent(
        	GrossSalesTY
         , 	GrossSalesLY)
}

def static "excelUtils.CreateSheet.createExcel"() {
    (new excelUtils.CreateSheet()).createExcel()
}

def static "reportbuildercustom.GuestCount_Formulas.calculate_Guest_LY_Count"(
    	double GuestCountTY	
     , 	double GuestCountLY	) {
    (new reportbuildercustom.GuestCount_Formulas()).calculate_Guest_LY_Count(
        	GuestCountTY
         , 	GuestCountLY)
}

def static "reportbuildercustom.GuestCount_Formulas.calculate_GuestCountvsLY_Percent"(
    	double GuestCountTY	
     , 	double GuestCountLY	) {
    (new reportbuildercustom.GuestCount_Formulas()).calculate_GuestCountvsLY_Percent(
        	GuestCountTY
         , 	GuestCountLY)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCost_Percent"(
    	double ActualLaborCostTY	
     , 	double NetSalesTY	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCost_Percent(
        	ActualLaborCostTY
         , 	NetSalesTY)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCost_LY__Percent"(
    	double ActualLaborCostLY	
     , 	double NetSalesLY	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCost_LY__Percent(
        	ActualLaborCostLY
         , 	NetSalesLY)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCost_Vs_LY__Dollar"(
    	double ActualLaborCostTY	
     , 	double ActualLaborCostLY	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCost_Vs_LY__Dollar(
        	ActualLaborCostTY
         , 	ActualLaborCostLY)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCost_Vs_LY__PP"(
    	double ActualLaborCostTYPercent	
     , 	double ActualLaborCostLYPercent	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCost_Vs_LY__PP(
        	ActualLaborCostTYPercent
         , 	ActualLaborCostLYPercent)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCostLW_Percent"(
    	double ActualLaborCostLW	
     , 	double ActualNetSalesLW	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCostLW_Percent(
        	ActualLaborCostLW
         , 	ActualNetSalesLW)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCost_VS_LW_PP"(
    	double ActualLaborCostTWPercent	
     , 	double ActualLaborCostLWPercent	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCost_VS_LW_PP(
        	ActualLaborCostTWPercent
         , 	ActualLaborCostLWPercent)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCost_VS_LW_Dollar"(
    	double ActualLaborCostTW	
     , 	double ActualLaborCostLW	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCost_VS_LW_Dollar(
        	ActualLaborCostTW
         , 	ActualLaborCostLW)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCostBudget_Percentage"(
    	double LaborCostBudgetBasedOnActualSales_dollar	
     , 	double NetSalesTY	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCostBudget_Percentage(
        	LaborCostBudgetBasedOnActualSales_dollar
         , 	NetSalesTY)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCostBudgetBasedOnActualSales_dollar"(
    	double ActualSalesTY	
     , 	double LaborCostBudgetPercent	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCostBudgetBasedOnActualSales_dollar(
        	ActualSalesTY
         , 	LaborCostBudgetPercent)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCostBudgetBasedOnBudgetedSales_dollar"(
    	double BudgetedSalesTY	
     , 	double LaborCostBudgetPercent	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCostBudgetBasedOnBudgetedSales_dollar(
        	BudgetedSalesTY
         , 	LaborCostBudgetPercent)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCostVsBudget_PP"(
    	double LaborCostPercent	
     , 	double LaborCostBudgetPercent	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCostVsBudget_PP(
        	LaborCostPercent
         , 	LaborCostBudgetPercent)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCostVsBudgetForActualSales_Dollar"(
    	double LaborCostDollar	
     , 	double LaborCostBudgetForActualSales	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCostVsBudgetForActualSales_Dollar(
        	LaborCostDollar
         , 	LaborCostBudgetForActualSales)
}

def static "reportbuildercustom.Labor_Formulas.calculate_LaborCostVsBudgetForBudgetSales_Dollar"(
    	double LaborCostDollar	
     , 	double LaborCostBudgetForBudgetSales	) {
    (new reportbuildercustom.Labor_Formulas()).calculate_LaborCostVsBudgetForBudgetSales_Dollar(
        	LaborCostDollar
         , 	LaborCostBudgetForBudgetSales)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createWorkbook(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook"(
    	String filePath	
     , 	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).saveWorkbook(
        	filePath
         , 	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelFile"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelFile(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getSheetNames"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getSheetNames(
        	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getWorkbook(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex"(
    	Sheet sheet	
     , 	int rowIndex	
     , 	int colIndex	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByIndex(
        	sheet
         , 	rowIndex
         , 	colIndex
         , 	value)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddress(
        	sheet
         , 	cellAddress
         , 	value)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddresses"(
    	Sheet sheet	
     , 	Map content	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddresses(
        	sheet
         , 	content)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheetByName"(
    	String filePath	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheetByName(
        	filePath
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheets"(
    	Workbook workbook	
     , 	java.util.List<String> sheetNames	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheets(
        	workbook
         , 	sheetNames)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValuesByRangeIndexes"(
    	Sheet sheet	
     , 	int rowInd1	
     , 	int colInd1	
     , 	int rowInd2	
     , 	int colInd2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValuesByRangeIndexes(
        	sheet
         , 	rowInd1
         , 	colInd1
         , 	rowInd2
         , 	colInd2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getMapOfKeyValueRows"(
    	Sheet sheet	
     , 	int keyRowIdx	
     , 	int valueRowIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getMapOfKeyValueRows(
        	sheet
         , 	keyRowIdx
         , 	valueRowIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellIndexByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellIndexByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getRowIndexByCellContent"(
    	Sheet sheet	
     , 	String cellContent	
     , 	int columnIdxForCell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getRowIndexByCellContent(
        	sheet
         , 	cellContent
         , 	columnIdxForCell)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByRangeAddress"(
    	Sheet sheet	
     , 	String topLeftAddress	
     , 	String rightBottomAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByRangeAddress(
        	sheet
         , 	topLeftAddress
         , 	rightBottomAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getColumnsByIndex"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> columnIndexes	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getColumnsByIndex(
        	sheet
         , 	columnIndexes)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	
     , 	int sheetIndex	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath
         , 	sheetIndex)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.locateCell"(
    	Sheet sheet	
     , 	Object cellContent	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).locateCell(
        	sheet
         , 	cellContent)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getTableContent"(
    	Sheet sheet	
     , 	int startRow	
     , 	int endRow	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getTableContent(
        	sheet
         , 	startRow
         , 	endRow)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getDataRows"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> rowIndexs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getDataRows(
        	sheet
         , 	rowIndexs)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValue"(
    	Cell cell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValue(
        	cell)
}

def static "reportbuildercustom.AvgCheck_Formulas.calculate_AvgCheckTYDollar"(
    	double NetSalesTY	
     , 	double GuestCountTY	) {
    (new reportbuildercustom.AvgCheck_Formulas()).calculate_AvgCheckTYDollar(
        	NetSalesTY
         , 	GuestCountTY)
}

def static "reportbuildercustom.AvgCheck_Formulas.calculate_AvgCheckLYDollar"(
    	double NetSalesLY	
     , 	double GuestCountLY	) {
    (new reportbuildercustom.AvgCheck_Formulas()).calculate_AvgCheckLYDollar(
        	NetSalesLY
         , 	GuestCountLY)
}

def static "reportbuildercustom.AvgCheck_Formulas.calculate_AvgCheck_Vs_LY_Count_Dollar"(
    	double AvgTicketTY	
     , 	double AvgTicketLY	) {
    (new reportbuildercustom.AvgCheck_Formulas()).calculate_AvgCheck_Vs_LY_Count_Dollar(
        	AvgTicketTY
         , 	AvgTicketLY)
}

def static "reportbuildercustom.AvgCheck_Formulas.calculate_AvgCheck_Vs_LY_Count_Percent"(
    	double AvgTicketTY	
     , 	double AvgTicketLY	) {
    (new reportbuildercustom.AvgCheck_Formulas()).calculate_AvgCheck_Vs_LY_Count_Percent(
        	AvgTicketTY
         , 	AvgTicketLY)
}

def static "reportbuildercustom.LaborHours_Formulas.calculate_TotalHoursvsLY"(
    	double TotalHoursTY	
     , 	double TotalHoursLY	) {
    (new reportbuildercustom.LaborHours_Formulas()).calculate_TotalHoursvsLY(
        	TotalHoursTY
         , 	TotalHoursLY)
}

def static "reportbuildercustom.LaborHours_Formulas.calculate_OTHoursvsLY"(
    	double OTHoursTY	
     , 	double OTHoursLY	) {
    (new reportbuildercustom.LaborHours_Formulas()).calculate_OTHoursvsLY(
        	OTHoursTY
         , 	OTHoursLY)
}

def static "reportbuildercustom.RB_BaseFunctions.getWeekEndDateOfFirstWeek"() {
    (new reportbuildercustom.RB_BaseFunctions()).getWeekEndDateOfFirstWeek()
}

def static "reportbuildercustom.RB_BaseFunctions.getWeekEndDateOfLastWeek"() {
    (new reportbuildercustom.RB_BaseFunctions()).getWeekEndDateOfLastWeek()
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCashOverShortPercentofSalesTYValues"(
    	double CashOverShortPercentofSalesTYReport	
     , 	double CashOverShortPercentofSalesTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCashOverShortPercentofSalesTYValues(
        	CashOverShortPercentofSalesTYReport
         , 	CashOverShortPercentofSalesTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionPercentofSalesTYValues"(
    	double ItemDeletionPercentofSalesTYReport	
     , 	double ItemDeletionPercentofSalesTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionPercentofSalesTYValues(
        	ItemDeletionPercentofSalesTYReport
         , 	ItemDeletionPercentofSalesTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionBeforePercentofSalesTYValues"(
    	double ItemDeletionBeforePercentofSalesTYReport	
     , 	double ItemDeletionBeforePercentofSalesTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionBeforePercentofSalesTYValues(
        	ItemDeletionBeforePercentofSalesTYReport
         , 	ItemDeletionBeforePercentofSalesTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionAfterPercentofSalesTYValues"(
    	double ItemDeletionAfterPercentofSalesTYReport	
     , 	double ItemDeletionAfterPercentofSalesTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionAfterPercentofSalesTYValues(
        	ItemDeletionAfterPercentofSalesTYReport
         , 	ItemDeletionAfterPercentofSalesTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyRefundPercentofSalesTYValues"(
    	double RefundPercentofSalesTYReport	
     , 	double RefundPercentofSalesTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyRefundPercentofSalesTYValues(
        	RefundPercentofSalesTYReport
         , 	RefundPercentofSalesTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCancelledTransactionPercentofSalesTYValues"(
    	double CancelledTransactionPercentofSalesTYReport	
     , 	double CancelledTransactionPercentofSalesTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCancelledTransactionPercentofSalesTYValues(
        	CancelledTransactionPercentofSalesTYReport
         , 	CancelledTransactionPercentofSalesTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyVoidTransactionPercentofSalesTYValues"(
    	double VoidTransactionPercentofSalesTYReport	
     , 	double VoidTransactionPercentofSalesTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyVoidTransactionPercentofSalesTYValues(
        	VoidTransactionPercentofSalesTYReport
         , 	VoidTransactionPercentofSalesTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCashOverShortPercentofSalesLYValues"(
    	double CashOverShortPercentofSalesLYReport	
     , 	double CashOverShortPercentofSalesLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCashOverShortPercentofSalesLYValues(
        	CashOverShortPercentofSalesLYReport
         , 	CashOverShortPercentofSalesLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionPercentofSalesLYValues"(
    	double ItemDeletionPercentofSalesLYReport	
     , 	double ItemDeletionPercentofSalesLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionPercentofSalesLYValues(
        	ItemDeletionPercentofSalesLYReport
         , 	ItemDeletionPercentofSalesLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionBeforePercentofSalesLYValues"(
    	double ItemDeletionBeforePercentofSalesLYReport	
     , 	double ItemDeletionBeforePercentofSalesLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionBeforePercentofSalesLYValues(
        	ItemDeletionBeforePercentofSalesLYReport
         , 	ItemDeletionBeforePercentofSalesLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyRefundPercentofSalesLYValues"(
    	double RefundPercentofSalesLYReport	
     , 	double RefundPercentofSalesLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyRefundPercentofSalesLYValues(
        	RefundPercentofSalesLYReport
         , 	RefundPercentofSalesLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCancelledTransactionPercentofSalesLYValues"(
    	double CancelledTransactionPercentofSalesLYReport	
     , 	double CancelledTransactionPercentofSalesLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCancelledTransactionPercentofSalesLYValues(
        	CancelledTransactionPercentofSalesLYReport
         , 	CancelledTransactionPercentofSalesLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyVoidTransactionPercentofSalesLYValues"(
    	double VoidTransactionPercentofSalesLYReport	
     , 	double VoidTransactionPercentofSalesLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyVoidTransactionPercentofSalesLYValues(
        	VoidTransactionPercentofSalesLYReport
         , 	VoidTransactionPercentofSalesLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionAfterPercentofSalesLYValues"(
    	double ItemDeletionAfterPercentofSalesLYReport	
     , 	double ItemDeletionAfterPercentofSalesLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionAfterPercentofSalesLYValues(
        	ItemDeletionAfterPercentofSalesLYReport
         , 	ItemDeletionAfterPercentofSalesLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionCountPercentofTotalTransactionsTYValues"(
    	double ItemDeletionCountPercentofTotalTransactionsTYReport	
     , 	double ItemDeletionCountPercentofTotalTransactionsTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionCountPercentofTotalTransactionsTYValues(
        	ItemDeletionCountPercentofTotalTransactionsTYReport
         , 	ItemDeletionCountPercentofTotalTransactionsTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCancelTransactionCountPercentofTotalTransactionsTYValues"(
    	double CancelTransactionCountPercentofTotalTransactionsTYReport	
     , 	double CancelTransactionCountPercentofTotalTransactionsTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCancelTransactionCountPercentofTotalTransactionsTYValues(
        	CancelTransactionCountPercentofTotalTransactionsTYReport
         , 	CancelTransactionCountPercentofTotalTransactionsTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionBeforeCountPercentofTotalTransactionsTYValues"(
    	double ItemDeletionBeforeCountPercentofTotalTransactionsTYReport	
     , 	double ItemDeletionBeforeCountPercentofTotalTransactionsTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionBeforeCountPercentofTotalTransactionsTYValues(
        	ItemDeletionBeforeCountPercentofTotalTransactionsTYReport
         , 	ItemDeletionBeforeCountPercentofTotalTransactionsTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionAfterCountPercentofTotalTransactionsTYValues"(
    	double ItemDeletionAfterCountPercentofTotalTransactionsTYReport	
     , 	double ItemDeletionAfterCountPercentofTotalTransactionsTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionAfterCountPercentofTotalTransactionsTYValues(
        	ItemDeletionAfterCountPercentofTotalTransactionsTYReport
         , 	ItemDeletionAfterCountPercentofTotalTransactionsTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyVoidTransactionCountPercentofTotalTransactionsTYValues"(
    	double VoidTransactionCountPercentofTotalTransactionsTYReport	
     , 	double VoidTransactionCountPercentofTotalTransactionsTY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyVoidTransactionCountPercentofTotalTransactionsTYValues(
        	VoidTransactionCountPercentofTotalTransactionsTYReport
         , 	VoidTransactionCountPercentofTotalTransactionsTY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionCountPercentofTotalTransactionsLYValues"(
    	double ItemDeletionCountPercentofTotalTransactionsLYReport	
     , 	double ItemDeletionCountPercentofTotalTransactionsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionCountPercentofTotalTransactionsLYValues(
        	ItemDeletionCountPercentofTotalTransactionsLYReport
         , 	ItemDeletionCountPercentofTotalTransactionsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCancelTransactionCountPercentofTotalTransactionsLYValues"(
    	double CancelTransactionCountPercentofTotalTransactionsLYReport	
     , 	double CancelTransactionCountPercentofTotalTransactionsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCancelTransactionCountPercentofTotalTransactionsLYValues(
        	CancelTransactionCountPercentofTotalTransactionsLYReport
         , 	CancelTransactionCountPercentofTotalTransactionsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionBeforeCountPercentofTotalTransactionsLYValues"(
    	double ItemDeletionBeforeCountPercentofTotalTransactionsLYReport	
     , 	double ItemDeletionBeforeCountPercentofTotalTransactionsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionBeforeCountPercentofTotalTransactionsLYValues(
        	ItemDeletionBeforeCountPercentofTotalTransactionsLYReport
         , 	ItemDeletionBeforeCountPercentofTotalTransactionsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionAfterCountPercentofTotalTransactionsLYValues"(
    	double ItemDeletionAfterCountPercentofTotalTransactionsLYReport	
     , 	double ItemDeletionAfterCountPercentofTotalTransactionsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionAfterCountPercentofTotalTransactionsLYValues(
        	ItemDeletionAfterCountPercentofTotalTransactionsLYReport
         , 	ItemDeletionAfterCountPercentofTotalTransactionsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyVoidTransactionCountPercentofTotalTransactionsLYValues"(
    	double VoidTransactionCountPercentofTotalTransactionsLYReport	
     , 	double VoidTransactionCountPercentofTotalTransactionsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyVoidTransactionCountPercentofTotalTransactionsLYValues(
        	VoidTransactionCountPercentofTotalTransactionsLYReport
         , 	VoidTransactionCountPercentofTotalTransactionsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCashOverShortPercentTYvsLYValues"(
    	double CashOverShortPercentTYvsLYReport	
     , 	double CashOverShortPercentTYvsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCashOverShortPercentTYvsLYValues(
        	CashOverShortPercentTYvsLYReport
         , 	CashOverShortPercentTYvsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionDollorTYvsLYValues"(
    	double ItemDeletionDollorTYvsLYReport	
     , 	double ItemDeletionDollorTYvsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionDollorTYvsLYValues(
        	ItemDeletionDollorTYvsLYReport
         , 	ItemDeletionDollorTYvsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionBeforeTotalDollorTYvsLYValues"(
    	double ItemDeletionBeforeTotalDollorTYvsLYReport	
     , 	double ItemDeletionBeforeTotalDollorTYvsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionBeforeTotalDollorTYvsLYValues(
        	ItemDeletionBeforeTotalDollorTYvsLYReport
         , 	ItemDeletionBeforeTotalDollorTYvsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionAfterTotalDollorTYvsLYValues"(
    	double ItemDeletionAfterTotalDollorTYvsLYReport	
     , 	double ItemDeletionAfterTotalDollorTYvsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionAfterTotalDollorTYvsLYValues(
        	ItemDeletionAfterTotalDollorTYvsLYReport
         , 	ItemDeletionAfterTotalDollorTYvsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyRefundDollorValues"(
    	double RefundDollorReport	
     , 	double RefundDollor	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyRefundDollorValues(
        	RefundDollorReport
         , 	RefundDollor
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCancelledTransactionsValues"(
    	double CancelledTransactionsReport	
     , 	double CancelledTransactions	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCancelledTransactionsValues(
        	CancelledTransactionsReport
         , 	CancelledTransactions
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyVoidTransactionsValues"(
    	double VoidTransactionsReport	
     , 	double VoidTransactions	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyVoidTransactionsValues(
        	VoidTransactionsReport
         , 	VoidTransactions
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCashOverShortPercentOfSalesTYvsLY_PPValues"(
    	double CashOverShortPercentOfSalesTYvsLY_PPReport	
     , 	double CashOverShortPercentOfSalesTYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCashOverShortPercentOfSalesTYvsLY_PPValues(
        	CashOverShortPercentOfSalesTYvsLY_PPReport
         , 	CashOverShortPercentOfSalesTYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionPercentOfSalesTYvsLY_PPValues"(
    	double ItemDeletionPercentOfSalesTYvsLY_PPReport	
     , 	double ItemDeletionPercentOfSalesTYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionPercentOfSalesTYvsLY_PPValues(
        	ItemDeletionPercentOfSalesTYvsLY_PPReport
         , 	ItemDeletionPercentOfSalesTYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPValues"(
    	double ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport	
     , 	double ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPValues(
        	ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport
         , 	ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionAfterTotalPercentOfSalesTYvsLY_PPValues"(
    	double ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport	
     , 	double ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionAfterTotalPercentOfSalesTYvsLY_PPValues(
        	ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport
         , 	ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyRefundPercentOfSalesTYvsLY_PPValues"(
    	double RefundPercentOfSalesTYvsLY_PPReport	
     , 	double RefundPercentOfSalesTYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyRefundPercentOfSalesTYvsLY_PPValues(
        	RefundPercentOfSalesTYvsLY_PPReport
         , 	RefundPercentOfSalesTYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCancelledTransactionPercentOfSalesTYvsLY_PPValues"(
    	double CancelledTransactionPercentOfSalesTYvsLY_PPReport	
     , 	double CancelledTransactionPercentOfSalesTYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCancelledTransactionPercentOfSalesTYvsLY_PPValues(
        	CancelledTransactionPercentOfSalesTYvsLY_PPReport
         , 	CancelledTransactionPercentOfSalesTYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyVoidTransactionsPercentOfSalesTYvsLY_PPValues"(
    	double VoidTransactionsPercentOfSalesTYvsLY_PPReport	
     , 	double VoidTransactionsPercentOfSalesTYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyVoidTransactionsPercentOfSalesTYvsLY_PPValues(
        	VoidTransactionsPercentOfSalesTYvsLY_PPReport
         , 	VoidTransactionsPercentOfSalesTYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionCountTYvsLYValues"(
    	double ItemDeletionCountTYvsLYReport	
     , 	double ItemDeletionCountTYvsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionCountTYvsLYValues(
        	ItemDeletionCountTYvsLYReport
         , 	ItemDeletionCountTYvsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCancelledTransactionCountTYvsLYValues"(
    	double CancelledTransactionCountTYvsLYReport	
     , 	double CancelledTransactionCountTYvsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCancelledTransactionCountTYvsLYValues(
        	CancelledTransactionCountTYvsLYReport
         , 	CancelledTransactionCountTYvsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionBeforeTotalCountTYvsLYValues"(
    	double ItemDeletionBeforeTotalCountTYvsLYReport	
     , 	double ItemDeletionBeforeTotalCountTYvsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionBeforeTotalCountTYvsLYValues(
        	ItemDeletionBeforeTotalCountTYvsLYReport
         , 	ItemDeletionBeforeTotalCountTYvsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionAfterTotalCountTYvsLYValues"(
    	double ItemDeletionAfterTotalCountTYvsLYReport	
     , 	double ItemDeletionAfterTotalCountTYvsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionAfterTotalCountTYvsLYValues(
        	ItemDeletionAfterTotalCountTYvsLYReport
         , 	ItemDeletionAfterTotalCountTYvsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyVoidTransactionsCountTYvsLYValues"(
    	double VoidTransactionsCountTYvsLYReport	
     , 	double VoidTransactionsCountTYvsLY	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyVoidTransactionsCountTYvsLYValues(
        	VoidTransactionsCountTYvsLYReport
         , 	VoidTransactionsCountTYvsLY
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionCountPercentOfTotalTransactionsYvsLY_PPValues"(
    	double ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport	
     , 	double ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionCountPercentOfTotalTransactionsYvsLY_PPValues(
        	ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport
         , 	ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyCancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPValues"(
    	double CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport	
     , 	double CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyCancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPValues(
        	CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport
         , 	CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPValues"(
    	double ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport	
     , 	double ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPValues(
        	ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport
         , 	ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPValues"(
    	double ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport	
     , 	double ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPValues(
        	ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport
         , 	ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP
         , 	store)
}

def static "compareColumnsValues.LossPreventionValuesCompare.toVerifyVoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPValues"(
    	double VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport	
     , 	double VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP	
     , 	String store	) {
    (new compareColumnsValues.LossPreventionValuesCompare()).toVerifyVoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPValues(
        	VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport
         , 	VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP
         , 	store)
}

def static "reportbuildercustom.EmailUtils.doSendEmail"() {
    (new reportbuildercustom.EmailUtils()).doSendEmail()
}

def static "excelUtils.WriteExcel.writeExcel"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcel()).writeExcel(
        	dataToWrite)
}

def static "excelUtils.WriteExcel.writeExcelForPass"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcel()).writeExcelForPass(
        	dataToWrite)
}

def static "RB_FetchValues.fetchVariablevaluesFromReport"() {
    (new RB_FetchValues()).fetchVariablevaluesFromReport()
}

def static "excelUtils.WriteExcelDailyFormula.writeExcelDailyFormulaCheck"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcelDailyFormula()).writeExcelDailyFormulaCheck(
        	dataToWrite)
}

def static "excelUtils.WriteExcelDailyFormula.writeExcelPassFormulaCheck"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcelDailyFormula()).writeExcelPassFormulaCheck(
        	dataToWrite)
}

def static "excelUtils.WriteExcelDailyFormula.writeExcelAllStorePass"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcelDailyFormula()).writeExcelAllStorePass(
        	dataToWrite)
}

def static "excelUtils.WriteExcelDailyFormula.writeExcelAllStoreFail"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcelDailyFormula()).writeExcelAllStoreFail(
        	dataToWrite)
}

def static "excelUtils.WriteExcelDailyFormula.writeRawValues"(
    	String[] dataToWrite	) {
    (new excelUtils.WriteExcelDailyFormula()).writeRawValues(
        	dataToWrite)
}

def static "compareColumnsValues.GuestCountValuesCompare.toVerifyGuestVsLYCountColumnsValues"(
    	double GuestCountVsLYCountt	
     , 	double GuestvsLYCount	
     , 	String store	) {
    (new compareColumnsValues.GuestCountValuesCompare()).toVerifyGuestVsLYCountColumnsValues(
        	GuestCountVsLYCountt
         , 	GuestvsLYCount
         , 	store)
}

def static "compareColumnsValues.GuestCountValuesCompare.toVerifyGuestVsLYPercentCountColumnsValues"(
    	double GuestCountVsLYPercent	
     , 	double GuestvsLYCountPercent	
     , 	String store	) {
    (new compareColumnsValues.GuestCountValuesCompare()).toVerifyGuestVsLYPercentCountColumnsValues(
        	GuestCountVsLYPercent
         , 	GuestvsLYCountPercent
         , 	store)
}

def static "compareColumnsValues.GrossSalesValuesCompare.toVerifyGrossSalesvsLYDollorReportColumnsValues"(
    	double GrossSalesvsLYDollorReport1	
     , 	double GrossSalesvsLYDollorReport	
     , 	String store	) {
    (new compareColumnsValues.GrossSalesValuesCompare()).toVerifyGrossSalesvsLYDollorReportColumnsValues(
        	GrossSalesvsLYDollorReport1
         , 	GrossSalesvsLYDollorReport
         , 	store)
}

def static "compareColumnsValues.GrossSalesValuesCompare.toVerifyGrossSalesvsLYPercentReportColumnsValues"(
    	double GrossSalesvsLYPercentReport1	
     , 	double GrossSalesvsLYPercentReport	
     , 	String store	) {
    (new compareColumnsValues.GrossSalesValuesCompare()).toVerifyGrossSalesvsLYPercentReportColumnsValues(
        	GrossSalesvsLYPercentReport1
         , 	GrossSalesvsLYPercentReport
         , 	store)
}

def static "reportbuildercustom.NetSales_Formulas.calculate_NetSalesVsLastYear_Dollar"(
    	double ActualSalesTY	
     , 	double ActualSalesLY	) {
    (new reportbuildercustom.NetSales_Formulas()).calculate_NetSalesVsLastYear_Dollar(
        	ActualSalesTY
         , 	ActualSalesLY)
}

def static "reportbuildercustom.NetSales_Formulas.calculate_NetSalesVsLastYear_Percent"(
    	double ActualSalesTY	
     , 	double ActualSalesLY	) {
    (new reportbuildercustom.NetSales_Formulas()).calculate_NetSalesVsLastYear_Percent(
        	ActualSalesTY
         , 	ActualSalesLY)
}

def static "reportbuildercustom.NetSales_Formulas.calculate_NetSalesBudget_Dollor"(
    	double SalesBudgetPercent	
     , 	double NetSalesLY	) {
    (new reportbuildercustom.NetSales_Formulas()).calculate_NetSalesBudget_Dollor(
        	SalesBudgetPercent
         , 	NetSalesLY)
}

def static "reportbuildercustom.NetSales_Formulas.calculate_NetSalesBudgetPercent"(
    	double SalesBudget	
     , 	double NetSalesLY	) {
    (new reportbuildercustom.NetSales_Formulas()).calculate_NetSalesBudgetPercent(
        	SalesBudget
         , 	NetSalesLY)
}

def static "reportbuildercustom.NetSales_Formulas.calculate_SalesVsBudget"(
    	double SalesBudgetTY	
     , 	double ActualSalesTY	) {
    (new reportbuildercustom.NetSales_Formulas()).calculate_SalesVsBudget(
        	SalesBudgetTY
         , 	ActualSalesTY)
}

def static "reportbuildercustom.NetSales_Formulas.calculate_SalesVsBudgetPercent"(
    	double SalesBudgetTY	
     , 	double ActualSalesTY	) {
    (new reportbuildercustom.NetSales_Formulas()).calculate_SalesVsBudgetPercent(
        	SalesBudgetTY
         , 	ActualSalesTY)
}

def static "RB_FetchValuesForLossPreventionOneStore.fetchVariablevaluesFromReport"() {
    (new RB_FetchValuesForLossPreventionOneStore()).fetchVariablevaluesFromReport()
}

def static "RB_MatchAndMapAllVariableValues.toMapAndMatchValuesWithReport"(
    	Object formulaValues	) {
    (new RB_MatchAndMapAllVariableValues()).toMapAndMatchValuesWithReport(
        	formulaValues)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.NetSalesValuesCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).NetSalesValuesCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.NetSalesLastYearValuesCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).NetSalesLastYearValuesCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.NetSalesBudgetValuesCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).NetSalesBudgetValuesCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.GuestCountCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).GuestCountCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.GuestCountLastyearCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).GuestCountLastyearCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.AverageCheckCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).AverageCheckCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.AverageCheckLastYearCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).AverageCheckLastYearCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.LaborCostTYCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).LaborCostTYCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.LaborCostLYCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).LaborCostLYCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.COGSCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).COGSCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.COGSLastyearCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).COGSLastyearCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.COGSBudgetrCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).COGSBudgetrCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.PrimeCostBudgetrCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).PrimeCostBudgetrCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.PrimeCostTYCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).PrimeCostTYCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.PrimeCostLYCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).PrimeCostLYCompareWithCalender(
        	map1
         , 	map2)
}

def static "reportbuildercustom.RB_ValueCompareWithCalendar.LaborCostBudgetDollorCompareWithCalender"(
    	Map map1	
     , 	Map map2	) {
    (new reportbuildercustom.RB_ValueCompareWithCalendar()).LaborCostBudgetDollorCompareWithCalender(
        	map1
         , 	map2)
}

def static "RB_fetchVariablesFromReportForMultipleStores.fetchVariablevaluesFromReportForMultipleStores"() {
    (new RB_fetchVariablesFromReportForMultipleStores()).fetchVariablevaluesFromReportForMultipleStores()
}

def static "compareColumnsValues.NetSalesValuesCompare.toVerifyNetSalesVsLyDollarColumnsValues"(
    	double NetSalesVSLY	
     , 	double NetSalesvsLY$	
     , 	String store	) {
    (new compareColumnsValues.NetSalesValuesCompare()).toVerifyNetSalesVsLyDollarColumnsValues(
        	NetSalesVSLY
         , 	NetSalesvsLY$
         , 	store)
}

def static "compareColumnsValues.NetSalesValuesCompare.toVerifyNetSalesVsLYPercentColumnValues"(
    	double NetSalesVSLYPercent	
     , 	double NetSalesvsLYPercent	
     , 	String store	) {
    (new compareColumnsValues.NetSalesValuesCompare()).toVerifyNetSalesVsLYPercentColumnValues(
        	NetSalesVSLYPercent
         , 	NetSalesvsLYPercent
         , 	store)
}

def static "compareColumnsValues.NetSalesValuesCompare.toVerifySalesBudgetDollorColumnValues"(
    	double NetSalesBudgetDollars	
     , 	double SalesBudgetedDollor	
     , 	String store	) {
    (new compareColumnsValues.NetSalesValuesCompare()).toVerifySalesBudgetDollorColumnValues(
        	NetSalesBudgetDollars
         , 	SalesBudgetedDollor
         , 	store)
}

def static "compareColumnsValues.NetSalesValuesCompare.toVerifySalesBudgetPercentColumnValues"(
    	double NetSalesBudgetPercent	
     , 	double SalesBudgetPercent	
     , 	String store	) {
    (new compareColumnsValues.NetSalesValuesCompare()).toVerifySalesBudgetPercentColumnValues(
        	NetSalesBudgetPercent
         , 	SalesBudgetPercent
         , 	store)
}

def static "compareColumnsValues.NetSalesValuesCompare.toVerifySalesvsBudgetDollarsColumnValues"(
    	double SalesVSBudgetDollar	
     , 	double SalesvsBudgetDollar	
     , 	String store	) {
    (new compareColumnsValues.NetSalesValuesCompare()).toVerifySalesvsBudgetDollarsColumnValues(
        	SalesVSBudgetDollar
         , 	SalesvsBudgetDollar
         , 	store)
}

def static "compareColumnsValues.NetSalesValuesCompare.toVerifySalesvsBudgetPercentColumnValues"(
    	double SalesVSBudgetPercent	
     , 	double SalesvsBudgetPercent	
     , 	String store	) {
    (new compareColumnsValues.NetSalesValuesCompare()).toVerifySalesvsBudgetPercentColumnValues(
        	SalesVSBudgetPercent
         , 	SalesvsBudgetPercent
         , 	store)
}

def static "compareColumnsValues.AvgTicketValuesCompare.toVerifyAvgCheckvsLYDollarColumnsValues"(
    	double AvgCheckVsLY	
     , 	double AvgCheckvsLY$	
     , 	String store	) {
    (new compareColumnsValues.AvgTicketValuesCompare()).toVerifyAvgCheckvsLYDollarColumnsValues(
        	AvgCheckVsLY
         , 	AvgCheckvsLY$
         , 	store)
}

def static "compareColumnsValues.AvgTicketValuesCompare.toVerifyAvgCheckvsLYPercentColumnsValues"(
    	double AvgCheckVsLYPercent	
     , 	double AvgCheckvsLYPercent	
     , 	String store	) {
    (new compareColumnsValues.AvgTicketValuesCompare()).toVerifyAvgCheckvsLYPercentColumnsValues(
        	AvgCheckVsLYPercent
         , 	AvgCheckvsLYPercent
         , 	store)
}

def static "compareColumnsValues.AvgTicketValuesCompare.toVerifyAvgCheckTYDollorValues"(
    	double AvgCheckTY	
     , 	double AvgCheckTY$	
     , 	String store	) {
    (new compareColumnsValues.AvgTicketValuesCompare()).toVerifyAvgCheckTYDollorValues(
        	AvgCheckTY
         , 	AvgCheckTY$
         , 	store)
}

def static "compareColumnsValues.AvgTicketValuesCompare.toVerifyAvgCheckLYDollorValues"(
    	double AvgCheckLY	
     , 	double AvgCheckLY$	
     , 	String store	) {
    (new compareColumnsValues.AvgTicketValuesCompare()).toVerifyAvgCheckLYDollorValues(
        	AvgCheckLY
         , 	AvgCheckLY$
         , 	store)
}

def static "reportbuildercustom.RB_Keywords.refreshBrowser"() {
    (new reportbuildercustom.RB_Keywords()).refreshBrowser()
}

def static "reportbuildercustom.RB_Keywords.clickElement"(
    	TestObject to	) {
    (new reportbuildercustom.RB_Keywords()).clickElement(
        	to)
}

def static "reportbuildercustom.RB_Keywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new reportbuildercustom.RB_Keywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "reportbuildercustom.RB_Keywords.verifyAddedColumn"(
    	String ColumnName	) {
    (new reportbuildercustom.RB_Keywords()).verifyAddedColumn(
        	ColumnName)
}

def static "reportbuildercustom.RB_Keywords.clickOnReportCategory"(
    	String ColumnName	) {
    (new reportbuildercustom.RB_Keywords()).clickOnReportCategory(
        	ColumnName)
}

def static "reportbuildercustom.RB_Keywords.clickAndVerifyCreatedReport"(
    	String ColumnName	) {
    (new reportbuildercustom.RB_Keywords()).clickAndVerifyCreatedReport(
        	ColumnName)
}

def static "reportbuildercustom.RB_Keywords.verifyTotalAddedColumns"() {
    (new reportbuildercustom.RB_Keywords()).verifyTotalAddedColumns()
}

def static "reportbuildercustom.RB_Keywords.dateFormat"(
    	String para	) {
    (new reportbuildercustom.RB_Keywords()).dateFormat(
        	para)
}

def static "reportbuildercustom.RB_Keywords.verifyStartDateOnReport"(
    	String Date	) {
    (new reportbuildercustom.RB_Keywords()).verifyStartDateOnReport(
        	Date)
}

def static "reportbuildercustom.RB_Keywords.verifyEndDateOnReport"(
    	String Date	) {
    (new reportbuildercustom.RB_Keywords()).verifyEndDateOnReport(
        	Date)
}

def static "reportbuildercustom.RB_Keywords.verifyStartWeekDateOnReport"(
    	String StartWeekDate	) {
    (new reportbuildercustom.RB_Keywords()).verifyStartWeekDateOnReport(
        	StartWeekDate)
}

def static "reportbuildercustom.RB_Keywords.verifyEndWeekDateOnReport"(
    	String EndWeekDate	) {
    (new reportbuildercustom.RB_Keywords()).verifyEndWeekDateOnReport(
        	EndWeekDate)
}

def static "reportbuildercustom.RB_Keywords.givenTwoDates"(
    	String Date1	
     , 	String Date2	) {
    (new reportbuildercustom.RB_Keywords()).givenTwoDates(
        	Date1
         , 	Date2)
}

def static "reportbuildercustom.RB_Keywords.removeCurrencyFormat"(
    	String CurrencyValue	) {
    (new reportbuildercustom.RB_Keywords()).removeCurrencyFormat(
        	CurrencyValue)
}

def static "reportbuildercustom.RB_Keywords.setNumberFormat"(
    	String CurrencyValue	) {
    (new reportbuildercustom.RB_Keywords()).setNumberFormat(
        	CurrencyValue)
}

def static "reportbuildercustom.RB_Keywords.getRoundNumber"(
    	String CurrencyValue	) {
    (new reportbuildercustom.RB_Keywords()).getRoundNumber(
        	CurrencyValue)
}

def static "reportbuildercustom.RB_Keywords.noOfWeeksBasedOnDate"() {
    (new reportbuildercustom.RB_Keywords()).noOfWeeksBasedOnDate()
}

def static "excelUtils.ExcelsCustom.createCell"(
    	Workbook wb	
     , 	Row row	
     , 	int column	
     , 	String Date	
     , 	Sheet sheet	) {
    (new excelUtils.ExcelsCustom()).createCell(
        	wb
         , 	row
         , 	column
         , 	Date
         , 	sheet)
}

def static "excelUtils.ExcelsCustom.createDataCell"(
    	Workbook wb	
     , 	Row row	
     , 	int column	
     , 	String Date	
     , 	Sheet sheet	) {
    (new excelUtils.ExcelsCustom()).createDataCell(
        	wb
         , 	row
         , 	column
         , 	Date
         , 	sheet)
}

def static "excelUtils.ExcelsCustom.deleteCalFile"() {
    (new excelUtils.ExcelsCustom()).deleteCalFile()
}

def static "excelUtils.ExcelsCustom.deleteFile"() {
    (new excelUtils.ExcelsCustom()).deleteFile()
}

def static "excelUtils.ExcelsCustom.deleteFileLossPrevention"() {
    (new excelUtils.ExcelsCustom()).deleteFileLossPrevention()
}

def static "excelUtils.RB_rough.function"() {
    (new excelUtils.RB_rough()).function()
}

def static "reportbuildercustom.FormulaResultEmailUtils.doSendEmailForFormulaResult"() {
    (new reportbuildercustom.FormulaResultEmailUtils()).doSendEmailForFormulaResult()
}
