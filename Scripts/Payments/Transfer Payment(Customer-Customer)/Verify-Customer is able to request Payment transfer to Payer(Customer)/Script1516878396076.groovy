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

def rownum = new Random().nextInt(248 - 1) + 1
def status = findTestObject('Customer Module/Customer List/Label-In Payment')

WebUI.callTestCase(findTestCase('Common/Search For Customer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Customer Module/Customer List/Label-In Payment'))

if (!status) {
	WebUI.closeBrowser()
	
}
else
WebUI.click(findTestObject('Customer Module/Customer List/image_MorePaymentInformation'))

depositReceipt = WebUI.getText(findTestObject('Customer Module/Customer List/td_Receipt Number'))

WebUI.click(findTestObject('Customer Module/Customer List/link_CustomerDepositReceipt', [('depositReceipt') : depositReceipt]))

WebUI.click(findTestObject('Customer Module/Customer List/button_TransferPayment'))

WebUI.check(findTestObject('Customer Module/Customer List/radio_Payer'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Customer Module/Customer List/input_CustomerReference'), findTestData('Customer Accounts/customer accounts').getValue(
        1, rownum))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Customer Module/Customer List/input_CustomerReference'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Customer List/dropdown_ProductAccount'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Customer List/dropdown_ProductAccount'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Customer List/label_Product Account'))

WebUI.setText(findTestObject('Customer Module/Customer List/input_PayerComment'), payerComment)

WebUI.click(findTestObject('Customer Module/Customer List/button_SaveTransferToCustomer'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Customer Module/Customer List/successMsg-transfer has been requested succesfully'))

WebUI.click(findTestObject('Customer Module/Customer List/button-Close Payment Details Window'))

