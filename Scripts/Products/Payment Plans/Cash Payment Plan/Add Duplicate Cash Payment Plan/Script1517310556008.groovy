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

WebUI.callTestCase(findTestCase('Products/Payment Plans/Cash Payment Plan/verify_Cash Payment Plan Added'), [('delay') : '5'
        , ('payment_PlanName') : 'PaymentPlan1', ('payment_PlanDisplayName') : 'Payment Plan Display Name Test', ('outletproducttype') : 'BluetoothTVOpt'
        , ('total_Price') : '50', ('requester_Notes') : 'Payment Cash Plan Notes'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Products/Payment Plans/Cash Payment Plan/verify_CashPaymentPlanApproval'), [('plan_toApprove') : 'PaymentPlan1'
        , ('approver_notes') : 'Cash Approval Notes', ('delay') : '10', ('cashplan_Name') : 'PaymentPlan1'], FailureHandling.STOP_ON_FAILURE)

