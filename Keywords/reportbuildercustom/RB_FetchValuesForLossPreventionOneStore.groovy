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


public class RB_FetchValuesForLossPreventionOneStore extends excelUtils.WriteExcelLossPreventionFormula
{





	@Keyword
	def fetchVariablevaluesFromReport()
	{


		WebDriver driver = DriverFactory.getWebDriver()


		String StoreName = GlobalVariable.PCName
		String DataGrain = GlobalVariable.DataGrain
		String PresentBy = GlobalVariable.PresentBy
		String user = GlobalVariable.username



		def ValuesFromReport = [:]

		int index;

		int NewIndex;


		if(user.equalsIgnoreCase("admin.insight360@analytix.com"))
		{

			println 'in IF loop'

			WebElement Tabel = driver.findElement(By.xpath("(//tbody[@class='ui-table-tbody'])[2]"))

			List<WebElement> Rows = Tabel.findElements(By.tagName('tr'))

			for (int j = 0; j < Rows.size(); j++)
			{

				WebElement VariableRow = Rows.get(j)

				List<WebElement> cells = VariableRow.findElements(By.tagName('td'))

				String Variablename = cells.get(0).getText()

				if (Variablename.trim().length() >=7)
				{
					String gotStorename = Variablename.trim()
					println(gotStorename)

					if(gotStorename.equalsIgnoreCase(StoreName))
					{

						NewIndex = j

						println 'Here is new index value'+NewIndex

						break
					}
				}
			}
		}

		else
		{

			println 'in else loop'

			WebElement Tabel = driver.findElement(By.xpath("(//tbody[@class='ui-table-tbody'])[2]"))

			List<WebElement> Rows = Tabel.findElements(By.tagName('tr'))

			for (int j = 0; j < Rows.size(); j++)
			{

				WebElement VariableRow = Rows.get(j)

				List<WebElement> cells = VariableRow.findElements(By.tagName('td'))

				String Variablename = cells.get(0).getText()

				if (Variablename.trim().length() > 8)
				{
					String gotStorename = Variablename.substring(11, Variablename.length()).trim()

					println(gotStorename)

					if (gotStorename.equalsIgnoreCase(StoreName))
					{

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

		if (PresentBy.equalsIgnoreCase('Day')||PresentBy.equalsIgnoreCase('Week')||PresentBy.equalsIgnoreCase('Month'))
		{


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

		else if (PresentBy.equalsIgnoreCase('EntireRange'))
		{


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

					writeRawValues(HeaderName,NetsalesReport,'-')


					println NetsalesReport

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





				case 'Guest Count':

					KeywordUtil.logInfo('FETCHING GUEST COUNT  FROM REPORT FOR FUTURE CALCULATION')

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

					KeywordUtil.logInfo('FETCHING GUEST COUNT LY FROM REPORT FOR FUTURE CALCULATION')

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



				case 'Item Deletion $':

					KeywordUtil.logInfo('FETCHING Item Deletion $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletion$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletion$Report1,'-')

					Number ItemDeletion$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(ItemDeletion$Report1)


					println(ItemDeletion$Report)


					ValuesFromReport.put('Item Deletion $', ItemDeletion$Report)


					break

				case 'Item Deletion Count':

					KeywordUtil.logInfo('FETCHING Item Deletion count  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionCountReport1,'-')

					Number ItemDeletionCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionCountReport1)


					println(ItemDeletionCountReport)


					ValuesFromReport.put('Item Deletion Count', ItemDeletionCountReport)


					break

				case 'Cancelled Transaction $':

					KeywordUtil.logInfo('FETCHING  Cancelled Transaction $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   CancelledTransaction$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,CancelledTransaction$Report1,'-')

					Number CancelledTransaction$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(CancelledTransaction$Report1)


					println(CancelledTransaction$Report)


					ValuesFromReport.put('Cancelled Transaction $', CancelledTransaction$Report)


					break


				case 'Cancelled Transaction Count':

					KeywordUtil.logInfo('FETCHING  Cancelled Transaction Count FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   CancelledTransactionCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,CancelledTransactionCountReport1,'-')

					Number CancelledTransactionCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CancelledTransactionCountReport1)


					println(CancelledTransactionCountReport)


					ValuesFromReport.put('Cancelled Transaction Count', CancelledTransactionCountReport)


					break

				case 'No Sale Transaction Count':

					KeywordUtil.logInfo('FETCHING  No Sale Transaction Count  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String    NoSaleTransactionCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,NoSaleTransactionCountReport1,'-')

					Number NoSaleTransactionCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(NoSaleTransactionCountReport1)


					println(NoSaleTransactionCountReport)


					ValuesFromReport.put('No Sale Transaction Count', NoSaleTransactionCountReport)


					break

				case 'Item Deletion Before Total $':

					KeywordUtil.logInfo('FETCHING Item Deletion Before Total $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String ItemDeletionBeforeTotal$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionBeforeTotal$Report1,'-')

					Number ItemDeletionBeforeTotal$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(ItemDeletionBeforeTotal$Report1)


					println(ItemDeletionBeforeTotal$Report)


					ValuesFromReport.put('Item Deletion Before Total $', ItemDeletionBeforeTotal$Report)


					break

				case 'Item Deletion After Total $':

					KeywordUtil.logInfo('FETCHING  Item Deletion After Total $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String ItemDeletionAfterTotal$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionAfterTotal$Report1,'-')

					Number ItemDeletionAfterTotal$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(ItemDeletionAfterTotal$Report1)


					println(ItemDeletionAfterTotal$Report)


					ValuesFromReport.put('Item Deletion After Total $', ItemDeletionAfterTotal$Report)


					break

				case 'Item Deletion Before Total Count':

					KeywordUtil.logInfo('FETCHING  Item Deletion Before Total Count  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String ItemDeletionBeforeTotalCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionBeforeTotalCountReport1,'-')

					Number  ItemDeletionBeforeTotalCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionBeforeTotalCountReport1)


					println(ItemDeletionBeforeTotalCountReport)


					ValuesFromReport.put('Item Deletion Before Total Count', ItemDeletionBeforeTotalCountReport)


					break

				case 'Item Deletion After Total Count':

					KeywordUtil.logInfo('FETCHING  Item Deletion After Total Count FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String ItemDeletionAfterTotalCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionAfterTotalCountReport1,'-')

					Number  ItemDeletionAfterTotalCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionAfterTotalCountReport1)


					println(ItemDeletionAfterTotalCountReport)


					ValuesFromReport.put('Item Deletion After Total Count', ItemDeletionAfterTotalCountReport)


					break

				case 'Refunds $':

					KeywordUtil.logInfo('FETCHING  Refunds $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  Refunds$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,Refunds$Report1,'-')

					Number  Refunds$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(Refunds$Report1)


					println(Refunds$Report)


					ValuesFromReport.put('Refunds $', Refunds$Report)


					break


				case 'Void Transactions $':

					KeywordUtil.logInfo('FETCHING Void Transactions $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  VoidTransactions$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,VoidTransactions$Report1,'-')

					Number  VoidTransactions$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(VoidTransactions$Report1)


					println(VoidTransactions$Report)


					ValuesFromReport.put('Void Transactions $', VoidTransactions$Report)


					break

				case 'Cash over short $':

					KeywordUtil.logInfo('FETCHING  Cash over short $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  Cashovershort$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,Cashovershort$Report1,'-')

					Number  Cashovershort$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(Cashovershort$Report1)


					println(Cashovershort$Report)


					ValuesFromReport.put('Cash over short $', Cashovershort$Report)


					break

				case 'Item Deletion %, of Sales TY':

					KeywordUtil.logInfo('FETCHING  Item Deletion %, of Sales TY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionPercentofSalesTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionPercentofSalesTYReport1,'-')

					Number  ItemDeletionPercentofSalesTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionPercentofSalesTYReport1)


					println(ItemDeletionPercentofSalesTYReport)


					ValuesFromReport.put('Item Deletion %, of Sales TY', ItemDeletionPercentofSalesTYReport)


					break

				case 'Item Deletion Count, % of Total Transactions TY':

					KeywordUtil.logInfo('FETCHING  Item Deletion Count, % of Total Transactions TY  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionCountPercentofTotalTransactionsTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionCountPercentofTotalTransactionsTYReport1,'-')

					Number  ItemDeletionCountPercentofTotalTransactionsTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionCountPercentofTotalTransactionsTYReport1)


					println(ItemDeletionCountPercentofTotalTransactionsTYReport)


					ValuesFromReport.put('Item Deletion Count, % of Total Transactions TY', ItemDeletionCountPercentofTotalTransactionsTYReport)


					break

				case 'Cancelled Transaction, % of Sales TY':

					KeywordUtil.logInfo('FETCHING  Cancelled Transaction, % of Sales TY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String    CancelledTransactionPercentofSalesTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,CancelledTransactionPercentofSalesTYReport1,'-')

					Number  CancelledTransactionPercentofSalesTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CancelledTransactionPercentofSalesTYReport1)


					println(CancelledTransactionPercentofSalesTYReport)


					ValuesFromReport.put('Cancelled Transaction, % of Sales TY', CancelledTransactionPercentofSalesTYReport)


					break

				case 'Cancelled Transaction Count, % of Total Transactions TY':

					KeywordUtil.logInfo('FETCHING Cancelled Transaction Count, % of Total Transactions TY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  CancelledTransactionCountPercentOfTotalTransactionTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CancelledTransactionCountPercentOfTotalTransactionTYReport1,'-')

					Number CancelledTransactionCountPercentOfTotalTransactionTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CancelledTransactionCountPercentOfTotalTransactionTYReport1)


					println(CancelledTransactionCountPercentOfTotalTransactionTYReport)


					ValuesFromReport.put('Cancelled Transaction Count, % of Total Transactions TY', CancelledTransactionCountPercentOfTotalTransactionTYReport)


					break

				case 'Item Deletion Before Total, % of Sales TY':

					KeywordUtil.logInfo('FETCHING  Item Deletion Before Total, % of Sales TY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionBeforeTotalPercentofSalesTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionBeforeTotalPercentofSalesTYReport1,'-')

					Number  ItemDeletionBeforeTotalPercentofSalesTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionBeforeTotalPercentofSalesTYReport1)


					println(ItemDeletionBeforeTotalPercentofSalesTYReport)


					ValuesFromReport.put('Item Deletion Before Total, % of Sales TY', ItemDeletionBeforeTotalPercentofSalesTYReport)


					break

				case 'Item Deletion After Total, % of Sales TY':

					KeywordUtil.logInfo('FETCHING  Item Deletion After Total, % of Sales TY  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionAfterTotalPercentofSalesTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionAfterTotalPercentofSalesTYReport1,'-')

					Number  ItemDeletionAfterTotalPercentofSalesTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionAfterTotalPercentofSalesTYReport1)


					println(ItemDeletionAfterTotalPercentofSalesTYReport)


					ValuesFromReport.put('Item Deletion After Total, % of Sales TY', ItemDeletionAfterTotalPercentofSalesTYReport)


					break

				case 'Item Deletion Before Total Count, % of Total Transactions TY':

					KeywordUtil.logInfo('FETCHING Item Deletion Before Total Count, % of Total Transactions TY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionBeforeTotalCountofTotalTransactionsTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionBeforeTotalCountofTotalTransactionsTYReport1,'-')

					Number   ItemDeletionBeforeTotalCountofTotalTransactionsTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionBeforeTotalCountofTotalTransactionsTYReport1)


					println(ItemDeletionBeforeTotalCountofTotalTransactionsTYReport)


					ValuesFromReport.put('Item Deletion Before Total Count, % of Total Transactions TY', ItemDeletionBeforeTotalCountofTotalTransactionsTYReport)


					break

				case 'Item Deletion After Total Count, % of Total Transactions TY':

					KeywordUtil.logInfo('FETCHING   Item Deletion After Total Count, % of Total Transactions TY  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String ItemDeletionAfterTotalCountPercentofTotalTransactionsTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll(
							'\n', ' ')
					writeRawValues(HeaderName,ItemDeletionAfterTotalCountPercentofTotalTransactionsTYReport1,'-')

					Number ItemDeletionAfterTotalCountPercentofTotalTransactionsTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionAfterTotalCountPercentofTotalTransactionsTYReport1)


					println(ItemDeletionAfterTotalCountPercentofTotalTransactionsTYReport)


					ValuesFromReport.put('Item Deletion After Total Count, % of Total Transactions TY', ItemDeletionAfterTotalCountPercentofTotalTransactionsTYReport)


					break

				case 'Cash Over/Short , % of Sales TY':

					KeywordUtil.logInfo('FETCHING   Cash Over/Short , % of Sales TY  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String CashOverShortPercentofSalesTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CashOverShortPercentofSalesTYReport1,'-')

					Number   CashOverShortPercentofSalesTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CashOverShortPercentofSalesTYReport1)


					println(CashOverShortPercentofSalesTYReport)


					ValuesFromReport.put('Cash Over/Short , % of Sales TY', CashOverShortPercentofSalesTYReport)


					break

				case 'Refund, % of Sales TY':

					KeywordUtil.logInfo('FETCHING  Refund, % of Sales TY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  RefundPercentofSalesTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,RefundPercentofSalesTYReport1,'-')

					Number  RefundPercentofSalesTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(RefundPercentofSalesTYReport1)


					println(RefundPercentofSalesTYReport)


					ValuesFromReport.put('Refund, % of Sales TY', RefundPercentofSalesTYReport)


					break

				case 'Void Transactions, % of Sales TY':

					KeywordUtil.logInfo('FETCHING  Void Transactions, % of Sales TY  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   VoidTransactionsPercentofSalesTYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,VoidTransactionsPercentofSalesTYReport1,'-')

					Number  VoidTransactionsPercentofSalesTYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(VoidTransactionsPercentofSalesTYReport1)


					println(VoidTransactionsPercentofSalesTYReport)


					ValuesFromReport.put('Void Transactions, % of Sales TY', VoidTransactionsPercentofSalesTYReport)


					break

				case 'Item Deletion LY $':

					KeywordUtil.logInfo('FETCHING  Item Deletion LY $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionLY$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionLY$Report1,'-')

					Number  ItemDeletionLY$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(ItemDeletionLY$Report1)


					println(ItemDeletionLY$Report)


					ValuesFromReport.put('Item Deletion LY $', ItemDeletionLY$Report)


					break

				case 'Item Deletion vs LY $':

					KeywordUtil.logInfo('FETCHING   Item Deletion vs LY $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionvsLY$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionvsLY$Report1,'-')

					Number ItemDeletionvsLY$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(ItemDeletionvsLY$Report1)


					println(ItemDeletionvsLY$Report)


					ValuesFromReport.put('Item Deletion vs LY $', ItemDeletionvsLY$Report)


					break

				case 'Item Deletion LY Count':

					KeywordUtil.logInfo('FETCHING  Item Deletion LY Count FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionLYCountReport1,'-')

					Number ItemDeletionLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionLYCountReport1)


					println(ItemDeletionLYCountReport)


					ValuesFromReport.put('Item Deletion LY Count', ItemDeletionLYCountReport)


					break

				case 'Item Deletion vs LY Count':

					KeywordUtil.logInfo('FETCHING  Item Deletion vs LY Count  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionvsLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionvsLYCountReport1,'-')

					Number ItemDeletionvsLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionvsLYCountReport1)


					println(ItemDeletionvsLYCountReport)


					ValuesFromReport.put('Item Deletion vs LY Count', ItemDeletionvsLYCountReport)


					break


				case 'Cancelled Transaction LY $':

					KeywordUtil.logInfo('FETCHING  Cancelled Transaction LY $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   CancelledTransactionLY$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CancelledTransactionLY$Report1,'-')

					Number CancelledTransactionLY$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(CancelledTransactionLY$Report1)


					println(CancelledTransactionLY$Report)


					ValuesFromReport.put('Cancelled Transaction LY $', CancelledTransactionLY$Report)


					break

				case 'Cancelled Transaction vs LY $':

					KeywordUtil.logInfo('FETCHING  Cancelled Transaction vs LY $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   CancelledTransactionvsLY$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CancelledTransactionvsLY$Report1,'-')

					Number CancelledTransactionvsLY$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(CancelledTransactionvsLY$Report1)


					println(CancelledTransactionvsLY$Report)


					ValuesFromReport.put('Cancelled Transaction vs LY $', CancelledTransactionvsLY$Report)


					break

				case 'Cancelled Transaction LY Count':

					KeywordUtil.logInfo('FETCHING  Cancelled Transaction LY Count  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String    CancelledTransactionLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CancelledTransactionLYCountReport1,'-')

					Number CancelledTransactionLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CancelledTransactionLYCountReport1)


					println(CancelledTransactionLYCountReport)


					ValuesFromReport.put('Cancelled Transaction LY Count', CancelledTransactionLYCountReport)


					break

				case 'Cancelled Transaction vs LY Count':

					KeywordUtil.logInfo('FETCHING  Cancelled Transaction vs LY Count  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  CancelledTransactionvsLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CancelledTransactionvsLYCountReport1,'-')

					Number CancelledTransactionvsLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CancelledTransactionvsLYCountReport1)


					println(CancelledTransactionvsLYCountReport)


					ValuesFromReport.put('Cancelled Transaction vs LY Count', CancelledTransactionvsLYCountReport)


					break

				case 'No Sale Transaction LY Count':

					KeywordUtil.logInfo('FETCHING  No Sale Transaction LY Count FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  NoSaleTransactionLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,NoSaleTransactionLYCountReport1,'-')

					Number NoSaleTransactionLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(NoSaleTransactionLYCountReport1)


					println(NoSaleTransactionLYCountReport)


					ValuesFromReport.put('No Sale Transaction LY Count', NoSaleTransactionLYCountReport)


					break

				case 'No Sale Transaction vs LY Count':

					KeywordUtil.logInfo('FETCHING  No Sale Transaction vs LY Count  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  NoSaleTransactionvsLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,NoSaleTransactionvsLYCountReport1,'-')

					Number NoSaleTransactionvsLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(NoSaleTransactionvsLYCountReport1)


					println(NoSaleTransactionvsLYCountReport)


					ValuesFromReport.put('No Sale Transaction vs LY Count', NoSaleTransactionvsLYCountReport)


					break

				case 'No Sale Transaction vs LY Count':

					KeywordUtil.logInfo('FETCHING  No Sale Transaction vs LY Count  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  NoSaleTransactionvsLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,NoSaleTransactionvsLYCountReport1,'-')

					Number NoSaleTransactionvsLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(NoSaleTransactionvsLYCountReport1)


					println(NoSaleTransactionvsLYCountReport)


					ValuesFromReport.put('No Sale Transaction vs LY Count', NoSaleTransactionvsLYCountReport)


					break

				case 'Item Deletion Before Total LY $':

					KeywordUtil.logInfo('FETCHING  Item DeletionBeforeTotal LY $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionBeforeTotalLY$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionBeforeTotalLY$Report1,'-')

					Number  ItemDeletionBeforeTotalLY$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(ItemDeletionBeforeTotalLY$Report1)


					println(ItemDeletionBeforeTotalLY$Report)


					ValuesFromReport.put('Item Deletion Before Total LY $', ItemDeletionBeforeTotalLY$Report)


					break

				case 'Item Deletion Before Total vs LY $':

					KeywordUtil.logInfo('FETCHING   Item DeletionBeforeTotal vs LY $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionBeforeTotalvsLY$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionBeforeTotalvsLY$Report1,'-')

					Number ItemDeletionBeforeTotalvsLY$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(ItemDeletionBeforeTotalvsLY$Report1)


					println(ItemDeletionBeforeTotalvsLY$Report)


					ValuesFromReport.put('Item Deletion Before Total vs LY $', ItemDeletionBeforeTotalvsLY$Report)


					break

				case 'Item Deletion Before Total LY Count':

					KeywordUtil.logInfo('FETCHING  Item DeletionBeforeTotal LY Count FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionBeforeTotalLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionBeforeTotalLYCountReport1,'-')

					Number ItemDeletionBeforeTotalLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionBeforeTotalLYCountReport1)


					println(ItemDeletionBeforeTotalLYCountReport)


					ValuesFromReport.put('Item Deletion Before Total LY Count', ItemDeletionBeforeTotalLYCountReport)


					break

				case 'Item Deletion Before Total vs LY Count':

					KeywordUtil.logInfo('FETCHING  Item DeletionBeforeTotal vs LY Count  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionBeforeTotalvsLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionBeforeTotalvsLYCountReport1,'-')

					Number ItemDeletionBeforeTotalvsLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionBeforeTotalvsLYCountReport1)


					println(ItemDeletionBeforeTotalvsLYCountReport)


					ValuesFromReport.put('Item Deletion Before Total vs LY Count', ItemDeletionBeforeTotalvsLYCountReport)


					break

				case 'Item Deletion After Total LY $':

					KeywordUtil.logInfo('FETCHING  Item DeletionAfterTotal LY $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionAfterTotalLY$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionAfterTotalLY$Report1,'-')

					Number  ItemDeletionAfterTotalLY$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(ItemDeletionAfterTotalLY$Report1)


					println(ItemDeletionAfterTotalLY$Report)


					ValuesFromReport.put('Item Deletion After Total LY $', ItemDeletionAfterTotalLY$Report)


					break

				case 'Item Deletion After Total vs LY $':

					KeywordUtil.logInfo('FETCHING   Item DeletionAfterTotal vs LY $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionAfterTotalvsLY$Report1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionAfterTotalvsLY$Report1,'-')

					Number ItemDeletionAfterTotalvsLY$Report =CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(ItemDeletionAfterTotalvsLY$Report1)


					println(ItemDeletionAfterTotalvsLY$Report)


					ValuesFromReport.put('Item Deletion After Total vs LY $', ItemDeletionAfterTotalvsLY$Report)


					break

				case 'Item Deletion After Total LY Count':

					KeywordUtil.logInfo('FETCHING  Item DeletionAfterTotal LY Count FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionAfterTotalLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionAfterTotalLYCountReport1,'-')

					Number ItemDeletionAfterTotalLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionAfterTotalLYCountReport1)


					println(ItemDeletionAfterTotalLYCountReport)


					ValuesFromReport.put('Item Deletion After Total LY Count', ItemDeletionAfterTotalLYCountReport)


					break

				case 'Item Deletion After Total vs LY Count':

					KeywordUtil.logInfo('FETCHING  Item DeletionAfterTotal vs LY Count  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionAfterTotalvsLYCountReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionAfterTotalvsLYCountReport1,'-')

					Number ItemDeletionAfterTotalvsLYCountReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionAfterTotalvsLYCountReport1)


					println(ItemDeletionAfterTotalvsLYCountReport)


					ValuesFromReport.put('Item Deletion After Total vs LY Count', ItemDeletionAfterTotalvsLYCountReport)


					break

				case 'Refunds LY $':

					KeywordUtil.logInfo('FETCHING  Refunds LY $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  RefindLastYearDollorReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,RefindLastYearDollorReport1,'-')

					Number RefindLastYearDollorReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(RefindLastYearDollorReport1)


					println(RefindLastYearDollorReport)


					ValuesFromReport.put('Refunds LY $', RefindLastYearDollorReport)


					break

				case 'Refunds vs LY $':

					KeywordUtil.logInfo('FETCHING  Refunds vs LY $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  RefindvsLastYearDollorReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,RefindvsLastYearDollorReport1,'-')

					Number RefindvsLastYearDollorReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(RefindvsLastYearDollorReport1)


					println(RefindvsLastYearDollorReport)


					ValuesFromReport.put('Refunds vs LY $', RefindvsLastYearDollorReport)


					break

				case 'Void Transactions LY $':

					KeywordUtil.logInfo('FETCHING  Refunds vs LY $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  VoidTransDollorReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,VoidTransDollorReport1,'-')

					Number VoidTransDollorReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(VoidTransDollorReport1)


					println(VoidTransDollorReport)


					ValuesFromReport.put('Void Transactions LY $', VoidTransDollorReport)


					break

				case 'Void Transactions vs LY $':

					KeywordUtil.logInfo('FETCHIN Void Transactions vs LY $ FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  VoidTransvsDollorReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,VoidTransvsDollorReport1,'-')

					Number VoidTransvsDollorReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(VoidTransvsDollorReport1)


					println(VoidTransvsDollorReport)


					ValuesFromReport.put('Void Transactions vs LY $', VoidTransvsDollorReport)


					break


				case 'Cash over short LY $':

					KeywordUtil.logInfo('FETCHING   Cash over short LY $   FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   CashovershortLYDollorReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CashovershortLYDollorReport1,'-')

					Number CashovershortLYDollorReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(CashovershortLYDollorReport1)


					println(CashovershortLYDollorReport)


					ValuesFromReport.put('Cash over short LY $', CashovershortLYDollorReport)


					break

				case 'Cash over short vs LY $':

					KeywordUtil.logInfo('FETCHING Cash over short vs LY $  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   CashovershortvsLYDollorReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CashovershortvsLYDollorReport1,'-')

					Number CashovershortvsLYDollorReport = CustomKeywords.'reportbuildercustom.RB_Keywords.removeCurrencyFormat'(CashovershortvsLYDollorReport1)


					println(CashovershortvsLYDollorReport)


					ValuesFromReport.put('Cash over vs short LY $', CashovershortvsLYDollorReport)


					break

				case 'Item Deletion %, of Sales LY':

					KeywordUtil.logInfo('FETCHING  Item Deletion %, of Sales LY  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionPercentOfSalesLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionPercentOfSalesLYReport1,'-')

					Number ItemDeletionPercentOfSalesLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionPercentOfSalesLYReport1)


					println(ItemDeletionPercentOfSalesLYReport)


					ValuesFromReport.put('Item Deletion %, of Sales LY', ItemDeletionPercentOfSalesLYReport)


					break

				case 'Item Deletion Count, % of Total Transactions LY':

					KeywordUtil.logInfo('FETCHING Item Deletion Count, % of Total Transactions LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionCountPercentOfTotalTransactionLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionCountPercentOfTotalTransactionLYReport1,'-')

					Number ItemDeletionCountPercentOfTotalTransactionLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionCountPercentOfTotalTransactionLYReport1)


					println(ItemDeletionCountPercentOfTotalTransactionLYReport)


					ValuesFromReport.put('Item Deletion Count, % of Total Transactions LY', ItemDeletionCountPercentOfTotalTransactionLYReport)


					break



				case 'Cancelled Transaction, % of Sales LY':

					KeywordUtil.logInfo('FETCHING  Cancelled Transaction, % of Sales LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   CancelledTransactionPercentOfSalesLYDollorReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CancelledTransactionPercentOfSalesLYDollorReport1,'-')

					Number CancelledTransactionPercentOfSalesLYDollorReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CancelledTransactionPercentOfSalesLYDollorReport1)


					println(CancelledTransactionPercentOfSalesLYDollorReport)


					ValuesFromReport.put('Cancelled Transaction, % of Sales LY', CancelledTransactionPercentOfSalesLYDollorReport)


					break



				case 'Cancelled Transaction Count, % of Total Transactions LY':

					KeywordUtil.logInfo('FETCHING Cancelled Transaction Count, % of Total Transactions LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  CancelledTransactionCountPercentOfTotalTransactionLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CancelledTransactionCountPercentOfTotalTransactionLYReport1,'-')

					Number CancelledTransactionCountPercentOfTotalTransactionLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CancelledTransactionCountPercentOfTotalTransactionLYReport1)


					println(CancelledTransactionCountPercentOfTotalTransactionLYReport)


					ValuesFromReport.put('Cancelled Transaction Count, % of Total Transactions LY', CancelledTransactionCountPercentOfTotalTransactionLYReport)


					break

				case 'Item Deletion Before Total, % of Sales LY':

					KeywordUtil.logInfo('FETCHING  Item DeletionBeforeTotal %, of Sales LY  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionBeforeTotalPercentOfSalesLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionBeforeTotalPercentOfSalesLYReport1,'-')

					Number ItemDeletionBeforeTotalPercentOfSalesLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionBeforeTotalPercentOfSalesLYReport1)


					println(ItemDeletionBeforeTotalPercentOfSalesLYReport)


					ValuesFromReport.put('Item Deletion Before Total, % of Sales LY', ItemDeletionBeforeTotalPercentOfSalesLYReport)


					break

				case 'Item Deletion After Total, % of Sales LY':

					KeywordUtil.logInfo('FETCHING  Item DeletionAfterTotal %, of Sales LY  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionAfterTotalPercentOfSalesLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionAfterTotalPercentOfSalesLYReport1,'-')

					Number ItemDeletionAfterTotalPercentOfSalesLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionAfterTotalPercentOfSalesLYReport1)


					println(ItemDeletionAfterTotalPercentOfSalesLYReport)


					ValuesFromReport.put('Item Deletion After Total, % of Sales LY', ItemDeletionAfterTotalPercentOfSalesLYReport)


					break

				case 'Item Deletion Before Total Count, % of Total Transactions LY':

					KeywordUtil.logInfo('FETCHING  Item Deletion Before Total Count, % of Total Transactions LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionBeforeTotalCountPercentOfTotalTransactionLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionBeforeTotalCountPercentOfTotalTransactionLYReport1,'-')

					Number ItemDeletionBeforeTotalCountPercentOfTotalTransactionLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionBeforeTotalCountPercentOfTotalTransactionLYReport1)


					println(ItemDeletionBeforeTotalCountPercentOfTotalTransactionLYReport)


					ValuesFromReport.put('Item Deletion Before Total Count, % of Total Transactions LY', ItemDeletionBeforeTotalCountPercentOfTotalTransactionLYReport)


					break


				case 'Item Deletion After Total Count, % of Total Transactions LY':

					KeywordUtil.logInfo('FETCHING  Item Deletion After Total Count, % of Total Transactions LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionAfterTotalCountPercentOfTotalTransactionLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionAfterTotalCountPercentOfTotalTransactionLYReport1,'-')

					Number ItemDeletionAfterTotalCountPercentOfTotalTransactionLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionAfterTotalCountPercentOfTotalTransactionLYReport1)


					println(ItemDeletionAfterTotalCountPercentOfTotalTransactionLYReport)


					ValuesFromReport.put('Item Deletion After Total Count, % of Total Transactions LY', ItemDeletionAfterTotalCountPercentOfTotalTransactionLYReport)


					break

				case 'Cash Over/Short , % of Sales LY':

					KeywordUtil.logInfo('FETCHING  Cash Over/Short , % of Sales LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String CashOvershortPercentOfSalesLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CashOvershortPercentOfSalesLYReport1,'-')

					Number CashOvershortPercentOfSalesLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CashOvershortPercentOfSalesLYReport1)


					println(CashOvershortPercentOfSalesLYReport)


					ValuesFromReport.put('Cash Over/Short , % of Sales LY', CashOvershortPercentOfSalesLYReport)

					break

				case 'Refund, % of Sales LY':

					KeywordUtil.logInfo('FETCHING  Refund , % of Sales LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String RefundPercentOfSalesLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,RefundPercentOfSalesLYReport1,'-')

					Number RefundPercentOfSalesLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(RefundPercentOfSalesLYReport1)


					println(RefundPercentOfSalesLYReport)


					ValuesFromReport.put('Refund, % of Sales LY', RefundPercentOfSalesLYReport)

					break


				case 'Void Transactions, % of Sales LY':

					KeywordUtil.logInfo('FETCHING  Void Transactions , % of Sales LY FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String VoidTransactionsPercentOfSalesLYReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,VoidTransactionsPercentOfSalesLYReport1,'-')

					Number VoidTransactionsPercentOfSalesLYReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(VoidTransactionsPercentOfSalesLYReport1)


					println(VoidTransactionsPercentOfSalesLYReport)


					ValuesFromReport.put('Void Transactions, % of Sales LY', VoidTransactionsPercentOfSalesLYReport)

					break

				case 'Item Deletion %, of Sales TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Item Deletion %, of Sales TY vs LY PP FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionPercentofSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionPercentofSalesTYvsLYPPReport1,'-')

					Number ItemDeletionPercentofSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionPercentofSalesTYvsLYPPReport1)


					println(ItemDeletionPercentofSalesTYvsLYPPReport)


					ValuesFromReport.put('Item Deletion %, of Sales TY vs LY PP', ItemDeletionPercentofSalesTYvsLYPPReport)

					break




				case 'Item Deletion Count, % of Total Transactions TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Item Deletion Count, % of Total Transactions TY vs LY PP  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionCountPercentofSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionCountPercentofSalesTYvsLYPPReport1,'-')

					Number ItemDeletionCountPercentofSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionCountPercentofSalesTYvsLYPPReport1)


					println(ItemDeletionCountPercentofSalesTYvsLYPPReport)


					ValuesFromReport.put('Item Deletion Count, % of Total Transactions TY vs LY PP', ItemDeletionCountPercentofSalesTYvsLYPPReport)

					break

				case 'Cancelled Transaction, % of Sales TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Item Deletion %, of Sales TY vs LY PP FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  CancelledTransactionPercentofSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CancelledTransactionPercentofSalesTYvsLYPPReport1,'-')

					Number CancelledTransactionPercentofSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CancelledTransactionPercentofSalesTYvsLYPPReport1)


					println(CancelledTransactionPercentofSalesTYvsLYPPReport)


					ValuesFromReport.put('Cancelled Transaction, % of Sales TY vs LY PP', CancelledTransactionPercentofSalesTYvsLYPPReport)

					break

				case 'Cancelled Transaction Count, % of Total Transactions TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Cancelled Transaction Count, % of Total Transactions TY vs LY PP  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  CancelledTransactionCountCountPercentofSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CancelledTransactionCountCountPercentofSalesTYvsLYPPReport1,'-')

					Number CancelledTransactionCountCountPercentofSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CancelledTransactionCountCountPercentofSalesTYvsLYPPReport1)


					println(CancelledTransactionCountCountPercentofSalesTYvsLYPPReport)


					ValuesFromReport.put('Cancelled Transaction Count, % of Total Transactions TY vs LY PP', CancelledTransactionCountCountPercentofSalesTYvsLYPPReport)

					break

				case 'Item Deletion Before Total, % of Sales TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Item Deletion Before Total, % of Sales TY vs LY PP  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionBeforeTotalPercentofSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionBeforeTotalPercentofSalesTYvsLYPPReport1,'-')

					Number ItemDeletionBeforeTotalPercentofSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionBeforeTotalPercentofSalesTYvsLYPPReport1)


					println(ItemDeletionBeforeTotalPercentofSalesTYvsLYPPReport)


					ValuesFromReport.put('Item Deletion Before Total, % of Sales TY vs LY PP', ItemDeletionBeforeTotalPercentofSalesTYvsLYPPReport)

					break

				case 'Item Deletion After Total, % of Sales TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Item Deletion After Total, % of Sales TY vs LY PP  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  ItemDeletionAfterTotalPercentofSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionAfterTotalPercentofSalesTYvsLYPPReport1,'-')

					Number ItemDeletionAfterTotalPercentofSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(ItemDeletionAfterTotalPercentofSalesTYvsLYPPReport1)


					println(ItemDeletionAfterTotalPercentofSalesTYvsLYPPReport)


					ValuesFromReport.put('Item Deletion After Total, % of Sales TY vs LY PP', ItemDeletionAfterTotalPercentofSalesTYvsLYPPReport)

					break


				case 'Item Deletion Before Total Count, % of Total Transactions TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Item Deletion Before Total Count, % of Total Transactions TY vs LY PP  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionBeforeTotalCountPercentofSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionBeforeTotalCountPercentofSalesTYvsLYPPReport1,'-')

					Number  ItemDeletionBeforeTotalCountPercentofSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'( ItemDeletionBeforeTotalCountPercentofSalesTYvsLYPPReport1)


					println( ItemDeletionBeforeTotalCountPercentofSalesTYvsLYPPReport)


					ValuesFromReport.put('Item Deletion Before Total Count, % of Total Transactions TY vs LY PP',  ItemDeletionBeforeTotalCountPercentofSalesTYvsLYPPReport)

					break


				case 'Item Deletion After Total Count, % of Total Transactions TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Item Deletion After Total Count, % of Total Transactions TY vs LY PP  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String   ItemDeletionAfterTotalCountPercentofSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,ItemDeletionAfterTotalCountPercentofSalesTYvsLYPPReport1,'-')

					Number  ItemDeletionAfterTotalCountPercentofSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'( ItemDeletionAfterTotalCountPercentofSalesTYvsLYPPReport1)


					println( ItemDeletionAfterTotalCountPercentofSalesTYvsLYPPReport)


					ValuesFromReport.put('Item Deletion After Total Count, % of Total Transactions TY vs LY PP',  ItemDeletionAfterTotalCountPercentofSalesTYvsLYPPReport)

					break

				case 'Cash Over/Short , % of Sales TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Cash Over/Short , % of Sales TY vs LY PP  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  CashOverShortofSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,CashOverShortofSalesTYvsLYPPReport1,'-')

					Number CashOverShortofSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(CashOverShortofSalesTYvsLYPPReport1)


					println(CashOverShortofSalesTYvsLYPPReport)


					ValuesFromReport.put('Cash Over/Short , % of Sales TY vs LY PP', CashOverShortofSalesTYvsLYPPReport)

					break

				case 'Refund, % of Sales TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Refund, % of Sales TY vs LY PP  FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  RefundofSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,RefundofSalesTYvsLYPPReport1,'-')

					Number RefundofSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(RefundofSalesTYvsLYPPReport1)


					println(RefundofSalesTYvsLYPPReport)


					ValuesFromReport.put('Refund, % of Sales TY vs LY PP', RefundofSalesTYvsLYPPReport)

					break



				case 'Void Transactions, % of Sales TY vs LY PP':

					KeywordUtil.logInfo('FETCHING  Void Transactions, % of Sales TY vs LY PP   FROM REPORT FOR FUTURE CALCULATION')

					index = i

					WebElement Tabel2 = driver.findElement(By.xpath('(//tbody[@class="ui-table-tbody"])[4]'))

					List<WebElement> Rows2 = Tabel2.findElements(By.tagName('tr'))

					WebElement RequiredRow = Rows2.get(NewIndex)

					List<WebElement> cellsNew = RequiredRow.findElements(By.tagName('td'))

					String  VoidTransactionPercentOfSalesTYvsLYPPReport1 = cellsNew.get(index).getText().replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

					writeRawValues(HeaderName,VoidTransactionPercentOfSalesTYvsLYPPReport1,'-')

					Number VoidTransactionPercentOfSalesTYvsLYPPReport =CustomKeywords.'reportbuildercustom.RB_Keywords.setNumberFormat'(VoidTransactionPercentOfSalesTYvsLYPPReport1)


					println(VoidTransactionPercentOfSalesTYvsLYPPReport)


					ValuesFromReport.put('Void Transactions, % of Sales TY vs LY PP', VoidTransactionPercentOfSalesTYvsLYPPReport)

					break


				default:


					break


			}


		}




		println ValuesFromReport


		return ValuesFromReport


	}




}
