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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//CustomKeywords.'cnarios.urlopen.open'()
//
////click on hard challege
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_challenge_hard'))
//
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_addtocart1'))
//
////click on cart
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_cart'))
//
////click +
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_plus'))
//
////contnue shopping
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_continueshopping'))
//
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_addtocart2'))
//
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_cart'))
//
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_proceedtoaddress'))
//
////Address
//WebUI.setText(findTestObject('Object Repository/cnarios/endtoendflow/txt_firstname'), 'Nandalal')
//
//WebUI.setText(findTestObject('Object Repository/cnarios/endtoendflow/txt_lastname'), 'Patil')
//
////WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/txt_address'))
//
//WebUI.setText(findTestObject('Object Repository/cnarios/endtoendflow/txt_address'), 'abcd pune')
//
////proceed to payment
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_proceedtopayment'))
////
//
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_Paynow'))
//
//KeywordUtil.logInfo("Order Placed Successfully!")
//
////Back to home
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_backtohome'))//
//

String path = 'Object Repository/cnarios/endtoendflow/'

def clickObj = { name ->
	WebUI.click(findTestObject(path + name))
}

def typeObj = { name, value ->
	WebUI.setText(findTestObject(path + name), value)
}

CustomKeywords.'cnarios.urlopen.open'()

clickObj('btn_challenge_hard')
clickObj('btn_addtocart1')
clickObj('btn_cart')
clickObj('btn_plus')
clickObj('btn_continueshopping')
clickObj('btn_addtocart2')
clickObj('btn_cart')
clickObj('btn_proceedtoaddress')

typeObj('txt_firstname', 'Nandalal')
typeObj('txt_lastname', 'Patil')
typeObj('txt_address', 'abcd pune')

clickObj('btn_proceedtopayment')
clickObj('btn_Paynow')

KeywordUtil.logInfo('Order Placed Successfully!')

clickObj('btn_backtohome')
