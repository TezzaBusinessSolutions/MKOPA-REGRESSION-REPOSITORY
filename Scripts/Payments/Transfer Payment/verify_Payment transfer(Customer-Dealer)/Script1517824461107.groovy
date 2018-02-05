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

WebUI.callTestCase(findTestCase('Common/step_SearchCustomer'), [('customerToSearch') : customerAccount], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Payments/Transfer Payment/steps_Transfer Payment'), [('customerAccount') : customerAccount
        , ('paymentReceipt') : paymentReceipt], FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Customer Module/Customer List/radio_Dealer'))

WebUI.delay(5)

WebUI.setText(findTestObject('Customer Module/Customer List/input_DealerAccountNumber'), dealerAccountNumber)

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Customer List/dropdown_Dealer Account', [('account') : account]))

WebUI.setText(findTestObject('Customer Module/Customer List/input_DealerComment'), comment)

WebUI.click(findTestObject('Customer Module/Customer List/button_SaveTransferToDealer'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Customer Module/Customer List/successMsg-transfer has been requested succesfully'), 
    10)

WebUI.click(findTestObject('Customer Module/Customer List/button-Close Payment Details Window'))

