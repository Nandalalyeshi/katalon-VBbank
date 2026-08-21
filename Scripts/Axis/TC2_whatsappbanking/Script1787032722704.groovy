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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import javax.swing.JOptionPane
//CustomKeywords.'axis.urlaxis.axisurl'()

WebUI.mouseOver(findTestObject('Object Repository/Axisobj/Whatappbanking/btn_banksmart'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Axisobj/Whatappbanking/btn_whatappbanking'), 10)

WebUI.click(findTestObject('Object Repository/Axisobj/Whatappbanking/btn_whatappbanking'))

WebUI.click(findTestObject('Object Repository/Axisobj/Whatappbanking/btn_signup'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Axisobj/Whatappbanking/selectinidia'), '+91', false)

WebUI.setText(findTestObject('Object Repository/Axisobj/Whatappbanking/txt_regmobileno'), '7276561226')

String usecaptch= JOptionPane.showInputDialog('Please read the screen and type the CAPTCHA here:')

WebUI.setText(findTestObject('Object Repository/Axisobj/Whatappbanking/txt_captch'), usecaptch)

WebUI.click(findTestObject('Object Repository/Axisobj/Whatappbanking/rbtn_aggree'))

WebUI.click(findTestObject('Object Repository/Axisobj/Whatappbanking/btn_submit'))

if(WebUI.verifyElementVisible(findTestObject('Object Repository/Axisobj/Whatappbanking/messageerror'), FailureHandling.OPTIONAL)){
	
	String msgerror = WebUI.getText(findTestObject('Object Repository/Axisobj/Whatappbanking/messageerror'))
	
	KeywordUtil.logInfo(msgerror)
}else {
	
	KeywordUtil.logInfo("successful")
}

WebUI.click(findTestObject('Object Repository/Axisobj/Whatappbanking/btn_close'))

WebUI.switchToWindowIndex(0)

