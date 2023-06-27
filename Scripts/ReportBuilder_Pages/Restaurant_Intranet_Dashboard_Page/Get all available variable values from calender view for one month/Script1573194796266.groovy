import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import org.openqa.selenium.interactions.Actions as Actions

WebUI.delay(2)

def NetSales = [:]

def NetSalesLastYear = [:]

def BudgetedSales = [:]

def GuestCount = [:]

def GuestCountLastYear = [:]

def GuestCountBudget = [:]

def AvgCheck = [:]

def AvgCheckLastYear = [:]

def AvgCheckBudget = [:]

def Labor = [:]

def LaborLastYear = [:]

def LaborBudget = [:]

def AllVariables = [:]

def DateAndValueFromCal = [:]

def DayWiseDate = []

def CalendarDates = []

String DailyDate = null

//WebUI.scrollToElement(findTestObject('Page_Restaurant Intranet/Dashboard/btn_DashboardCalender'), 10)
WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Wrappers = driver.findElement(By.xpath('//div[@class=\'calendar-wrap dbschema_wraper\']'))

ArrayList<WebElement> Calenderrow = Wrappers.findElements(By.xpath('((//div[@class="col-center col-center--chart"]))//div[@class="chart-data chart-data--future"]'))

int NoOfcalenderRows = Calenderrow.size()

println('No of calender rows are' + NoOfcalenderRows)

