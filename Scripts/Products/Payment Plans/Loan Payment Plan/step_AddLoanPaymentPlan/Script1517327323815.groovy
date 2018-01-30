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

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-Products'))

WebUI.delay(delay)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-PaymentPlans'))

WebUI.delay(delay)

WebUI.click(findTestObject('Page Header and Menu/Products/link_AddLoanPaymentPlan'))

WebUI.setText(findTestObject('Products Module/Add Loan Payment Plan/input_LoanPaymentPlanName'), loan_PaymentPlanName)

WebUI.setText(findTestObject('Products Module/Add Loan Payment Plan/input_DisplayName'), loan_PaymentDisplayName)

WebUI.delay(delay)

WebUI.scrollToElement(findTestObject('Products Module/Add Cash Payment Plan/option_OutletProductType', [('outletproducttype') : outletproducttype]), 
    0)

WebUI.click(findTestObject('Products Module/Add Cash Payment Plan/option_OutletProductType', [('outletproducttype') : outletproducttype]))

WebUI.click(findTestObject('Products Module/Add Cash Payment Plan/button_AddProductType'))

WebUI.setText(findTestObject('Products Module/Add Loan Payment Plan/input_LoanDeposit'), loan_Deposit)

WebUI.setText(findTestObject('Products Module/Add Loan Payment Plan/input_CostPerCredit'), costpercredit)

WebUI.setText(findTestObject('Products Module/Add Loan Payment Plan/input_OptimalLoanDuration'), loan_Duration)

WebUI.setText(findTestObject('Products Module/Add Loan Payment Plan/input_FreeUsageOnActivation'), free_Activation)

WebUI.setText(findTestObject('Products Module/Add Cash Payment Plan/input_TotalPrice'), total_Price)

WebUI.click(findTestObject('Products Module/Add Loan Payment Plan/dropdown_CreditSystem'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delay)

WebUI.click(findTestObject('Products Module/Add Loan Payment Plan/option_DailyCountdown'))

WebUI.delay(delay)

WebUI.click(findTestObject('Products Module/Add Loan Payment Plan/dropdown_LoanType'))

WebUI.delay(delay)

WebUI.click(findTestObject('Products Module/Add Loan Payment Plan/option_loanType', [('loan_Type') : loan_Type]))

WebUI.setText(findTestObject('Products Module/Add Cash Payment Plan/input_RequesterNotes'), requester_Notes)

WebUI.click(findTestObject('Products Module/Add Loan Payment Plan/button_SaveLoanPaymentPlan'))

