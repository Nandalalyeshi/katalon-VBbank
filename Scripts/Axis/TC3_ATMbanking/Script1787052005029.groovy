import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

import cucumber.api.java.en_lol.WEN
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//CustomKeywords.'axis.urlaxis.axisurl'()

WebUI.mouseOver(findTestObject('Object Repository/Axisobj/Whatappbanking/btn_banksmart'))

WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/btn_atmbanking'))

WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/btn_locateatm'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/dropd_select'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/select_maharashtra'))

WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/select_city'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/selectcity_navimumbai'))

WebUI.setText(findTestObject('Object Repository/Axisobj/ATMbanking/txt_enterlocality'), 'Koparkhairane')

//WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/btn_select_radius'))

//WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/txt_5km'))

WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/chk_ATm'))

WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/chk_Bank'))

WebUI.click(findTestObject('Object Repository/Axisobj/ATMbanking/btn_search'))

if(WebUI.verifyElementVisible(findTestObject('Object Repository/Axisobj/ATMbanking/msg_nolocationfound'), FailureHandling.OPTIONAL)){
	
	String msgnolocation= WebUI.getText(findTestObject('Object Repository/Axisobj/ATMbanking/msg_nolocationfound'))
	
	KeywordUtil.logInfo(msgnolocation)
	
}else {
	
	KeywordUtil.logInfo("location found")
	
}


WebUI.switchToWindowIndex(0)











