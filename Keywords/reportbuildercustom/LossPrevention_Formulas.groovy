package reportbuildercustom

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

import internal.GlobalVariable

public class LossPrevention_Formulas
{





	@Keyword
	def double calculate_CashOverShortPercentofSalesTY(double CashOverShortDollorTY, double NetSalesTY)
	{


		double dblCashOverShortTYPercent=NetSalesTY == 0 ? 0 :CashOverShortDollorTY/NetSalesTY*100;
		double CashOverShortTYPercent= Math.round(dblCashOverShortTYPercent * 100) / 100
		return CashOverShortTYPercent
	}


	@Keyword
	def double calculate_ItemDeletionPercentOfSalesTY(double ItemDeletionDollorTY, double NetSalesTY)
	{

		double dblItemDeletionPercnetTY=NetSalesTY == 0 ? 0 :ItemDeletionDollorTY/NetSalesTY*100;
		double ItemDeletionPercnetTY= Math.round(dblItemDeletionPercnetTY * 100) / 100
		return ItemDeletionPercnetTY
	}


	@Keyword
	def double calculate_ItemDeletionBeforePercentOfSalesTY(double ItemDeletionBeforeDollorTY, double NetSalesTY)
	{

		double dblItemBeforeDeletionPercnetTY=NetSalesTY == 0 ? 0 :ItemDeletionBeforeDollorTY/NetSalesTY*100;
		double ItemBeforeDeletionPercnetTY= Math.round(dblItemBeforeDeletionPercnetTY * 100) / 100
		return ItemBeforeDeletionPercnetTY
	}

	@Keyword
	def double calculate_ItemDeletionAfterPercentOfSalesTY(double ItemDeletionBeforeDollorTY, double NetSalesTY)
	{

		double dblItemBeforeDeletionPercnetTY=NetSalesTY == 0 ? 0 :ItemDeletionBeforeDollorTY/NetSalesTY*100;
		double ItemBeforeDeletionPercnetTY= Math.round(dblItemBeforeDeletionPercnetTY * 100) / 100
		return ItemBeforeDeletionPercnetTY
	}

	@Keyword
	def double calculate_RefundPercentOfSalesTY(double RefundDollorTY, double NetSalesTY)
	{

		double dblRefundPercnetTY=NetSalesTY == 0 ? 0 :RefundDollorTY/NetSalesTY*100;
		double RefundPercnetTY= Math.round(dblRefundPercnetTY * 100) / 100
		return RefundPercnetTY
	}

	@Keyword
	def double calculate_CancelledTransactionPercentOfSalesTY(double CancelledTransactionDollorTY, double NetSalesTY)
	{

		double dblCancelledTransactionPercnetTY=NetSalesTY == 0 ? 0 :CancelledTransactionDollorTY/NetSalesTY*100;
		double CancelledTransactionPercnetTY= Math.round(dblCancelledTransactionPercnetTY * 100) / 100
		return CancelledTransactionPercnetTY
	}

	@Keyword
	def double calculate_VoidTransactionPercentOfSalesTY(double VoidTransactionDollorTY, double NetSalesTY)
	{

		double dblVoidTransactionPercnetTY=NetSalesTY == 0 ? 0 :VoidTransactionDollorTY/NetSalesTY*100;
		double VoidTransactionPercnetTY= Math.round(dblVoidTransactionPercnetTY * 100) / 100
		return VoidTransactionPercnetTY
	}





	//Last Year


	@Keyword
	def double calculate_CashOverShortPercentofSalesLY(double CashOverShortDollorLY, double NetSalesLY)

	{


		double dblCashOverShortLYPercent=NetSalesLY == 0 ? 0 :CashOverShortDollorLY/NetSalesLY*100;
		double CashOverShortLYPercent= Math.round(dblCashOverShortLYPercent * 100) / 100
		return CashOverShortLYPercent


	}


	@Keyword
	def double calculate_ItemDeletionPercentOfSalesLY(double ItemDeletionDollorLY, double NetSalesLY)


