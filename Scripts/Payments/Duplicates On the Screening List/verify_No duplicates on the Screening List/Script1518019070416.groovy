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

WebUI.mouseOver(findTestObject('Page Header and Menu/Customers/Link-Customer'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Customers/link_Screening'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Customers/link_Customer Awaiting Screening'))

WebUI.delay(3)

WebUI.click(findTestObject('Customer Module/Customers awaiting Screening/link_To Account', [('account') : account]))

WebUI.mouseOver(findTestObject('Customer Module/Customer List/hamburger-Hamburger Menu'))

WebUI.click(findTestObject('Customer Module/Customer List/button_Change Plan'))

WebUI.click(findTestObject('Customer Module/Customer List/dropdown_newPlanSelect'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Customer List/select_newplanLabel', [('plan') : plan]))

WebUI.setText(findTestObject('Customer Module/Customer List/textaarea_Comment'), '')

WebUI.click(findTestObject('Customer Module/Customer List/button_SubmitChange Plan'))

WebUI.verifyAlertPresent(20)

WebUI.acceptAlert()

