import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
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
import internal.GlobalVariable as GlobalVariable


public class RB_FetchValues extends excelUtils.WriteExcelDailyFormula {





	@Keyword
	def fetchVariablevaluesFromReport() {


		WebDriver driver = DriverFactory.getWebDriver()


		String StoreName = GlobalVariable.PCName
		String DataGrain = GlobalVariable.DataGrain
		String PresentBy = GlobalVariable.PresentBy
		String user = GlobalVariable.username



		def ValuesFromReport = [:]

		int index;

		int NewIndex;


		if(user.equalsIgnoreCase("admin.insight360@analytix.com")) {

			println 'in IF loop'

			WebElement Tabel = driver.findElement(By.xpath("(//tbody[@class='ui-table-tbody'])[2]"))

			List<WebElement> Rows = Tabel.findElements(By.tagName('tr'))

			for (int j = 0; j < Rows.size(); j++) {

				WebElement VariableRow = Rows.get(j)

				List<WebElement> cells = VariableRow.findElements(By.tagName('td'))

				String Variablename = cells.get(0).getText()

				if (Variablename.trim().length() >=7) {
					String gotStorename = Variablename.trim()
					println(gotStorename)

					if(gotStorename.equalsIgnoreCase(StoreName)) {

						NewIndex = j

						println 'Here is new index value'+NewIndex

						break
					}
				}
			}
		}

		else {

			println 'in else loop'

			WebElement Tabel = driver.findElement(By.xpath("(//tbody[@class='ui-table-tbody'])[2]"))

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

						println 'Here is new index value'+NewIndex

						break
					}
				}
			}
		}



		WebElement HeaderRow = driver.findElement(By.xpath("(//thead[@class='ui-table-thead'])[2]"))
		int Headersssize
		List<WebElement> Headers;
		println 'bhavin'

		if (PresentBy.equalsIgnoreCase('Day')||PresentBy.equalsIgnoreCase('Week')||PresentBy.equalsIgnoreCase('Month')) {


			List<WebElement> HeadersRowTotal = HeaderRow.findElements(By.tagName('tr'))

			int rowsize=HeadersRowTotal.size()

			println rowsize

			println 'bhavin1'
			println rowsize


			Headers = HeadersRowTotal.get(1).findElements(By.tagName('th'))
			Headersssize=Headers.size()
			println 'bhavin2'


			println 'bhavin3'
		}

		else if (PresentBy.equalsIgnoreCase('EntireRange')) {


			List<WebElement> HeadersRowTotal = HeaderRow.findElements(By.tagName('tr'))

			int rowsize=HeadersRowTotal.size()

			println rowsize

			println 'bhavin1'
			println rowsize


			Headers = HeadersRowTotal.get(0).findElements(By.tagName('th'))
			Headersssize=Headers.size()
			println 'bhavin2'


			println 'bhavin3'
		}



		//Fetching variable values from tabel for all variables.
		//Headers.size()
		for (int i = 0; i <Headersssize; i++) {

			JavascriptExecutor je = ((driver) as JavascriptExecutor)

			WebElement HeaderNameElement = Headers.get(i)

			je.executeScript('arguments[0].scrollIntoView()', HeaderNameElement)

			String HeaderName = HeaderNameElement.getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

			println 'Header Name is'+HeaderName




			switch (HeaderName) {


				case 'Net Sales $':


					KeywordUtil.logInfo('FETCHING NET SALES TY VALUE FROM REPORT FOR FUTURE CALCULATION')

					index = i

					println 'index is'+index
					println 'Newindex is'+NewIndex

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					println Rows2.size()

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					println cellsNew.size()


					String NetsalesReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					println NetsalesReport


					writeRawValues(HeaderName,NetsalesReport,'-')


					Number NetSales = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(NetsalesReport)

					println(NetSales)


					ValuesFromReport.put('Net Sales $', NetSales)



					break


				case 'Net Sales LY $':

					KeywordUtil.logInfo('FETCHING NET SALES LY $ VALUE FROM REPORT FOR FURUTE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String NetsalesLYReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')


					writeRawValues(HeaderName,NetsalesLYReport,'-')

					Number NetSalesLY = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(NetsalesLYReport)


					println(NetSalesLY)


					ValuesFromReport.put('Net Sales LY $', NetSalesLY)



					break



				case 'Net Sales vs LY $':

					KeywordUtil.logInfo('FETCHING NET SALES VS LY $ VALUE FROM REPORT FOR FURUTE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String Netsales_VS_LYReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,Netsales_VS_LYReport,'-')

					Number NetSalesLY_vs_LY = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(Netsales_VS_LYReport)


					println(NetSalesLY_vs_LY)


					ValuesFromReport.put('Net Sales vs LY $', NetSalesLY_vs_LY)


					break






				case 'Net Sales vs LY %':

					KeywordUtil.logInfo('FETCHING NET SALES VS LY % VALUE FROM REPORT FOR FURUTE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String Netsales_VS_LY_Percent_Report = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,Netsales_VS_LY_Percent_Report,'-')

					Number Netsales_VS_LY_Percent = CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(Netsales_VS_LY_Percent_Report)


					println(Netsales_VS_LY_Percent)


					ValuesFromReport.put('Net Sales vs LY %', Netsales_VS_LY_Percent)

					break

				case 'Sales Budget $':


					KeywordUtil.logInfo('FETCHING  Sales Budget $  VALUE FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String SalesBudgetDollar = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,SalesBudgetDollar,'-')

					Number SalesBudgetDollars =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(SalesBudgetDollar)

					println(SalesBudgetDollars)


					ValuesFromReport.put('Sales Budget $', SalesBudgetDollars)


					break



				case 'Sales Budget %':


					KeywordUtil.logInfo('FETCHING Sales Budget % VALUE FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String NetsalesBudgetPercent = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,NetsalesBudgetPercent,'-')


					Number NetSalesBudget =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(NetsalesBudgetPercent)

					println(NetSalesBudget)


					ValuesFromReport.put('Sales Budget %', NetSalesBudget)


					break


				case 'Sales vs Budget $':


					KeywordUtil.logInfo('FETCHING Sales vs Budget $ VALUE FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String NetsalesVSBudgetDollar = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,NetsalesVSBudgetDollar,'-')


					Number NetSalesVsBudget =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(NetsalesVSBudgetDollar)

					println(NetSalesVsBudget)


					ValuesFromReport.put('Sales vs Budget $', NetSalesVsBudget)


					break


				case 'Sales vs Budget %':


					KeywordUtil.logInfo('FETCHING Sales vs Budget % VALUE FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String NetsalesVSBudgetPercentage = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,NetsalesVSBudgetPercentage,'-')


					Number NetSalesVsBudgetPercent =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(NetsalesVSBudgetPercentage)

					println(NetSalesVsBudgetPercent)


					ValuesFromReport.put('Sales vs Budget %', NetSalesVsBudgetPercent)


					break



				case 'Guest Count':

					KeywordUtil.logInfo('FETCHING GUEST COUNT  FROM CALENDAR FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String GuestCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,GuestCountReport1,'-')


					Number GuestCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(GuestCountReport1)


					println(GuestCountReport)


					ValuesFromReport.put('Guest Count', GuestCountReport)


					break


				case 'Guest LY Count':

					KeywordUtil.logInfo('FETCHING GUEST COUNT LY FROM CALENDAR FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String GuestCountLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,GuestCountLYReport1,'-')

					Number GuestCountLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(GuestCountLYReport1)


					println(GuestCountLYReport)


					ValuesFromReport.put('Guest LY Count', GuestCountLYReport)



					break


				case 'Guest vs LY Count':

					KeywordUtil.logInfo('FETCHING GUEST COUNT VS LY COUNT FROM CALENDAR FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String GuestCount_VS_LY_COUNT_Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,GuestCount_VS_LY_COUNT_Report1,'-')


					Number GuestCount_VS_LY_COUNT_Report =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(GuestCount_VS_LY_COUNT_Report1)

					println(GuestCount_VS_LY_COUNT_Report)


					ValuesFromReport.put('Guest vs LY Count', GuestCount_VS_LY_COUNT_Report)



					break



				case 'Guest vs LY %':

					KeywordUtil.logInfo('FETCHING GUEST COUNT VS LY % COUNT FROM CALENDAR FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String GuestCount_VS_LY_PERCENT_Report = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,GuestCount_VS_LY_PERCENT_Report,'-')

					Number GuestCount_VS_LY_PERCENT = CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(GuestCount_VS_LY_PERCENT_Report)


					println(GuestCount_VS_LY_PERCENT)


					ValuesFromReport.put('Guest vs LY %', GuestCount_VS_LY_PERCENT)

					break

				case 'Avg Check $':

					KeywordUtil.logInfo('FETCHING AVG CHECK VALUE FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String AvgCheckReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,AvgCheckReport,'-')


					Number AvgCheckDollor = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(AvgCheckReport)


					println(AvgCheckDollor)


					ValuesFromReport.put('Avg Check $', AvgCheckDollor)


					break

				case 'Avg Check LY $':

					KeywordUtil.logInfo('FETCHING AVG CHECK VALUE LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String AvgCheckLYReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,AvgCheckLYReport,'-')

					Number AvgCheckLY = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(AvgCheckLYReport)


					println(AvgCheckLY)


					ValuesFromReport.put('Avg Check LY $', AvgCheckLY)



					break

				case 'Avg Check vs LY $':

					KeywordUtil.logInfo('FETCHING AvgCheck_VS_LYReport FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String AvgCheck_VS_LYReport = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,AvgCheck_VS_LYReport,'-')

					Number AvgCheck_VS_LY = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(AvgCheck_VS_LYReport)


					println(AvgCheck_VS_LY)


					ValuesFromReport.put('Avg Check vs LY $', AvgCheck_VS_LY)
					break

				case 'Avg Check vs LY %':

					KeywordUtil.logInfo('FETCHING AvgCheckvsLY_PERCENT FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  AvgCheckvsLY_PERCENT  = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,AvgCheckvsLY_PERCENT,'-')


					Number AvgCheckvs_LY_PERCENTEGE = CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(AvgCheckvsLY_PERCENT)


					println(AvgCheckvs_LY_PERCENTEGE)


					ValuesFromReport.put('Avg Check vs LY %', AvgCheckvs_LY_PERCENTEGE)



					break



				case 'Labor Cost, $':

					KeywordUtil.logInfo('FETCHING Labor Cost, $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCost_$  = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCost_$,'-')


					Number LaborCost_$_Amount = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(LaborCost_$)


					println(LaborCost_$_Amount)


					ValuesFromReport.put('Labor Cost, $', LaborCost_$_Amount)

					break

				case 'Labor Cost, %':

					KeywordUtil.logInfo('FETCHING Labor Cost, %  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCostPercent  = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCostPercent,'-')


					Number LaborCost_Percent = CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(LaborCostPercent)


					println(LaborCost_Percent)


					ValuesFromReport.put('Labor Cost, %', LaborCost_Percent)
					break

				case 'Labor Cost LY, $':

					KeywordUtil.logInfo('FETCHING Labor Cost LY, $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCostLY$  = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCostLY$,'-')


					Number LaborCost_LY$ = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(LaborCostLY$)


					println(LaborCost_LY$)


					ValuesFromReport.put('Labor Cost LY, $', LaborCost_LY$)
					break

				case 'Labor Cost LY, %':

					KeywordUtil.logInfo('FETCHING Labor Cost LY, % FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCostLYPercent  = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCostLYPercent,'-')

					Number LaborCostLY_Percent = CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(LaborCostLYPercent)


					println(LaborCostLY_Percent)


					ValuesFromReport.put('Labor Cost LY, %', LaborCostLY_Percent)

					break

				case 'Labor Cost vs LY, $':

					KeywordUtil.logInfo('FETCHING Labor Cost vs LY, $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCost_VS_LY_$  = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCost_VS_LY_$,'-')

					Number LaborCost_VS_LY = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(LaborCost_VS_LY_$)


					println(LaborCost_VS_LY)


					ValuesFromReport.put('Labor Cost vs LY, $', LaborCost_VS_LY)
					break

				case 'Labor Cost vs LY, p.p.':

					KeywordUtil.logInfo('FETCHING Labor Cost vs LY, p.p. FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCost_VS_LY_PP1  = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCost_VS_LY_PP1,'-')

					Number LaborCost_VS_LY_PP = CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(LaborCost_VS_LY_PP1)


					println(LaborCost_VS_LY_PP)


					ValuesFromReport.put('Labor Cost vs LY, p.p.', LaborCost_VS_LY_PP)

					break

				case 'Labor Cost LW, $':

					KeywordUtil.logInfo('FETCHING Labor Cost LW, $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCost_LW_$ = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCost_LW_$,'-')


					Number LaborCost_LW_$_Report = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(LaborCost_LW_$)


					println(LaborCost_LW_$_Report)


					ValuesFromReport.put('Labor Cost LW, $', LaborCost_LW_$_Report)
					break

				case 'Labor Cost LW, %':


					KeywordUtil.logInfo('FETCHING Labor Cost LW, % FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCost_LW_Percent = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCost_LW_Percent,'-')


					Number LaborCost_LW = CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(LaborCost_LW_Percent)


					println(LaborCost_LW)


					ValuesFromReport.put('Labor Cost LW, %', LaborCost_LW)

					break

				case 'Labor Cost vs LW, $':

					KeywordUtil.logInfo('FETCHING Labor Cost vs LW, $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCost_VS_LW_$= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCost_VS_LW_$,'-')


					Number LaborCost_VS_LW_$_report = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(LaborCost_VS_LW_$)


					println(LaborCost_VS_LW_$_report)


					ValuesFromReport.put('Labor Cost vs LW, $', LaborCost_VS_LW_$_report)
					break

				case 'Labor Cost vs LW, p.p.':

					KeywordUtil.logInfo('FETCHING Labor Cost vs LW, p.p. FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCost_VS_LW_PP1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCost_VS_LW_PP1,'-')


					Number LaborCost_VS_LW_PP = CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(LaborCost_VS_LW_PP1)


					println(LaborCost_VS_LW_PP)


					ValuesFromReport.put('Labor Cost vs LW, p.p.', LaborCost_VS_LW_PP)



					break


				case 'Labor Cost Budget, %':


					KeywordUtil.logInfo('FETCHING Labor Cost Budget, % FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCostBudgetPercent= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCostBudgetPercent,'-')


					Number LaborCostBudgetPercentage = CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(LaborCostBudgetPercent)


					println(LaborCostBudgetPercentage)


					ValuesFromReport.put('Labor Cost Budget, %', LaborCostBudgetPercentage)


					break

				case 'Labor Cost Budget, $ (actual sales)':


					KeywordUtil.logInfo('FETCHING LaborCostBudget_$_ActualSales FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCostBudget_$_ActualSales= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCostBudget_$_ActualSales,'-')


					Number LaborCostBudget$_ActualSales = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(LaborCostBudget_$_ActualSales)


					println(LaborCostBudget$_ActualSales)


					ValuesFromReport.put('Labor Cost Budget, $ (actual sales)', LaborCostBudget$_ActualSales)


					break

				case 'Labor Cost Budget, $ (budgeted sales)':


					KeywordUtil.logInfo('FETCHING  Labor Cost Budget, $ (budgeted sales) FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCostBudget_$_BudgetedSales= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCostBudget_$_BudgetedSales,'-')


					Number LaborCostBudget$_BudgetedSales = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(LaborCostBudget_$_BudgetedSales)


					println(LaborCostBudget$_BudgetedSales)


					ValuesFromReport.put('Labor Cost Budget, $ (budgeted sales)', LaborCostBudget$_BudgetedSales)



					break


				case 'Labor Cost vs Budget, p.p.':


					KeywordUtil.logInfo('FETCHING  Labor Cost vs Budget, p.p. FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCost_VS_Budget_PP1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCost_VS_Budget_PP1,'-')


					Number LaborCost_VS_Budget_PP = CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(LaborCost_VS_Budget_PP1)


					println(LaborCost_VS_Budget_PP)


					ValuesFromReport.put('Labor Cost vs Budget, p.p.', LaborCost_VS_Budget_PP)



					break

				case 'Labor Cost vs Budget, $ (actual sales)':


					KeywordUtil.logInfo('FETCHING  Labor Cost vs Budget, $ (actual sales)  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCost_VS_Budget_$_ActualSales= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCost_VS_Budget_$_ActualSales,'-')


					Number LaborCost_VSBudget$_ActualSales = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(LaborCost_VS_Budget_$_ActualSales)


					println(LaborCost_VSBudget$_ActualSales)


					ValuesFromReport.put('Labor Cost vs Budget, $ (actual sales)', LaborCost_VSBudget$_ActualSales)



					break

				case 'Labor Cost vs Budget, $ (budgeted sales)':


					KeywordUtil.logInfo('FETCHING  Labor Cost vs Budget, $ (actual sales)  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String LaborCost_VS_Budget_$_BudgetedSales= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,LaborCost_VS_Budget_$_BudgetedSales,'-')

					Number LaborCost_VSBudget_$_BudgetedSales = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(LaborCost_VS_Budget_$_BudgetedSales)


					println(LaborCost_VSBudget_$_BudgetedSales)


					ValuesFromReport.put('Labor Cost vs Budget, $ (budgeted sales)', LaborCost_VSBudget_$_BudgetedSales)



					break

				case 'Gross Sales $':


					KeywordUtil.logInfo('FETCHING Gross Sales $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String GrossSalesLYDollorReport1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,GrossSalesLYDollorReport1,'-')

					Number GrossSalesDollorReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(GrossSalesLYDollorReport1)


					println(GrossSalesDollorReport)


					ValuesFromReport.put('Gross Sales $', GrossSalesDollorReport)



					break


				case 'Gross Sales LY $':


					KeywordUtil.logInfo('FETCHING Gross Sales LY $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String GrossSalesLYDollorReport1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,GrossSalesLYDollorReport1,'-')


					Number GrossSalesDollorLYReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(GrossSalesLYDollorReport1)


					println(GrossSalesDollorLYReport)


					ValuesFromReport.put('Gross Sales LY $', GrossSalesDollorLYReport)



					break


				case 'Gross Sales vs LY $':


					KeywordUtil.logInfo('FETCHING Gross Sales LY $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String GrossSalesvsLYDollorReport1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,GrossSalesvsLYDollorReport1,'-')


					Number GrossSalesDollorvsLYReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(GrossSalesvsLYDollorReport1)


					println(GrossSalesDollorvsLYReport)


					ValuesFromReport.put('Gross Sales vs LY $', GrossSalesDollorvsLYReport)



					break



				case 'Gross Sales vs LY %':


					KeywordUtil.logInfo('FETCHING Gross Sales LY % FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String GrossSalesLYPercentReport1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,GrossSalesLYPercentReport1,'-')


					Number GrossSalesPercentvsLYReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(GrossSalesLYPercentReport1)


					println(GrossSalesPercentvsLYReport)


					ValuesFromReport.put('Gross Sales vs LY %', GrossSalesPercentvsLYReport)


					break


				case 'Total hours':


					KeywordUtil.logInfo('FETCHING Total hours FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String TotalHoursReport1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,TotalHoursReport1,'-')


					Number TotalHoursReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(TotalHoursReport1)


					println(TotalHoursReport)


					ValuesFromReport.put('Total hours', TotalHoursReport)


					break


				case 'OT hours':


					KeywordUtil.logInfo('FETCHING OT hours FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String OTHoursReport1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,OTHoursReport1,'-')


					Number OTHoursReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(OTHoursReport1)


					println(OTHoursReport)


					ValuesFromReport.put('OT hours', OTHoursReport)

					break

				case 'Total hours LY':


					KeywordUtil.logInfo('FETCHING Total hours LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String TotalhoursLYReport1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,TotalhoursLYReport1,'-')


					Number TotalhoursLYReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(TotalhoursLYReport1)


					println(TotalhoursLYReport)


					ValuesFromReport.put('Total hours LY', TotalhoursLYReport)


					break

				case 'OT hours LY':


					KeywordUtil.logInfo('FETCHING OT hours LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String OThoursLYReport1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,OThoursLYReport1,'-')


					Number OThoursLYReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(OThoursLYReport1)


					println(OThoursLYReport)


					ValuesFromReport.put('OT hours LY', OThoursLYReport)


					break

				case 'Total hours vs LY':


					KeywordUtil.logInfo('FETCHING Total hours vs LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String TotalhoursvsLYReport1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,TotalhoursvsLYReport1,'-')

					Number TotalhoursvsLYReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(TotalhoursvsLYReport1)


					println(TotalhoursvsLYReport)


					ValuesFromReport.put('Total hours vs LY', TotalhoursvsLYReport)


					break

				case 'OT hours vs LY':


					KeywordUtil.logInfo('FETCHING OT hours vs LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String OThoursvsLYReport1= cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')

					writeRawValues(HeaderName,OThoursvsLYReport1,'-')


					Number OThoursvsLYReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(OThoursvsLYReport1)


					println(OThoursvsLYReport)


					ValuesFromReport.put('OT hours vs LY', OThoursvsLYReport)


					break









				default:


					break


			}


		}




		println ValuesFromReport


		return ValuesFromReport


	}




}
