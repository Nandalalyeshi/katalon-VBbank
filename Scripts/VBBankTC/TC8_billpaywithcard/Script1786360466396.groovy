import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.RenderingHints.Key

import com.github.fge.jsonschema.library.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.KatalonBuiltInKeywordsUtil
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

//Click on Bill payment
WebUI.click(findTestObject('Object Repository/Billpayment/btn_Billspayment'))

//select Utility Provider *

WebUI.selectOptionByValue(findTestObject('Object Repository/Billpayment/selectutilityprovider'), "provider_001", false, FailureHandling.STOP_ON_FAILURE)

//amount
WebUI.setText(findTestObject('Object Repository/Billpayment/txt_amount'), billpayamount)

//Description

WebUI.setText(findTestObject('Object Repository/Billpayment/txt_Description'), "VB Power Bill payment")

//click on Radio Pay with card
WebUI.click(findTestObject('Object Repository/Billwithcard/rd_paywithcard'))

//click on continue

WebUI.click(findTestObject('Object Repository/Billwithcard/btn_continuetopay'))

//card details

WebUI.setText(findTestObject('Object Repository/Billwithcard/txt_cardno'), cardnumber)

WebUI.setText(findTestObject('Object Repository/Billwithcard/txt_cardholdername'), cardholdername)

WebUI.setText(findTestObject('Object Repository/Billwithcard/txt_expiry'), '12/28')

WebUI.setText(findTestObject('Object Repository/Billwithcard/txt_cvv'), cvv)

WebUI.click(findTestObject('Object Repository/Billwithcard/btn_pay'))

KeywordUtil.logInfo("Card payment successful! Bill has been paid.")

WebUI.delay(5)
//go to Dashboard
WebUI.click(findTestObject('Object Repository/Billpayment/btn_Dashboard'))

WebUI.delay(5)

String balance= WebUI.getText(findTestObject('Object Repository/vb_login/balanceamount'))

KeywordUtil.logInfo("Current Balance=" + balance)