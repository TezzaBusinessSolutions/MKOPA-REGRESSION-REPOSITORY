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

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page Header and Menu/Payments/Link-Payments'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Page Header and Menu/Payments/Link-FloatingPayments'))

'change in the xpath and put anothe reference number after the test case is complete\r\n'
WebUI.click(findTestObject('Payments Module/Floating Payer Payments/link_AssignFloatingPayer', [('ReciptNo') : ReciptNo]))

WebUI.click(findTestObject('Payments Module/Assign Floating Payer Payments/Button-Assign'))

WebUI.verifyTextPresent('\'Comment\' should not be empty.', false)

WebUI.click(findTestObject('Payments Module/Assign Floating Payer Payments/Input-PayerReference'))

WebUI.delay(2)

WebUI.setMaskedText(findTestObject('Payments Module/Assign Floating Payer Payments/Input-PayerReference'), PayerReference)

WebUI.setText(findTestObject('Payments Module/Assign Floating Payer Payments/Input-Comments'), 'Assigned due to lack of the owner')

WebUI.delay(2)

WebUI.click(findTestObject('Payments Module/Assign Floating Payer Payments/DropDown-ProductAccount'))

WebUI.delay(2)

WebUI.click(findTestObject('Payments Module/Assign Floating Payer Payments/Input-ProductAccount'))

WebUI.doubleClick(findTestObject('Payments Module/Assign Floating Payer Payments/SelectingProductAccount'))

WebUI.click(findTestObject('Payments Module/Assign Floating Payer Payments/Button-Assign'))

WebUI.delay(8)

WebUI.click(findTestObject('Page Header and Menu/Payments/Link-Payments'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Page Header and Menu/Payments/Link-FloatingPayments'))

WebUI.verifyTextNotPresent(ReciptNo, false)

WebUI.setText(findTestObject('Customer Module/Input-SearchForCustomer'), PayerReference)

WebUI.click(findTestObject('Customer Module/IconBtn-Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Customer Module/Customer List/Radio_Paymentlist'))

