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
import com.kms.katalon.core.testcase.Variable as Variable
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String tagged = tagGenerator('QWERTYUIOP1234567890LKJHGFDSAZXCVBNM', 9)

location = System.getenv('USERPROFILE')
String filePath=(location+"/git/MKOPA-REGRESSION-REPOSITORY/Payment Files/payments.csv")

CustomKeywords.'csvCreatorPackage.paymentFileGenerator.paymentFileGenerator'(Account, Phone, Amount, receiptNumber)

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page Header and Menu/FileUploadCenter/Link-FileUploadMenu'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('File Upload Center Module/File Upload Center/button_MPESA'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('File Upload Center Module/Upload Payment File (MPESA)/button_SELECT'),  filePath)

WebUI.setText(findTestObject('File Upload Center Module/Upload Payment File (MPESA)/input_COMMENT'), Comment)

WebUI.setText(findTestObject('File Upload Center Module/Upload Payment File (MPESA)/input_Tag'), tagged)

WebUI.click(findTestObject('File Upload Center Module/Upload Payment File (MPESA)/button_UPLOAD'))

WebUI.delay(2)

WebUI.click(findTestObject('File Upload Center Module/Upload Payment File (MPESA)/button_Close Window Button'))

String tagGenerator(String chars, Integer length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    return sb.toString()
}