	{

		double dblItemDeletionPercnetLY=NetSalesLY == 0 ? 0 :ItemDeletionDollorLY/NetSalesLY*100;
		double ItemDeletionPercnetLY= Math.round(dblItemDeletionPercnetLY * 100) / 100
		return ItemDeletionPercnetLY


	}


	@Keyword
	def double calculate_ItemDeletionBeforePercentOfSalesLY(double ItemDeletionBeforeDollorLY, double NetSalesLY)


	{

		double dblItemBeforeDeletionPercnetLY=NetSalesLY == 0 ? 0 :ItemDeletionBeforeDollorLY/NetSalesLY*100;
		double ItemBeforeDeletionPercnetLY= Math.round(dblItemBeforeDeletionPercnetLY * 100) / 100
		return ItemBeforeDeletionPercnetLY


	}

	@Keyword
	def double calculate_ItemDeletionAfterPercentOfSalesLY(double ItemDeletionBeforeDollorLY, double NetSalesLY)


	{

		double dblItemBeforeDeletionPercnetLY=NetSalesLY == 0 ? 0 :ItemDeletionBeforeDollorLY/NetSalesLY*100;
		double ItemBeforeDeletionPercnetLY= Math.round(dblItemBeforeDeletionPercnetLY * 100) / 100
		return ItemBeforeDeletionPercnetLY


	}

	@Keyword
	def double calculate_RefundPercentOfSalesLY(double RefundDollorLY, double NetSalesLY)


	{

		double dblRefundPercnetLY=NetSalesLY == 0 ? 0 :RefundDollorLY/NetSalesLY*100;
		double RefundPercnetLY= Math.round(dblRefundPercnetLY * 100) / 100
		return RefundPercnetLY


	}

	@Keyword
	def double calculate_CancelledTransactionPercentOfSalesLY(double CancelledTransactionDollorLY, double NetSalesLY)


	{

		double dblCancelledTransactionPercnetLY=NetSalesLY == 0 ? 0 :CancelledTransactionDollorLY/NetSalesLY*100;
		double CancelledTransactionPercnetLY= Math.round(dblCancelledTransactionPercnetLY * 100) / 100
		return CancelledTransactionPercnetLY


	}

	@Keyword
	def double calculate_VoidTransactionPercentOfSalesLY(double VoidTransactionDollorLY, double NetSalesLY)


	{

		double dblVoidTransactionPercnetLY=NetSalesLY == 0 ? 0 :VoidTransactionDollorLY/NetSalesLY*100;
		double VoidTransactionPercnetLY= Math.round(dblVoidTransactionPercnetLY * 100) / 100
		return VoidTransactionPercnetLY


	}



	//Total transaction


	@Keyword
	def double calculate_ItemDeletionCountPercentofTotalTransactionsTY(double ItemDeletionCountTY, double GuestCountTY)



	{

		double dblItemDeletionCountTY=GuestCountTY == 0 ? 0 :ItemDeletionCountTY/GuestCountTY*100;
		double ItemDeletionCountPercentTY= Math.round(dblItemDeletionCountTY * 100) / 100
		return ItemDeletionCountPercentTY


	}

	@Keyword
	def double calculate_CancelledTransCountPercentofTotalTransactionsTY(double CancelledTransCountTY, double GuestCountTY)



	{

		double dblCancelledTransCountTYPercentTY=GuestCountTY == 0 ? 0 :CancelledTransCountTY/GuestCountTY*100;
		double CancelledTransCountTYPercentTY= Math.round(dblCancelledTransCountTYPercentTY * 100) / 100
		return CancelledTransCountTYPercentTY


	}


	@Keyword
	def double calculate_ItemDeletionBeforeTotalCountPercentofTotalTransactionsTY(double ItemDeletionBeforeCountTY, double GuestCountTY)




	{

		double dblItemDeletionBeforeCountTY=GuestCountTY == 0 ? 0 :ItemDeletionBeforeCountTY/GuestCountTY*100;
		double ItemDeletionBeforeCountPercentTY= Math.round(dblItemDeletionBeforeCountTY * 100) / 100
		return ItemDeletionBeforeCountPercentTY


	}

