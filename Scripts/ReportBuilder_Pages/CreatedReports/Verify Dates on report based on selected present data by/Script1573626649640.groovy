import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

def TotalDays = []

def OnlyDays = []

def DayWiseDate = []

def NoWeeks = []

String presentBy = GlobalVariable.PresentBy

if (presentBy.equalsIgnoreCase('Day')) {
	
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement HeaderRow = driver.findElement(By.xpath('(//thead[@class="ui-table-thead"])[2]'))

    List<WebElement> Headers = HeaderRow.findElements(By.tagName('tr'))

    List<WebElement> Days = Headers.get(0).findElements(By.tagName('th'))

    int NoOfdaysSelected = Days.size()
	
	println '****NoOfdaysSelected****'+NoOfdaysSelected

    for (int i = 0; i < NoOfdaysSelected; i++) {
		
        JavascriptExecutor je = ((driver) as JavascriptExecutor)

        WebElement DateElement = Days.get(i)

        je.executeScript('arguments[0].scrollIntoView()', DateElement)

        String FirstDate = DateElement.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

		
		println 'FirstDate'+FirstDate
		
        TotalDays.add(FirstDate)

        String dateToBeSplited = TotalDays[i]

        OnlyDays = dateToBeSplited.split('/')

        String FinalDay = OnlyDays[1].replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

        DayWiseDate.add(FinalDay)
    }
    
    int daySize = TotalDays.size()

    println 'Total Days in array'+daySize

    String FirstDate = TotalDays[0]
	CustomKeywords.'reportbuildercustom.RB_Keywords.verifyStartDateOnReport'(FirstDate)
	
	String EndDate;
	
	if( TotalDays.size()>1) {
		
    int LastDate = TotalDays.size() - 1

     EndDate = TotalDays[LastDate]


    CustomKeywords.'reportbuildercustom.RB_Keywords.verifyEndDateOnReport'(EndDate)
	
	}

    String DayLimit = GlobalVariable.NoOfDays

    println('**********')

    String diffrence = CustomKeywords.'reportbuildercustom.RB_Keywords.givenTwoDates'(FirstDate, EndDate)

    println(diffrence)

    if (DayLimit.equalsIgnoreCase(diffrence)) {
        assert true
    }
} else if (presentBy.equalsIgnoreCase('Week')) {
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement HeaderRow1 = driver.findElement(By.xpath('(//thead[@class="ui-table-thead"])[2]'))

    List<WebElement> Headers1 = HeaderRow1.findElements(By.tagName('tr'))

    List<WebElement> weeks = Headers1.get(0).findElements(By.tagName('th'))

    int NoOfWeekSelected = weeks.size()

    for (int i = 0; i < NoOfWeekSelected; i++) {
        JavascriptExecutor je = ((driver) as JavascriptExecutor)

        WebElement DateWeekElement = weeks.get(i)

        je.executeScript('arguments[0].scrollIntoView()', DateWeekElement)

        String FirstWeek = DateWeekElement.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

        NoWeeks.add(FirstWeek)
		
		
    }
    
    String FirstWeekDate = NoWeeks[0]
	CustomKeywords.'reportbuildercustom.RB_Keywords.verifyStartWeekDateOnReport'(FirstWeekDate)
	
	if( NoWeeks.size()>1) {
    int LastDateCnt = NoWeeks.size() - 1

    String LastDateWeek = NoWeeks[LastDateCnt]


    CustomKeywords.'reportbuildercustom.RB_Keywords.verifyEndWeekDateOnReport'(LastDateWeek)
	
	}

    double noOfweesdiff=CustomKeywords.'reportbuildercustom.RB_Keywords.noOfWeeksBasedOnDate'()
	String weekDiff = String.valueOf(noOfweesdiff);
	String WeekLimit = GlobalVariable.NoOfWeeks
	
	
	if (WeekLimit.equalsIgnoreCase(weekDiff)) {
		assert true
	}
	
	
} else if (presentBy.equalsIgnoreCase('Month')) {


    assert true
}

println(DayWiseDate)

return DayWiseDate

