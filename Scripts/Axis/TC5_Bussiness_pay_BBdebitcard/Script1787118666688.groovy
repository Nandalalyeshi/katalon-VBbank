import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.assertj.core.api.InstanceOfAssertFactories.STRING

import com.github.fge.jsonschema.library.Keyword
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import javax.swing.JOptionPane


CustomKeywords.'axis.urlaxis.axisurl'()

WebUI.click(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/btn_bussiness'))

WebUI.mouseOver(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/btn_Pay'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/btn_bbdebitcard'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/btn_Applynow'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/txt_name'), 'Vishal')

WebUI.setText(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/email'), 'sfs@gmail.com')

WebUI.setText(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/txt_address'), 'ABC dfdj')

WebUI.selectOptionByValue(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/selectstate'), 'Maharashtra', false)

WebUI.waitForElementClickable(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/selectcity'), 15)

WebUI.selectOptionByValue(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/selectcity'), 'Nashik', false)

WebUI.waitForElementClickable(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/selectbranch'), 15)

WebUI.selectOptionByValue(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/selectbranch'), '0629', false)

WebUI.setText(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/txt_Pincode'), '674533')

WebUI.setText(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/txt_mobileno'), '7450347323')

String usecaptch= JOptionPane.showInputDialog('Please read the screen and type the CAPTCHA here:')

WebUI.setText(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/txt_captcha'), usecaptch)

WebUI.click(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/btn_Submit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/messagesuccess'), 10)

if(WebUI.verifyElementVisible(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/messagesuccess'), FailureHandling.OPTIONAL)) {
	
	String message = WebUI.getText(findTestObject('Object Repository/Axisobj/Bussiness_pay_BBDebitcard/messagesuccess'))
	
	KeywordUtil.logInfo('Thank You ' + message)
		
}else {
	
	KeywordUtil.logInfo("Incorrect data")
	
}
















