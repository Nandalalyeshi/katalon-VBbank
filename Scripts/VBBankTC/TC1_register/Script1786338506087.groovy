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

CustomKeywords.'vbbank.Vbbankkeyword.openurl'()

//click Reg here
WebUI.click(findTestObject('Object Repository/vb_register/btn_registerhere'))

WebUI.setText(findTestObject('Object Repository/vb_register/txt_fullname'), fullname)

WebUI.setText(findTestObject('Object Repository/vb_register/txt_username'), username)

WebUI.setText(findTestObject('Object Repository/vb_register/txt_email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/vb_register/txt_password'), password)

WebUI.setEncryptedText(findTestObject('Object Repository/vb_register/txt_confirmpassword'), confirmpassword)

WebUI.click(findTestObject('Object Repository/vb_register/btn_createaccounnt'))

WebUI.click(findTestObject('Object Repository/vb_register/btn_logout'))

KeywordUtil.logInfo(fullname + " Register Successfully")