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

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-Products'))

WebUI.delay(delay)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-PaymentPlans'))

WebUI.delay(delay)

WebUI.click(findTestObject('Page Header and Menu/Products/link_AddLoanPaymentPlan'))

WebUI.setText(findTestObject('Products Module/Add Loan Payment Plan/input_LoanPaymentPlanName'), loan_PaymentPlanName)

WebUI.setText(findTestObject('Products Module/Add Loan Payment Plan/input_DisplayName'), loan_PaymentDisplayName)

WebUI.delay(delay)

WebUI.setText(findTestObject('Products Module/Add Cash Payment Plan/input_RequesterNotes'), requester_Notes)

WebUI.click(findTestObject('Products Module/Add Loan Payment Plan/button_SaveLoanPaymentPlan'))

WebUI.getText(findTestObject('Products Module/Add Loan Payment Plan/message_ValidLoanType'))

String error = 'Please supply a valid loan type'

WebUI.verifyElementText(findTestObject('Products Module/Add Loan Payment Plan/message_ValidLoanType'), error)

