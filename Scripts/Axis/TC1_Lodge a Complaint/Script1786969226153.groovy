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

WebUI.click(findTestObject('Object Repository/Axisobj/lodgeacom/btn_lodgeacoma'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Axisobj/lodgeacom/drop_startselectionhere'))

WebUI.click(findTestObject('Object Repository/Axisobj/lodgeacom/btn_bankaccount'))

WebUI.click(findTestObject('Object Repository/Axisobj/lodgeacom/btn_continueselecting'))

WebUI.click(findTestObject('Object Repository/Axisobj/lodgeacom/allsavingaccounts'))

WebUI.click(findTestObject('Object Repository/Axisobj/lodgeacom/btn_chhoosefrombelooption'))

WebUI.click(findTestObject('Object Repository/Axisobj/lodgeacom/chequebook'))

WebUI.click(findTestObject('Object Repository/Axisobj/lodgeacom/btn_chat'))

WebUI.switchToWindowIndex(2)

WebUI.setText(findTestObject('Object Repository/Axisobj/lodgeacom/txt_regemailid'), 'fgfc@gmail.com')

WebUI.setText(findTestObject('Object Repository/Axisobj/lodgeacom/txt_mobileno'), '7276561226')


String usecaptch= JOptionPane.showInputDialog('Please read the screen and type the CAPTCHA here:')

WebUI.setText(findTestObject('Object Repository/Axisobj/lodgeacom/txt_captcha'), usecaptch)

WebUI.click(findTestObject('Object Repository/Axisobj/lodgeacom/btn_startchatting'))

//String error= WebUI.getText(findTestObject('Object Repository/Axisobj/lodgeacom/errormessagecatpch'))
//String error1= WebUI.getText(findTestObject('Object Repository/Axisobj/lodgeacom/error2'))
if(WebUI.verifyElementVisible(findTestObject('Object Repository/Axisobj/lodgeacom/errormessagecatpch'), FailureHandling.OPTIONAL)){
	String error= WebUI.getText(findTestObject('Object Repository/Axisobj/lodgeacom/errormessagecatpch'))
	KeywordUtil.logInfo(error)
	
}else {
	String error1= WebUI.getText(findTestObject('Object Repository/Axisobj/lodgeacom/error2'))
	KeywordUtil.logInfo(error1)

	
}

WebUI.switchToWindowIndex(0)





