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

def COGS = [:]

def COGSLastYear = [:]

def COGSBudget = [:]

def PrimeCost = [:]

def PrimeCostLastYear = [:]

def PrimeCostBudget = [:]

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

ArrayList<WebElement> Calenderrow = Wrappers.findElements(By.xpath('((//div[contains(@class,"calendar-row calendar-row--charts")]))'))

int NoOfcalenderRows = Calenderrow.size()

println('No of calender rows are' + NoOfcalenderRows)

JavascriptExecutor je = ((driver) as JavascriptExecutor)

for (int l = 0; l < NoOfcalenderRows; l++) {
    int count = l + 2

    WebElement Row = driver.findElement(By.xpath(('/html/body/app-root/app-homelayout/body/div/app-home/div[2]/div/div[' + 
            count) + ']/div[3]/div'))

    //WebElement Row = Calenderrow.get(l).findElement(By.xpath("//div[@class=\"col-right col-right--chart\"]"))
    //int NoOfRows = Row.size()
    println('No of  rows ' + l)

    if (l >= 1) {
        je.executeScript('arguments[0].scrollIntoView(true);', Row)

        je.executeScript('arguments[0].click();', Row)
    } else {
        Row.click()
    }
    
    /* Actions actions = new Actions(driver);
   actions.moveToElement(Row);
   actions.perform();*/
    //Row.click()
    //actions.click()
    //je.executeScript('arguments[0].scrollIntoView(true);', Row)
    //Row.click()
    /*if (l >= 1) {
    } else {
        Row.click()
    }*/
    // WebElement Row = CalenderViewNew.findElement(By.xpath("//div[starts-with(@class,'chart-data chart-data--future')]"))
    String DateOnCalendar = WebUI.getText(findTestObject('Page_Restaurant Intranet/Dashboard/div_DailyDateHeader'))

    CalendarDates = DateOnCalendar.split('-')

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

                    NetSalesLastYear.put(DailyDate, NetSalesLY )//COGS with Last Year

                    AllVariables.put('NetSalesLastYearValues', NetSalesLastYear)
					
                    }else if (Variablename.equalsIgnoreCase('LABOR')) {
				
                    KeywordUtil.logInfo('FETCHING LABOR COST TY FROM CALENDAR FOR DATE:' + DailyDate)
					println index
                    List<WebElement> Labordata= cells.get(index).findElements(By.tagName('p'))
					WebElement Labordata2=Labordata.get(1)			
					String LaborCostTY=Labordata2.getText()
                    WebUI.comment(LaborCostTY)
					
					
                    println(LaborCostTY)

                    Labor.put(DailyDate, LaborCostTY)

                    AllVariables.put('LaborThisYear', Labor)

                    KeywordUtil.logInfo('FETCHING LABOR LY FROM CALENDAR FOR DATE:' + DailyDate)

					List<WebElement> LabordataLY= cells.get(index+1).findElements(By.tagName('div'))
					String LaborCostLY=LabordataLY.get(1).findElements(By.tagName('span')).get(0).getText()
	                 WebUI.comment(LaborCostLY)
					

                    LaborLastYear.put(DailyDate, LaborCostLY)

                    AllVariables.put('LaborLastYear', LaborLastYear) 
                } else if (Variablename.equalsIgnoreCase('COGS')) {
                    KeywordUtil.logInfo('FETCHING COGS TY FROM CALENDAR FOR DATE:' + DailyDate)

					List<WebElement> COGSdata= cells.get(index).findElements(By.tagName('p'))
					WebElement COGSdata2=COGSdata.get(0)
					String COGSTY=COGSdata2.getText()
					

                    WebUI.comment(COGSTY)

                    println(COGSTY)

                    COGS.put(DailyDate, COGSTY)

                    AllVariables.put('COGSValues', COGS)

                    KeywordUtil.logInfo('FETCHING COGS LY FROM CALENDAR FOR DATE:' + DailyDate)

                    List<WebElement> COGSdataLY= cells.get(index+1).findElements(By.tagName('div'))
					String COGSLY=COGSdataLY.get(0).findElements(By.tagName('span')).get(0).getText()
	                WebUI.comment(COGSLY)

                    WebUI.comment(COGSLY)

                    println(COGSLY)

                    COGSLastYear.put(DailyDate, COGSLY)

                    AllVariables.put('COGSLastYearValues', COGSLastYear)
                } else if (Variablename.equalsIgnoreCase('PRIME COST')) {
                    KeywordUtil.logInfo('FETCHING PRIME COST TY FROM CALENDAR FOR DATE:' + DailyDate)
					
					List<WebElement> PrimeCostdata= cells.get(index).findElements(By.tagName('p'))
					WebElement PrimeCostdata2=PrimeCostdata.get(0)
					String PrimeCostTY=PrimeCostdata2.getText()
					WebUI.comment(PrimeCostTY)
					
					
					println(PrimeCostTY)

					PrimeCost.put(DailyDate, PrimeCostTY)

                    AllVariables.put('PrimeCostValues', PrimeCost)
					
					
					KeywordUtil.logInfo('FETCHING PRIME COST LY FROM CALENDAR FOR DATE:' + DailyDate)

					List<WebElement> PrimeCostLYData= cells.get(index+1).findElements(By.tagName('div'))
					String PrimeCostLY=PrimeCostLYData.get(0).findElements(By.tagName('span')).get(0).getText()
					
					WebUI.comment(PrimeCostLY)
					
					PrimeCostLastYear.put(DailyDate, PrimeCostLY)

					AllVariables.put('PrimeCostLastYearValues', PrimeCostLastYear)


                   

                    

                   
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
                            } else if (VariablenameBudget.equalsIgnoreCase('COGS')) {
                                KeywordUtil.logInfo('FETCHING COGS BUDGET FROM CALENDAR FOR DATE:' + DailyDate)
								
										

                                List<WebElement> COGSBudgetedData = cellsBudget.get(index + 1).findElements(By.tagName('span'))

                                String COGSBudgeted = COGSBudgetedData.get(0).getText()

                                WebUI.comment(COGSBudgeted)

                                println(COGSBudgeted)

                                COGSBudget.put(DailyDate, COGSBudgeted)

                                AllVariables.put('COGSBudgetValues', COGSBudget)
                            } else if (VariablenameBudget.equalsIgnoreCase('LABOR')) {
                                KeywordUtil.logInfo('FETCHING LABOR BUDGET FROM CALENDAR FOR DATE:' + DailyDate)
								
									

                                List<WebElement> LABORBudgetedData = cellsBudget.get(index+1).findElements(By.tagName('div'))

                                String LABORBudgeted = LABORBudgetedData.get(1).findElements(By.tagName('span')).get(0).getText()

                                WebUI.comment(LABORBudgeted)

                                println(LABORBudgeted)

                                LaborBudget.put(DailyDate, LABORBudgeted)

                                AllVariables.put('LABORBudgetValues', LaborBudget)
								
                            } else if (VariablenameBudget.equalsIgnoreCase('PRIME COST')) {
                                KeywordUtil.logInfo('FETCHING PRIME COST BUDGET FROM CALENDAR FOR DATE:' + DailyDate)

                                List<WebElement> PrimeCostBudgetedData = cellsBudget.get(index + 1).findElements(By.tagName(
                                        'div'))

                                String PrimeCostBudgeted = PrimeCostBudgetedData.get(0).findElements(By.tagName('span')).get(0).getText()

                                WebUI.comment(PrimeCostBudgeted)

                                println(PrimeCostBudgeted)

                                PrimeCostBudget.put(DailyDate, PrimeCostBudgeted)

                                AllVariables.put('PrimeCostBudgetValues', PrimeCostBudget)
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