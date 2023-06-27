package reportbuildercustom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import java.text.SimpleDateFormat;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import reportbuildercustom.RB_BaseFunctions;

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.testobject.ConditionType as ConditionType

import java.util.concurrent.TimeUnit

public class RB_ValueCompareWithCalendar extends excelUtils.WriteExcel {




	@Keyword
	def  NetSalesValuesCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;
		String ValueFromCalendar=null;
		String ValuesFromReports=null;
		String ActualDate=null;




		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {
				ValueFromCalendar=Array1[j]
				ValuesFromReports=Array2[j]
				ActualDate=Array1keys[index]

				writeExcelForPass('NetSales',ActualDate,ValueFromCalendar,ValuesFromReports)
				KeywordUtil.logInfo("Net Sales  Values Matched with Calendar")
				KeywordUtil.markPassed("Net Sales Values Matched with Calendar")
			}
			else {

				ValueFromCalendar=Array1[j]
				ValuesFromReports=Array2[j]
				ActualDate=Array1keys[index]

				writeExcel('NetSales',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.markError("*******Net Sales Values is not Matched with Calendar for folowing details**********")
				KeywordUtil.logInfo("Net Sales Data Mismatch for the date:  "  +ActualDate)
				KeywordUtil.logInfo("Net Sales Value From Calender for above date is  "  +ValueFromCalendar)
				KeywordUtil.logInfo("Net Sales Value From Created Report for above date is  "  +ValuesFromReports)
				KeywordUtil.markError("Net Sales Values is MisMatched between Calendar and Report for same time period")


				flag=true
				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports



			}



			index++
		}
		if(flag==false) {

			KeywordUtil.logInfo("All Net Sales  Values Matched with Calendar")
			KeywordUtil.markPassed("All Net Sales Values Matched with Calendar")
		}
	}


	@Keyword
	def  NetSalesLastYearValuesCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;




		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcelForPass('NetSalesLastYear',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.logInfo("All Net Sales LY Values Matched with Calendar")
				KeywordUtil.markPassed("All Net Sales LY Values Matched with Calendar")
			}

			else {

				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcel('NetSalesLastYear',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.markError("*******Net Sales Values for Last Year is not Matched with Calendar and below are the entries which are miscmatched**********")
				KeywordUtil.logInfo("Net Sales Last year Data Mismatch for the date:  "  +ActualDate)
				KeywordUtil.logInfo("Net Sales Last year Data From Calender for above date is  "  +ValueFromCalendar)
				KeywordUtil.logInfo("Net Sales Last year Data From Created Report for above date is  "  +ValuesFromReports)
				KeywordUtil.markError("Net Sales Values for Last Year is MisMatched between Calendar and Report for same time period")

				flag=true


				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports


			}

			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All Net Sales LY Values Matched with Calendar")
			KeywordUtil.markPassed("All Net Sales LY Values Matched with Calendar")
		}
	}


	@Keyword
	def  NetSalesBudgetValuesCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;




		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcelForPass('NetSales_Budget',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.logInfo("All NetSales_Budget Values Matched with Calendar")
				KeywordUtil.markPassed("All NetSales_Budget Values Matched with Calendar")
			}

			else {

				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcel('NetSales_Budget',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.markError("*******NetSales_Budget for Last Year is not Matched with Calendar and below are the entries which are miscmatched**********")
				KeywordUtil.logInfo("NetSales_Budget Data Mismatch for the date:  "  +ActualDate)
				KeywordUtil.logInfo("NetSales_Budget Data From Calender for above date is  "  +ValueFromCalendar)
				KeywordUtil.logInfo("NetSales_Budget Data From Created Report for above date is  "  +ValuesFromReports)
				KeywordUtil.markError("NetSales_Budget for Last Year is MisMatched between Calendar and Report for same time period")

				flag=true


				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports


			}

			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All NetSales_Budget Values Matched with Calendar")
			KeywordUtil.markPassed("All NetSales_Budget Values Matched with Calendar")
		}
	}







	@Keyword
	def  GuestCountCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;


		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcelForPass('GuestCount',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.logInfo(" GUEST COUNT  Values Matched with Calendar")
				KeywordUtil.markPassed(" GUEST COUNT  Values Matched with Calendar")
			}

			else {

				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcel('GuestCount',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.logInfo("*******Guest Count Values for Last Year is not Matched with Calendar and below are the entries which are miscmatched**********")
				KeywordUtil.logInfo("Guest Count Data Mismatch for the date:	"  +ActualDate)
				KeywordUtil.logInfo("Guest Count Data From Calender for above date is	"  +ValueFromCalendar)
				KeywordUtil.logInfo("Guest Count Data From Created Report for above date is	"  +ValuesFromReports)
				KeywordUtil.markError("Guest Count Values for Last Year is MisMatched between Calendar and Report for same time period")

				flag=true


				//println ActualDate

				// ValueFromCalendar
				//println ValuesFromReports



			}

			index++
		}
		if(flag==false) {


			KeywordUtil.logInfo("All GUEST COUNT  Values Matched with Calendar")
			KeywordUtil.markPassed("All GUEST COUNT  Values Matched with Calendar")
		}
	}

	@Keyword
	def  GuestCountLastyearCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;




		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcelForPass('GuestCountLastYear',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.logInfo("GUEST COUNT Last year  Values Matched with Calendar")
				KeywordUtil.markPassed("GUEST COUNT Last year  Values Matched with Calendar")
			}

			else {
				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcel('GuestCountLastYear',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.markError("*******Guest Count Last year Values for Last Year is not Matched with Calendar and below are the entries which are miscmatched**********")
				KeywordUtil.logInfo("Guest Count Last year Data Mismatch for the date:	"  +ActualDate)
				KeywordUtil.logInfo("Guest Count Last year Data From Calender for above date is	"  +ValueFromCalendar)
				KeywordUtil.logInfo("Guest Count Last year Data From Created Report for above date is	"  +ValuesFromReports)
				KeywordUtil.markError("Guest Count Last Year Values for Last Year is MisMatched between Calendar and Report for same time period")

				flag=true



				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports


			}


			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All GUEST COUNT Last year  Values Matched with Calendar")
			KeywordUtil.markPassed("All GUEST COUNT Last year  Values Matched with Calendar")
		}
	}

	@Keyword
	def AverageCheckCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcelForPass('AvgCheck',ActualDate,ValueFromCalendar,ValuesFromReports)
				KeywordUtil.logInfo("AVG CHECK  Values Matched with Calendar")
				KeywordUtil.markPassed("AVG CHECK Values Matched with Calendar")
			}

			else {
				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcel('AvgCheck',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.markError("*******Avg Check  Values for Last Year is not Matched with Calendar and below are the entries which are miscmatched**********")
				KeywordUtil.logInfo("Avg Check Data Mismatch for the date:	"  +ActualDate)
				KeywordUtil.logInfo("Avg Check  Data From Calender for above date is	"  +ValueFromCalendar)
				KeywordUtil.logInfo("Avg Check  Data From Created Report for above date is	"  +ValuesFromReports)
				KeywordUtil.markError("Avg Check Values for Last Year is MisMatched between Calendar and Report for same time period")

				flag=true


				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports




			}


			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All AVG CHECK  Values Matched with Calendar")
			KeywordUtil.markPassed("All AVG CHECK Values Matched with Calendar")
		}
	}

	@Keyword
	def  AverageCheckLastYearCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcelForPass('AvgCheckLastYear',ActualDate,ValueFromCalendar,ValuesFromReports)
				KeywordUtil.logInfo("AVG CHECK LY Values Matched with Calendar")
				KeywordUtil.markPassed("AVG CHECK LY Values Matched with Calendar")
			}

			else {

				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcel('AvgCheckLastYear',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.markError("*******Avg Check Last year Values for Last Year is not Matched with Calendar and below are the entries which are miscmatched**********")
				KeywordUtil.logInfo("Avg Check Last year Data Mismatch for the date:	"  +ActualDate)
				KeywordUtil.logInfo("Avg Check Last year Data From Calender for above date is	"  +ValueFromCalendar)
				KeywordUtil.logInfo("Avg Check Last year Data From Created Report for above date is	"  +ValuesFromReports)
				KeywordUtil.markError("Avg Check Last Year Values for Last Year is MisMatched between Calendar and Report for same time period")

				flag=true



				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports

			}


			index++
		}

		if(flag==false) {



			KeywordUtil.logInfo("All AVG CHECK LY Values Matched with Calendar")
			KeywordUtil.markPassed("All AVG CHECK LY Values Matched with Calendar")
		}
	}



	@Keyword
	def  LaborCostTYCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcelForPass('Labor Cost $',ActualDate,ValueFromCalendar,ValuesFromReports)
				KeywordUtil.logInfo("Labor Cost TY Values Matched with Calendar")
				KeywordUtil.markPassed("Labor Cost TY Values Matched with Calendar")
			}

			else {

				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcel('Labor Cost $',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.markError("*******Labor Cost Dollor year Values for Last Year is not Matched with Calendar and below are the entries which are miscmatched**********")
				KeywordUtil.logInfo("Labor Cost Dollor Data Mismatch for the date:	"  +ActualDate)
				KeywordUtil.logInfo("Labor Cost Dollor Data From Calender for above date is	"  +ValueFromCalendar)
				KeywordUtil.logInfo("Labor Cost Dollor Data From Created Report for above date is	"  +ValuesFromReports)
				KeywordUtil.markError("Labor Cost Dollor  Values for Last Year is MisMatched between Calendar and Report for same time period")

				flag=true



				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports

			}


			index++
		}

		if(flag==false) {



			KeywordUtil.logInfo("All Labor Cost Dollor Values Matched with Calendar")
			KeywordUtil.markPassed("Labor Cost Dollor  Values Matched with Calendar")
		}
	}

	@Keyword
	def  LaborCostLYCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcelForPass('Labor Cost LY $',ActualDate,ValueFromCalendar,ValuesFromReports)
				KeywordUtil.logInfo("Labor Cost LY Values Matched with Calendar")
				KeywordUtil.markPassed("Labor Cost LY Values Matched with Calendar")
			}

			else {

				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]

				writeExcel('Labor Cost LY $',ActualDate,ValueFromCalendar,ValuesFromReports)

				KeywordUtil.markError("*******Labor Cost LY Dollor year Values for Last Year is not Matched with Calendar and below are the entries which are miscmatched**********")
				KeywordUtil.logInfo("Labor Cost LY Dollor Data Mismatch for the date:	"  +ActualDate)
				KeywordUtil.logInfo("Labor Cost LY Dollor Data From Calender for above date is	"  +ValueFromCalendar)
				KeywordUtil.logInfo("Labor Cost LY Dollor Data From Created Report for above date is	"  +ValuesFromReports)
				KeywordUtil.markError("Labor Cost LY Dollor  Values for Last Year is MisMatched between Calendar and Report for same time period")

				flag=true



				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports

			}


			index++
		}

		if(flag==false) {



			KeywordUtil.logInfo("All Labor Cost LY  Dollor Values Matched with Calendar")
			KeywordUtil.markPassed("All Labor Cost LY Dollor  Values Matched with Calendar")
		}
	}
	
	
	@Keyword
	def COGSCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcelForPass('COGS Total, %',ActualDate,ValueFromCalendar,ValuesFromReports)
				
			}

			else {
				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcel('COGS Total, %',ActualDate,ValueFromCalendar,ValuesFromReports)

				
				flag=true


				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports




			}


			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All COGS Total, %  Values Matched with Calendar")
			KeywordUtil.markPassed("All COGS Total, % Values Matched with Calendar")
		}
	}

	
	
	@Keyword
	def COGSLastyearCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcelForPass('COGS Total LY, %',ActualDate,ValueFromCalendar,ValuesFromReports)
				
			}

			else {
				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcel('COGS Total LY, %',ActualDate,ValueFromCalendar,ValuesFromReports)

				
				flag=true


				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports




			}


			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All COGS Total LY, %  Values Matched with Calendar")
			KeywordUtil.markPassed("All COGS Total LY, % Values Matched with Calendar")
		}
	}

	
	@Keyword
	def COGSBudgetrCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcelForPass('COGS Budget %',ActualDate,ValueFromCalendar,ValuesFromReports)
				
			}

			else {
				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcel('COGS Budget %',ActualDate,ValueFromCalendar,ValuesFromReports)

				
				flag=true


				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports




			}


			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All COGS Budget %  Values Matched with Calendar")
			KeywordUtil.markPassed("All COGS Budget % Values Matched with Calendar")
		}
	}

	
	@Keyword
	def PrimeCostBudgetrCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcelForPass('Prime Cost Budget, %',ActualDate,ValueFromCalendar,ValuesFromReports)
				
			}

			else {
				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcel('Prime Cost Budget, %',ActualDate,ValueFromCalendar,ValuesFromReports)

				
				flag=true


				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports




			}


			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All Prime Cost Budget, %  Values Matched with Calendar")
			KeywordUtil.markPassed("All Prime Cost Budget, % Values Matched with Calendar")
		}
	}

	@Keyword
	def PrimeCostTYCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcelForPass('Prime Cost, %',ActualDate,ValueFromCalendar,ValuesFromReports)
				
			}

			else {
				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcel('Prime Cost, %',ActualDate,ValueFromCalendar,ValuesFromReports)

				
				flag=true


				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports




			}


			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All 'Prime Cost, %  Values Matched with Calendar")
			KeywordUtil.markPassed("All 'Prime Cost, % Values Matched with Calendar")
		}
	}

	@Keyword
	def PrimeCostLYCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcelForPass('Prime Cost LY, %',ActualDate,ValueFromCalendar,ValuesFromReports)
				
			}

			else {
				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcel('Prime Cost LY, %',ActualDate,ValueFromCalendar,ValuesFromReports)

				
				flag=true


				//println ActualDate

				//println ValueFromCalendar
				//println ValuesFromReports




			}


			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All Prime Cost LY, %  Values Matched with Calendar")
			KeywordUtil.markPassed("All Prime Cost LY, % Values Matched with Calendar")
		}
	}

	
	@Keyword
	def LaborCostBudgetDollorCompareWithCalender(Map map1,Map map2) {



		def Array1 = [] as String[]
		def Array2 = [] as String[]
		def Array1keys = [] as String[]
		int index=0;
		boolean flag=false;





		Array1=map1.values()
		Array2=map2.values()
		Array1keys=map1.keySet()
		println Array1.size()


		for (int j = 0; j < Array1.size(); j++) {



			if(Array1[j].equals(Array2[j])) {



				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcelForPass('Labor Cost Budget, $ (actual sales)',ActualDate,ValueFromCalendar,ValuesFromReports)
				
			}

			else {
				String ValueFromCalendar=Array1[j]
				String ValuesFromReports=Array2[j]
				String ActualDate=Array1keys[index]


				writeExcel('Labor Cost Budget, $ (actual sales)',ActualDate,ValueFromCalendar,ValuesFromReports)

				
				flag=true


		



			}


			index++
		}

		if(flag==false) {


			KeywordUtil.logInfo("All Labor Cost Budget (actual sales)  Values Matched with Calendar")
			KeywordUtil.markPassed("All Labor Cost Budget (actual sales) Values Matched with Calendar")
		} 
	}

	
	
	
	
}
