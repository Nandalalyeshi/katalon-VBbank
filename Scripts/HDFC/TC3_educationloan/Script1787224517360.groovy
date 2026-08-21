import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.swing.JOptionPane

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'hdfc.openurl.rrlhdfc'()

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/btn_Dicoverproduct'))

WebUI.click(findTestObject('Object Repository/HDFCobj/educationloan/btn_loan'))

WebUI.click(findTestObject('Object Repository/HDFCobj/educationloan/btn_Educationloan'))

WebUI.click(findTestObject('Object Repository/HDFCobj/educationloan/btn_Applynow'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/HDFCobj/educationloan/btn_studentlogin'))

WebUI.click(findTestObject('Object Repository/HDFCobj/educationloan/btn_createanaccount'))

WebUI.setText(findTestObject('Object Repository/HDFCobj/educationloan/txt_applicantname'), 'Vijay dssa')

WebUI.setText(findTestObject('Object Repository/HDFCobj/educationloan/txt_mobileno'), '7676754597')

WebUI.setText(findTestObject('Object Repository/HDFCobj/educationloan/txt_emailid'), 'scasd2ss@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HDFCobj/educationloan/txt_password'), 'ZKxczsQBhPctcJEjDcfLWQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/HDFCobj/educationloan/txt_confirmpass'), 'ZKxczsQBhPctcJEjDcfLWQ==')

String usecaptcha = JOptionPane.showInputDialog('enter display captch:')

WebUI.setText(findTestObject('Object Repository/HDFCobj/educationloan/txt_captcha'), usecaptcha)

WebUI.click(findTestObject('Object Repository/HDFCobj/educationloan/checkboax_iagree'))	

WebUI.click(findTestObject('Object Repository/HDFCobj/educationloan/btn_submit'))

if(WebUI.verifyElementVisible(findTestObject('Object Repository/HDFCobj/educationloan/error_msg'), FailureHandling.OPTIONAL)) {
	
	String errormsg = WebUI.getText(findTestObject('Object Repository/HDFCobj/educationloan/error_msg'))
	KeywordUtil.logInfo(errormsg)
	
	
}else {
	String otpmsg= WebUI.getText(findTestObject('Object Repository/HDFCobj/educationloan/OTP_successful'))
	
	KeywordUtil.logInfo(otpmsg)
	WebUI.click(findTestObject('Object Repository/HDFCobj/educationloan/btn_close'))
}












