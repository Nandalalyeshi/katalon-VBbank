import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.assertj.core.api.InstanceOfAssertFactories.STRING

import javax.swing.JOptionPane
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

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/btn_accounts'))

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/btn_currentaccount'))

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/btn_applynow'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/HDFCobj/Currentaccout/txt_entityname'), 'Abcd')

WebUI.setText(findTestObject('Object Repository/HDFCobj/Currentaccout/txt_authorizedperson'), 'kunal')

WebUI.setText(findTestObject('Object Repository/HDFCobj/Currentaccout/txt_mobileno'), '7276371738')

WebUI.setText(findTestObject('Object Repository/HDFCobj/Currentaccout/txt_emailid'), 'dfd@gmail.com')

WebUI.setText(findTestObject('Object Repository/HDFCobj/Currentaccout/txt_pincode'), '424311')

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/text'))

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/btn_yes_existingcust'))

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/selectcurrentaccounttype'))

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/selectcurrentaccounttype_2500AQB'))

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/selectconstitution'))

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/txt_constitype_sole'))

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/chkbox_1'))

WebUI.scrollToElement(findTestObject('Object Repository/HDFCobj/Currentaccout/scroll_1'), 10)

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/btn_iagree'))

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/chkbox_2'))

WebUI.scrollToElement(findTestObject('Object Repository/HDFCobj/Currentaccout/scroll2'), 10)

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/btn_iagree2'))


String usecaptcha= JOptionPane.showInputDialog('please enter captcha')

WebUI.setText(findTestObject('Object Repository/HDFCobj/Currentaccout/txt_captcha'), usecaptcha)

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/btn_Getotp'))
//

if(WebUI.verifyElementVisible(findTestObject('Object Repository/HDFCobj/Currentaccout/otptext'), FailureHandling.OPTIONAL)) {
	
	String otpmsg= WebUI.getText(findTestObject('Object Repository/HDFCobj/Currentaccout/otptext'))
	
	KeywordUtil.logInfo(otpmsg)
		
}else {
	
	String errorcaptcha = WebUI.getText(findTestObject('Object Repository/HDFCobj/Currentaccout/error_captcha'))
	
	KeywordUtil.logInfo(errorcaptcha)
	
}










