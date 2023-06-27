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



String StoreName = GlobalVariable.PCName

def ListOfColumnsFromCalendar = [:]

int index;

int NewIndex;


ListOfColumnsFromCalendar = SetUpCulumnList



def listForReportColumns = ['Net Sales $', 'Net Sales LY $', 'Guest Count', 'Guest LY Count', 'Avg Check $', 'Avg Check LY $']

WebDriver driver = DriverFactory.getWebDriver()

WebElement HeaderRow = driver.findElement(By.xpath('(//thead[@class="ui-table-thead"])[2]'))

List<WebElement> HeadersRowTotal = HeaderRow.findElements(By.tagName('tr'))

List<WebElement> Headers = HeadersRowTotal.get(1).findElements(By.tagName('th'))

println(Headers.size())

WebElement Tabel = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[2]'))

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

            println(NewIndex)

            break
        }
    }
}

//Fetching variable values from tabel for all variables.
for (int i = 0; i < Headers.size(); i++) {
	
    JavascriptExecutor je = ((driver) as JavascriptExecutor)

    WebElement HeaderNameElement = Headers.get(i)

    je.executeScript('arguments[0].scrollIntoView()', HeaderNameElement)

    String HeaderName = HeaderNameElement.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

    println(HeaderName)

    if (listForReportColumns.contains(HeaderName)) {
		
		
		
			
		
        if (HeaderName.equalsIgnoreCase('Net Sales $')) {
			
            KeywordUtil.logInfo('FETCHING NET SALES TY VALUE FROM REPORT FOR FUTURE CALCULATION')

            index = i

            WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

            List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

            WebElement RequiredRow = Rows2.get(NewIndex)

            List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

            String NetsalesReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                '\n', ' ')

            println(NetsalesReport)

            WebUI.comment(NetsalesReport)
			
			

          
        } else if (HeaderName.equalsIgnoreCase('Net Sales LY $')) {
            KeywordUtil.logInfo('FETCHING NET SALES LY $ VALUE FROM REPORT FOR FURUTE CALCULATION')

            index = i

            WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

            List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

            WebElement RequiredRow = Rows2.get(NewIndex)

            List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

            String NetsalesLYReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                '\n', ' ')

            println(NetsalesLYReport)

            WebUI.comment(NetsalesLYReport)

      
        }
		
		else if (HeaderName.equalsIgnoreCase('Net Sales vs LY $')) {
			
			KeywordUtil.logInfo('FETCHING NET SALES VS LY $ VALUE FROM REPORT FOR FURUTE CALCULATION')

			index = i

			WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

			List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

			WebElement RequiredRow = Rows2.get(NewIndex)

			List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

			String Netsales_VS_LYReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
				'\n', ' ')

			println(Netsales_VS_LYReport)

			WebUI.comment(Netsales_VS_LYReport)

	  
		}
		
		else if (HeaderName.equalsIgnoreCase('Net Sales vs LY %')) {
			
			KeywordUtil.logInfo('FETCHING NET SALES VS LY % VALUE FROM REPORT FOR FURUTE CALCULATION')

			index = i

			WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

			List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

			WebElement RequiredRow = Rows2.get(NewIndex)

			List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

			String Netsales_VS_LY_Percent_Report = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
				'\n', ' ')

			println(Netsales_VS_LY_Percent_Report)

			WebUI.comment(Netsales_VS_LY_Percent_Report)

	  
		}
		
		
		
		 else if (HeaderName.equalsIgnoreCase('Guest Count')) {
			 
            KeywordUtil.logInfo('FETCHING GUEST COUNT  FROM CALENDAR FOR FUTURE CALCULATION')

            index = i

            WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

            List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

            WebElement RequiredRow = Rows2.get(NewIndex)

            List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

            String GuestCountReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                '\n', ' ')

            println(GuestCountReport)

            WebUI.comment(GuestCountReport)

        }
		  else if (HeaderName.equalsIgnoreCase('Guest LY Count')) {
			  
            KeywordUtil.logInfo('FETCHING GUEST COUNT LY FROM CALENDAR FOR FUTURE CALCULATION')

            index = i

            WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

            List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

            WebElement RequiredRow = Rows2.get(NewIndex)

            List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

            String GuestCountLYReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                '\n', ' ')

            println(GuestCountLYReport)

            WebUI.comment(GuestCountLYReport)

        }
		  else if (HeaderName.equalsIgnoreCase('Guest vs LY Count')) {
			  
            KeywordUtil.logInfo('FETCHING GUEST COUNT VS LY COUNT FROM CALENDAR FOR FUTURE CALCULATION')

            index = i

            WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

            List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

            WebElement RequiredRow = Rows2.get(NewIndex)

            List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

            String GuestCount_VS_LY_COUNT_Report = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                '\n', ' ')

            println(GuestCount_VS_LY_COUNT_Report)

            WebUI.comment(GuestCount_VS_LY_COUNT_Report)

        }
		  
		  else if (HeaderName.equalsIgnoreCase('Guest vs LY %')) {
			  
			KeywordUtil.logInfo('FETCHING GUEST COUNT VS LY % COUNT FROM CALENDAR FOR FUTURE CALCULATION')

			index = i

			WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

			List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

			WebElement RequiredRow = Rows2.get(NewIndex)

			List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

			String GuestCount_VS_LY_PERCENT_Report = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
				'\n', ' ')

			println(GuestCount_VS_LY_PERCENT_Report)

			WebUI.comment(GuestCount_VS_LY_PERCENT_Report)

		}
		  
		   else if (HeaderName.equalsIgnoreCase('Avg Check $')) {
			   
            KeywordUtil.logInfo('FETCHING AVG CHECK VALUE FROM REPORT FOR FUTURE CALCULATION')

            index = i

            WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

            List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

            WebElement RequiredRow = Rows2.get(NewIndex)

            List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

            String AvgCheckReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                '\n', ' ')

            println(AvgCheckReport)

            WebUI.comment(AvgCheckReport)

        } else if (HeaderName.equalsIgnoreCase('Avg Check LY $')) {
		
            KeywordUtil.logInfo('FETCHING AVG CHECK VALUE LY FROM REPORT FOR FUTURE CALCULATION')

            index = i

            WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

            List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

            WebElement RequiredRow = Rows2.get(NewIndex)

            List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

            String AvgCheckLYReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
                '\n', ' ')

            println(AvgCheckLYReport)

            WebUI.comment(AvgCheckLYReport)

        }
		
		else if (HeaderName.equalsIgnoreCase('Avg Check vs LY $')) {
			
				KeywordUtil.logInfo('FETCHING AvgCheck_VS_LYReport FROM REPORT FOR FUTURE CALCULATION')
	
				index = i
	
				WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))
	
				List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))
	
				WebElement RequiredRow = Rows2.get(NewIndex)
	
				List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))
	
				String AvgCheck_VS_LYReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
					'\n', ' ')
	
				println(AvgCheck_VS_LYReport)
	
				WebUI.comment(AvgCheck_VS_LYReport)
	
			}
		
		else if (HeaderName.equalsIgnoreCase(' Avg Check vs LY % ')) {
			
				KeywordUtil.logInfo('FETCHING AvgCheckvsLY_PERCENT FROM REPORT FOR FUTURE CALCULATION')
	
				index = i
	
				WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))
	
				List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))
	
				WebElement RequiredRow = Rows2.get(NewIndex)
	
				List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))
	
				String  AvgCheckvsLY_PERCENT  = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
					'\n', ' ')
	
				println(AvgCheckvsLY_PERCENT)
	
				WebUI.comment(AvgCheckvsLY_PERCENT)
	
			}
		
    } else {
    }
    

    
}

