package cnarios

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.assertj.core.api.InstanceOfAssertFactories.STRING

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class urlopen {

	
	@Keyword
	def open() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://www.cnarios.com/challenges')
		
	}
	
	@Keyword
	def opencal() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://www.globalsqa.com/angularjs-protractor-practice-site/')
		
	}
	
	@Keyword
	def opensele() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://selectorshub.com/xpath-practice-page/')
		
	}
	
	
	@Keyword
	def openishine() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://ishine.apmosys.com/#/login?returnUrl=%2Fhome')
		WebUI.setText(findTestObject('Object Repository/ishine_obj/txt_username'), 'nandalal.yeshi@apmosys.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/ishine_obj/txt_password'), 'nx8lW3ljSW+65wtTjzWR9Q==')
			
		WebUI.click(findTestObject('Object Repository/ishine_obj/btn_login'))
	}
	
	@Keyword
	def otp() {
		
		WebUI.newTab('https://mail.apmosys.com/webmail/')
		
		WebUI.setText(findTestObject('Object Repository/ishine_obj/txt_email'), 'nandalal.yeshi@apmosys.com')
		WebUI.click(findTestObject('Object Repository/ishine_obj/btn_next'))
		
		WebUI.setEncryptedText(findTestObject('Object Repository/ishine_obj/txt_emailpassword'), 'nx8lW3ljSW+65wtTjzWR9Q==')
		WebUI.click(findTestObject('Object Repository/ishine_obj/btn_emailsingn'))
		
		WebUI.delay(5)	
		
		WebUI.click(findTestObject('Object Repository/ishine_obj/btn_refresh'))
		WebUI.delay(3)
		
		WebUI.click(findTestObject('Object Repository/ishine_obj/btn_ishingotp'))
		
		WebUI.switchToFrame(findTestObject('Object Repository/ishine_obj/iframe'), 5)
		
		String emailtext= WebUI.getText(findTestObject('Object Repository/ishine_obj/otpcontest'))
		
		String otpvalue = (emailtext=~/\d{6}/)[0]
		
		WebUI.switchToWindowIndex(0)
		
		WebUI.setText(findTestObject('Object Repository/ishine_obj/txt_otp'), otpvalue)
		
		WebUI.click(findTestObject('Object Repository/ishine_obj/btn_confirm'))
		
			
		
		
	}
	
	
	
	
	
}