for (int l = 0; l < 3; l++) {
    ArrayList<WebElement> Row = Calenderrow.get(l).findElements(By.xpath('//div[@class=\'chart-data chart-data--future\']'))

    int NoOfRows = Row.size()

    println('No of  rows ' + NoOfRows)

    WebElement CalenderView = Row.get(l)

    if (l > 13) {
		
        JavascriptExecutor je = ((driver) as JavascriptExecutor)

        je.executeScript('arguments[0].scrollIntoView()', CalenderView)

        CalenderView.click()
    } else {
        CalenderView.click()
    }
    
    // WebElement Row = CalenderViewNew.findElement(By.xpath("//div[starts-with(@class,'chart-data chart-data--future')]"))
    String DateOnCalendar = WebUI.getText(findTestObject('Page_Restaurant Intranet/Dashboard/div_DailyDateHeader'))

    CalendarDates = DateOnCalendar.split(',')

    String DailyDates = (CalendarDates[1]).replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

    DayWiseDate.add(l, DailyDates)

    String FirstCharacter = DailyDates.charAt(0)

    if (DailyDates.length() == 1) {
        DailyDate = ('0' + DailyDates)
    } else {
        DailyDate = DailyDates
    }
    
    //Fetching data From Calender
    def HeaderOftabel = ['Total']

    WebElement HeaderRow = driver.findElement(By.xpath('//*[@id="mdl-dailyActuals"]/div/div/div[2]/div/div[1]/div/div/table/thead'))

    List<WebElement> Headers = HeaderRow.findElements(By.tagName('th'))

    println(Headers.size())

    for (int i = 1; i < (Headers.size() - 1); i++) {
        String HeaderName = Headers.get(i).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

        println(HeaderName)

        if (HeaderOftabel.contains(HeaderName)) {
            index = i

            WebElement Tabel = driver.findElement(By.xpath('//*[@id="mdl-dailyActuals"]/div/div/div[2]/div/div[1]/div/div/table/tbody'))

            List<WebElement> Rows = Tabel.findElements(By.tagName('tr'))

            for (int j = 0; j < Rows.size(); j++) {
                WebElement VariableRow = Rows.get(j)

                List<WebElement> cells = VariableRow.findElements(By.tagName('td'))

                String Variablename = cells.get(0).getText()

                if (Variablename.equalsIgnoreCase('SALES')) {
                    KeywordUtil.logInfo('FETCHING NET SALES TY VALUE FROM CALENDAR FOR DATE:' + DailyDate)

                    String NetSalesTY = cells.get(index).getText()

                    WebUI.comment(NetSalesTY)

                    println(NetSalesTY)

                    NetSales.put(DailyDate, NetSalesTY)

                    AllVariables.put('NetSalesValues', NetSales)

                    //Net Sales with Last Year
                    KeywordUtil.logInfo('FETCHING NET SALES LY VALUE FROM CALENDAR FOR DATE:' + DailyDate)

                    List<WebElement> NetSalesLYData = cells.get(index + 1).findElements(By.tagName('span'))

                    String NetSalesLY = NetSalesLYData.get(0).getText()

                    WebUI.comment(NetSalesLY)

                    println(NetSalesLY)

                    NetSalesLastYear.put(DailyDate, NetSalesLY //Guest Count with Last Year
                        )

                    AllVariables.put('NetSalesLastYearValues', NetSalesLastYear //GUEST COUNT with Last Year
                        //Avg Check with Last Year
                        ) //Net Sales with Budget
                    //Guest with Budget
                    //Avg Check With Budget
                    /* }else if (Variablename.equalsIgnoreCase('LABOR')) {
				
                    KeywordUtil.logInfo('FETCHING LABOR COST TY FROM CALENDAR FOR DATE:' + DailyDate)
					println index
                    List<WebElement> Labordata= cells.get(index+1).findElements(By.tagName('div'))
					WebElement Labordata2=Labordata.get(1).findElements(By.tagName('span')).get(1)
					WebElement Labordata3=Labordata2.findElement(By.tagName('span'))
					String LaborCostTY=Labordata3.findElement(By.tagName('strong')).getText()
                    WebUI.comment(LaborCostTY)
					
					//*[@id="mdl-dailyActuals"]/div/div/div[2]/div/div[1]/div/div/table/tbody/tr[4]/td[3]/div[2]/span[2]/span/strong

                    println(LaborCostTY)

                    Labor.put(DailyDate, LaborCostTY)

                    AllVariables.put('LaborThisYear', Labor)

                    KeywordUtil.logInfo('FETCHING LABOR LY FROM CALENDAR FOR DATE:' + DailyDate)

					List<WebElement> LabordataLY= cells.get(index+1).findElements(By.tagName('div'))
					String LaborCostLY=LabordataLY.get(2).findElements(By.tagName('span')).get(1).getText()
					//WebElement LabordataLY3=LabordataLY2.findElement(By.tagName('span'))
					//String LaborCostLY=LabordataLY3.findElement(By.tagName('strong')).getText()
					WebUI.comment(LaborCostLY)
					

                    LaborLastYear.put(DailyDate, LaborCostLY)

                    AllVariables.put('LaborLastYear', LaborLastYear)*/
                } else if (Variablename.equalsIgnoreCase('GUESTS')) {
                    KeywordUtil.logInfo('FETCHING GUEST COUNT TY FROM CALENDAR FOR DATE:' + DailyDate)

                    String GuestCountTY = cells.get(index).getText()

                    WebUI.comment(GuestCountTY)

                    println(GuestCountTY)

                    GuestCount.put(DailyDate, GuestCountTY)

                    AllVariables.put('GuestCountValues', GuestCount)

                    KeywordUtil.logInfo('FETCHING GUEST COUNT LY FROM CALENDAR FOR DATE:' + DailyDate)

                    List<WebElement> GuestCountLYData = cells.get(index + 1).findElements(By.tagName('span'))

                    String GuestCountLY = GuestCountLYData.get(0).getText()

                    WebUI.comment(GuestCountLY)

                    println(GuestCountLY)

                    GuestCountLastYear.put(DailyDate, GuestCountLY)

                    AllVariables.put('GuestCountLastYearValues', GuestCountLastYear)
                } else if (Variablename.equalsIgnoreCase('PPA') || Variablename.equalsIgnoreCase('AVG.CHECK')) {
                    KeywordUtil.logInfo('FETCHING AVG CHECK TY FROM CALENDAR FOR DATE:' + DailyDate)

                    String AvgCheckTY = cells.get(index).getText()

                    WebUI.comment(AvgCheckTY)

                    println(AvgCheckTY)

                    AvgCheck.put(DailyDate, AvgCheckTY)

                    AllVariables.put('AvgCheckValues', AvgCheck)

                    KeywordUtil.logInfo('FETCHING AVG CHECK LY FROM CALENDAR FOR DATE:' + DailyDate)

                    List<WebElement> AvgCheckLYData = cells.get(index + 1).findElements(By.tagName('span'))

                    String AvgCheckLY = AvgCheckLYData.get(0).getText()

                    WebUI.comment(AvgCheckLY)

                    println(AvgCheckLY)

                    AvgCheckLastYear.put(DailyDate, AvgCheckLY)

                    AllVariables.put('AvgCheckLastYearValues', AvgCheckLastYear)

                    String currentComparisionWith = WebUI.getText(findTestObject('Page_Restaurant Intranet/Dashboard/span_Last Year'))

                    if (currentComparisionWith.equalsIgnoreCase('Last Year')) {
                        KeywordUtil.logInfo('NOW FETCHING VARIABLE DATA FOR BUDGET FOR SAME PERIOD')

                        WebUI.click(findTestObject('Page_Restaurant Intranet/Dashboard/btn_toChangeBudget'))

                        WebElement Tabe2 = driver.findElement(By.xpath('//*[@id="mdl-dailyActuals"]/div/div/div[2]/div/div[1]/div/div/table/tbody'))

                        List<WebElement> Rows2 = Tabe2.findElements(By.tagName('tr'))

                        for (int k = 0; k < Rows2.size(); k++) {
                            WebElement VariableRowBudget = Rows2.get(k)

                            List<WebElement> cellsBudget = VariableRowBudget.findElements(By.tagName('td'))

                            String VariablenameBudget = cellsBudget.get(0).getText()

                            if (VariablenameBudget.equalsIgnoreCase('SALES')) {
                                KeywordUtil.logInfo('FETCHING NET SALES BUDGET FROM CALENDAR FOR DATE:' + DailyDate)

                                List<WebElement> NetSalesBudgetedData = cellsBudget.get(index + 1).findElements(By.tagName(
                                        'span'))

                                String NetSalesBudgeted = NetSalesBudgetedData.get(0).getText()

                                WebUI.comment(NetSalesBudgeted)

                                println(NetSalesBudgeted)

                                BudgetedSales.put(DailyDate, NetSalesBudgeted)

                                AllVariables.put('BudgetedSalesValues', BudgetedSales)
                            } else if (VariablenameBudget.equalsIgnoreCase('GUESTS')) {
                                KeywordUtil.logInfo('FETCHING GUEST COUNT BUDGET FROM CALENDAR FOR DATE:' + DailyDate)

                                List<WebElement> GuestCountBudgetedData = cellsBudget.get(index + 1).findElements(By.tagName(
                                        'span'))

                                String GuestCountBudgeted = GuestCountBudgetedData.get(0).getText()

                                WebUI.comment(GuestCountBudgeted)

                                println(GuestCountBudgeted)

                                GuestCountBudget.put(DailyDate, GuestCountBudgeted)

                                AllVariables.put('GuestCountBudgetValues', GuestCountBudget)
                            } else if (VariablenameBudget.equalsIgnoreCase('PPA') || VariablenameBudget.equalsIgnoreCase(
                                'AVG.CHECK')) {
                                KeywordUtil.logInfo('FETCHING AVG CHECK BUDGET FROM CALENDAR FOR DATE:' + DailyDate)

                                List<WebElement> AvgCheckBudgetedData = cellsBudget.get(index + 1).findElements(By.tagName(
                                        'span'))

                                String AvegCheckBudgeted = AvgCheckBudgetedData.get(0).getText()

                                WebUI.comment(AvegCheckBudgeted)

                                println(AvegCheckBudgeted)

                                AvgCheckBudget.put(DailyDate, AvegCheckBudgeted)

                                AllVariables.put('AvgCheckBudgetValues', AvgCheckBudget)
                            }
                        }
                        
                        WebUI.click(findTestObject('Page_Restaurant Intranet/Dashboard/btn_toChangeBudget'))
                    }
                }
            }
        }
    }
    
    WebUI.waitForElementClickable(findTestObject('Page_Restaurant Intranet/Dashboard/btn_closePopUp'), 10)

    WebUI.click(findTestObject('Page_Restaurant Intranet/Dashboard/btn_closePopUp'), FailureHandling.CONTINUE_ON_FAILURE)

    KeywordUtil.markPassed(('EXECUTION OF GETTING DATA FROM CALENDAR DASHBOARD FOR DATE  +' + DailyDate) + '+ is completed successfully....')
}

println(AllVariables.size())

def valueFromCal = [:]

valueFromCal = AllVariables.get('NetSalesValues')

println(valueFromCal.size())

DateAndValueFromCal.put('VariableValues', AllVariables)

DateAndValueFromCal.put('CalandarValues', DayWiseDate)

return DateAndValueFromCal


