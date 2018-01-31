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

displayNameGenerator = generateName('QWRTYPeuioasdFghjklMnbvcxz', 5)

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-Products'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-PaymentPlans'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Products/Link-ListCashPaymentPlans'))

WebUI.click(findTestObject('Payments Module/Cash Payment Plan/Link_Edit Cash Payment Plan', [('editCashPaymentPlan') : editCashPaymentPlan]))

WebUI.setText(findTestObject('Payments Module/Edit Cash Payment Plan/input_Plan Name'), name)

WebUI.setText(findTestObject('Payments Module/Edit Cash Payment Plan/input_Plan Display Name'), displayNameGenerator)

WebUI.setText(findTestObject('Payments Module/Edit Cash Payment Plan/input_Requestor Notes'), requestorNotes)

WebUI.click(findTestObject('Payments Module/Edit Cash Payment Plan/button_Save'))

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Payments/Edit Cash payment plan name and display name/approve_Approve changed name and Display Name'), 
    [('approveName') : 'Moran', ('approverNotes') : 'I find it necessary and fair enough to approve the change of name and display name. Reason being the current name is way too much \'bulk\''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-Products'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-PaymentPlans'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Products/Link-ListCashPaymentPlans'))

WebUI.delay(2)

WebUI.getText(findTestObject('Payments Module/Cash Payment Plan/label-Cash Payment Plan Name', [('paymentPlan') : paymentPlan]))

WebUI.verifyEqual(paymentPlan, name)

WebUI.closeBrowser()

String generateName(String chars, Integer length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    return sb.toString()
}

