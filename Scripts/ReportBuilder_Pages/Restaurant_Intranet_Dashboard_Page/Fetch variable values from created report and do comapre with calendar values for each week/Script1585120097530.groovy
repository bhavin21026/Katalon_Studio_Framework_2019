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

def COGSFromReport = [:]

def COGSLastYearFromReport = [:]

def COGSBudgetFromReport = [:]

def PrimeCostFromReport = [:]

def PrimeCostLastYearFromReport = [:]

def PrimeCostBudgetFromReport = [:]

def LaborFromReport = [:]

def LaborLastYearFromReport = [:]

def LaborBudgetFromReport = [:]

def AllVariablesFromReport = [:]

int index

int NewIndex

def CompareNetSales = [:]

def CompareNetSalesLY = [:]

def CompareCOGS = [:]

def ComapreCOGSLY = [:]

def ComparePrimeCost = [:]

def ComparePrimeCostLY = [:]

def CompareLaborCostTY = [:]

def CompareLaborCostLY = [:]

def CompareLaborCostBudget = [:]

def CompareCOGSBudget = [:]

def ComparePrimerCostBudget = [:]


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

def listForReportColumns = ['Net Sales $', 'Net Sales LY $', 'Sales Budget $', 'Labor Cost, $', 'Labor Cost LY, $', 'Labor Cost Budget, $ (actual sales)'
    , 'COGS Total, %', 'COGS Total LY, %', 'COGS Budget, %', 'Prime Cost, %', 'Prime Cost LY, %', 'Prime Cost Budget, %']

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

    je.executeScript("arguments[0].scrollIntoView(true);", HeaderNameElement)

    //WebUI.scrollToElement(HeaderNameElement, i)
    //WebUI.executeJavaScript("arguments[0].scrollIntoView(true);",HeaderNameElement)
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
            case 'COGS Total, %':
                KeywordUtil.logInfo('FETCHING COGS Total, %  FROM CALENDAR FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement COGSReport1 = cellsNew.get(index).findElement(By.tagName('div'))

                je.executeScript('arguments[0].scrollIntoView(true);', COGSReport1)

                String COGSReport = COGSReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', 
                    ' ')

                println(COGSReport)

                WebUI.comment(COGSReport)

                COGSFromReport.put(fecthDates[DateIndex], COGSReport)

                break
            case 'COGS Total LY, %':
                KeywordUtil.logInfo('FETCHING COGS Total LY, % FROM CALENDAR FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement COGSLYReport1 = cellsNew.get(index).findElement(By.tagName('div'))

                je.executeScript('arguments[0].scrollIntoView(true);', COGSLYReport1)

                String COGSLYReport = COGSLYReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', 
                    ' ')

                println(COGSLYReport)

                WebUI.comment(COGSLYReport)

                COGSLastYearFromReport.put(fecthDates[DateIndex], COGSLYReport)

                break
            case 'Prime Cost, %':
                KeywordUtil.logInfo('FETCHING Prime Cost, % VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement PrimeCostReport1 = cellsNew.get(index).findElement(By.tagName('div'))

                je.executeScript('arguments[0].scrollIntoView(true);', PrimeCostReport1)

                String PrimeCostReport = PrimeCostReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

                println(PrimeCostReport)

                WebUI.comment(PrimeCostReport)

                PrimeCostFromReport.put(fecthDates[DateIndex], PrimeCostReport)

                break
            case 'Prime Cost LY, %':
                KeywordUtil.logInfo('FETCHING Prime Cost LY, % VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement PrimeCostLYReport1 = cellsNew.get(index).findElement(By.tagName('div'))

                je.executeScript('arguments[0].scrollIntoView(true);', PrimeCostLYReport1)

                String PrimeCostLYReport = PrimeCostLYReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                    '\n', ' ')

                println(PrimeCostLYReport)

                WebUI.comment(PrimeCostLYReport)

                PrimeCostLastYearFromReport.put(fecthDates[DateIndex], PrimeCostLYReport)

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
            case 'Labor Cost Budget, $ (actual sales)':
                KeywordUtil.logInfo('FETCHING Labor Cost Budget, $ (actual sales) VALUE FROM REPORT FOR DATE:' + (fecthDates[
                    DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement LaborCostBudgetDollorReport1 = cellsNew.get(index).findElement(By.tagName('div'))

                je.executeScript('arguments[0].scrollIntoView(true);', LaborCostBudgetDollorReport1)

                String LaborCostBudgetDollorReport = LaborCostBudgetDollorReport1.getText().replaceAll('\r\n', ' ').replaceAll(
                    '\r', ' ').replaceAll('\n', ' ')

                println(LaborCostBudgetDollorReport)

                WebUI.comment(LaborCostBudgetDollorReport)

                LaborBudgetFromReport.put(fecthDates[DateIndex], LaborCostBudgetDollorReport)

                break
            case 'COGS Budget, %':
                KeywordUtil.logInfo('FETCHING COGS Budget, % VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement CogsBudgetPercentReport1 = cellsNew.get(index).findElement(By.tagName('div'))

                je.executeScript('arguments[0].scrollIntoView(true);', CogsBudgetPercentReport1)

                String CogsBudgetPercentReport = CogsBudgetPercentReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', 
                    ' ').replaceAll('\n', ' ')

                println(CogsBudgetPercentReport)

                WebUI.comment(CogsBudgetPercentReport)

                COGSBudgetFromReport.put(fecthDates[DateIndex], CogsBudgetPercentReport)

                break
            case 'Prime Cost Budget, %':
                KeywordUtil.logInfo('FETCHING Prime Cost Budget, % VALUE FROM REPORT FOR DATE:' + (fecthDates[DateIndex]))

                index = i

                WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

                List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

                WebElement RequiredRow = Rows2.get(NewIndex)

                List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

                WebElement PrimeBudgetPercentReport1 = cellsNew.get(index).findElement(By.tagName('div'))

                je.executeScript('arguments[0].scrollIntoView(true);', PrimeBudgetPercentReport1)

                String PrimeBudgetPercentReport = PrimeBudgetPercentReport1.getText().replaceAll('\r\n', ' ').replaceAll('\r', 
                    ' ').replaceAll('\n', ' ')

                println(PrimeBudgetPercentReport)

                WebUI.comment(PrimeBudgetPercentReport)

                PrimeCostBudgetFromReport.put(fecthDates[DateIndex], PrimeBudgetPercentReport)

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

CompareCOGS = ValuesFromCalender.get('COGSValues')

ComapreCOGSLY = ValuesFromCalender.get('COGSLastYearValues')

 CompareLaborCostTY = ValuesFromCalender.get('LaborThisYear')

 CompareLaborCostLY = ValuesFromCalender.get('LaborLastYear')

ComparePrimeCost = ValuesFromCalender.get('PrimeCostValues')

ComparePrimeCostLY = ValuesFromCalender.get('PrimeCostLastYearValues')

 CompareLaborCostBudget =  ValuesFromCalender.get('LABORBudgetValues')

 CompareCOGSBudget =  ValuesFromCalender.get('COGSBudgetValues')

 ComparePrimerCostBudget =  ValuesFromCalender.get('PrimeCostBudgetValues')


CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.NetSalesValuesCompareWithCalender'(CompareNetSales, NetSalesFromReport)

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.NetSalesLastYearValuesCompareWithCalender'(CompareNetSalesLY, 
    NetSalesLastYearFromReport)

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.NetSalesBudgetValuesCompareWithCalender'(CompareSalesBudget, BudgetedSalesFromReport)


CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.COGSCompareWithCalender'(CompareCOGS, COGSFromReport)

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.COGSLastyearCompareWithCalender'(ComapreCOGSLY, COGSLastYearFromReport)

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.COGSBudgetrCompareWithCalender'(CompareCOGSBudget, COGSBudgetFromReport)


CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.PrimeCostBudgetrCompareWithCalender'(ComparePrimerCostBudget, PrimeCostBudgetFromReport)

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.PrimeCostTYCompareWithCalender'(ComparePrimeCost,PrimeCostFromReport)

CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.PrimeCostLYCompareWithCalender'(ComparePrimeCostLY,PrimeCostLastYearFromReport)



CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.LaborCostTYCompareWithCalender'(CompareLaborCostTY, LaborFromReport)
CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.LaborCostLYCompareWithCalender'(CompareLaborCostLY, LaborLastYearFromReport)
CustomKeywords.'reportbuildercustom.RB_ValueCompareWithCalendar.LaborCostBudgetDollorCompareWithCalender'(CompareLaborCostBudget, LaborBudgetFromReport)

KeywordUtil.logInfo('\'******************COMPARISION FINISHED*******************\'')

CustomKeywords.'reportbuildercustom.EmailUtils.doSendEmail'()
