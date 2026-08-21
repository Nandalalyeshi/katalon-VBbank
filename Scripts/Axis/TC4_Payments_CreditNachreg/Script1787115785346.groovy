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

CustomKeywords.'axis.urlaxis.axisurl'()

WebUI.mouseOver(findTestObject('Object Repository/Axisobj/creditnachregistration/tbn_payments'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Axisobj/creditnachregistration/btn_otherpayments'))

WebUI.mouseOver(findTestObject('Object Repository/Axisobj/creditnachregistration/creditcardenachreg'))

WebUI.click(findTestObject('Object Repository/Axisobj/creditnachregistration/btn_knowmore'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/Axisobj/creditnachregistration/txt_enterlast4digitcreditcard'), '1234')

WebUI.setText(findTestObject('Object Repository/Axisobj/creditnachregistration/txt_mobileno'), '7276561227')

WebUI.click(findTestObject('Object Repository/Axisobj/creditnachregistration/txt_DOB'))
WebUI.setText(findTestObject('Object Repository/Axisobj/creditnachregistration/txt_DOB'), '07-01-1994')

WebUI.click(findTestObject('Object Repository/Axisobj/creditnachregistration/btn_Submit'))

WebUI.delay(3)

if(WebUI.verifyElementVisible(findTestObject('Object Repository/Axisobj/creditnachregistration/errortext'), FailureHandling.OPTIONAL)) {

String error= WebUI.getText(findTestObject('Object Repository/Axisobj/creditnachregistration/errortext'))

KeywordUtil.logInfo(error)

}else {
	KeywordUtil.logInfo("Registration Successful")
}

