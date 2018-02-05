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

WebUI.callTestCase(findTestCase('Common/Steps-Upload Payments File'), [('Amount') : amount, ('Account') : account
        , ('Phone') : phoneNumber, ('filePath') : 'C:\\Users\\stellah.ireri\\git\\MKOPA-REGRESSION-REPOSITORY\\Payment Files\\payments.csv'
        , ('Comment') : 'Nice and paid on time', ('receiptNumber') : receiptNumber], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Payments/Floating Payer Payment/steps_Navigate to floating payments'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(6)

receiptText = WebUI.getText(findTestObject('Payments Module/Floating Payer Payments/text_receiptNumber', [('receiptNumber') : receiptNumber]))

WebUI.verifyEqual(receiptText, receiptNumber)

WebUI.callTestCase(findTestCase('Common/step_SearchCustomer'), [('customerToSearch') : account], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Customer Module/Customer List/image_MorePaymentInformation'))

WebUI.getText(findTestObject('Customer Module/Customer List/link_CustomerPaymentReceipt', [('depositReceipt') : depositReceipt]))

WebUI.verifyNotEqual(depositReceipt, text)

WebUI.closeBrowser()

