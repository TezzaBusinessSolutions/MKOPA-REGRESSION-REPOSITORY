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

displayNameGenerator = generateName('qwertyuiopasdfghjklzxcvbnm', 51)

displayNameGenerator1 = generateName('qwertyuiopasdfghjklzxcvbnm', 49)

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-Products'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-PaymentPlans'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Products/Link-ListCashPaymentPlans'))

WebUI.click(findTestObject('Payments Module/Cash Payment Plan/Link_Edit Cash Payment Plan', [('editCashPaymentPlan') : editCashPaymentPlan]))

WebUI.setText(findTestObject('Payments Module/Edit Cash Payment Plan/input_Plan Display Name'), displayNameGenerator)

WebUI.verifyElementPresent(findTestObject('Payments Module/Edit Cash Payment Plan/errorMsg_You have exceede 50 characters'), 
    2)

WebUI.clearText(findTestObject('Payments Module/Edit Cash Payment Plan/input_Plan Display Name'))

WebUI.delay(2)

WebUI.setText(findTestObject('Payments Module/Edit Cash Payment Plan/input_Requestor Notes'), requestorNotes)

WebUI.setText(findTestObject('Payments Module/Edit Cash Payment Plan/input_Plan Display Name', [('editCashPaymentPlan') : editCashPaymentPlan]), 
    displayNameGenerator1)

WebUI.click(findTestObject('Payments Module/Edit Cash Payment Plan/button_Save'))

String generateName(String chars, Integer length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    return sb.toString()
}

