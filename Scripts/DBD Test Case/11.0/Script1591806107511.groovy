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

WebUI.click(findTestObject('DBD Repository/Page_Accounts/clear/div_Account ListDashboardRecently ModifiedLoading Widget'))

WebUI.delay(3)

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/Accountname'), findTestData('DBD Test Data/D5').getValue(1, 1))

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/AccountnameENG'), 'ไทยแลน')

WebUI.click(findTestObject('DBD Repository/Page_Accounts/AccountstatusSmall'))

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/input accrount status New'), 'Prospect')

WebUI.sendKeys(findTestObject('DBD Repository/Page_Accounts/input accrount status New'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD Repository/Page_Accounts/CSBig'))

WebUI.setText(findTestObject('DBD Repository/Customer Segment Input/Page_Accounts/input Customer Segment'), findTestData('DBD Test Data/D5').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('DBD Repository/Customer Segment Input/Page_Accounts/input Customer Segment'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD Repository/Page_Accounts/CLBig'))

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/input CL'), findTestData('DBD Test Data/D5').getValue(3, 1))

WebUI.sendKeys(findTestObject('DBD Repository/Page_Accounts/input CL'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD Repository/Page_Accounts/JPBig'))

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/input JP'), findTestData('DBD Test Data/D5').getValue(4, 1))

WebUI.sendKeys(findTestObject('DBD Repository/Page_Accounts/input JP'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/BranchID'), findTestData('DBD Test Data/D5').getValue(6, 1))

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/PD'), findTestData('DBD Test Data/D5').getValue(5, 1))

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/Phone'), 'adfssf')

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/Address'), findTestData('DBD Test Data/D5').getValue(7, 1))

WebUI.click(findTestObject('DBD Repository/Page_Accounts/SearchZ'))

WebUI.switchToWindowTitle('ZONE')

WebUI.click(findTestObject('DBD Repository/Page_ZONE/a_270207'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/Tax NO'), findTestData('DBD Test Data/D5').getValue(9, 1))

WebUI.click(findTestObject('DBD Repository/Page_Accounts/button_Save'))

WebUI.delay(2)

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/Phone'), '111-111-1111')

WebUI.click(findTestObject('DBD Repository/Page_Accounts/button_Save'))

WebUI.delay(2)

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/AccountnameENG'), findTestData('DBD Test Data/D4').getValue(2, 1))

WebUI.setText(findTestObject('DBD Repository/Page_Accounts/Phone'), findTestData('DBD Test Data/D4').getValue(9, 1))

WebUI.click(findTestObject('DBD Repository/Page_Accounts/button_Save'))

