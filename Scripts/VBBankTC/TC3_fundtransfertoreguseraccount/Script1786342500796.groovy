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

//CustomKeywords.'vbbank.Vbbankkeyword.openurl'()

//click on login as user
WebUI.click(findTestObject('Object Repository/vb_login/btn_loginasuser'))

//click on transfer
WebUI.click(findTestObject('Object Repository/transferfromanotheruser/btn_transfer'))

//serach Recipient Account Number

WebUI.setText(findTestObject('Object Repository/transferfromanotheruser/txt_enteraccountno'), fullname)

WebUI.waitForElementClickable(findTestObject('Object Repository/transferfromanotheruser/searchresultaccont'), 3)
WebUI.click(findTestObject('Object Repository/transferfromanotheruser/searchresultaccont'))

//enter amount
WebUI.setText(findTestObject('Object Repository/transferfromanotheruser/txt_amount'), '10000')

//description

WebUI.setText(findTestObject('Object Repository/transferfromanotheruser/txt_description'), 'trnasfer to Nandalal')

//click on TransferMoney
WebUI.click(findTestObject('Object Repository/transferfromanotheruser/bt_transferMoney'))

//click on logout
WebUI.click(findTestObject('Object Repository/vb_register/btn_logout'))

KeywordUtil.logInfo("Transfer successful")
//

