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

<<<<<<< HEAD
WebUI.click(findTestObject('Page Header and Menu/Customers/Link-Customer'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Customers/Link-ListCustomers'))

WebUI.click(findTestObject('Customer Module/Customer List/link_CustomerAccount', [('customerAccount') : customerAccount]))

WebUI.click(findTestObject('Customer Module/Customer List/image_MorePaymentInformation'))

String availablebalance = WebUI.getText(findTestObject('Customer Module/Customer List/label_AvailableBalance'))

<<<<<<< HEAD
=======
WebUI.delay(delay)

WebUI.scrollToElement(findTestObject('Customer Module/Customer List/link_CustomerDepositReceipt', [('depositReceipt') : depositReceipt]), 
    0)

>>>>>>> branch 'master' of https://github.com/TezzaBusinessSolutions/MKOPA-REGRESSION-REPOSITORY
WebUI.click(findTestObject('Customer Module/Customer List/link_CustomerDepositReceipt', [('depositReceipt') : depositReceipt]))

System.out.println(availablebalance)

WebUI.click(findTestObject('Customer Module/Customer List/button_RefundPayment'))

