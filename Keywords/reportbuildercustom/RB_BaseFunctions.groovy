package reportbuildercustom
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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import java.util.Calendar as Calendar
import java.time.LocalDate as LocalDate
import java.time.temporal.ChronoUnit as ChronoUnit
import java.text.NumberFormat as NumberFormat
import java.text.DecimalFormat as DecimalFormat
import java.text.DateFormat;
import java.math.RoundingMode as RoundingMode
import java.text.SimpleDateFormat as SimpleDateFormat
import java.text.DateFormat as DateFormat
import java.util.Date as Date
import java.time.DayOfWeek;
public class RB_BaseFunctions {

	@Keyword
	def getWeekEndDateOfFirstWeek() {



		String start = GlobalVariable.MonthYear //Apr, 2019


		String dates = GlobalVariable.StartDate

		String firstMonth1 = start.substring(0, 3)

		Date date = new SimpleDateFormat('MMMM').parse(firstMonth1)

		Calendar cal1 = Calendar.getInstance()

		cal1.setTime(date)

		int finalMonth2 = cal1.get(Calendar.MONTH)

		int firstMonth = finalMonth2 + 1

		String firstYear1 = start.substring(5, 9)

		int firstYear = Integer.parseInt(firstYear1)


		String findingDateSecond1 = dates
		int findingDateOne = Integer.parseInt(findingDateSecond1)

		//LocalDate date1 = LocalDate.of(firstYear, firstMonth, findingDateOne)

		LocalDate date1 = LocalDate.of(firstYear, firstMonth, findingDateOne);

		java.time.DayOfWeek dayOfWeek = date1.getDayOfWeek();
		//System.out.println(date1 + " was a " + dayOfWeek);
		LocalDate firstWorkingDay;
		long six=6
		long five=5
		long four=4
		long three=3
		long two=2
		long one=1
		long zero=0

		println '****************************************'
		println dayOfWeek


		//Using DayOfWeek to execute dependent business logic
		switch (dayOfWeek) {

			case 'SUNDAY':firstWorkingDay = date1.plusDays(six)
				break;
			case 'MONDAY':firstWorkingDay = date1.plusDays(five)
				break;
			case 'TUESDAY':firstWorkingDay = date1.plusDays(four)
				break;
			case 'WEDNESDAY':firstWorkingDay = date1.plusDays(three)
				break;
			case 'THURSDAY':firstWorkingDay = date1.plusDays(two)
				break;
			case 'FRIDAY':firstWorkingDay = date1.plusDays(one)
				break;
			case 'SATURDAY':firstWorkingDay = date1.plusDays(zero);
				break;

		}
		System.out.println("Last Day of first week "+firstWorkingDay);

		Date WeekEnddate = java.sql.Date.valueOf(firstWorkingDay)
		DateFormat df = new SimpleDateFormat('MM-dd')

		String FirstWeekEnd=df.format(WeekEnddate)

		String FirstWeekEndNew='WE'+' '+FirstWeekEnd

		System.out.println(FirstWeekEndNew)

		return FirstWeekEndNew






	}



	@Keyword
	def getWeekEndDateOfLastWeek()
	{




		String End = GlobalVariable.EndMonthYear //Apr 28 - May 25

		String dates = GlobalVariable.EndDate


		String secondYear1 = End.substring(5, 9)
		int secondYear = Integer.parseInt(secondYear1)

		String secondMonth1=End.substring(0, 3)
		Date secondMonthDate = new SimpleDateFormat("MMMM").parse(secondMonth1);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(secondMonthDate);
		int finalMonth3=cal2.get(Calendar.MONTH);
		int secondMonth=finalMonth3+1


		String findingDateSecond1 = dates
		int secondDate = Integer.parseInt(findingDateSecond1)

		//LocalDate date1 = LocalDate.of(firstYear, firstMonth, findingDateOne)

		LocalDate date1 = LocalDate.of(secondYear, secondMonth, secondDate);

		java.time.DayOfWeek dayOfWeek = date1.getDayOfWeek();
		//System.out.println(date1 + " was a " + dayOfWeek);
		LocalDate firstWorkingDay;
		long six=6
		long five=5
		long four=4
		long three=3
		long two=2
		long one=1
		long zero=0

		println '****************************************'
		println dayOfWeek


		//Using DayOfWeek to execute dependent business logic
		switch (dayOfWeek) {

			case 'SUNDAY':firstWorkingDay = date1.plusDays(six)
				break;
			case 'MONDAY':firstWorkingDay = date1.plusDays(five)
				break;
			case 'TUESDAY':firstWorkingDay = date1.plusDays(four)
				break;
			case 'WEDNESDAY':firstWorkingDay = date1.plusDays(three)
				break;
			case 'THURSDAY':firstWorkingDay = date1.plusDays(two)
				break;
			case 'FRIDAY':firstWorkingDay = date1.plusDays(one)
				break;
			case 'SATURDAY':firstWorkingDay = date1.plusDays(zero);
				break;

		}
		System.out.println("Last Day of Last week  "+firstWorkingDay);

		Date WeekEnddate = java.sql.Date.valueOf(firstWorkingDay)
		DateFormat df = new SimpleDateFormat('MM-dd')

		String LastWeekEnd=df.format(WeekEnddate)

		String LasttWeekEndNew='WE'+' '+LastWeekEnd

		System.out.println(LasttWeekEndNew)

		return LasttWeekEndNew







	}








}
