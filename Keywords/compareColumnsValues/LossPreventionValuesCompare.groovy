package compareColumnsValues

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil


import internal.GlobalVariable

public class LossPreventionValuesCompare extends excelUtils.WriteExcelLossPreventionFormula
{




	@Keyword
	def  toVerifyCashOverShortPercentofSalesTYValues(double CashOverShortPercentofSalesTYReport,double CashOverShortPercentofSalesTY,String store)
	{

		int Decison1=Double.compare(CashOverShortPercentofSalesTYReport, CashOverShortPercentofSalesTY)


		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Cash Over/Short , % of Sales TY',String.valueOf(CashOverShortPercentofSalesTYReport),String.valueOf(CashOverShortPercentofSalesTY))
			}
			else
			{
				writeExcelAllStorePass('Cash Over/Short , % of Sales TY',String.valueOf(CashOverShortPercentofSalesTYReport),String.valueOf(CashOverShortPercentofSalesTY))
			}

			KeywordUtil.logInfo('Cash Over/Short , % of Sales TY value found On Report is '+CashOverShortPercentofSalesTYReport+'And Value derived using formula is'+CashOverShortPercentofSalesTY)
			KeywordUtil.markPassed('Cash Over/Short , % of Sales TY value found On Report is	'+CashOverShortPercentofSalesTYReport+'And Value derived using formula is'+CashOverShortPercentofSalesTY)
			KeywordUtil.markPassed('Cash Over/Short , % of Sales TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Cash Over/Short , % of Sales TY',String.valueOf(CashOverShortPercentofSalesTYReport),String.valueOf(CashOverShortPercentofSalesTY))
			}
			else
			{
				writeExcelAllStoreFail('Cash Over/Short , % of Sales TY',String.valueOf(CashOverShortPercentofSalesTYReport),String.valueOf(CashOverShortPercentofSalesTY))
			}



			KeywordUtil.logInfo('Cash Over/Short , % of Sales TY value found On Report is'+CashOverShortPercentofSalesTYReport+'And Value derived using formula is	'+CashOverShortPercentofSalesTY)
			KeywordUtil.markError('Cash Over/Short , % of Sales TY value found On Report is'+CashOverShortPercentofSalesTYReport+' And Value derived using formula is'+CashOverShortPercentofSalesTY)
			KeywordUtil.markError('Cash Over/Short , % of Sales TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyItemDeletionPercentofSalesTYValues(double ItemDeletionPercentofSalesTYReport,double ItemDeletionPercentofSalesTY,String store)
	{

		int Decison1=Double.compare(ItemDeletionPercentofSalesTYReport, ItemDeletionPercentofSalesTY)





		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item Deletion %, of Sales TY',String.valueOf(ItemDeletionPercentofSalesTYReport),String.valueOf(ItemDeletionPercentofSalesTY))
			}
			else
			{
				writeExcelAllStorePass('Item Deletion %, of Sales TY',String.valueOf(ItemDeletionPercentofSalesTYReport),String.valueOf(ItemDeletionPercentofSalesTY))
			}

			KeywordUtil.logInfo('Item Deletion %, of Sales TY value found On Report is '+ItemDeletionPercentofSalesTYReport+'And Value derived using formula is'+ItemDeletionPercentofSalesTY)
			KeywordUtil.markPassed('Item Deletion %, of Sales TY value found On Report is	'+ItemDeletionPercentofSalesTYReport+'And Value derived using formula is'+ItemDeletionPercentofSalesTY)
			KeywordUtil.markPassed('Item Deletion %, of Sales TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item Deletion %, of Sales TY',String.valueOf(ItemDeletionPercentofSalesTYReport),String.valueOf(ItemDeletionPercentofSalesTY))
			}
			else
			{
				writeExcelAllStoreFail('Item Deletion %, of Sales TY',String.valueOf(ItemDeletionPercentofSalesTYReport),String.valueOf(ItemDeletionPercentofSalesTY))
			}



			KeywordUtil.logInfo('Item Deletion %, of Sales TY value found On Report is'+ItemDeletionPercentofSalesTYReport+'And Value derived using formula is	'+ItemDeletionPercentofSalesTY)
			KeywordUtil.markError('Item Deletion %, of Sales TY value found On Report is'+ItemDeletionPercentofSalesTYReport+' And Value derived using formula is'+ItemDeletionPercentofSalesTY)
			KeywordUtil.markError('Item Deletion %, of Sales TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyItemDeletionBeforePercentofSalesTYValues(double ItemDeletionBeforePercentofSalesTYReport,double ItemDeletionBeforePercentofSalesTY,String store)
	{

		int Decison1=Double.compare(ItemDeletionBeforePercentofSalesTYReport, ItemDeletionBeforePercentofSalesTY)





		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item Deletion Before Total, % of Sales TY',String.valueOf(ItemDeletionBeforePercentofSalesTYReport),String.valueOf(ItemDeletionBeforePercentofSalesTY))
			}
			else
			{
				writeExcelAllStorePass('Item Deletion Before Total, % of Sales TY',String.valueOf(ItemDeletionBeforePercentofSalesTYReport),String.valueOf(ItemDeletionBeforePercentofSalesTY))
			}

			KeywordUtil.logInfo('Item Deletion Before Total, % of Sales TY value found On Report is '+ItemDeletionBeforePercentofSalesTYReport+'And Value derived using formula is'+ItemDeletionBeforePercentofSalesTY)
			KeywordUtil.markPassed('Item Deletion Before Total, % of Sales TY value found On Report is	'+ItemDeletionBeforePercentofSalesTYReport+'And Value derived using formula is'+ItemDeletionBeforePercentofSalesTY)
			KeywordUtil.markPassed('Item Deletion Before Total, % of Sales TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item Deletion Before Total, % of Sales TY',String.valueOf(ItemDeletionBeforePercentofSalesTYReport),String.valueOf(ItemDeletionBeforePercentofSalesTY))
			}
			else
			{
				writeExcelAllStoreFail('Item Deletion Before Total, % of Sales TY',String.valueOf(ItemDeletionBeforePercentofSalesTYReport),String.valueOf(ItemDeletionBeforePercentofSalesTY))
			}



			KeywordUtil.logInfo('Item Deletion Before Total, % of Sales TY value found On Report is'+ItemDeletionBeforePercentofSalesTYReport+'And Value derived using formula is	'+ItemDeletionBeforePercentofSalesTY)
			KeywordUtil.markError('Item Deletion Before Total, % of Sales TY value found On Report is'+ItemDeletionBeforePercentofSalesTYReport+' And Value derived using formula is'+ItemDeletionBeforePercentofSalesTY)
			KeywordUtil.markError('Item Deletion Before Total, % of Sales TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyItemDeletionAfterPercentofSalesTYValues(double ItemDeletionAfterPercentofSalesTYReport,double ItemDeletionAfterPercentofSalesTY,String store)
	{

		int Decison1=Double.compare(ItemDeletionAfterPercentofSalesTYReport, ItemDeletionAfterPercentofSalesTY)







		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item Deletion After Total, % of Sales TY',String.valueOf(ItemDeletionAfterPercentofSalesTYReport),String.valueOf(ItemDeletionAfterPercentofSalesTY))
			}
			else
			{
				writeExcelAllStorePass('Item Deletion After Total, % of Sales TY',String.valueOf(ItemDeletionAfterPercentofSalesTYReport),String.valueOf(ItemDeletionAfterPercentofSalesTY))
			}

			KeywordUtil.logInfo('Item Deletion After Total, % of Sales TY value found On Report is '+ItemDeletionAfterPercentofSalesTYReport+'And Value derived using formula is'+ItemDeletionAfterPercentofSalesTY)
			KeywordUtil.markPassed('Item Deletion After Total, % of Sales TY value found On Report is	'+ItemDeletionAfterPercentofSalesTYReport+'And Value derived using formula is'+ItemDeletionAfterPercentofSalesTY)
			KeywordUtil.markPassed('Item Deletion After Total, % of Sales TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item Deletion After Total, % of Sales TY',String.valueOf(ItemDeletionAfterPercentofSalesTYReport),String.valueOf(ItemDeletionAfterPercentofSalesTY))
			}
			else
			{
				writeExcelAllStoreFail('Item Deletion After Total, % of Sales TY',String.valueOf(ItemDeletionAfterPercentofSalesTYReport),String.valueOf(ItemDeletionAfterPercentofSalesTY))
			}



			KeywordUtil.logInfo('Item Deletion After Total, % of Sales TY value found On Report is'+ItemDeletionAfterPercentofSalesTYReport+'And Value derived using formula is	'+ItemDeletionAfterPercentofSalesTY)
			KeywordUtil.markError('Item Deletion After Total, % of Sales TY  value found On Report is'+ItemDeletionAfterPercentofSalesTYReport+' And Value derived using formula is'+ItemDeletionAfterPercentofSalesTY)
			KeywordUtil.markError('Item Deletion After Total, % of Sales TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyRefundPercentofSalesTYValues(double RefundPercentofSalesTYReport,double RefundPercentofSalesTY,String store)
	{

		int Decison1=Double.compare(RefundPercentofSalesTYReport, RefundPercentofSalesTY)








		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Refund, % of Sales TY',String.valueOf(RefundPercentofSalesTYReport),String.valueOf(RefundPercentofSalesTY))
			}
			else
			{
				writeExcelAllStorePass('Refund, % of Sales TY',String.valueOf(RefundPercentofSalesTYReport),String.valueOf(RefundPercentofSalesTY))
			}

			KeywordUtil.logInfo('Refund, % of Sales TY value found On Report is '+RefundPercentofSalesTYReport+'And Value derived using formula is'+RefundPercentofSalesTY)
			KeywordUtil.markPassed('Refund, % of Sales TY value found On Report is	'+RefundPercentofSalesTYReport+'And Value derived using formula is'+RefundPercentofSalesTY)
			KeywordUtil.markPassed('Refund, % of Sales TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Refund, % of Sales TY',String.valueOf(RefundPercentofSalesTYReport),String.valueOf(RefundPercentofSalesTY))
			}
			else
			{
				writeExcelAllStoreFail('Refund, % of Sales TY',String.valueOf(RefundPercentofSalesTYReport),String.valueOf(RefundPercentofSalesTY))
			}



			KeywordUtil.logInfo('Refund, % of Sales TY value found On Report is'+RefundPercentofSalesTYReport+'And Value derived using formula is	'+RefundPercentofSalesTY)
			KeywordUtil.markError('Refund, % of Sales TY  value found On Report is'+RefundPercentofSalesTYReport+' And Value derived using formula is'+RefundPercentofSalesTY)
			KeywordUtil.markError('Refund, % of Sales TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyCancelledTransactionPercentofSalesTYValues(double CancelledTransactionPercentofSalesTYReport,double CancelledTransactionPercentofSalesTY,String store)
	{

		int Decison1=Double.compare(CancelledTransactionPercentofSalesTYReport, CancelledTransactionPercentofSalesTY)







		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Cancelled Transaction, % of Sales TY',String.valueOf(CancelledTransactionPercentofSalesTYReport),String.valueOf(CancelledTransactionPercentofSalesTY))
			}
			else
			{
				writeExcelAllStorePass('Cancelled Transaction, % of Sales TY',String.valueOf(CancelledTransactionPercentofSalesTYReport),String.valueOf(CancelledTransactionPercentofSalesTY))
			}

			KeywordUtil.logInfo('Cancelled Transaction, % of Sales TY value found On Report is '+CancelledTransactionPercentofSalesTYReport+'And Value derived using formula is'+CancelledTransactionPercentofSalesTY)
			KeywordUtil.markPassed('Cancelled Transaction, % of Sales TY value found On Report is	'+CancelledTransactionPercentofSalesTYReport+'And Value derived using formula is'+CancelledTransactionPercentofSalesTY)
			KeywordUtil.markPassed('Cancelled Transaction, % of Sales TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Cancelled Transaction, % of Sales TY',String.valueOf(CancelledTransactionPercentofSalesTYReport),String.valueOf(CancelledTransactionPercentofSalesTY))
			}
			else
			{
				writeExcelAllStoreFail('Cancelled Transaction, % of Sales TY',String.valueOf(CancelledTransactionPercentofSalesTYReport),String.valueOf(CancelledTransactionPercentofSalesTY))
			}



			KeywordUtil.logInfo('Cancelled Transaction, % of Sales TY value found On Report is'+CancelledTransactionPercentofSalesTYReport+'And Value derived using formula is	'+CancelledTransactionPercentofSalesTY)
			KeywordUtil.markError('Cancelled Transaction, % of Sales TY  value found On Report is'+CancelledTransactionPercentofSalesTYReport+' And Value derived using formula is'+CancelledTransactionPercentofSalesTY)
			KeywordUtil.markError('Cancelled Transaction, % of Sales TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyVoidTransactionPercentofSalesTYValues(double VoidTransactionPercentofSalesTYReport,double VoidTransactionPercentofSalesTY,String store)
	{

		int Decison1=Double.compare(VoidTransactionPercentofSalesTYReport, VoidTransactionPercentofSalesTY)







		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Void Transactions, % of Sales TY',String.valueOf(VoidTransactionPercentofSalesTYReport),String.valueOf(VoidTransactionPercentofSalesTY))
			}
			else
			{
				writeExcelAllStorePass('Void Transactions, % of Sales TY',String.valueOf(VoidTransactionPercentofSalesTYReport),String.valueOf(VoidTransactionPercentofSalesTY))
			}

			KeywordUtil.logInfo('Void Transactions, % of Sales TY value found On Report is '+VoidTransactionPercentofSalesTYReport+'And Value derived using formula is'+VoidTransactionPercentofSalesTY)
			KeywordUtil.markPassed('Void Transactions, % of Sales TY value found On Report is	'+VoidTransactionPercentofSalesTYReport+'And Value derived using formula is'+VoidTransactionPercentofSalesTY)
			KeywordUtil.markPassed('Void Transactions, % of Sales TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Void Transactions, % of Sales TY',String.valueOf(VoidTransactionPercentofSalesTYReport),String.valueOf(VoidTransactionPercentofSalesTY))
			}
			else
			{
				writeExcelAllStoreFail('Void Transactions, % of Sales TY',String.valueOf(VoidTransactionPercentofSalesTYReport),String.valueOf(VoidTransactionPercentofSalesTY))
			}



			KeywordUtil.logInfo('Void Transactions, % of Sales TY value found On Report is'+VoidTransactionPercentofSalesTYReport+'And Value derived using formula is	'+VoidTransactionPercentofSalesTY)
			KeywordUtil.markError('Void Transactions, % of Sales TY value found On Report is'+VoidTransactionPercentofSalesTYReport+' And Value derived using formula is'+VoidTransactionPercentofSalesTY)
			KeywordUtil.markError('Void Transactions, % of Sales TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyCashOverShortPercentofSalesLYValues(double CashOverShortPercentofSalesLYReport,double CashOverShortPercentofSalesLY,String store)
	{

		int Decison1=Double.compare(CashOverShortPercentofSalesLYReport, CashOverShortPercentofSalesLY)


		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Cash Over/Short , % of Sales LY',String.valueOf(CashOverShortPercentofSalesLYReport),String.valueOf(CashOverShortPercentofSalesLY))
			}
			else
			{
				writeExcelAllStorePass('Cash Over/Short , % of Sales LY',String.valueOf(CashOverShortPercentofSalesLYReport),String.valueOf(CashOverShortPercentofSalesLY))
			}

			KeywordUtil.logInfo('Cash Over/Short , % of Sales LY value found On Report is '+CashOverShortPercentofSalesLYReport+'And Value derived using formula is'+CashOverShortPercentofSalesLY)
			KeywordUtil.markPassed('Cash Over/Short , % of Sales LY value found On Report is	'+CashOverShortPercentofSalesLYReport+'And Value derived using formula is'+CashOverShortPercentofSalesLY)
			KeywordUtil.markPassed('Cash Over/Short , % of Sales LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Cash Over/Short , % of Sales LY',String.valueOf(CashOverShortPercentofSalesLYReport),String.valueOf(CashOverShortPercentofSalesLY))
			}
			else
			{
				writeExcelAllStoreFail('Cash Over/Short , % of Sales LY',String.valueOf(CashOverShortPercentofSalesLYReport),String.valueOf(CashOverShortPercentofSalesLY))
			}



			KeywordUtil.logInfo('Cash Over/Short , % of Sales LY value found On Report is'+CashOverShortPercentofSalesLYReport+'And Value derived using formula is	'+CashOverShortPercentofSalesLY)
			KeywordUtil.markError('Cash Over/Short , % of Sales LY value found On Report is'+CashOverShortPercentofSalesLYReport+' And Value derived using formula is'+CashOverShortPercentofSalesLY)
			KeywordUtil.markError('Cash Over/Short , % of Sales LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyItemDeletionPercentofSalesLYValues(double ItemDeletionPercentofSalesLYReport,double ItemDeletionPercentofSalesLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionPercentofSalesLYReport, ItemDeletionPercentofSalesLY)





		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item Deletion %, of Sales LY',String.valueOf(ItemDeletionPercentofSalesLYReport),String.valueOf(ItemDeletionPercentofSalesLY))
			}
			else
			{
				writeExcelAllStorePass('Item Deletion %, of Sales LY',String.valueOf(ItemDeletionPercentofSalesLYReport),String.valueOf(ItemDeletionPercentofSalesLY))
			}

			KeywordUtil.logInfo('Item Deletion %, of Sales LY value found On Report is '+ItemDeletionPercentofSalesLYReport+'And Value derived using formula is'+ItemDeletionPercentofSalesLY)
			KeywordUtil.markPassed('Item Deletion %, of Sales LY value found On Report is	'+ItemDeletionPercentofSalesLYReport+'And Value derived using formula is'+ItemDeletionPercentofSalesLY)
			KeywordUtil.markPassed('Item Deletion %, of Sales LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item Deletion %, of Sales LY',String.valueOf(ItemDeletionPercentofSalesLYReport),String.valueOf(ItemDeletionPercentofSalesLY))
			}
			else
			{
				writeExcelAllStoreFail('Item Deletion %, of Sales LY',String.valueOf(ItemDeletionPercentofSalesLYReport),String.valueOf(ItemDeletionPercentofSalesLY))
			}



			KeywordUtil.logInfo('Item Deletion %, of Sales LY value found On Report is'+ItemDeletionPercentofSalesLYReport+'And Value derived using formula is	'+ItemDeletionPercentofSalesLY)
			KeywordUtil.markError('Item Deletion %, of Sales LY value found On Report is'+ItemDeletionPercentofSalesLYReport+' And Value derived using formula is'+ItemDeletionPercentofSalesLY)
			KeywordUtil.markError('Item Deletion %, of Sales LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyItemDeletionBeforePercentofSalesLYValues(double ItemDeletionBeforePercentofSalesLYReport,double ItemDeletionBeforePercentofSalesLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionBeforePercentofSalesLYReport, ItemDeletionBeforePercentofSalesLY)





		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item Deletion Before Total, % of Sales LY',String.valueOf(ItemDeletionBeforePercentofSalesLYReport),String.valueOf(ItemDeletionBeforePercentofSalesLY))
			}
			else
			{
				writeExcelAllStorePass('Item Deletion Before Total, % of Sales LY',String.valueOf(ItemDeletionBeforePercentofSalesLYReport),String.valueOf(ItemDeletionBeforePercentofSalesLY))
			}

			KeywordUtil.logInfo('Item Deletion Before Total, % of Sales LY value found On Report is '+ItemDeletionBeforePercentofSalesLYReport+'And Value derived using formula is'+ItemDeletionBeforePercentofSalesLY)
			KeywordUtil.markPassed('Item Deletion Before Total, % of Sales LY value found On Report is	'+ItemDeletionBeforePercentofSalesLYReport+'And Value derived using formula is'+ItemDeletionBeforePercentofSalesLY)
			KeywordUtil.markPassed('Item Deletion Before Total, % of Sales LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item Deletion Before Total, % of Sales LY',String.valueOf(ItemDeletionBeforePercentofSalesLYReport),String.valueOf(ItemDeletionBeforePercentofSalesLY))
			}
			else
			{
				writeExcelAllStoreFail('Item Deletion Before Total, % of Sales LY',String.valueOf(ItemDeletionBeforePercentofSalesLYReport),String.valueOf(ItemDeletionBeforePercentofSalesLY))
			}



			KeywordUtil.logInfo('Item Deletion Before Total, % of Sales LY value found On Report is'+ItemDeletionBeforePercentofSalesLYReport+'And Value derived using formula is	'+ItemDeletionBeforePercentofSalesLY)
			KeywordUtil.markError('Item Deletion Before Total, % of Sales LY value found On Report is'+ItemDeletionBeforePercentofSalesLYReport+' And Value derived using formula is'+ItemDeletionBeforePercentofSalesLY)
			KeywordUtil.markError('Item Deletion Before Total, % of Sales LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyRefundPercentofSalesLYValues(double RefundPercentofSalesLYReport,double RefundPercentofSalesLY,String store)
	{

		int Decison1=Double.compare(RefundPercentofSalesLYReport, RefundPercentofSalesLY)








		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Refund, % of Sales LY',String.valueOf(RefundPercentofSalesLYReport),String.valueOf(RefundPercentofSalesLY))
			}
			else
			{
				writeExcelAllStorePass('Refund, % of Sales LY',String.valueOf(RefundPercentofSalesLYReport),String.valueOf(RefundPercentofSalesLY))
			}

			KeywordUtil.logInfo('Refund, % of Sales LY value found On Report is '+RefundPercentofSalesLYReport+'And Value derived using formula is'+RefundPercentofSalesLY)
			KeywordUtil.markPassed('Refund, % of Sales LY value found On Report is	'+RefundPercentofSalesLYReport+'And Value derived using formula is'+RefundPercentofSalesLY)
			KeywordUtil.markPassed('Refund, % of Sales LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Refund, % of Sales LY',String.valueOf(RefundPercentofSalesLYReport),String.valueOf(RefundPercentofSalesLY))
			}
			else
			{
				writeExcelAllStoreFail('Refund, % of Sales LY',String.valueOf(RefundPercentofSalesLYReport),String.valueOf(RefundPercentofSalesLY))
			}



			KeywordUtil.logInfo('Refund, % of Sales LY value found On Report is'+RefundPercentofSalesLYReport+'And Value derived using formula is	'+RefundPercentofSalesLY)
			KeywordUtil.markError('Refund, % of Sales LY  value found On Report is'+RefundPercentofSalesLYReport+' And Value derived using formula is'+RefundPercentofSalesLY)
			KeywordUtil.markError('Refund, % of Sales LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyCancelledTransactionPercentofSalesLYValues(double CancelledTransactionPercentofSalesLYReport,double CancelledTransactionPercentofSalesLY,String store)
	{

		int Decison1=Double.compare(CancelledTransactionPercentofSalesLYReport, CancelledTransactionPercentofSalesLY)







		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Cancelled Transaction, % of Sales LY',String.valueOf(CancelledTransactionPercentofSalesLYReport),String.valueOf(CancelledTransactionPercentofSalesLY))
			}
			else
			{
				writeExcelAllStorePass('Cancelled Transaction, % of Sales LY',String.valueOf(CancelledTransactionPercentofSalesLYReport),String.valueOf(CancelledTransactionPercentofSalesLY))
			}

			KeywordUtil.logInfo('Cancelled Transaction, % of Sales LY value found On Report is '+CancelledTransactionPercentofSalesLYReport+'And Value derived using formula is'+CancelledTransactionPercentofSalesLY)
			KeywordUtil.markPassed('Cancelled Transaction, % of Sales LY value found On Report is	'+CancelledTransactionPercentofSalesLYReport+'And Value derived using formula is'+CancelledTransactionPercentofSalesLY)
			KeywordUtil.markPassed('Cancelled Transaction, % of Sales LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Cancelled Transaction, % of Sales LY',String.valueOf(CancelledTransactionPercentofSalesLYReport),String.valueOf(CancelledTransactionPercentofSalesLY))
			}
			else
			{
				writeExcelAllStoreFail('Cancelled Transaction, % of Sales LY',String.valueOf(CancelledTransactionPercentofSalesLYReport),String.valueOf(CancelledTransactionPercentofSalesLY))
			}



			KeywordUtil.logInfo('Cancelled Transaction, % of Sales LY value found On Report is'+CancelledTransactionPercentofSalesLYReport+'And Value derived using formula is	'+CancelledTransactionPercentofSalesLY)
			KeywordUtil.markError('Cancelled Transaction, % of Sales LY  value found On Report is'+CancelledTransactionPercentofSalesLYReport+' And Value derived using formula is'+CancelledTransactionPercentofSalesLY)
			KeywordUtil.markError('Cancelled Transaction, % of Sales LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}

	@Keyword
	def  toVerifyVoidTransactionPercentofSalesLYValues(double VoidTransactionPercentofSalesLYReport,double VoidTransactionPercentofSalesLY,String store)
	{

		int Decison1=Double.compare(VoidTransactionPercentofSalesLYReport, VoidTransactionPercentofSalesLY)







		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Void Transactions, % of Sales LY',String.valueOf(VoidTransactionPercentofSalesLYReport),String.valueOf(VoidTransactionPercentofSalesLY))
			}
			else
			{
				writeExcelAllStorePass('Void Transactions, % of Sales LY',String.valueOf(VoidTransactionPercentofSalesLYReport),String.valueOf(VoidTransactionPercentofSalesLY))
			}

			KeywordUtil.logInfo('Void Transactions, % of Sales LY value found On Report is '+VoidTransactionPercentofSalesLYReport+'And Value derived using formula is'+VoidTransactionPercentofSalesLY)
			KeywordUtil.markPassed('Void Transactions, % of Sales LY value found On Report is	'+VoidTransactionPercentofSalesLYReport+'And Value derived using formula is'+VoidTransactionPercentofSalesLY)
			KeywordUtil.markPassed('Void Transactions, % of Sales LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Void Transactions, % of Sales LY',String.valueOf(VoidTransactionPercentofSalesLYReport),String.valueOf(VoidTransactionPercentofSalesLY))
			}
			else
			{
				writeExcelAllStoreFail('Void Transactions, % of Sales LY',String.valueOf(VoidTransactionPercentofSalesLYReport),String.valueOf(VoidTransactionPercentofSalesLY))
			}



			KeywordUtil.logInfo('Void Transactions, % of Sales LY value found On Report is'+VoidTransactionPercentofSalesLYReport+'And Value derived using formula is	'+VoidTransactionPercentofSalesLY)
			KeywordUtil.markError('Void Transactions, % of Sales LY value found On Report is'+VoidTransactionPercentofSalesLYReport+' And Value derived using formula is'+VoidTransactionPercentofSalesLY)
			KeywordUtil.markError('Void Transactions, % of Sales LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyItemDeletionAfterPercentofSalesLYValues(double ItemDeletionAfterPercentofSalesLYReport,double ItemDeletionAfterPercentofSalesLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionAfterPercentofSalesLYReport, ItemDeletionAfterPercentofSalesLY)







		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item Deletion After Total, % of Sales LY',String.valueOf(ItemDeletionAfterPercentofSalesLYReport),String.valueOf(ItemDeletionAfterPercentofSalesLY))
			}
			else
			{
				writeExcelAllStorePass('Item Deletion After Total, % of Sales LY',String.valueOf(ItemDeletionAfterPercentofSalesLYReport),String.valueOf(ItemDeletionAfterPercentofSalesLY))
			}

			KeywordUtil.logInfo('Item Deletion After Total, % of Sales LY value found On Report is '+ItemDeletionAfterPercentofSalesLYReport+'And Value derived using formula is'+ItemDeletionAfterPercentofSalesLY)
			KeywordUtil.markPassed('Item Deletion After Total, % of Sales LY value found On Report is	'+ItemDeletionAfterPercentofSalesLYReport+'And Value derived using formula is'+ItemDeletionAfterPercentofSalesLY)
			KeywordUtil.markPassed('Item Deletion After Total, % of Sales LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item Deletion After Total, % of Sales LY',String.valueOf(ItemDeletionAfterPercentofSalesLYReport),String.valueOf(ItemDeletionAfterPercentofSalesLY))
			}
			else
			{
				writeExcelAllStoreFail('Item Deletion After Total, % of Sales LY',String.valueOf(ItemDeletionAfterPercentofSalesLYReport),String.valueOf(ItemDeletionAfterPercentofSalesLY))
			}



			KeywordUtil.logInfo('Item Deletion After Total, % of Sales LY value found On Report is'+ItemDeletionAfterPercentofSalesLYReport+'And Value derived using formula is	'+ItemDeletionAfterPercentofSalesLY)
			KeywordUtil.markError('Item Deletion After Total, % of Sales LY  value found On Report is'+ItemDeletionAfterPercentofSalesLYReport+' And Value derived using formula is'+ItemDeletionAfterPercentofSalesLY)
			KeywordUtil.markError('Item Deletion After Total, % of Sales LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}

	///////////////////////////////////////////////////////////

	@Keyword
	def  toVerifyItemDeletionCountPercentofTotalTransactionsTYValues(double ItemDeletionCountPercentofTotalTransactionsTYReport,double ItemDeletionCountPercentofTotalTransactionsTY,String store)
	{

		int Decison1=Double.compare(ItemDeletionCountPercentofTotalTransactionsTYReport, ItemDeletionCountPercentofTotalTransactionsTY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item Deletion Count, % of Total Transactions TY',String.valueOf(ItemDeletionCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionCountPercentofTotalTransactionsTY))
			}
			else
			{
				writeExcelAllStorePass('Item Deletion Count, % of Total Transactions TY',String.valueOf(ItemDeletionCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionCountPercentofTotalTransactionsTY))
			}

			KeywordUtil.logInfo('Item Deletion Count, % of Total Transactions TY value found On Report is '+ItemDeletionCountPercentofTotalTransactionsTYReport+'And Value derived using formula is'+ItemDeletionCountPercentofTotalTransactionsTY)
			KeywordUtil.markPassed('Item Deletion Count, % of Total Transactions TY value found On Report is	'+ItemDeletionCountPercentofTotalTransactionsTYReport+'And Value derived using formula is'+ItemDeletionCountPercentofTotalTransactionsTY)
			KeywordUtil.markPassed('Item Deletion Count, % of Total Transactions TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item Deletion Count, % of Total Transactions TY',String.valueOf(ItemDeletionCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionCountPercentofTotalTransactionsTY))
			}
			else
			{
				writeExcelAllStoreFail('Item Deletion Count, % of Total Transactions TY',String.valueOf(ItemDeletionCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionCountPercentofTotalTransactionsTY))
			}



			KeywordUtil.logInfo('Item Deletion Count, % of Total Transactions TY value found On Report is'+ItemDeletionCountPercentofTotalTransactionsTYReport+'And Value derived using formula is	'+ItemDeletionCountPercentofTotalTransactionsTY)
			KeywordUtil.markError('Item Deletion Count, % of Total Transactions TY  value found On Report is'+ItemDeletionCountPercentofTotalTransactionsTYReport+' And Value derived using formula is'+ItemDeletionCountPercentofTotalTransactionsTY)
			KeywordUtil.markError('Item Deletion Count, % of Total Transactions TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}

	@Keyword
	def  toVerifyCancelTransactionCountPercentofTotalTransactionsTYValues(double CancelTransactionCountPercentofTotalTransactionsTYReport,double CancelTransactionCountPercentofTotalTransactionsTY,String store)
	{

		int Decison1=Double.compare(CancelTransactionCountPercentofTotalTransactionsTYReport, CancelTransactionCountPercentofTotalTransactionsTY)





		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Cancelled Transaction Count, % of Total Transactions TY',String.valueOf(CancelTransactionCountPercentofTotalTransactionsTYReport),String.valueOf(CancelTransactionCountPercentofTotalTransactionsTY))
			}
			else
			{
				writeExcelAllStorePass('Cancelled Transaction Count, % of Total Transactions TY',String.valueOf(CancelTransactionCountPercentofTotalTransactionsTYReport),String.valueOf(CancelTransactionCountPercentofTotalTransactionsTY))
			}

			KeywordUtil.logInfo('Cancelled Transaction Count, % of Total Transactions TY value found On Report is '+CancelTransactionCountPercentofTotalTransactionsTYReport+'And Value derived using formula is'+CancelTransactionCountPercentofTotalTransactionsTY)
			KeywordUtil.markPassed('Cancelled Transaction Count, % of Total Transactions TY value found On Report is	'+CancelTransactionCountPercentofTotalTransactionsTYReport+'And Value derived using formula is'+CancelTransactionCountPercentofTotalTransactionsTY)
			KeywordUtil.markPassed('Cancelled Transaction Count, % of Total Transactions TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Cancelled Transaction Count, % of Total Transactions TY',String.valueOf(CancelTransactionCountPercentofTotalTransactionsTYReport),String.valueOf(CancelTransactionCountPercentofTotalTransactionsTY))
			}
			else
			{
				writeExcelAllStoreFail('Cancelled Transaction Count, % of Total Transactions TY',String.valueOf(CancelTransactionCountPercentofTotalTransactionsTYReport),String.valueOf(CancelTransactionCountPercentofTotalTransactionsTY))
			}



			KeywordUtil.logInfo('Cancelled Transaction Count, % of Total Transactions TY value found On Report is'+CancelTransactionCountPercentofTotalTransactionsTYReport+'And Value derived using formula is	'+CancelTransactionCountPercentofTotalTransactionsTY)
			KeywordUtil.markError('Cancelled Transaction Count, % of Total Transactions TY  value found On Report is'+CancelTransactionCountPercentofTotalTransactionsTYReport+' And Value derived using formula is'+CancelTransactionCountPercentofTotalTransactionsTY)
			KeywordUtil.markError('Cancelled Transaction Count, % of Total Transactions TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}




	@Keyword
	def  toVerifyItemDeletionBeforeCountPercentofTotalTransactionsTYValues(double ItemDeletionBeforeCountPercentofTotalTransactionsTYReport,double ItemDeletionBeforeCountPercentofTotalTransactionsTY,String store)
	{

		int Decison1=Double.compare(ItemDeletionBeforeCountPercentofTotalTransactionsTYReport, ItemDeletionBeforeCountPercentofTotalTransactionsTY)









		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item DeletionBefore Count, % of Total Transactions TY',String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsTY))
			}
			else
			{
				writeExcelAllStorePass('Item DeletionBefore Count, % of Total Transactions TY',String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsTY))
			}

			KeywordUtil.logInfo('Item DeletionBefore Count, % of Total Transactions TY value found On Report is '+ItemDeletionBeforeCountPercentofTotalTransactionsTYReport+'And Value derived using formula is'+ItemDeletionBeforeCountPercentofTotalTransactionsTY)
			KeywordUtil.markPassed('Item DeletionBefore Count, % of Total Transactions TY value found On Report is	'+ItemDeletionBeforeCountPercentofTotalTransactionsTYReport+'And Value derived using formula is'+ItemDeletionBeforeCountPercentofTotalTransactionsTY)
			KeywordUtil.markPassed('Item DeletionBefore Count, % of Total Transactions TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item DeletionBefore Count, % of Total Transactions TY',String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsTY))
			}
			else
			{
				writeExcelAllStoreFail('Item DeletionBefore Count, % of Total Transactions TY',String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsTY))
			}



			KeywordUtil.logInfo('Item DeletionBefore Count, % of Total Transactions TY value found On Report is'+ItemDeletionBeforeCountPercentofTotalTransactionsTYReport+'And Value derived using formula is	'+ItemDeletionBeforeCountPercentofTotalTransactionsTY)
			KeywordUtil.markError('Item DeletionBefore Count, % of Total Transactions TY  value found On Report is'+ItemDeletionBeforeCountPercentofTotalTransactionsTYReport+' And Value derived using formula is'+ItemDeletionBeforeCountPercentofTotalTransactionsTY)
			KeywordUtil.markError('Item DeletionBefore Count, % of Total Transactions TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyItemDeletionAfterCountPercentofTotalTransactionsTYValues(double ItemDeletionAfterCountPercentofTotalTransactionsTYReport,double ItemDeletionAfterCountPercentofTotalTransactionsTY,String store)
	{

		int Decison1=Double.compare(ItemDeletionAfterCountPercentofTotalTransactionsTYReport, ItemDeletionAfterCountPercentofTotalTransactionsTY)









		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item DeletionAfter Count, % of Total Transactions TY',String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsTY))
			}
			else
			{
				writeExcelAllStorePass('Item DeletionAfter Count, % of Total Transactions TY',String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsTY))
			}

			KeywordUtil.logInfo('Item DeletionAfter Count, % of Total Transactions TY value found On Report is '+ItemDeletionAfterCountPercentofTotalTransactionsTYReport+'And Value derived using formula is'+ItemDeletionAfterCountPercentofTotalTransactionsTY)
			KeywordUtil.markPassed('Item DeletionAfter Count, % of Total Transactions TY value found On Report is	'+ItemDeletionAfterCountPercentofTotalTransactionsTYReport+'And Value derived using formula is'+ItemDeletionAfterCountPercentofTotalTransactionsTY)
			KeywordUtil.markPassed('Item DeletionAfter Count, % of Total Transactions TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item DeletionAfter Count, % of Total Transactions TY',String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsTY))
			}
			else
			{
				writeExcelAllStoreFail('Item DeletionAfter Count, % of Total Transactions TY',String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsTYReport),String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsTY))
			}



			KeywordUtil.logInfo('Item DeletionAfter Count, % of Total Transactions TY value found On Report is'+ItemDeletionAfterCountPercentofTotalTransactionsTYReport+'And Value derived using formula is	'+ItemDeletionAfterCountPercentofTotalTransactionsTY)
			KeywordUtil.markError('Item DeletionAfter Count, % of Total Transactions TY  value found On Report is'+ItemDeletionAfterCountPercentofTotalTransactionsTYReport+' And Value derived using formula is'+ItemDeletionAfterCountPercentofTotalTransactionsTY)
			KeywordUtil.markError('Item DeletionAfter Count, % of Total Transactions TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}




	@Keyword
	def  toVerifyVoidTransactionCountPercentofTotalTransactionsTYValues(double VoidTransactionCountPercentofTotalTransactionsTYReport,double VoidTransactionCountPercentofTotalTransactionsTY,String store)
	{

		int Decison1=Double.compare(VoidTransactionCountPercentofTotalTransactionsTYReport, VoidTransactionCountPercentofTotalTransactionsTY)



		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Void Transactions Count, % of Total Transactions Count TYY',String.valueOf(VoidTransactionCountPercentofTotalTransactionsTYReport),String.valueOf(VoidTransactionCountPercentofTotalTransactionsTY))
			}
			else
			{
				writeExcelAllStorePass('Void Transactions Count, % of Total Transactions Count TY',String.valueOf(VoidTransactionCountPercentofTotalTransactionsTYReport),String.valueOf(VoidTransactionCountPercentofTotalTransactionsTY))
			}

			KeywordUtil.logInfo('Void Transactions Count, % of Total Transactions Count TY value found On Report is '+VoidTransactionCountPercentofTotalTransactionsTYReport+'And Value derived using formula is'+VoidTransactionCountPercentofTotalTransactionsTY)
			KeywordUtil.markPassed('Void Transactions Count, % of Total Transactions Count TY value found On Report is	'+VoidTransactionCountPercentofTotalTransactionsTYReport+'And Value derived using formula is'+VoidTransactionCountPercentofTotalTransactionsTY)
			KeywordUtil.markPassed('Void Transactions Count, % of Total Transactions Count TY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Void Transactions Count, % of Total Transactions Count TY',String.valueOf(VoidTransactionCountPercentofTotalTransactionsTYReport),String.valueOf(VoidTransactionCountPercentofTotalTransactionsTY))
			}
			else
			{
				writeExcelAllStoreFail('Void Transactions Count, % of Total Transactions Count TY',String.valueOf(VoidTransactionCountPercentofTotalTransactionsTYReport),String.valueOf(VoidTransactionCountPercentofTotalTransactionsTY))
			}



			KeywordUtil.logInfo('Void Transactions Count, % of Total Transactions Count TY value found On Report is'+VoidTransactionCountPercentofTotalTransactionsTYReport+'And Value derived using formula is	'+VoidTransactionCountPercentofTotalTransactionsTY)
			KeywordUtil.markError('Void Transactions Count, % of Total Transactions Count TY value found On Report is'+VoidTransactionCountPercentofTotalTransactionsTYReport+' And Value derived using formula is'+VoidTransactionCountPercentofTotalTransactionsTY)
			KeywordUtil.markError('Void Transactions Count, % of Total Transactions Count TY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	//Last Year Total Transaction



	@Keyword
	def  toVerifyItemDeletionCountPercentofTotalTransactionsLYValues(double ItemDeletionCountPercentofTotalTransactionsLYReport,double ItemDeletionCountPercentofTotalTransactionsLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionCountPercentofTotalTransactionsLYReport, ItemDeletionCountPercentofTotalTransactionsLY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item Deletion Count, % of Total Transactions LY',String.valueOf(ItemDeletionCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionCountPercentofTotalTransactionsLY))
			}
			else
			{
				writeExcelAllStorePass('Item Deletion Count, % of Total Transactions LY',String.valueOf(ItemDeletionCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionCountPercentofTotalTransactionsLY))
			}

			KeywordUtil.logInfo('Item Deletion Count, % of Total Transactions LY value found On Report is '+ItemDeletionCountPercentofTotalTransactionsLYReport+'And Value derived using formula is'+ItemDeletionCountPercentofTotalTransactionsLY)
			KeywordUtil.markPassed('Item Deletion Count, % of Total Transactions LY value found On Report is	'+ItemDeletionCountPercentofTotalTransactionsLYReport+'And Value derived using formula is'+ItemDeletionCountPercentofTotalTransactionsLY)
			KeywordUtil.markPassed('Item Deletion Count, % of Total Transactions LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item Deletion Count, % of Total Transactions LY',String.valueOf(ItemDeletionCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionCountPercentofTotalTransactionsLY))
			}
			else
			{
				writeExcelAllStoreFail('Item Deletion Count, % of Total Transactions LY',String.valueOf(ItemDeletionCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionCountPercentofTotalTransactionsLY))
			}



			KeywordUtil.logInfo('Item Deletion Count, % of Total Transactions LY value found On Report is'+ItemDeletionCountPercentofTotalTransactionsLYReport+'And Value derived using formula is	'+ItemDeletionCountPercentofTotalTransactionsLY)
			KeywordUtil.markError('Item Deletion Count, % of Total Transactions LY  value found On Report is'+ItemDeletionCountPercentofTotalTransactionsLYReport+' And Value derived using formula is'+ItemDeletionCountPercentofTotalTransactionsLY)
			KeywordUtil.markError('Item Deletion Count, % of Total Transactions LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyCancelTransactionCountPercentofTotalTransactionsLYValues(double CancelTransactionCountPercentofTotalTransactionsLYReport,double CancelTransactionCountPercentofTotalTransactionsLY,String store)
	{

		int Decison1=Double.compare(CancelTransactionCountPercentofTotalTransactionsLYReport, CancelTransactionCountPercentofTotalTransactionsLY)





		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Cancelled Transaction Count, % of Total Transactions LY',String.valueOf(CancelTransactionCountPercentofTotalTransactionsLYReport),String.valueOf(CancelTransactionCountPercentofTotalTransactionsLY))
			}
			else
			{
				writeExcelAllStorePass('Cancelled Transaction Count, % of Total Transactions LY',String.valueOf(CancelTransactionCountPercentofTotalTransactionsLYReport),String.valueOf(CancelTransactionCountPercentofTotalTransactionsLY))
			}

			KeywordUtil.logInfo('Cancelled Transaction Count, % of Total Transactions LY value found On Report is '+CancelTransactionCountPercentofTotalTransactionsLYReport+'And Value derived using formula is'+CancelTransactionCountPercentofTotalTransactionsLY)
			KeywordUtil.markPassed('Cancelled Transaction Count, % of Total Transactions LY value found On Report is	'+CancelTransactionCountPercentofTotalTransactionsLYReport+'And Value derived using formula is'+CancelTransactionCountPercentofTotalTransactionsLY)
			KeywordUtil.markPassed('Cancelled Transaction Count, % of Total Transactions LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Cancelled Transaction Count, % of Total Transactions LY',String.valueOf(CancelTransactionCountPercentofTotalTransactionsLYReport),String.valueOf(CancelTransactionCountPercentofTotalTransactionsLY))
			}
			else
			{
				writeExcelAllStoreFail('Cancelled Transaction Count, % of Total Transactions LY',String.valueOf(CancelTransactionCountPercentofTotalTransactionsLYReport),String.valueOf(CancelTransactionCountPercentofTotalTransactionsLY))
			}



			KeywordUtil.logInfo('Cancelled Transaction Count, % of Total Transactions LY value found On Report is'+CancelTransactionCountPercentofTotalTransactionsLYReport+'And Value derived using formula is	'+CancelTransactionCountPercentofTotalTransactionsLY)
			KeywordUtil.markError('Cancelled Transaction Count, % of Total Transactions LY  value found On Report is'+CancelTransactionCountPercentofTotalTransactionsLYReport+' And Value derived using formula is'+CancelTransactionCountPercentofTotalTransactionsLY)
			KeywordUtil.markError('Cancelled Transaction Count, % of Total Transactions LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}




	@Keyword
	def  toVerifyItemDeletionBeforeCountPercentofTotalTransactionsLYValues(double ItemDeletionBeforeCountPercentofTotalTransactionsLYReport,double ItemDeletionBeforeCountPercentofTotalTransactionsLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionBeforeCountPercentofTotalTransactionsLYReport, ItemDeletionBeforeCountPercentofTotalTransactionsLY)









		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item DeletionBefore Count, % of Total Transactions LY',String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsLY))
			}
			else
			{
				writeExcelAllStorePass('Item DeletionBefore Count, % of Total Transactions LY',String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsLY))
			}

			KeywordUtil.logInfo('Item DeletionBefore Count, % of Total Transactions LY value found On Report is '+ItemDeletionBeforeCountPercentofTotalTransactionsLYReport+'And Value derived using formula is'+ItemDeletionBeforeCountPercentofTotalTransactionsLY)
			KeywordUtil.markPassed('Item DeletionBefore Count, % of Total Transactions LY value found On Report is	'+ItemDeletionBeforeCountPercentofTotalTransactionsLYReport+'And Value derived using formula is'+ItemDeletionBeforeCountPercentofTotalTransactionsLY)
			KeywordUtil.markPassed('Item DeletionBefore Count, % of Total Transactions LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item DeletionBefore Count, % of Total Transactions LY',String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsLY))
			}
			else
			{
				writeExcelAllStoreFail('Item DeletionBefore Count, % of Total Transactions LY',String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionBeforeCountPercentofTotalTransactionsLY))
			}



			KeywordUtil.logInfo('Item DeletionBefore Count, % of Total Transactions LY value found On Report is'+ItemDeletionBeforeCountPercentofTotalTransactionsLYReport+'And Value derived using formula is	'+ItemDeletionBeforeCountPercentofTotalTransactionsLY)
			KeywordUtil.markError('Item DeletionBefore Count, % of Total Transactions LY  value found On Report is'+ItemDeletionBeforeCountPercentofTotalTransactionsLYReport+' And Value derived using formula is'+ItemDeletionBeforeCountPercentofTotalTransactionsLY)
			KeywordUtil.markError('Item DeletionBefore Count, % of Total Transactions LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyItemDeletionAfterCountPercentofTotalTransactionsLYValues(double ItemDeletionAfterCountPercentofTotalTransactionsLYReport,double ItemDeletionAfterCountPercentofTotalTransactionsLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionAfterCountPercentofTotalTransactionsLYReport, ItemDeletionAfterCountPercentofTotalTransactionsLY)









		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Item DeletionAfter Count, % of Total Transactions LY',String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsLY))
			}
			else
			{
				writeExcelAllStorePass('Item DeletionAfter Count, % of Total Transactions LY',String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsLY))
			}

			KeywordUtil.logInfo('Item DeletionAfter Count, % of Total Transactions LY value found On Report is '+ItemDeletionAfterCountPercentofTotalTransactionsLYReport+'And Value derived using formula is'+ItemDeletionAfterCountPercentofTotalTransactionsLY)
			KeywordUtil.markPassed('Item DeletionAfter Count, % of Total Transactions LY value found On Report is	'+ItemDeletionAfterCountPercentofTotalTransactionsLYReport+'And Value derived using formula is'+ItemDeletionAfterCountPercentofTotalTransactionsLY)
			KeywordUtil.markPassed('Item DeletionAfter Count, % of Total Transactions LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Item DeletionAfter Count, % of Total Transactions LY',String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsLY))
			}
			else
			{
				writeExcelAllStoreFail('Item DeletionAfter Count, % of Total Transactions LY',String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsLYReport),String.valueOf(ItemDeletionAfterCountPercentofTotalTransactionsLY))
			}



			KeywordUtil.logInfo('Item DeletionAfter Count, % of Total Transactions LY value found On Report is'+ItemDeletionAfterCountPercentofTotalTransactionsLYReport+'And Value derived using formula is	'+ItemDeletionAfterCountPercentofTotalTransactionsLY)
			KeywordUtil.markError('Item DeletionAfter Count, % of Total Transactions LY  value found On Report is'+ItemDeletionAfterCountPercentofTotalTransactionsLYReport+' And Value derived using formula is'+ItemDeletionAfterCountPercentofTotalTransactionsLY)
			KeywordUtil.markError('Item DeletionAfter Count, % of Total Transactions LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}




	@Keyword
	def  toVerifyVoidTransactionCountPercentofTotalTransactionsLYValues(double VoidTransactionCountPercentofTotalTransactionsLYReport,double VoidTransactionCountPercentofTotalTransactionsLY,String store)
	{

		int Decison1=Double.compare(VoidTransactionCountPercentofTotalTransactionsLYReport, VoidTransactionCountPercentofTotalTransactionsLY)



		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('Void Transactions Count, % of Total Transactions Count LYY',String.valueOf(VoidTransactionCountPercentofTotalTransactionsLYReport),String.valueOf(VoidTransactionCountPercentofTotalTransactionsLY))
			}
			else
			{
				writeExcelAllStorePass('Void Transactions Count, % of Total Transactions Count LY',String.valueOf(VoidTransactionCountPercentofTotalTransactionsLYReport),String.valueOf(VoidTransactionCountPercentofTotalTransactionsLY))
			}

			KeywordUtil.logInfo('Void Transactions Count, % of Total Transactions Count LY value found On Report is '+VoidTransactionCountPercentofTotalTransactionsLYReport+'And Value derived using formula is'+VoidTransactionCountPercentofTotalTransactionsLY)
			KeywordUtil.markPassed('Void Transactions Count, % of Total Transactions Count LY value found On Report is	'+VoidTransactionCountPercentofTotalTransactionsLYReport+'And Value derived using formula is'+VoidTransactionCountPercentofTotalTransactionsLY)
			KeywordUtil.markPassed('Void Transactions Count, % of Total Transactions Count LY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('Void Transactions Count, % of Total Transactions Count LY',String.valueOf(VoidTransactionCountPercentofTotalTransactionsLYReport),String.valueOf(VoidTransactionCountPercentofTotalTransactionsLY))
			}
			else
			{
				writeExcelAllStoreFail('Void Transactions Count, % of Total Transactions Count LY',String.valueOf(VoidTransactionCountPercentofTotalTransactionsLYReport),String.valueOf(VoidTransactionCountPercentofTotalTransactionsLY))
			}



			KeywordUtil.logInfo('Void Transactions Count, % of Total Transactions Count LY value found On Report is'+VoidTransactionCountPercentofTotalTransactionsLYReport+'And Value derived using formula is	'+VoidTransactionCountPercentofTotalTransactionsLY)
			KeywordUtil.markError('Void Transactions Count, % of Total Transactions Count LY value found On Report is'+VoidTransactionCountPercentofTotalTransactionsLYReport+' And Value derived using formula is'+VoidTransactionCountPercentofTotalTransactionsLY)
			KeywordUtil.markError('Void Transactions Count, % of Total Transactions Count LY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	//Column Name ( TY vs LY )


	@Keyword
	def  toVerifyCashOverShortPercentTYvsLYValues(double CashOverShortPercentTYvsLYReport,double CashOverShortPercentTYvsLY,String store)
	{

		int Decison1=Double.compare(CashOverShortPercentTYvsLYReport, CashOverShortPercentTYvsLY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('CashOverShortPercentTYvsLY',String.valueOf(CashOverShortPercentTYvsLYReport),String.valueOf(CashOverShortPercentTYvsLY))
			}
			else
			{
				writeExcelAllStorePass('CashOverShortPercentTYvsLY',String.valueOf(CashOverShortPercentTYvsLYReport),String.valueOf(CashOverShortPercentTYvsLY))
			}

			KeywordUtil.logInfo('CashOverShortPercentTYvsLY value found On Report is '+CashOverShortPercentTYvsLYReport+'And Value derived using formula is'+CashOverShortPercentTYvsLY)
			KeywordUtil.markPassed('CashOverShortPercentTYvsLY value found On Report is	'+CashOverShortPercentTYvsLYReport+'And Value derived using formula is'+CashOverShortPercentTYvsLY)
			KeywordUtil.markPassed('CashOverShortPercentTYvsLY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('CashOverShortPercentTYvsLY',String.valueOf(CashOverShortPercentTYvsLYReport),String.valueOf(CashOverShortPercentTYvsLY))
			}
			else
			{
				writeExcelAllStoreFail('CashOverShortPercentTYvsLY',String.valueOf(CashOverShortPercentTYvsLYReport),String.valueOf(CashOverShortPercentTYvsLY))
			}



			KeywordUtil.logInfo('CashOverShortPercentTYvsLY value found On Report is'+CashOverShortPercentTYvsLYReport+'And Value derived using formula is	'+CashOverShortPercentTYvsLY)
			KeywordUtil.markError('CashOverShortPercentTYvsLY value found On Report is'+CashOverShortPercentTYvsLYReport+' And Value derived using formula is'+CashOverShortPercentTYvsLY)
			KeywordUtil.markError('CashOverShortPercentTYvsLY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}

	@Keyword
	def  toVerifyItemDeletionDollorTYvsLYValues(double ItemDeletionDollorTYvsLYReport,double ItemDeletionDollorTYvsLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionDollorTYvsLYReport, ItemDeletionDollorTYvsLY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionDollorTYvsLY',String.valueOf(ItemDeletionDollorTYvsLYReport),String.valueOf(ItemDeletionDollorTYvsLY))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionDollorTYvsLY',String.valueOf(ItemDeletionDollorTYvsLYReport),String.valueOf(ItemDeletionDollorTYvsLY))
			}

			KeywordUtil.logInfo('ItemDeletionDollorTYvsLY value found On Report is '+ItemDeletionDollorTYvsLYReport+'And Value derived using formula is'+ItemDeletionDollorTYvsLY)
			KeywordUtil.markPassed('ItemDeletionDollorTYvsLY value found On Report is	'+ItemDeletionDollorTYvsLYReport+'And Value derived using formula is'+ItemDeletionDollorTYvsLY)
			KeywordUtil.markPassed('ItemDeletionDollorTYvsLY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionDollorTYvsLY',String.valueOf(ItemDeletionDollorTYvsLYReport),String.valueOf(ItemDeletionDollorTYvsLY))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionDollorTYvsLY',String.valueOf(ItemDeletionDollorTYvsLYReport),String.valueOf(ItemDeletionDollorTYvsLY))
			}



			KeywordUtil.logInfo('ItemDeletionDollorTYvsLY value found On Report is'+ItemDeletionDollorTYvsLYReport+'And Value derived using formula is	'+ItemDeletionDollorTYvsLY)
			KeywordUtil.markError('ItemDeletionDollorTYvsLY value found On Report is'+ItemDeletionDollorTYvsLYReport+' And Value derived using formula is'+ItemDeletionDollorTYvsLY)
			KeywordUtil.markError('ItemDeletionDollorTYvsLY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyItemDeletionBeforeTotalDollorTYvsLYValues(double ItemDeletionBeforeTotalDollorTYvsLYReport,double ItemDeletionBeforeTotalDollorTYvsLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionBeforeTotalDollorTYvsLYReport, ItemDeletionBeforeTotalDollorTYvsLY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionBeforeTotalDollorTYvsLY',String.valueOf(ItemDeletionBeforeTotalDollorTYvsLYReport),String.valueOf(ItemDeletionBeforeTotalDollorTYvsLY))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionBeforeTotalDollorTYvsLY',String.valueOf(ItemDeletionBeforeTotalDollorTYvsLYReport),String.valueOf(ItemDeletionBeforeTotalDollorTYvsLY))
			}

			KeywordUtil.logInfo('ItemDeletionBeforeTotalDollorTYvsLY value found On Report is '+ItemDeletionBeforeTotalDollorTYvsLYReport+'And Value derived using formula is'+ItemDeletionBeforeTotalDollorTYvsLY)
			KeywordUtil.markPassed('ItemDeletionBeforeTotalDollorTYvsLY value found On Report is	'+ItemDeletionBeforeTotalDollorTYvsLYReport+'And Value derived using formula is'+ItemDeletionBeforeTotalDollorTYvsLY)
			KeywordUtil.markPassed('ItemDeletionBeforeTotalDollorTYvsLY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionBeforeTotalDollorTYvsLY',String.valueOf(ItemDeletionBeforeTotalDollorTYvsLYReport),String.valueOf(ItemDeletionBeforeTotalDollorTYvsLY))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionBeforeTotalDollorTYvsLY',String.valueOf(ItemDeletionBeforeTotalDollorTYvsLYReport),String.valueOf(ItemDeletionBeforeTotalDollorTYvsLY))
			}



			KeywordUtil.logInfo('ItemDeletionBeforeTotalDollorTYvsLY value found On Report is'+ItemDeletionBeforeTotalDollorTYvsLYReport+'And Value derived using formula is	'+ItemDeletionBeforeTotalDollorTYvsLY)
			KeywordUtil.markError('ItemDeletionBeforeTotalDollorTYvsLY value found On Report is'+ItemDeletionBeforeTotalDollorTYvsLYReport+' And Value derived using formula is'+ItemDeletionBeforeTotalDollorTYvsLY)
			KeywordUtil.markError('ItemDeletionBeforeTotalDollorTYvsLY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyItemDeletionAfterTotalDollorTYvsLYValues(double ItemDeletionAfterTotalDollorTYvsLYReport,double ItemDeletionAfterTotalDollorTYvsLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionAfterTotalDollorTYvsLYReport, ItemDeletionAfterTotalDollorTYvsLY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionAfterTotalDollorTYvsLY',String.valueOf(ItemDeletionAfterTotalDollorTYvsLYReport),String.valueOf(ItemDeletionAfterTotalDollorTYvsLY))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionAfterTotalDollorTYvsLY',String.valueOf(ItemDeletionAfterTotalDollorTYvsLYReport),String.valueOf(ItemDeletionAfterTotalDollorTYvsLY))
			}

			KeywordUtil.logInfo('ItemDeletionAfterTotalDollorTYvsLY value found On Report is '+ItemDeletionAfterTotalDollorTYvsLYReport+'And Value derived using formula is'+ItemDeletionAfterTotalDollorTYvsLY)
			KeywordUtil.markPassed('ItemDeletionAfterTotalDollorTYvsLY value found On Report is	'+ItemDeletionAfterTotalDollorTYvsLYReport+'And Value derived using formula is'+ItemDeletionAfterTotalDollorTYvsLY)
			KeywordUtil.markPassed('ItemDeletionAfterTotalDollorTYvsLY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionAfterTotalDollorTYvsLY',String.valueOf(ItemDeletionAfterTotalDollorTYvsLYReport),String.valueOf(ItemDeletionAfterTotalDollorTYvsLY))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionAfterTotalDollorTYvsLY',String.valueOf(ItemDeletionAfterTotalDollorTYvsLYReport),String.valueOf(ItemDeletionAfterTotalDollorTYvsLY))
			}



			KeywordUtil.logInfo('ItemDeletionAfterTotalDollorTYvsLY value found On Report is'+ItemDeletionAfterTotalDollorTYvsLYReport+'And Value derived using formula is	'+ItemDeletionAfterTotalDollorTYvsLY)
			KeywordUtil.markError('ItemDeletionAfterTotalDollorTYvsLY value found On Report is'+ItemDeletionAfterTotalDollorTYvsLYReport+' And Value derived using formula is'+ItemDeletionAfterTotalDollorTYvsLY)
			KeywordUtil.markError('ItemDeletionAfterTotalDollorTYvsLY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyRefundDollorValues(double RefundDollorReport,double RefundDollor,String store)
	{

		int Decison1=Double.compare(RefundDollorReport, RefundDollor)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('RefundDollor',String.valueOf(RefundDollorReport),String.valueOf(RefundDollor))
			}
			else
			{
				writeExcelAllStorePass('RefundDollor',String.valueOf(RefundDollorReport),String.valueOf(RefundDollor))
			}

			KeywordUtil.logInfo('RefundDollor value found On Report is '+RefundDollorReport+'And Value derived using formula is'+RefundDollor)
			KeywordUtil.markPassed('RefundDollor value found On Report is	'+RefundDollorReport+'And Value derived using formula is'+RefundDollor)
			KeywordUtil.markPassed('RefundDollor----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('RefundDollor',String.valueOf(RefundDollorReport),String.valueOf(RefundDollor))
			}
			else
			{
				writeExcelAllStoreFail('RefundDollor',String.valueOf(RefundDollorReport),String.valueOf(RefundDollor))
			}



			KeywordUtil.logInfo('RefundDollor value found On Report is'+RefundDollorReport+'And Value derived using formula is	'+RefundDollor)
			KeywordUtil.markError('RefundDollor value found On Report is'+RefundDollorReport+' And Value derived using formula is'+RefundDollor)
			KeywordUtil.markError('RefundDollor ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyCancelledTransactionsValues(double CancelledTransactionsReport,double CancelledTransactions,String store)
	{

		int Decison1=Double.compare(CancelledTransactionsReport, CancelledTransactions)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('CancelledTransactions',String.valueOf(CancelledTransactionsReport),String.valueOf(CancelledTransactions))
			}
			else
			{
				writeExcelAllStorePass('CancelledTransactions',String.valueOf(CancelledTransactionsReport),String.valueOf(CancelledTransactions))
			}

			KeywordUtil.logInfo('CancelledTransactions value found On Report is '+CancelledTransactionsReport+'And Value derived using formula is'+CancelledTransactions)
			KeywordUtil.markPassed('CancelledTransactions value found On Report is	'+CancelledTransactionsReport+'And Value derived using formula is'+CancelledTransactions)
			KeywordUtil.markPassed('CancelledTransactions----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('CancelledTransactions',String.valueOf(CancelledTransactionsReport),String.valueOf(CancelledTransactions))
			}
			else
			{
				writeExcelAllStoreFail('CancelledTransactions',String.valueOf(CancelledTransactionsReport),String.valueOf(CancelledTransactions))
			}



			KeywordUtil.logInfo('CancelledTransactions value found On Report is'+CancelledTransactionsReport+'And Value derived using formula is	'+CancelledTransactions)
			KeywordUtil.markError('CancelledTransactions value found On Report is'+CancelledTransactionsReport+' And Value derived using formula is'+CancelledTransactions)
			KeywordUtil.markError('CancelledTransactions ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyVoidTransactionsValues(double VoidTransactionsReport,double VoidTransactions,String store)
	{

		int Decison1=Double.compare(VoidTransactionsReport, VoidTransactions)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('VoidTransactions',String.valueOf(VoidTransactionsReport),String.valueOf(VoidTransactions))
			}
			else
			{
				writeExcelAllStorePass('VoidTransactions',String.valueOf(VoidTransactionsReport),String.valueOf(VoidTransactions))
			}

			KeywordUtil.logInfo('VoidTransactions value found On Report is '+VoidTransactionsReport+'And Value derived using formula is'+VoidTransactions)
			KeywordUtil.markPassed('VoidTransactions value found On Report is	'+VoidTransactionsReport+'And Value derived using formula is'+VoidTransactions)
			KeywordUtil.markPassed('VoidTransactions----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('VoidTransactions',String.valueOf(VoidTransactionsReport),String.valueOf(VoidTransactions))
			}
			else
			{
				writeExcelAllStoreFail('VoidTransactions',String.valueOf(VoidTransactionsReport),String.valueOf(VoidTransactions))
			}



			KeywordUtil.logInfo('VoidTransactions value found On Report is'+VoidTransactionsReport+'And Value derived using formula is	'+VoidTransactions)
			KeywordUtil.markError('VoidTransactions value found On Report is'+VoidTransactionsReport+' And Value derived using formula is'+VoidTransactions)
			KeywordUtil.markError('VoidTransactions ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	//PP




	@Keyword
	def  toVerifyCashOverShortPercentOfSalesTYvsLY_PPValues(double CashOverShortPercentOfSalesTYvsLY_PPReport,double CashOverShortPercentOfSalesTYvsLY_PP,String store)
	{

		int Decison1=Double.compare(CashOverShortPercentOfSalesTYvsLY_PPReport, CashOverShortPercentOfSalesTYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('CashOverShortPercentOfSalesTYvsLY_PP',String.valueOf(CashOverShortPercentOfSalesTYvsLY_PPReport),String.valueOf(CashOverShortPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('CashOverShortPercentOfSalesTYvsLY_PP',String.valueOf(CashOverShortPercentOfSalesTYvsLY_PPReport),String.valueOf(CashOverShortPercentOfSalesTYvsLY_PP))
			}

			KeywordUtil.logInfo('CashOverShortPercentOfSalesTYvsLY_PP value found On Report is '+CashOverShortPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+CashOverShortPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('CashOverShortPercentOfSalesTYvsLY_PP value found On Report is	'+CashOverShortPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+CashOverShortPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('CashOverShortPercentOfSalesTYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('CashOverShortPercentOfSalesTYvsLY_PP',String.valueOf(CashOverShortPercentOfSalesTYvsLY_PPReport),String.valueOf(CashOverShortPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('CashOverShortPercentOfSalesTYvsLY_PP',String.valueOf(CashOverShortPercentOfSalesTYvsLY_PPReport),String.valueOf(CashOverShortPercentOfSalesTYvsLY_PP))
			}



			KeywordUtil.logInfo('CashOverShortPercentOfSalesTYvsLY_PP value found On Report is'+CashOverShortPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is	'+CashOverShortPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('CashOverShortPercentOfSalesTYvsLY_PP value found On Report is'+CashOverShortPercentOfSalesTYvsLY_PPReport+' And Value derived using formula is'+CashOverShortPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('CashOverShortPercentOfSalesTYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyItemDeletionPercentOfSalesTYvsLY_PPValues(double ItemDeletionPercentOfSalesTYvsLY_PPReport,double ItemDeletionPercentOfSalesTYvsLY_PP,String store)
	{

		int Decison1=Double.compare(ItemDeletionPercentOfSalesTYvsLY_PPReport, ItemDeletionPercentOfSalesTYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionPercentOfSalesTYvsLY_PP))
			}

			KeywordUtil.logInfo('ItemDeletionPercentOfSalesTYvsLY_PP value found On Report is '+ItemDeletionPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionPercentOfSalesTYvsLY_PP value found On Report is	'+ItemDeletionPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionPercentOfSalesTYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionPercentOfSalesTYvsLY_PP))
			}



			KeywordUtil.logInfo('ItemDeletionPercentOfSalesTYvsLY_PP value found On Report is'+ItemDeletionPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is	'+ItemDeletionPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('ItemDeletionPercentOfSalesTYvsLY_PP value found On Report is'+ItemDeletionPercentOfSalesTYvsLY_PPReport+' And Value derived using formula is'+ItemDeletionPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('ItemDeletionPercentOfSalesTYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPValues(double ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport,double ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP,String store)
	{

		int Decison1=Double.compare(ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport, ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP))
			}

			KeywordUtil.logInfo('ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP value found On Report is '+ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP value found On Report is	'+ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP))
			}



			KeywordUtil.logInfo('ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP value found On Report is'+ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is	'+ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP value found On Report is'+ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PPReport+' And Value derived using formula is'+ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyItemDeletionAfterTotalPercentOfSalesTYvsLY_PPValues(double ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport,double ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP,String store)
	{

		int Decison1=Double.compare(ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport, ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP))
			}

			KeywordUtil.logInfo('ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP value found On Report is '+ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP value found On Report is	'+ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP',String.valueOf(ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport),String.valueOf(ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP))
			}



			KeywordUtil.logInfo('ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP value found On Report is'+ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is	'+ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP value found On Report is'+ItemDeletionAfterTotalPercentOfSalesTYvsLY_PPReport+' And Value derived using formula is'+ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyRefundPercentOfSalesTYvsLY_PPValues(double RefundPercentOfSalesTYvsLY_PPReport,double RefundPercentOfSalesTYvsLY_PP,String store)
	{

		int Decison1=Double.compare(RefundPercentOfSalesTYvsLY_PPReport, RefundPercentOfSalesTYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('RefundPercentOfSalesTYvsLY_PP',String.valueOf(RefundPercentOfSalesTYvsLY_PPReport),String.valueOf(RefundPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('RefundPercentOfSalesTYvsLY_PP',String.valueOf(RefundPercentOfSalesTYvsLY_PPReport),String.valueOf(RefundPercentOfSalesTYvsLY_PP))
			}

			KeywordUtil.logInfo('RefundPercentOfSalesTYvsLY_PP value found On Report is '+RefundPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+RefundPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('RefundPercentOfSalesTYvsLY_PP value found On Report is	'+RefundPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+RefundPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('RefundPercentOfSalesTYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('RefundPercentOfSalesTYvsLY_PP',String.valueOf(RefundPercentOfSalesTYvsLY_PPReport),String.valueOf(RefundPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('RefundPercentOfSalesTYvsLY_PP',String.valueOf(RefundPercentOfSalesTYvsLY_PPReport),String.valueOf(RefundPercentOfSalesTYvsLY_PP))
			}



			KeywordUtil.logInfo('RefundPercentOfSalesTYvsLY_PP value found On Report is'+RefundPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is	'+RefundPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('RefundPercentOfSalesTYvsLY_PP value found On Report is'+RefundPercentOfSalesTYvsLY_PPReport+' And Value derived using formula is'+RefundPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('RefundPercentOfSalesTYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyCancelledTransactionPercentOfSalesTYvsLY_PPValues(double CancelledTransactionPercentOfSalesTYvsLY_PPReport,double CancelledTransactionPercentOfSalesTYvsLY_PP,String store)
	{

		int Decison1=Double.compare(CancelledTransactionPercentOfSalesTYvsLY_PPReport, CancelledTransactionPercentOfSalesTYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('CancelledTransactionPercentOfSalesTYvsLY_PP',String.valueOf(CancelledTransactionPercentOfSalesTYvsLY_PPReport),String.valueOf(CancelledTransactionPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('CancelledTransactionPercentOfSalesTYvsLY_PP',String.valueOf(CancelledTransactionPercentOfSalesTYvsLY_PPReport),String.valueOf(CancelledTransactionPercentOfSalesTYvsLY_PP))
			}

			KeywordUtil.logInfo('CancelledTransactionPercentOfSalesTYvsLY_PP value found On Report is '+CancelledTransactionPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+CancelledTransactionPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('CancelledTransactionPercentOfSalesTYvsLY_PP value found On Report is	'+CancelledTransactionPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+CancelledTransactionPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('CancelledTransactionPercentOfSalesTYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('CancelledTransactionPercentOfSalesTYvsLY_PP',String.valueOf(CancelledTransactionPercentOfSalesTYvsLY_PPReport),String.valueOf(CancelledTransactionPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('CancelledTransactionPercentOfSalesTYvsLY_PP',String.valueOf(CancelledTransactionPercentOfSalesTYvsLY_PPReport),String.valueOf(CancelledTransactionPercentOfSalesTYvsLY_PP))
			}



			KeywordUtil.logInfo('CancelledTransactionPercentOfSalesTYvsLY_PP value found On Report is'+CancelledTransactionPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is	'+CancelledTransactionPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('CancelledTransactionPercentOfSalesTYvsLY_PP value found On Report is'+CancelledTransactionPercentOfSalesTYvsLY_PPReport+' And Value derived using formula is'+CancelledTransactionPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('CancelledTransactionPercentOfSalesTYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyVoidTransactionsPercentOfSalesTYvsLY_PPValues(double VoidTransactionsPercentOfSalesTYvsLY_PPReport,double VoidTransactionsPercentOfSalesTYvsLY_PP,String store)
	{

		int Decison1=Double.compare(VoidTransactionsPercentOfSalesTYvsLY_PPReport, VoidTransactionsPercentOfSalesTYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('VoidTransactionsPercentOfSalesTYvsLY_PP',String.valueOf(VoidTransactionsPercentOfSalesTYvsLY_PPReport),String.valueOf(VoidTransactionsPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('VoidTransactionsPercentOfSalesTYvsLY_PP',String.valueOf(VoidTransactionsPercentOfSalesTYvsLY_PPReport),String.valueOf(VoidTransactionsPercentOfSalesTYvsLY_PP))
			}

			KeywordUtil.logInfo('VoidTransactionsPercentOfSalesTYvsLY_PP value found On Report is '+VoidTransactionsPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+VoidTransactionsPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('VoidTransactionsPercentOfSalesTYvsLY_PP value found On Report is	'+VoidTransactionsPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is'+VoidTransactionsPercentOfSalesTYvsLY_PP)
			KeywordUtil.markPassed('VoidTransactionsPercentOfSalesTYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('VoidTransactionsPercentOfSalesTYvsLY_PP',String.valueOf(VoidTransactionsPercentOfSalesTYvsLY_PPReport),String.valueOf(VoidTransactionsPercentOfSalesTYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('VoidTransactionsPercentOfSalesTYvsLY_PP',String.valueOf(VoidTransactionsPercentOfSalesTYvsLY_PPReport),String.valueOf(VoidTransactionsPercentOfSalesTYvsLY_PP))
			}



			KeywordUtil.logInfo('VoidTransactionsPercentOfSalesTYvsLY_PP value found On Report is'+VoidTransactionsPercentOfSalesTYvsLY_PPReport+'And Value derived using formula is	'+VoidTransactionsPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('VoidTransactionsPercentOfSalesTYvsLY_PP value found On Report is'+VoidTransactionsPercentOfSalesTYvsLY_PPReport+' And Value derived using formula is'+VoidTransactionsPercentOfSalesTYvsLY_PP)
			KeywordUtil.markError('VoidTransactionsPercentOfSalesTYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	//count



	@Keyword
	def  toVerifyItemDeletionCountTYvsLYValues(double ItemDeletionCountTYvsLYReport,double ItemDeletionCountTYvsLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionCountTYvsLYReport, ItemDeletionCountTYvsLY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionCountTYvsLY',String.valueOf(ItemDeletionCountTYvsLYReport),String.valueOf(ItemDeletionCountTYvsLY))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionCountTYvsLY',String.valueOf(ItemDeletionCountTYvsLYReport),String.valueOf(ItemDeletionCountTYvsLY))
			}

			KeywordUtil.logInfo('ItemDeletionCountTYvsLY value found On Report is '+ItemDeletionCountTYvsLYReport+'And Value derived using formula is'+ItemDeletionCountTYvsLY)
			KeywordUtil.markPassed('ItemDeletionCountTYvsLY value found On Report is	'+ItemDeletionCountTYvsLYReport+'And Value derived using formula is'+ItemDeletionCountTYvsLY)
			KeywordUtil.markPassed('ItemDeletionCountTYvsLY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionCountTYvsLY',String.valueOf(ItemDeletionCountTYvsLYReport),String.valueOf(ItemDeletionCountTYvsLY))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionCountTYvsLY',String.valueOf(ItemDeletionCountTYvsLYReport),String.valueOf(ItemDeletionCountTYvsLY))
			}



			KeywordUtil.logInfo('ItemDeletionCountTYvsLY value found On Report is'+ItemDeletionCountTYvsLYReport+'And Value derived using formula is	'+ItemDeletionCountTYvsLY)
			KeywordUtil.markError('ItemDeletionCountTYvsLY value found On Report is'+ItemDeletionCountTYvsLYReport+' And Value derived using formula is'+ItemDeletionCountTYvsLY)
			KeywordUtil.markError('ItemDeletionCountTYvsLY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyCancelledTransactionCountTYvsLYValues(double CancelledTransactionCountTYvsLYReport,double CancelledTransactionCountTYvsLY,String store)
	{

		int Decison1=Double.compare(CancelledTransactionCountTYvsLYReport, CancelledTransactionCountTYvsLY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('CancelledTransactionCountTYvsLY',String.valueOf(CancelledTransactionCountTYvsLYReport),String.valueOf(CancelledTransactionCountTYvsLY))
			}
			else
			{
				writeExcelAllStorePass('CancelledTransactionCountTYvsLY',String.valueOf(CancelledTransactionCountTYvsLYReport),String.valueOf(CancelledTransactionCountTYvsLY))
			}

			KeywordUtil.logInfo('CancelledTransactionCountTYvsLY value found On Report is '+CancelledTransactionCountTYvsLYReport+'And Value derived using formula is'+CancelledTransactionCountTYvsLY)
			KeywordUtil.markPassed('CancelledTransactionCountTYvsLY value found On Report is	'+CancelledTransactionCountTYvsLYReport+'And Value derived using formula is'+CancelledTransactionCountTYvsLY)
			KeywordUtil.markPassed('CancelledTransactionCountTYvsLY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('CancelledTransactionCountTYvsLY',String.valueOf(CancelledTransactionCountTYvsLYReport),String.valueOf(CancelledTransactionCountTYvsLY))
			}
			else
			{
				writeExcelAllStoreFail('CancelledTransactionCountTYvsLY',String.valueOf(CancelledTransactionCountTYvsLYReport),String.valueOf(CancelledTransactionCountTYvsLY))
			}



			KeywordUtil.logInfo('CancelledTransactionCountTYvsLY value found On Report is'+CancelledTransactionCountTYvsLYReport+'And Value derived using formula is	'+CancelledTransactionCountTYvsLY)
			KeywordUtil.markError('CancelledTransactionCountTYvsLY value found On Report is'+CancelledTransactionCountTYvsLYReport+' And Value derived using formula is'+CancelledTransactionCountTYvsLY)
			KeywordUtil.markError('CancelledTransactionCountTYvsLY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyItemDeletionBeforeTotalCountTYvsLYValues(double ItemDeletionBeforeTotalCountTYvsLYReport,double ItemDeletionBeforeTotalCountTYvsLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionBeforeTotalCountTYvsLYReport, ItemDeletionBeforeTotalCountTYvsLY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionBeforeTotalCountTYvsLY',String.valueOf(ItemDeletionBeforeTotalCountTYvsLYReport),String.valueOf(ItemDeletionBeforeTotalCountTYvsLY))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionBeforeTotalCountTYvsLY',String.valueOf(ItemDeletionBeforeTotalCountTYvsLYReport),String.valueOf(ItemDeletionBeforeTotalCountTYvsLY))
			}

			KeywordUtil.logInfo('ItemDeletionBeforeTotalCountTYvsLY value found On Report is '+ItemDeletionBeforeTotalCountTYvsLYReport+'And Value derived using formula is'+ItemDeletionBeforeTotalCountTYvsLY)
			KeywordUtil.markPassed('ItemDeletionBeforeTotalCountTYvsLY value found On Report is	'+ItemDeletionBeforeTotalCountTYvsLYReport+'And Value derived using formula is'+ItemDeletionBeforeTotalCountTYvsLY)
			KeywordUtil.markPassed('ItemDeletionBeforeTotalCountTYvsLY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionBeforeTotalCountTYvsLY',String.valueOf(ItemDeletionBeforeTotalCountTYvsLYReport),String.valueOf(ItemDeletionBeforeTotalCountTYvsLY))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionBeforeTotalCountTYvsLY',String.valueOf(ItemDeletionBeforeTotalCountTYvsLYReport),String.valueOf(ItemDeletionBeforeTotalCountTYvsLY))
			}



			KeywordUtil.logInfo('ItemDeletionBeforeTotalCountTYvsLY value found On Report is'+ItemDeletionBeforeTotalCountTYvsLYReport+'And Value derived using formula is	'+ItemDeletionBeforeTotalCountTYvsLY)
			KeywordUtil.markError('ItemDeletionBeforeTotalCountTYvsLY value found On Report is'+ItemDeletionBeforeTotalCountTYvsLYReport+' And Value derived using formula is'+ItemDeletionBeforeTotalCountTYvsLY)
			KeywordUtil.markError('ItemDeletionBeforeTotalCountTYvsLY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyItemDeletionAfterTotalCountTYvsLYValues(double ItemDeletionAfterTotalCountTYvsLYReport,double ItemDeletionAfterTotalCountTYvsLY,String store)
	{

		int Decison1=Double.compare(ItemDeletionAfterTotalCountTYvsLYReport, ItemDeletionAfterTotalCountTYvsLY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionAfterTotalCountTYvsLY',String.valueOf(ItemDeletionAfterTotalCountTYvsLYReport),String.valueOf(ItemDeletionAfterTotalCountTYvsLY))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionAfterTotalCountTYvsLY',String.valueOf(ItemDeletionAfterTotalCountTYvsLYReport),String.valueOf(ItemDeletionAfterTotalCountTYvsLY))
			}

			KeywordUtil.logInfo('ItemDeletionAfterTotalCountTYvsLY value found On Report is '+ItemDeletionAfterTotalCountTYvsLYReport+'And Value derived using formula is'+ItemDeletionAfterTotalCountTYvsLY)
			KeywordUtil.markPassed('ItemDeletionAfterTotalCountTYvsLY value found On Report is	'+ItemDeletionAfterTotalCountTYvsLYReport+'And Value derived using formula is'+ItemDeletionAfterTotalCountTYvsLY)
			KeywordUtil.markPassed('ItemDeletionAfterTotalCountTYvsLY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionAfterTotalCountTYvsLY',String.valueOf(ItemDeletionAfterTotalCountTYvsLYReport),String.valueOf(ItemDeletionAfterTotalCountTYvsLY))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionAfterTotalCountTYvsLY',String.valueOf(ItemDeletionAfterTotalCountTYvsLYReport),String.valueOf(ItemDeletionAfterTotalCountTYvsLY))
			}



			KeywordUtil.logInfo('ItemDeletionAfterTotalCountTYvsLY value found On Report is'+ItemDeletionAfterTotalCountTYvsLYReport+'And Value derived using formula is	'+ItemDeletionAfterTotalCountTYvsLY)
			KeywordUtil.markError('ItemDeletionAfterTotalCountTYvsLY value found On Report is'+ItemDeletionAfterTotalCountTYvsLYReport+' And Value derived using formula is'+ItemDeletionAfterTotalCountTYvsLY)
			KeywordUtil.markError('ItemDeletionAfterTotalCountTYvsLY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyVoidTransactionsCountTYvsLYValues(double VoidTransactionsCountTYvsLYReport,double VoidTransactionsCountTYvsLY,String store)
	{

		int Decison1=Double.compare(VoidTransactionsCountTYvsLYReport, VoidTransactionsCountTYvsLY)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('VoidTransactionsCountTYvsLY',String.valueOf(VoidTransactionsCountTYvsLYReport),String.valueOf(VoidTransactionsCountTYvsLY))
			}
			else
			{
				writeExcelAllStorePass('VoidTransactionsCountTYvsLY',String.valueOf(VoidTransactionsCountTYvsLYReport),String.valueOf(VoidTransactionsCountTYvsLY))
			}

			KeywordUtil.logInfo('VoidTransactionsCountTYvsLY value found On Report is '+VoidTransactionsCountTYvsLYReport+'And Value derived using formula is'+VoidTransactionsCountTYvsLY)
			KeywordUtil.markPassed('VoidTransactionsCountTYvsLY value found On Report is	'+VoidTransactionsCountTYvsLYReport+'And Value derived using formula is'+VoidTransactionsCountTYvsLY)
			KeywordUtil.markPassed('VoidTransactionsCountTYvsLY----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('VoidTransactionsCountTYvsLY',String.valueOf(VoidTransactionsCountTYvsLYReport),String.valueOf(VoidTransactionsCountTYvsLY))
			}
			else
			{
				writeExcelAllStoreFail('VoidTransactionsCountTYvsLY',String.valueOf(VoidTransactionsCountTYvsLYReport),String.valueOf(VoidTransactionsCountTYvsLY))
			}



			KeywordUtil.logInfo('VoidTransactionsCountTYvsLY value found On Report is'+VoidTransactionsCountTYvsLYReport+'And Value derived using formula is	'+VoidTransactionsCountTYvsLY)
			KeywordUtil.markError('VoidTransactionsCountTYvsLY value found On Report is'+VoidTransactionsCountTYvsLYReport+' And Value derived using formula is'+VoidTransactionsCountTYvsLY)
			KeywordUtil.markError('VoidTransactionsCountTYvsLY ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	//Total Transaction count


	@Keyword
	def  toVerifyItemDeletionCountPercentOfTotalTransactionsYvsLY_PPValues(double ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport,double ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP,String store)
	{

		int Decison1=Double.compare(ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport, ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP))
			}

			KeywordUtil.logInfo('ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP value found On Report is '+ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP value found On Report is	'+ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP))
			}



			KeywordUtil.logInfo('ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP value found On Report is'+ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is	'+ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markError('ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP value found On Report is'+ItemDeletionCountPercentOfTotalTransactionsYvsLY_PPReport+' And Value derived using formula is'+ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markError('ItemDeletionCountPercentOfTotalTransactionsYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


	@Keyword
	def  toVerifyCancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPValues(double CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport,double CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP,String store)
	{

		int Decison1=Double.compare(CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport, CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP))
			}

			KeywordUtil.logInfo('CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP value found On Report is '+CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is'+CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markPassed('CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP value found On Report is	'+CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is'+CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markPassed('CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP))
			}



			KeywordUtil.logInfo('CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP value found On Report is'+CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is	'+CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markError('CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP value found On Report is'+CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport+' And Value derived using formula is'+CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markError('CancelledTransactionsCountPercentOfTotalTransactionsYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPValues(double ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport,double ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP,String store)
	{

		int Decison1=Double.compare(ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport, ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP))
			}

			KeywordUtil.logInfo('ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP value found On Report is '+ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP value found On Report is	'+ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP))
			}



			KeywordUtil.logInfo('ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP value found On Report is'+ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is	'+ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markError('ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP value found On Report is'+ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PPReport+' And Value derived using formula is'+ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markError('ItemDeletionBeforeTotalCountPercentOfTotalTransactionsYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPValues(double ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport,double ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP,String store)
	{

		int Decison1=Double.compare(ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport, ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP))
			}

			KeywordUtil.logInfo('ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP value found On Report is '+ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP value found On Report is	'+ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is'+ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markPassed('ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP))
			}



			KeywordUtil.logInfo('ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP value found On Report is'+ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is	'+ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markError('ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP value found On Report is'+ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PPReport+' And Value derived using formula is'+ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markError('ItemDeletionAfterTotalCountPercentOfTotalTransactionsYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}



	@Keyword
	def  toVerifyVoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPValues(double VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport,double VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP,String store)
	{

		int Decison1=Double.compare(VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport, VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP)




		if(Decison1==0)
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelPassFormulaCheck('VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP))
			}
			else
			{
				writeExcelAllStorePass('VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP))
			}

			KeywordUtil.logInfo('VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP value found On Report is '+VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is'+VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markPassed('VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP value found On Report is	'+VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is'+VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markPassed('VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP----> Value derived using formula is matching with tabel value.')
		}

		else
		{
			if(store.equalsIgnoreCase('Single'))
			{
				writeExcelDailyFormulaCheck('VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP))
			}
			else
			{
				writeExcelAllStoreFail('VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP',String.valueOf(VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport),String.valueOf(VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP))
			}



			KeywordUtil.logInfo('VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP value found On Report is'+VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport+'And Value derived using formula is	'+VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markError('VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP value found On Report is'+VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PPReport+' And Value derived using formula is'+VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP)
			KeywordUtil.markError('VoidTransactionsCountPercentOfTotalTransactionsYvsLY_PP ----> Value derived using formula is NOT MATCHING with tabel value.')
		}
	}


}














