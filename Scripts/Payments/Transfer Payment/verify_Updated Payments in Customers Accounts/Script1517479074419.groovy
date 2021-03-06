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

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Payments/Transfer Payment/verify_Payment transfer (Customer-Customer)'), 
    [('account') : account, ('paymentReceipt') : paymentReceipt, ('customerReference') : customerReference, ('payerComment') : payerComment], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Common/CheckerLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Payments/Transfer Payment/steps_Approve Cash Transfer'), [('requestorNotes') : requestorNotes
        , ('comments') : comments], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/step_SearchCustomer'), [('customerToSearch') : customerReference], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Customer Module/Customer List/image_MorePaymentInformation'))

receipt = WebUI.getText(findTestObject('Customer Module/Customer List/td_Receipt Number'))

WebUI.verifyEqual(receipt, paymentReceipt)

WebUI.closeBrowser()

