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

class RB_Keywords extends RB_BaseFunctions {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}


	@Keyword
	def verifyAddedColumn(String ColumnName) {


		String xpath1 = '//span[contains(@class,"add-column-box-text pl-20") and text() ="'+ ColumnName +'"]'

		println "*******************************"
		println xpath1
		println "*******************************"
		TestObject to = new TestObject('CreatedColumns')

		to.addProperty('xpath', ConditionType.EQUALS, xpath1)

		//WebUI.click(findTestObject('ReportSetupScreen/Name Your Report/drp_CategoryValue'))
		WebUI.waitForElementVisible(to, 20)

		WebUI.verifyElementVisible(to)




	}

	@Keyword
	def clickOnReportCategory(String ColumnName) {


		String xpath2= '//span[contains(text(),"'+ColumnName+'")]'
		//span[contains(text(),'Bhavin QA Category1')]

		println "*******************************"
		println xpath2
		println "*******************************"
		TestObject to = new TestObject('CreatedColumns')

		to.addProperty('xpath', ConditionType.EQUALS, xpath2)

		//WebUI.click(findTestObject('ReportSetupScreen/Name Your Report/drp_CategoryValue'))
		WebUI.waitForElementVisible(to, 20)

		WebUI.verifyElementVisible(to)

		WebUI.click(to)



	}




	@Keyword
	def clickAndVerifyCreatedReport(String ColumnName) {


		String xpath2= '//a[contains(text(),"'+ColumnName+'")]'

		println "*******************************"
		println xpath2
		println "*******************************"
		TestObject to = new TestObject('CreatedColumns')

		to.addProperty('xpath', ConditionType.EQUALS, xpath2)

		//WebUI.click(findTestObject('ReportSetupScreen/Name Your Report/drp_CategoryValue'))
		WebUI.waitForElementVisible(to, 20)

		WebUI.verifyElementVisible(to)

		WebUI.click(to)



	}





	@Keyword
	def verifyTotalAddedColumns() {

		def ColumnList = []

		WebDriver driver = DriverFactory.getWebDriver()
		ArrayList<WebElement> fields = driver.findElements(By.xpath("//span[contains(@class,'add-column-box-text pl-20')]"))
		int totalelementsfind = fields.size()

		println "*******************************"

		System.out.println(totalelementsfind)

		println "*******************************"

		for(int i=0;i<totalelementsfind;i++) {

			String AddedColumnName=fields.get(i).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')
			ColumnList.add(i, AddedColumnName)


			println "*******************************"
			println ColumnList[i]
			println "*******************************"
		}
		return ColumnList
	}

	@Keyword
	def String dateFormat(String para) {

		def date = new Date().parse("dd.MMM.yyyy",para)
		return date;

		/*String pattern = "dd-MMM-yyyy";
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		 String date = simpleDateFormat.format(new Date(para));*/
	}

	@Keyword
	def verifyStartDateOnReport(String Date) {

		println(Date)
		println(Date.length())

		String Month=Date.substring(0, 2)
		String Day=Date.substring(3, 5)
		String Year=Date.substring(6, 10)


		println('************')

		println Month
		println Day
		println Year

		println('************')


		String enteredDate=GlobalVariable.StartDate
		String enteredEndDate=GlobalVariable.EndDate
		String enteredYear=GlobalVariable.MonthYear

		String startYear=enteredYear.substring(5, 9)

		println startYear


		if(Day.equalsIgnoreCase(enteredDate) && Year.equals(startYear) ) {

			assert true
		}
	}


	@Keyword
	def verifyEndDateOnReport(String Date) {

		println(Date)
		println(Date.length())

		String Month=Date.substring(0, 2)
		String Day=Date.substring(3, 5)
		String Year=Date.substring(6, 10)


		println('************')

		println Month
		println Day
		println Year

		println('************')


		String enteredDate=GlobalVariable.StartDate
		String enteredEndDate=GlobalVariable.EndDate
		String enteredYear=GlobalVariable.MonthYear
		String enteredEndYear=GlobalVariable.EndMonthYear


		String endYears=enteredEndYear.substring(5, 9)

		println endYears

		if(Day.equalsIgnoreCase(enteredEndDate) && Year.equals(endYears) ) {

			assert true
		}
	}


	@Keyword
	def verifyStartWeekDateOnReport(String StartWeekDate) {

		println(StartWeekDate)

		String StartingWeek=getWeekEndDateOfFirstWeek()



		if(StartWeekDate.equalsIgnoreCase(StartingWeek)) {

			assert true
		}
	}




	@Keyword
	def verifyEndWeekDateOnReport(String EndWeekDate) {

		println(EndWeekDate)

		String EndingWeek=getWeekEndDateOfLastWeek()



		if(EndWeekDate.equalsIgnoreCase(EndingWeek) ) {

			assert true
		}
	}







	@Keyword
	def long givenTwoDates(String Date1,String Date2) {


		String pattern = "MM/dd/yyyy";
		SimpleDateFormat formatter  = new SimpleDateFormat(pattern)
		Date Startdate = formatter.parse(Date1);
		Date Enddate = formatter.parse(Date2);

		long duration  =     Enddate.getTime() - Startdate.getTime();
		long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
		long diffInDays = TimeUnit.MILLISECONDS.toDays(duration);

		long Difference=diffInDays+1;
		return Difference
	}



	@Keyword
	def double removeCurrencyFormat(String CurrencyValue) {


		String NewCurrency=CurrencyValue.replace('$', '')
		NumberFormat format = NumberFormat.getInstance()
		Number NewCurrency2 = format.parse(NewCurrency);
		double numbers = NewCurrency2.doubleValue();

		return numbers
	}

	@Keyword
	def setNumberFormat(String CurrencyValue) {


		NumberFormat format = NumberFormat.getNumberInstance()
		Number number = format.parse(CurrencyValue);
		double numbers = number.doubleValue();
		return numbers
	}

	@Keyword
	def int getRoundNumber(String CurrencyValue) {


		NumberFormat format = NumberFormat.getNumberInstance()
		int number = format.parse(CurrencyValue)
		System.out.println(number)
		return number
	}


	@Keyword
	def double noOfWeeksBasedOnDate() {

		String start=GlobalVariable.MonthYear  //Apr, 2019
		String End=GlobalVariable.EndMonthYear
		String dates=GlobalVariable.OperationalCalender //Apr 28 - May 25

		String firstMonth1=start.substring(0, 3)

		Date date = new SimpleDateFormat('MMMM').parse(firstMonth1)

		Calendar cal1 = Calendar.getInstance()

		cal1.setTime(date)

		int finalMonth2 = cal1.get(Calendar.MONTH)

		int firstMonth = finalMonth2 + 1



		String firstYear1=start.substring(5, 9)
		int firstYear = Integer.parseInt(firstYear1);


		String secondMonth1=End.substring(0, 3)
		Date secondMonthDate = new SimpleDateFormat("MMMM").parse(secondMonth1);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(secondMonthDate);
		int finalMonth3=cal2.get(Calendar.MONTH);
		int secondMonth=finalMonth3+1


		String secondYear1=End.substring(5, 9)
		int secondYear = Integer.parseInt(secondYear1);


		String findingDateOne1=dates.substring(4, 6)
		int findingDateOne = Integer.parseInt(findingDateOne1);

		String findingDateSecond1=dates.substring(13, 15)
		int findingDateSecond = Integer.parseInt(findingDateSecond1);



		LocalDate date1 = LocalDate.of(firstYear, firstMonth, findingDateOne)

		LocalDate date2 = LocalDate.of(secondYear, secondMonth, findingDateSecond)

		double diffInDays1 = ChronoUnit.DAYS.between(date1, date2)
		double diffInDays=diffInDays1+1
		double weeks1 = diffInDays / 7.0




		// If you want to include the fraction, replace long with double and 7 with 7.0
		System.out.println((((('Weeks between ' + date1) + ' and ') + date2) + ': ') + weeks1)

		return weeks1




	}
}
