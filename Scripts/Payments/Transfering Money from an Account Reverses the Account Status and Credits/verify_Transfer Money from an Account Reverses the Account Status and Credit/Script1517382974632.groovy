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

WebUI.callTestCase(findTestCase('Payments/Transfering Money from an Account Reverses the Account Status and Credits/steps_Transfering money by an In finished Customer'), 
    [('customerInFinishedPayment') : customerInFinishedPayment, ('depositReceipt') : depositReceipt, ('payerComment') : 'kwanza'
        , ('customerReference') : '22715468'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Payments/Transfer Payment/steps_Approve Cash Transfer'), [('requestorNotes') : requestorNotes
        , ('comments') : comments], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/step_SearchCustomer'), [('customerToSearch') : customerInFinishedPayment], 
    FailureHandling.STOP_ON_FAILURE)

finishedPaymentLabel = WebUI.getText(findTestObject('Customer Module/Customer List/Label-Finished Payment'))

WebUI.verifyEqual(finishedPaymentLabel, labelStatus)

WebUI.closeBrowser()

