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

WebUI.callTestCase(findTestCase('Common/CheckerLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-Products'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-PaymentPlans'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Products/link_PaymentPlansApproval'))

WebUI.click(findTestObject('Payments Module/Payment Plans Pending Approval/Link-Approve', [('approveName') : approveName]))

WebUI.setText(findTestObject('Payments Module/Approve Cash Payment Plan Update/input-Approvers Notes'), approverNotes)

WebUI.check(findTestObject('Payments Module/Approve Cash Payment Plan Update/checkBox-Is Approved'))

WebUI.click(findTestObject('Payments Module/Approve Cash Payment Plan Update/button-Save'), FailureHandling.STOP_ON_FAILURE)

