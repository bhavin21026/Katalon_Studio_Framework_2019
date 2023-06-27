package reportbuildercustom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable



public class GuestCount_Formulas
{





	@Keyword
	def double calculate_Guest_LY_Count(double GuestCountTY, double GuestCountLY)
	{

		double dblGuestCountLY=GuestCountTY-GuestCountLY
		double GuestCountLYValue= Math.round(dblGuestCountLY * 100) / 100
		return GuestCountLYValue
	}

	@Keyword
	def double calculate_GuestCountvsLY_Percent(double GuestCountTY, double GuestCountLY)
	{

		double dblGuestCountLYPercent=GuestCountLY == 0 ? 0 :((GuestCountTY-GuestCountLY)/GuestCountLY)*100
		double GuestCountLY_Percent_Value= Math.round(dblGuestCountLYPercent * 100) / 100
		return GuestCountLY_Percent_Value
	}
}
