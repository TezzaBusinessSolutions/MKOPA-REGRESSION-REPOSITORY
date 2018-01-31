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

WebUI.callTestCase(findTestCase('Payments/Early completion discount/Steps_view list dicounts'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Payments Module/List Discounts/page-5', [('page') : page]))

discount = WebUI.getText(findTestObject('Payments Module/List Discounts/label_Discount', [('paymentPlan') : paymentPlan, ('discount') : discount]))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('File Upload Center Module/Steps-Upload Payments File'), [('Amount') : amount, ('Account') : customerAccount
        , ('Phone') : phoneNumber, ('filePath') : 'C:\\Users\\stellah.ireri\\git\\MKOPA-REGRESSION-REPOSITORY\\Payment Files\\payments.csv'
        , ('Comment') : 'Nice and paid on time', ('tagged') : '', ('blankComment') : '', ('blankTag') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.refresh()

WebUI.callTestCase(findTestCase('Common/Step_SearchSpecificCustomer'), [('customerToSearch') : customerAccount], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Customer Module/Customer List/Label-In Payment', [('status') : status]), status)

