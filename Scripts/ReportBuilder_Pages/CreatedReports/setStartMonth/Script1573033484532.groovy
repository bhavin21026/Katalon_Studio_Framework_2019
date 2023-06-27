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
import com.kms.katalon.core.webui.exception.WebElementNotFoundException as WebElementNotFoundException
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

WebUI.waitForElementClickable(findTestObject('ReportBuilderUI/StartDatePicker'), 5)

WebUI.click(findTestObject('ReportBuilderUI/StartDatePicker'))

//WebElement MonthValue = WebUI.getText(findTestObject('ReportBuilderUI/MonthValue'))

//println MonthValue

String enteredYear=GlobalVariable.MonthYear

		String startYear=enteredYear.substring(5, 9).replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')
		String startingMonth=enteredYear.substring(0, 3).replaceAll('\r\n', ' ').replaceAll('\r', ' ').replaceAll('\n', ' ')

		println startYear
		println startingMonth

		
		String text=WebUI.getText(findTestObject('Object Repository/Created Reports Objects/dtp_MonthValue'))
		println text


while (!(WebUI.getText(findTestObject('Object Repository/Created Reports Objects/dtp_MonthValue')).equalsIgnoreCase(startYear))) {
    WebUI.click(findTestObject('ReportBuilderUI/cld_backbtn'))
}

WebDriver driver = DriverFactory.getWebDriver()

WebElement picker = driver.findElement(By.xpath('(//div[@class=\'dp-calendar-wrapper\'])[1]'))

ArrayList<WebElement> Days = picker.findElements(By.tagName('div'))

int totalelementsfind = Days.size()


int flag=0;
for (int i = 0; i < totalelementsfind; i++) {
	
    ArrayList<WebElement> Days1 = Days.get(i).findElements(By.tagName('button'))


    int totalelementsfind1 = Days1.size()



    for (int j = 0; j < totalelementsfind1; j++) {
        String DayValue = Days1.get(j).getText()

        if (DayValue.equalsIgnoreCase(startingMonth)) {
            Days1.get(j).click()
			flag= 1;
            break
        }
		
	
		
    }
	
	if(flag == 1)
	{
		break;
	}
	
}