KeywordUtil.logInfo('\'******************EXECUTION FINSISHED AND NOW START COMPARING CALENDAR AND REPORT VALUE FOR SAME PERIOD*******************\'')

CompareNetSales = ValuesFromCalender.get('NetSalesValues')

CompareNetSalesLY = ValuesFromCalender.get('NetSalesLastYearValues')

CompareGuestCount = ValuesFromCalender.get('GuestCountValues')

ComapreGuestCountLY = ValuesFromCalender.get('GuestCountLastYearValues')

CompareAvgTck = ValuesFromCalender.get('AvgCheckValues')

CompareAvgTckLY = ValuesFromCalender.get('AvgCheckLastYearValues')

CustomKeywords.'reportbuildercustom.RB_Keywords.NetSalesValuesCompareWithCalender'(CompareNetSales, NetSalesFromReport)

CustomKeywords.'reportbuildercustom.RB_Keywords.NetSalesLastYearValuesCompareWithCalender'(CompareNetSalesLY, NetSalesLastYearFromReport)

CustomKeywords.'reportbuildercustom.RB_Keywords.GuestCountCompareWithCalender'(CompareGuestCount, GuestCountFromReport)

CustomKeywords.'reportbuildercustom.RB_Keywords.GuestCountLastyearCompareWithCalender'(ComapreGuestCountLY, GuestCountLastYearFromReport)

CustomKeywords.'reportbuildercustom.RB_Keywords.AverageCheckCompareWithCalender'(CompareAvgTck, AvgCheckFromReport)

CustomKeywords.'reportbuildercustom.RB_Keywords.AverageCheckLastYearCompareWithCalender'(CompareAvgTckLY,AvgCheckLastYearFromReport)


KeywordUtil.logInfo('\'******************COMPARISION FINISHED*******************\'')

