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
import java.math.RoundingMode as RoundingMode
import java.text.SimpleDateFormat as SimpleDateFormat
import java.text.DateFormat as DateFormat
import java.time.ZoneId as ZoneId
import java.util.Date as Date
import static java.time.temporal.TemporalAdjusters.previousOrSame;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import java.time.DayOfWeek;
package com.javabrahman.java8.time


String start = GlobalVariable.MonthYear //Apr, 2019

String End = GlobalVariable.EndMonthYear //Apr 28 - May 25

String dates = GlobalVariable.StartDate

String firstMonth1 = start.substring(0, 3)

Date date = new SimpleDateFormat('MMMM').parse(firstMonth1)

Calendar cal1 = Calendar.getInstance()

cal1.setTime(date)

int finalMonth2 = cal1.get(Calendar.MONTH)

int firstMonth = finalMonth2 + 1

String firstYear1 = start.substring(5, 9)

int firstYear = Integer.parseInt(firstYear1)

String secondMonth1 = End.substring(0, 3)

Date secondMonthDate = new SimpleDateFormat('MMMM').parse(secondMonth1)

Calendar cal2 = Calendar.getInstance()

cal2.setTime(secondMonthDate)

int finalMonth3 = cal2.get(Calendar.MONTH)

int secondMonth = finalMonth3 + 1

String secondYear1 = End.substring(5, 9)

int secondYear = Integer.parseInt(secondYear1)

String findingDateOne1 = dates
int findingDateOne = Integer.parseInt(findingDateOne1)

String findingDateSecond1 = dates
int findingDateSecond = Integer.parseInt(findingDateSecond1)

LocalDate date1 = LocalDate.of(firstYear, firstMonth, findingDateOne)

java.time.DayOfWeek dayOfWeek = date1.getDayOfWeek();
System.out.println(date1 + " was a " + dayOfWeek);
LocalDate firstWorkingDay;
 
//Using DayOfWeek to execute dependent business logic
switch (dayOfWeek) {
  case 'FRIDAY':firstWorkingDay = date1.plusDays(3);
	break;
  case 'SATURDAY':firstWorkingDay = date1.plusDays(2);
	break;
  default:firstWorkingDay=date1.plusDays(1);
	break;
}
System.out.println("First working day of 2016 was "+firstWorkingDay);



/*LocalDate now = LocalDate.now(); 

LocalDate first =  now.with(nextOrSame(DayOfWeek.SUNDAY))

println first

Date date123 = java.sql.Date.valueOf(date1)

println(date123)

Calendar c = Calendar.getInstance()

// Set the calendar to monday of the current week c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
System.out.println()

System.out.println('gET TIME IS' + date123)

// Print dates of the current week starting on Monday
DateFormat df = new SimpleDateFormat('MM-dd')

System.out.println(df.format(date123))

for (int i = 0; i < 6; i++) {
	
    c.add(Calendar.DATE, 1)
}

System.out.println(df.format(date123))

System.out.println()*/