import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Payments/Credit Purchase Payment Upload/verify_Credit purchase'), [('account') : account
        , ('amount') : amount, ('phoneNumber') : phoneNumber, ('previousCredits') : '41', ('deviceSerial') : ''], FailureHandling.STOP_ON_FAILURE)

currentCredits = WebUI.getText(findTestObject('Customer Module/Customer List/credits'))

WebUI.click(findTestObject('Customer Module/Customer List/link_DeviceSerial', [('deviceSerial') : deviceSerial]))

WebUI.delay(2)

WebUI.switchToWindowTitle('Inventory item details | M-KOPAnet')

WebUI.delay(2)

WebUI.refresh()

WebUI.scrollToElement(findTestObject('Customer Module/Customer List/button_CreditsSent'), 3)

WebUI.click(findTestObject('Customer Module/Customer List/button_CreditsSent'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Customer Module/Customer List/label_SentCredit', [('currentCredits') : currentCredits]), 
    2)

