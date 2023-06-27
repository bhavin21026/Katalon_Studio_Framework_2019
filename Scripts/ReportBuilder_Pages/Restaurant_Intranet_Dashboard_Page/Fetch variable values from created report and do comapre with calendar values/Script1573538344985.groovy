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

def NetSalesFromReport = [:]

def NetSalesLastYearFromReport = [:]

def BudgetedSalesFromReport = [:]

def GuestCountFromReport = [:]

def GuestCountLastYearFromReport = [:]

def GuestCountBudgetFromReport = [:]

def AvgCheckFromReport = [:]

def AvgCheckLastYearFromReport = [:]

def AvgCheckBudgetFromReport = [:]

def LaborFromReport = [:]

def LaborLastYearFromReport = [:]

def LaborBudgetFromReport = [:]

def AllVariablesFromReport = [:]

int index

int NewIndex

def CompareNetSales = [:]

def CompareNetSalesLY = [:]

def CompareGuestCount = [:]

def ComapreGuestCountLY = [:]

def CompareAvgTck = [:]

def CompareAvgTckLY = [:]

def CompareLaborCostTY = [:]

def CompareLaborCostLY = [:]

def CompareSalesBudget = [:]

def fecthDates = []

def allvaluesFromCal = [:]

allvaluesFromCal = SetUpListToGetData

fecthDates = allvaluesFromCal.get('CalandarValues')

int sizeOfColumns = NoOfAddedColumns

def ValuesFromCalender = [:]

ValuesFromCalender = allvaluesFromCal.get('VariableValues')

int DateIndex = 0

String StoreName = GlobalVariable.PCName

String user = GlobalVariable.username

def listForReportColumns = ['Net Sales $', 'Net Sales LY $', 'Sales Budget $', 'Guest Count', 'Guest LY Count', 'Avg Check $' , 'Avg Check LY $', 'Labor Cost, $', 'Labor Cost LY, $']



WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor je = ((driver) as JavascriptExecutor)


WebUI.delay(3)

if (user.equalsIgnoreCase('admin.insight360@analytix.com')) {
   println('in IF loop')

    WebElement Tabel = driver.findElement(By.xpath('(//tbody[@class=\'ui-table-tbody\'])[2]'))

    List<WebElement> Rows = Tabel.findElements(By.tagName('tr'))

    for (int j = 0; j < Rows.size(); j++) {
		
        WebElement VariableRow = Rows.get(j)

        List<WebElement> cells = VariableRow.findElements(By.tagName('td'))

        String Variablename = cells.get(0).getText()

        if (Variablename.trim().length() >= 7) {
            String gotStorename = Variablename.trim()

           println(gotStorename)

            if (gotStorename.equalsIgnoreCase(StoreName)) {
                NewIndex = j

               println('Here is new index value' + NewIndex)

                break
            }
        }
    }
} else {
   println('in else loop')

    WebElement Tabel = driver.findElement(By.xpath('(//tbody[@class=\'ui-table-tbody\'])[2]'))

    List<WebElement> Rows = Tabel.findElements(By.tagName('tr'))

    for (int j = 0; j < Rows.size(); j++) {
        WebElement VariableRow = Rows.get(j)

        List<WebElement> cells = VariableRow.findElements(By.tagName('td'))

        String Variablename = cells.get(0).getText()

        if (Variablename.trim().length() > 8) {
            String gotStorename = Variablename.substring(11, Variablename.length()).trim()

           println(gotStorename)

            if (gotStorename.equalsIgnoreCase(StoreName)) {
                NewIndex = j

               println('Here is new index value' + NewIndex)

                break
            }
        }
    }
}




WebElement HeaderRow = driver.findElement(By.xpath('(//thead[@class="ui-table-thead"])[2]'))

List<WebElement> HeadersRowTotal = HeaderRow.findElements(By.tagName('tr'))

List<WebElement> Headers = HeadersRowTotal.get(1).findElements(By.tagName('th'))

//println(Headers.size())

