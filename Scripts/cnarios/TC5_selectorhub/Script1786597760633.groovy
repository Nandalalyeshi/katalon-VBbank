import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en_lol.WEN
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'cnarios.urlopen.opensele'()

//WebUI.switchToFrame(findTestObject('Object Repository/obj_DummyForm1/iframe'), 5)
WebUI.delay(2)
//Dummy form
WebUI.click(findTestObject('Object Repository/obj_DummyForm1/txt_useremail'))	
WebUI.setText(findTestObject('Object Repository/obj_DummyForm1/txt_useremail'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/obj_DummyForm1/txt_password'), password)

WebUI.setText(findTestObject('Object Repository/obj_DummyForm1/txt_company'), company)

WebUI.setText(findTestObject('Object Repository/obj_DummyForm1/txt_mobile'), mobile)


//WebUI.waitForElementClickable(findTestObject('Object Repository/obj_DummyForm1/txt_country'), 5)
WebUI.click(findTestObject('Object Repository/obj_DummyForm1/txt_country'))
WebUI.setText(findTestObject('Object Repository/obj_DummyForm1/txt_country'), 'India')

WebUI.click(findTestObject('Object Repository/obj_DummyForm1/btn_submit'))

WebUI.setText(findTestObject('Object Repository/obj_DummyForm1/txt_frush'), 'sfnf')

//Shadom