	@Keyword
	def double calculate_ItemDeletionAfterTotalCountPercentofTotalTransactionsTY(double ItemDeletionAfterCountTY, double GuestCountTY)




	{

		double dblItemDeletionAfterCountTY=GuestCountTY == 0 ? 0 :ItemDeletionAfterCountTY/GuestCountTY*100;
		double ItemDeletionAfterCountPercentTY= Math.round(dblItemDeletionAfterCountTY * 100) / 100
		return ItemDeletionAfterCountPercentTY


	}

	@Keyword
	def double calculate_VoidTransactionCountPercentofTotalTransactionsTY(double VoidTransactionCountTY, double GuestCountTY)




	{

		double dblVoidTransactionCountTY=GuestCountTY == 0 ? 0 :VoidTransactionCountTY/GuestCountTY*100;
		double VoidTransactionCountTYCountPercentTY= Math.round(dblVoidTransactionCountTY * 100) / 100
		return VoidTransactionCountTYCountPercentTY


	}


	//Last Year total transactions



	@Keyword
	def double calculate_ItemDeletionCountPercentofTotalTransactionsLY(double ItemDeletionCountLY, double GuestCountLY)



	{

		double dblItemDeletionCountLY=GuestCountLY == 0 ? 0 :ItemDeletionCountLY/GuestCountLY*100;
		double ItemDeletionCountPercentLY= Math.round(dblItemDeletionCountLY * 100) / 100
		return ItemDeletionCountPercentLY


	}

	@Keyword
	def double calculate_CancelledTransCountPercentofTotalTransactionsLY(double CancelledTransCountLY, double GuestCountLY)



	{

		double dblCancelledTransCountTYPercentLY=GuestCountLY == 0 ? 0 :CancelledTransCountLY/GuestCountLY*100;
		double CancelledTransCountTYPercentLY= Math.round(dblCancelledTransCountTYPercentLY * 100) / 100
		return CancelledTransCountTYPercentLY


	}


	@Keyword
	def double calculate_ItemDeletionBeforeTotalCountPercentofTotalTransactionsLY(double ItemDeletionBeforeCountLY, double GuestCountLY)




	{

		double dblItemDeletionBeforeCountLY=GuestCountLY == 0 ? 0 :ItemDeletionBeforeCountLY/GuestCountLY*100;
		double ItemDeletionBeforeCountPercentLY= Math.round(dblItemDeletionBeforeCountLY * 100) / 100
		return ItemDeletionBeforeCountPercentLY


	}

	@Keyword
	def double calculate_ItemDeletionAfterTotalCountPercentofTotalTransactionsLY(double ItemDeletionAfterCountLY, double GuestCountLY)




	{

		double dblItemDeletionAfterCountLY=GuestCountLY == 0 ? 0 :ItemDeletionAfterCountLY/GuestCountLY*100;
		double ItemDeletionAfterCountPercentLY= Math.round(dblItemDeletionAfterCountLY * 100) / 100
		return ItemDeletionAfterCountPercentLY


	}

	@Keyword
	def double calculate_VoidTransactionCountPercentofTotalTransactionsLY(double VoidTransactionCountLY, double GuestCountLY)




	{

		double dblVoidTransactionCountLY=GuestCountLY == 0 ? 0 :VoidTransactionCountLY/GuestCountLY*100;
		double VoidTransactionCountTYCountPercentLY= Math.round(dblVoidTransactionCountLY * 100) / 100
		return VoidTransactionCountTYCountPercentLY


	}



	//Column Name ( TY vs LY )


	@Keyword
	def double calculate_CashOverShortDollorTYvsLY(double CashOverShortTY, double CashOverShortLY)
	{

		double dblCashOverShortTYvsLY=CashOverShortTY-CashOverShortLY
		double CashOverShortTYvsLY= Math.round(dblCashOverShortTYvsLY * 100) / 100
		return CashOverShortTYvsLY
	}



