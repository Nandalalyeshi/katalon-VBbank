import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.swing.JOptionPane

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

CustomKeywords.'axis.urlaxis.axisurl'()

WebUI.mouseOver(findTestObject('Object Repository/Axisobj/Homeloan/btn_loans'))

WebUI.mouseOver(findTestObject('Object Repository/Axisobj/Homeloan/btn_homeloan'))

WebUI.click(findTestObject('Object Repository/Axisobj/Homeloan/btn_applynow'))

WebUI.switchToWindowIndex(1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Axisobj/Homeloan/select_existingcustomer'), 'Yes', false)

WebUI.setText(findTestObject('Object Repository/Axisobj/Homeloan/txt_Name'), 'Kunal')

WebUI.setText(findTestObject('Object Repository/Axisobj/Homeloan/txt_mobileno'), '7276564345')

WebUI.setText(findTestObject('Object Repository/Axisobj/Homeloan/txt_emailid'), 'ddsd@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Axisobj/Homeloan/select_state'), 'Maharashtra', false)
	
WebUI.selectOptionByLabel(findTestObject('Object Repository/Axisobj/Homeloan/select_city'), 'Dhule', false)	
	
String usecaptch= JOptionPane.showInputDialog('Please read the screen and type the CAPTCHA here:')

WebUI.setText(findTestObject('Object Repository/Axisobj/Homeloan/txt_captch'), usecaptch)

WebUI.click(findTestObject('Object Repository/Axisobj/Homeloan/chkbox'))	

WebUI.click(findTestObject('Object Repository/Axisobj/Homeloan/btn_Submit'))

String otpmsg= WebUI.getText(findTestObject('Object Repository/Axisobj/Homeloan/otpcomingmessage'))
	
KeywordUtil.logInfo(otpmsg)
	
	
	
	
	
