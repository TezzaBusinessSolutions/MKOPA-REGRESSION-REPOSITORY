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

WebUI.callTestCase(findTestCase('Common/Steps-Upload Payments File'), [('Amount') : amount, ('Account') : accountNumber
        , ('Phone') : phone, ('filePath') : 'C:\\Users\\dennis.gituto\\git\\MKOPA-REGRESSION-REPOSITORY\\Payment Files\\payments.csv'
        , ('Comment') : 'Nice and paid on time', ('receiptNumber') : receiptNumber], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Payments/Link-Payments'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Payments/Link_Dealers Payments List'))

WebUI.delay(7)

text = WebUI.getText(findTestObject('Payments Module/Dealer Payments/text_Receipt Number'))

WebUI.verifyEqual(text, receiptNumber)

WebUI.closeBrowser()

