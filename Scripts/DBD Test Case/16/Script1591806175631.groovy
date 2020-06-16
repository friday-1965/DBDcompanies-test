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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('DBD Repository/activies/strong_Activities  0'))

WebUI.click(findTestObject('DBD Repository/add activity/button_Add Activity'))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input__subject'), findTestData('DBD Test Data/D8').getValue(1, 1))

WebUI.click(findTestObject('DBD Repository/Activity/input activity/activity type'))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input activity type'), findTestData('DBD Test Data/D8').getValue(2, 
        1))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input activity type'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD Repository/Activity/input activity/Assign to'))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input assign to'), findTestData('D8').getValue(3, 1))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input assign to'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD Repository/Activity/input activity/Sales Type'))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input sales type'), findTestData('DBD Test Data/D8').getValue(4, 1))

WebUI.sendKeys(findTestObject('DBD Repository/Activity/input activity/input sales type'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input__date start'), findTestData('D8').getValue(7, 1))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input__time_start'), findTestData('DBD Test Data/D8').getValue(13, 
        1))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input__end_date'), findTestData('D8').getValue(8, 1))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input__time_end'), findTestData('DBD Test Data/D8').getValue(14, 1))

WebUI.click(findTestObject('DBD Repository/click to clear/div_My CalendarShared CalendarCalendar ListRecently ModifiedLoading Widget'))

WebUI.delay(1)

WebUI.click(findTestObject('DBD Repository/Activity/input activity/status result'))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input status result'), findTestData('DBD Test Data/D8').getValue(10, 
        1))

WebUI.sendKeys(findTestObject('DBD Repository/Activity/input activity/input status result'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD Repository/Activity/input activity/product group'))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input product group'), 'Fax')

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input product group'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD Repository/Activity/input activity/show time as'))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/input show time as'), findTestData('DBD Test Data/D8').getValue(11, 
        1))

WebUI.sendKeys(findTestObject('DBD Repository/Activity/input activity/input show time as'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('DBD Repository/Activity/input activity/textarea__description'), findTestData('DBD Test Data/D8').getValue(
        12, 1))

WebUI.click(findTestObject('DBD Repository/Activity/input activity/button_Save'))

