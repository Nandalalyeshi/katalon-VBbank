import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.RenderingHints.Key

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

CustomKeywords.'hdfc.openurl.rrlhdfc'()

WebUI.click(findTestObject('Object Repository/HDFCobj/Currentaccout/btn_Dicoverproduct'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_investments'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_NRI_smartinvest'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_opennow'))

WebUI.switchToWindowIndex(1)

//WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_mandatorydoc_viewall'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/newtextoffical9'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_oknoted'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_letsbegin'))//

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/radiobtn_iaminindia'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/chkbox_ichoose'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_continue'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_locationallow'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/HDFCobj/invest_NRI/select_country'), 'INDIA', false)

//WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/txt_mobileno'))
WebUI.setText(findTestObject('Object Repository/HDFCobj/invest_NRI/txt_mobileno'), '7276561227')

WebUI.setText(findTestObject('Object Repository/HDFCobj/invest_NRI/txt_email'), 'dfg@gmail.com')

WebUI.clearText(findTestObject('Object Repository/HDFCobj/invest_NRI/LGcode1'))

WebUI.setText(findTestObject('Object Repository/HDFCobj/invest_NRI/LGcode1'), '232')

WebUI.setText(findTestObject('Object Repository/HDFCobj/invest_NRI/Lccode'), '34')

WebUI.clearText(findTestObject('Object Repository/HDFCobj/invest_NRI/txt_sourcecode'))

//WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/select_0013'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/chkbox_consent1'))

WebUI.scrollToElement(findTestObject('Object Repository/HDFCobj/invest_NRI/clickinghere'), 10)

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_accept'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/chkbox_consent2'))

WebUI.scrollToElement(findTestObject('Object Repository/HDFCobj/invest_NRI/consent2_clickinghere'), 10)

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/consentaccept'))

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_getotps'))

String otpmessage= WebUI.getText(findTestObject('Object Repository/HDFCobj/invest_NRI/OtPmessgae'))

KeywordUtil.logInfo(otpmessage)

WebUI.setText(findTestObject('Object Repository/HDFCobj/invest_NRI/txt_sms'), '454333')

WebUI.click(findTestObject('Object Repository/HDFCobj/invest_NRI/btn_submit'))

if(WebUI.verifyElementVisible(findTestObject('Object Repository/HDFCobj/invest_NRI/msg_incorrect otp'), FailureHandling.OPTIONAL)) {
	
	String incorrectmsg = WebUI.getText(findTestObject('Object Repository/HDFCobj/invest_NRI/msg_incorrect otp'))
	
	KeywordUtil.logInfo(incorrectmsg)
		
}else {
	
	KeywordUtil.logInfo('Enter Email OTP')
}