	@Keyword
	def double calculate_ItemDeletionTYvsLY(double ItemDeletionTY, double ItemDeletionLY)
	{

		double dblItemDeletionTYvsLY=ItemDeletionTY-ItemDeletionLY
		double ItemDeletionTYvsLY= Math.round(dblItemDeletionTYvsLY * 100) / 100
		return ItemDeletionTYvsLY
	}


	@Keyword
	def double calculate_ItemDeletionBeforeTotalTYvsLY(double ItemDeletionBeforeTotalTY, double ItemDeletionBeforeTotalLY)
	{

		double dblItemDeletionBeforeTotalTYvsLY=ItemDeletionBeforeTotalTY-ItemDeletionBeforeTotalLY
		double ItemDeletionBeforeTotalTYvsLY= Math.round(dblItemDeletionBeforeTotalTYvsLY * 100) / 100
		return ItemDeletionBeforeTotalTYvsLY
	}



	@Keyword
	def double calculate_ItemDeletionAfterTotalTYvsLY(double ItemDeletionAfterTotalTY, double ItemDeletionAfterTotalLY)
	{

		double dblItemDeletionAfterTotalTYvsLY=ItemDeletionAfterTotalTY-ItemDeletionAfterTotalLY
		double ItemDeletionAfterTotalTYvsLY= Math.round(dblItemDeletionAfterTotalTYvsLY * 100) / 100
		return ItemDeletionAfterTotalTYvsLY
	}

	@Keyword
	def double calculate_RefundTYvsLY(double RefundTY, double RefundLY)
	{

		double dblRefundTYvsLY=RefundTY-RefundLY
		double RefundTyvsLy= Math.round(dblRefundTYvsLY * 100) / 100
		return RefundTyvsLy
	}

	@Keyword
	def double calculate_CancelledTransactionTYvsLY(double CancelledTransactionTY, double CancelledTransactionLY)
	{

		double dblCancelledTransactionTYvsLY=CancelledTransactionTY-CancelledTransactionLY
		double CancelledTransactionTyvsLy= Math.round(dblCancelledTransactionTYvsLY * 100) / 100
		return CancelledTransactionTyvsLy
	}

	@Keyword
	def double calculate_VoidTransactionTYvsLY(double VoidTransactionTY, double VoidTransactionLY)
	{

		double dblVoidTransactionTYvsLY=VoidTransactionTY-VoidTransactionLY
		double VoidTransactionTyvsLy= Math.round(dblVoidTransactionTYvsLY * 100) / 100
		return VoidTransactionTyvsLy
	}


	//Column Name ( TY vs LY ) PP

	@Keyword
	def double calculate_CashOverShortPercentOfSalesTYvsLY_PP(double CashOverShortPercentOfSalesTY, double CashOverShortPercentOfSalesLY)
	{

		double dblCashOverShortTYvsLY=CashOverShortPercentOfSalesTY-CashOverShortPercentOfSalesLY
		double CashOverShortTYvsLY= Math.round(dblCashOverShortTYvsLY * 100) / 100
		return CashOverShortTYvsLY
	}

	@Keyword
	def double calculate_ItemDeletionPercentOfSalesTYvsLY_PP(double ItemDeletionPercentOfSalesTY, double ItemDeletionPercentOfSalesLY)
	{

		double dblItemDeletionTYvsLY=ItemDeletionPercentOfSalesTY-ItemDeletionPercentOfSalesLY
		double ItemDeletionTYvsLY= Math.round(dblItemDeletionTYvsLY * 100) / 100
		return ItemDeletionTYvsLY
	}

	@Keyword
	def double calculate_ItemDeletionBeforeTotalPercentOfSalesTYvsLY_PP(double ItemDeletionBeforeTotalPercentOfSalesTY, double ItemDeletionBeforeTotalPercentOfSalesLY)
	{

		double dblItemDeletionBeforeTotalTYvsLY=ItemDeletionBeforeTotalPercentOfSalesTY-ItemDeletionBeforeTotalPercentOfSalesLY
		double ItemDeletionBeforeTotalTYvsLY= Math.round(dblItemDeletionBeforeTotalTYvsLY * 100) / 100
		return ItemDeletionBeforeTotalTYvsLY
	}

