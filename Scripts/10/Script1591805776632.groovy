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

WebUI.click(findTestObject('Page_Home/Accounts'))

WebUI.click(findTestObject('Page_Accounts/Add Account'))

WebUI.setText(findTestObject('Page_Accounts/Accountname'), findTestData('D4').getValue(1, 1))

WebUI.setText(findTestObject('Page_Accounts/AccountnameENG'), findTestData('D4').getValue(2, 1))

WebUI.click(findTestObject('Page_Accounts/Account StatusBig'))

WebUI.setText(findTestObject('Page_Accounts/input Account Status'), 'Prospect')

WebUI.sendKeys(findTestObject('Page_Accounts/input Account Status'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Accounts/CSBig'))

WebUI.setText(findTestObject('Customer Segment Input/Page_Accounts/input Customer Segment'), findTestData('D4').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('Customer Segment Input/Page_Accounts/input Customer Segment'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Accounts/CLBig'))

WebUI.setText(findTestObject('Page_Accounts/input CL'), findTestData('D4').getValue(4, 1))

WebUI.sendKeys(findTestObject('Page_Accounts/input CL'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Accounts/JPBig'))

WebUI.setText(findTestObject('Page_Accounts/input JP'), findTestData('D4').getValue(5, 1))

WebUI.sendKeys(findTestObject('Page_Accounts/input JP'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_Accounts/BranchID'), findTestData('D4').getValue(7, 1))

WebUI.setText(findTestObject('Page_Accounts/PD'), findTestData('D4').getValue(6, 1))

WebUI.click(findTestObject('Page_Accounts/Company statusBig'))

WebUI.setText(findTestObject('Page_Accounts/input Companu Status'), findTestData('D4').getValue(8, 1))

WebUI.sendKeys(findTestObject('Page_Accounts/input Companu Status'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_Accounts/Phone'), findTestData('D4').getValue(9, 1))

WebUI.setText(findTestObject('Page_Accounts/Address'), findTestData('D4').getValue(10, 1))

WebUI.click(findTestObject('Page_Accounts/SearchZ'))

WebUI.switchToWindowTitle('ZONE')

WebUI.click(findTestObject('Page_ZONE/a_270207'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Page_Accounts/Tax NO'), findTestData('D4').getValue(12, 1))

WebUI.click(findTestObject('Page_Accounts/button_Save'))

