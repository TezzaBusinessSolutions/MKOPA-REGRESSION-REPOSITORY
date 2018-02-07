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

WebUI.mouseOver(findTestObject('Page Header and Menu/Payments/Link-Payments'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Payments/Link-RecentCustomerPayments'))

receiptNumber = WebUI.getText(findTestObject('Payments Module/Recent Customer Payments/text_Receipt Number', [('receiptNumber') : receiptNumber]))

receivedDate = WebUI.getText(findTestObject('Payments Module/Recent Customer Payments/text_Received Date'))

paymentDate = WebUI.getText(findTestObject('Payments Module/Recent Customer Payments/text_PaymentDate'))

WebUI.callTestCase(findTestCase('Payments/Search For Payments/Search For Payment Using a Receipt Number'), [('Receiptno') : receiptNumber], 
    FailureHandling.STOP_ON_FAILURE)

paymentDate1 = WebUI.getText(findTestObject('Payments Module/Payment Search Results/text_Payment Date'))

receivedDate1 = WebUI.getText(findTestObject('Payments Module/Payment Search Results/text_Received Date'))

not_run: WebUI.verifyEqual(receivedDate, receivedDate1)

WebUI.verifyEqual(paymentDate, paymentDate1)

