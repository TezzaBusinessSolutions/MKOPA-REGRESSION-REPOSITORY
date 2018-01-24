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

int rowNum = new Random().nextInt(248 - 1) + 1

WebUI.callTestCase(findTestCase('Payments/View unmatched payments/View unmatched payments steps'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payments Module/Unmatched Payments/link_Assign', [('reference') : reference]))

WebUI.check(findTestObject('Payments Module/Payment Exceptions- Assign Payments/checkButton_Payer'))

WebUI.sendKeys(findTestObject('Payments Module/Payment Exceptions- Assign Payments/input_Customer Reference'), findTestData(
        'Customer Accounts/customer accounts').getValue(1, rowNum))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Payments Module/Payment Exceptions- Assign Payments/input_Customer Reference'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payments Module/Payment Exceptions- Assign Payments/select_Product Account'))

WebUI.delay(2)

WebUI.click(findTestObject('Payments Module/Payment Exceptions- Assign Payments/select_Product Account'))

WebUI.delay(2)

WebUI.click(findTestObject('Payments Module/Payment Exceptions- Assign Payments/txt-product Account'))

WebUI.delay(2)

WebUI.setText(findTestObject('Payments Module/Payment Exceptions- Assign Payments/input_Payer Comments'), Comments)

WebUI.click(findTestObject('Payments Module/Payment Exceptions- Assign Payments/button_Payer Resolve'))

WebUI.verifyElementPresent(findTestObject('Payments Module/UnMatched Payment Assigned/successMsg_payment was successfuly signed '), 
    1)