	@Keyword
	def double calculate_ItemDeletionAfterTotalPercentOfSalesTYvsLY_PP(double ItemDeletionAfterTotalPercentOfSalesTY, double ItemDeletionAfterTotalPercentOfSalesLY)
	{

		double dblItemDeletionAfterTotalTYvsLY=ItemDeletionAfterTotalPercentOfSalesTY-ItemDeletionAfterTotalPercentOfSalesLY
		double ItemDeletionAfterTotalTYvsLY= Math.round(dblItemDeletionAfterTotalTYvsLY * 100) / 100
		return ItemDeletionAfterTotalTYvsLY
	}

	@Keyword
	def double calculate_RefundPercentOfSalesTYvsLY_PP(double RefundPercentOfSalesTY, double RefundPercentOfSalesLY)
	{

		double dblRefundTYvsLY=RefundPercentOfSalesTY-RefundPercentOfSalesLY
		double RefundTYvsLY= Math.round(dblRefundTYvsLY * 100) / 100
		return RefundTYvsLY
	}

	@Keyword
	def double calculate_CancelledTransactionPercentOfSalesTYvsLY_PP(double CancelledTransactionPercentOfSalesTY, double CancelledTransactionPercentOfSalesLY)
	{

		double dblCancelledTransactionTYvsLY=CancelledTransactionPercentOfSalesTY-CancelledTransactionPercentOfSalesLY
		double CancelledTransactionTYvsLY= Math.round(dblCancelledTransactionTYvsLY * 100) / 100
		return CancelledTransactionTYvsLY
	}

	@Keyword
	def double calculate_VoidTransactionPercentOfSalesTYvsLY_PP(double VoidTransactionPercentOfSalesTY, double VoidTransactionPercentOfSalesLY)
	{

		double dblVoidTransactionTYvsLY=VoidTransactionPercentOfSalesTY-VoidTransactionPercentOfSalesLY
		double VoidTransactionTYvsLY= Math.round(dblVoidTransactionTYvsLY * 100) / 100
		return VoidTransactionTYvsLY
	}


	//count Ty vs LY

	@Keyword
	def double calculate_ItemDeletionCountTyvsLY(double ItemDeletionCountTY, double ItemDeletionCountLY)
	{

		double dblItemDeletionCountTyvsLY=ItemDeletionCountTY-ItemDeletionCountLY
		double ItemDeletionCountTyvsLY= Math.round(dblItemDeletionCountTyvsLY * 100) / 100
		return ItemDeletionCountTyvsLY
	}

	@Keyword
	def double calculate_CancelledTransactionCountTyvsLY(double CancelledTransactionCountTY, double CancelledTransactionCountLY)
	{

		double dblCancelledTransactionCountTyvsLY=CancelledTransactionCountTY-CancelledTransactionCountLY
		double CancelledTransactionCountTyvsLY= Math.round(dblCancelledTransactionCountTyvsLY * 100) / 100
		return CancelledTransactionCountTyvsLY
	}

	@Keyword
	def double calculate_ItemDeletionBeforeTotalCountTyvsLY(double ItemDeletionBeforeTotalCountTY, double ItemDeletionBeforeTotalCountLY)
	{

		double dblItemDeletionBeforeTotalCountTyvsLY=ItemDeletionBeforeTotalCountTY-ItemDeletionBeforeTotalCountLY
		double ItemDeletionBeforeTotalCountTyvsLY= Math.round(dblItemDeletionBeforeTotalCountTyvsLY * 100) / 100
		return ItemDeletionBeforeTotalCountTyvsLY
	}