//Fetching variable values from tabel for all variables.
for (int i = 0; i < Headers.size(); i++) {
	
	

	
    WebElement HeaderNameElement = Headers.get(i)


    je.executeScript('arguments[0].scrollIntoView(true)', HeaderNameElement)

    //WebUI.scrollToElement(HeaderNameElement, i)
    //WebUI.executeJavaScript('arguments[0].scrollIntoView(true);',HeaderNameElement)
    String HeaderName = HeaderNameElement.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

   println(HeaderName)

    if (listForReportColumns.contains(HeaderName)) {
		
        switch (HeaderName) {
			
            case 'Net Sales $':
                KeywordUtil.logInfo('FETCHING NET SALES TY VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement NetsalesReport1 = cellsNew.get(index).findElement(By.tagName('div'))


                je.executeScript('arguments[0].scrollIntoView(true);', NetsalesReport1)

                //WebUI.scrollToElement(HeaderNameElement, i)
                String NetsalesReport = NetsalesReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

               println(NetsalesReport)

                WebUI.comment(NetsalesReport)

                NetSalesFromReport.put(fecthDates[DateIndex], NetsalesReport // AllVariablesFromReport.put('NetSales', NetSalesFromReport)
                    )

                break
            case 'Sales Budget $':
                KeywordUtil.logInfo('FETCHING  Sales Budget $  VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement NetsalesBudgetReport2 = cellsNew.get(index).findElement(By.tagName('div'))


                je.executeScript('arguments[0].scrollIntoView(true);', NetsalesBudgetReport2)

                //WebUI.scrollToElement(HeaderNameElement, i)
                String NetsalesBudgetReport = NetsalesBudgetReport2.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

               println(NetsalesBudgetReport)

                WebUI.comment(NetsalesBudgetReport)

                BudgetedSalesFromReport.put(fecthDates[DateIndex], NetsalesBudgetReport)

                break
            case 'Net Sales LY $':
                KeywordUtil.logInfo('FETCHING NET SALES LY VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement NetsalesLYReport1 = cellsNew.get(index).findElement(By.tagName('div'))


                je.executeScript('arguments[0].scrollIntoView(true);', NetsalesLYReport1)

                //WebUI.scrollToElement(HeaderNameElement, i)
                String NetsalesLYReport = NetsalesLYReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

               println(NetsalesLYReport)

                WebUI.comment(NetsalesLYReport)

                NetSalesLastYearFromReport.put(fecthDates[DateIndex], NetsalesLYReport)

                break
            case 'Guest Count':
                KeywordUtil.logInfo('FETCHING GUEST COUNT  FROM CALENDAR FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement GuestCountReport1 = cellsNew.get(index).findElement(By.tagName('div'))


                je.executeScript('arguments[0].scrollIntoView(true);', GuestCountReport1)

                String GuestCountReport = GuestCountReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

               println(GuestCountReport)

                WebUI.comment(GuestCountReport)

                GuestCountFromReport.put(fecthDates[DateIndex], GuestCountReport)

                break
            case 'Guest LY Count':
                KeywordUtil.logInfo('FETCHING GUEST COUNT LY FROM CALENDAR FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement GuestCountLYReport1 = cellsNew.get(index).findElement(By.tagName('div'))


                je.executeScript('arguments[0].scrollIntoView(true);', GuestCountLYReport1)

                String GuestCountLYReport = GuestCountLYReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

               println(GuestCountLYReport)

                WebUI.comment(GuestCountLYReport)

                GuestCountLastYearFromReport.put(fecthDates[DateIndex], GuestCountLYReport)

                break
            case 'Avg Check $':
                KeywordUtil.logInfo('FETCHING AVG CHECK VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement AvgCheckReport1 = cellsNew.get(index).findElement(By.tagName('div'))


                je.executeScript('arguments[0].scrollIntoView(true);', AvgCheckReport1)

                String AvgCheckReport = AvgCheckReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

               println(AvgCheckReport)

                WebUI.comment(AvgCheckReport)

                AvgCheckFromReport.put(fecthDates[DateIndex], AvgCheckReport)

                break
            case 'Avg Check LY $':
                KeywordUtil.logInfo('FETCHING AVG CHECK LY VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement AvgCheckLYReport1 = cellsNew.get(index).findElement(By.tagName('div'))


                je.executeScript('arguments[0].scrollIntoView(true);', AvgCheckLYReport1)

                String AvgCheckLYReport = AvgCheckLYReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

               println(AvgCheckLYReport)

                WebUI.comment(AvgCheckLYReport)

                AvgCheckLastYearFromReport.put(fecthDates[DateIndex], AvgCheckLYReport)

                break
            case 'Labor Cost, $':
                KeywordUtil.logInfo('FETCHING LABOR COST TY VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement LaborCostTYReport1 = cellsNew.get(index).findElement(By.tagName('div'))


                je.executeScript('arguments[0].scrollIntoView(true);', LaborCostTYReport1)

                String LaborCostTYReport = LaborCostTYReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

               println(LaborCostTYReport)

                WebUI.comment(LaborCostTYReport)

                LaborFromReport.put(fecthDates[DateIndex], LaborCostTYReport)

                break
            case 'Labor Cost LY, $':
                KeywordUtil.logInfo('FETCHING LABOR COST LY VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement LaborCostLYReport1 = cellsNew.get(index).findElement(By.tagName('div'))


                je.executeScript('arguments[0].scrollIntoView(true);', LaborCostLYReport1)

                String LaborCostLYReport = LaborCostLYReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

               println(LaborCostLYReport)

                WebUI.comment(LaborCostLYReport)

                LaborLastYearFromReport.put(fecthDates[DateIndex], LaborCostLYReport)

                break
            default:
                break
        }
    }
    
    int noofcolumn = sizeOfColumns

    //sizeOfColumns
    if (((i + 1) % noofcolumn) == 0) {
        KeywordUtil.markPassed(('EXECUTION OF GETTING DATA FROM REPORT FOR DATE  +' + (fecthDates[DateIndex])) + '+ is completed successfully....')

        DateIndex++
    }
}

KeywordUtil.logInfo('\'******************DELETE EXCEL FILE*******************\'')

CustomKeywords.'excelUtils.ExcelsCustom.deleteCalFile'()

KeywordUtil.logInfo('\'******************CREATING EXCEL FILE*******************\'')

CustomKeywords.'excelUtils.CreateSheet.createExcel'()

KeywordUtil.logInfo('\'******************EXCEL CREATION DONE SUCCESSFULLY*******************\'')

KeywordUtil.logInfo('\'******************EXECUTION FINSISHED AND NOW START COMPARING CALENDAR AND REPORT VALUE FOR SAME PERIOD*******************\'')

CompareNetSales = ValuesFromCalender.get('NetSalesValues')

CompareNetSalesLY = ValuesFromCalender.get('NetSalesLastYearValues')

CompareSalesBudget = ValuesFromCalender.get('BudgetedSalesValues')

CompareGuestCount = ValuesFromCalender.get('GuestCountValues')

ComapreGuestCountLY = ValuesFromCalender.get('GuestCountLastYearValues')

CompareAvgTck = ValuesFromCalender.get('AvgCheckValues')

CompareAvgTckLY = ValuesFromCalender.get('AvgCheckLastYearValues')

//CompareLaborCostTY=ValuesFromCalender.get('LaborThisYear')
//CompareLaborCostLY=ValuesFromCalender.get('LaborLastYear')
//println('********************************************************************************')

//println('********************************************************************************')

//println(CompareNetSales)

//println(NetSalesFromReport)

//println('********************************************************************************')

//println('********************************************************************************')

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.NetSalesValuesCompareWithCalender'(CompareNetSales, NetSalesFromReport)

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.NetSalesLastYearValuesCompareWithCalender'(CompareNetSalesLY, 
    NetSalesLastYearFromReport)

//CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.NetSalesBudgetValuesCompareWithCalender'(CompareSalesBudget, BudgetedSalesFromReport)
CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.GuestCountCompareWithCalender'(CompareGuestCount, GuestCountFromReport)

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.GuestCountLastyearCompareWithCalender'(ComapreGuestCountLY, 
    GuestCountLastYearFromReport)

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.AverageCheckCompareWithCalender'(CompareAvgTck, AvgCheckFromReport)

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.AverageCheckLastYearCompareWithCalender'(CompareAvgTckLY, 
    AvgCheckLastYearFromReport)

//CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.LaborCostTYCompareWithCalender'(CompareLaborCostTY, LaborFromReport)
//CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.LaborCostLYCompareWithCalender'(CompareLaborCostLY, LaborLastYearFromReport)
KeywordUtil.logInfo('\'******************COMPARISION FINISHED*******************\'')

CustomKeywords.'reportbuildercustom.EmailUtils.doSendEmail'()
