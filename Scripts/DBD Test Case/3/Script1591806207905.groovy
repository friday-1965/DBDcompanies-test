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

WebUI.click(findTestObject('DBD Repository/Page_Home/DBD Companies'))

WebUI.click(findTestObject('DBD Repository/Page_DBDCompanies/Add DBDCompany'))

WebUI.setText(findTestObject('DBD Repository/Page_DBDCompanies/Registration Number'), findTestData('DBD Test Data/D3').getValue(1, 1))

WebUI.setText(findTestObject('DBD Repository/Page_DBDCompanies/Company Name'), '')

WebUI.setText(findTestObject('DBD Repository/Page_DBDCompanies/Registration Date'), 'a')

WebUI.click(findTestObject('DBD Repository/Page_DBDCompanies/Created By1'))

WebUI.click(findTestObject('DBD Repository/Page_DBDCompanies/Created By1'))

WebUI.setText(findTestObject('DBD Repository/Page_DBDCompanies/input'), findTestData('DBD Test Data/D3').getValue(3, 1))

WebUI.sendKeys(findTestObject('DBD Repository/Page_DBDCompanies/input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD Repository/Page_DBDCompanies/button_Save'))

WebUI.delay(2)

WebUI.setText(findTestObject('DBD Repository/Page_DBDCompanies/Company Name'), findTestData('DBD Test Data/D2').getValue(2, 1))

WebUI.setText(findTestObject('DBD Repository/Page_DBDCompanies/Registration Date'), findTestData('DBD Test Data/D3').getValue(2, 1))

WebUI.click(findTestObject('DBD Repository/Page_DBDCompanies/button_Save'))