	@Keyword
	def double calculate_ItemDeletionAfterTotalCountTyvsLY(double ItemDeletionAfterTotalCountTY, double ItemDeletionAfterTotalCountLY)
	{

		double dblItemDeletionAfterTotalCountTyvsLY=ItemDeletionAfterTotalCountTY-ItemDeletionAfterTotalCountLY
		double ItemDeletionAfterTotalCountTyvsLY= Math.round(dblItemDeletionAfterTotalCountTyvsLY * 100) / 100
		return ItemDeletionAfterTotalCountTyvsLY
	}

	@Keyword
	def double calculate_VoidTransactionCountTyvsLY(double VoidTransactionCountTY, double VoidTransactionCountLY)
	{

		double dblVoidTransactionCountTyvsLY=VoidTransactionCountTY-VoidTransactionCountLY
		double VoidTransactionCountTyvsLY= Math.round(dblVoidTransactionCountTyvsLY * 100) / 100
		return VoidTransactionCountTyvsLY
	}


	//pp percent



	@Keyword
	def double calculate_CancelledTransactionCountPercentOftotalTransactionsTYvsLY_PP(double CancelledTransactionPercentOftotalTransactionsTY, double CancelledTransactionPercentOftotalTransactionsLY)
	{

		double dblCancelledTransactionTYvsLY=CancelledTransactionPercentOftotalTransactionsTY-CancelledTransactionPercentOftotalTransactionsLY
		double CancelledTransactionTYvsLY= Math.round(dblCancelledTransactionTYvsLY * 100) / 100
		return CancelledTransactionTYvsLY
	}

	@Keyword
	def double calculate_VoidTransactionCountPercentOftotalTransactionsTYvsLY_PP(double VoidTransactionPercentOftotalTransactionsTY, double VoidTransactionPercentOftotalTransactionsLY)
	{

		double dblVoidTransactionTYvsLY=VoidTransactionPercentOftotalTransactionsTY-VoidTransactionPercentOftotalTransactionsLY
		double VoidTransactionTYvsLY= Math.round(dblVoidTransactionTYvsLY * 100) / 100
		return VoidTransactionTYvsLY
	}

	@Keyword
	def double calculate_ItemDeletionCountPercentOftotalTransactionsTYvsLY_PP(double ItemDeletionPercentOftotalTransactionsTY, double ItemDeletionPercentOftotalTransactionsLY)
	{

		double dblItemDeletionTYvsLY=ItemDeletionPercentOftotalTransactionsTY-ItemDeletionPercentOftotalTransactionsLY
		double ItemDeletionTYvsLY= Math.round(dblItemDeletionTYvsLY * 100) / 100
		return ItemDeletionTYvsLY
	}


	@Keyword
	def double calculate_ItemDeletionBeforeTotalCountPercentOftotalTransactionsTYvsLY_PP(double ItemDeletionBeforeTotalPercentOftotalTransactionsTY, double ItemDeletionBeforeTotalPercentOftotalTransactionsLY)
	{

		double dblItemDeletionBeforeTotalTYvsLY=ItemDeletionBeforeTotalPercentOftotalTransactionsTY-ItemDeletionBeforeTotalPercentOftotalTransactionsLY
		double ItemDeletionBeforeTotalTYvsLY= Math.round(dblItemDeletionBeforeTotalTYvsLY * 100) / 100
		return ItemDeletionBeforeTotalTYvsLY
	}

	@Keyword
	def double calculate_ItemDeletionAfterTotalCountPercentOftotalTransactionsTYvsLY_PP(double ItemDeletionAfterTotalPercentOftotalTransactionsTY, double ItemDeletionAfterTotalPercentOftotalTransactionsLY)
	{

		double dblItemDeletionAfterTotalTYvsLY=ItemDeletionAfterTotalPercentOftotalTransactionsTY-ItemDeletionAfterTotalPercentOftotalTransactionsLY
		double ItemDeletionAfterTotalTYvsLY= Math.round(dblItemDeletionAfterTotalTYvsLY * 100) / 100
		return ItemDeletionAfterTotalTYvsLY
	}

}
