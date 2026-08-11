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

WebUI.click(findTestObject('Object Repository/Topup/btn_topup'))

String balance= WebUI.getText(findTestObject('Object Repository/Topup/currentbalance'))

KeywordUtil.logInfo("Current Balance=" + balance)

//amount
WebUI.setText(findTestObject('Object Repository/Billpayment/txt_amount'), billpayamount)

//Proceed to payment
WebUI.click(findTestObject('Object Repository/Topup/btn_proceed'))

//card details

WebUI.setText(findTestObject('Object Repository/Billwithcard/txt_cardno'), cardnumber)

WebUI.setText(findTestObject('Object Repository/Billwithcard/txt_cardholdername'), cardholdername)

WebUI.setText(findTestObject('Object Repository/Billwithcard/txt_expiry'), '12/28')

WebUI.setText(findTestObject('Object Repository/Billwithcard/txt_cvv'), cvv)

WebUI.click(findTestObject('Object Repository/Billwithcard/btn_pay'))

KeywordUtil.logInfo('Successfully added $' + billpayamount + ' to your account!')

KeywordUtil.logInfo("Current Balance=" + balance)



