import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.sql.Driver

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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebElement as Keys

CustomKeywords.'cnarios.urlopen.open'()

//click on hard challege
WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_challenge_hard'))
//
//def driver = DriverFactory.getWebDriver()
//
//List<WebElement> addcart = driver.findElements(By.xpath('//div[@class="MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root w-60 h-80 shadow-md rounded-xl flex flex-col css-12nllm1"]'))
//
//for (int i = 0; i<4; i++) {
//	
//addcart = driver.findElements(By.xpath('//div[@class="MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root w-60 h-80 shadow-md rounded-xl flex flex-col css-12nllm1"]'))
//
//WebElement addbtn=addcart.get(i).findElement(By.xpath('//button[@class="MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-17j8wdr"]'))
//addbtn.click()
//
//}

//
//for (int i = 0; i<4; i++) {
//
//	def dynamicButton = findTestObject('Object Repository/cnarios/multipleadd/btn_addtocartupto5', [('index') : i])
//	
//	WebUI.waitForElementVisible(dynamicButton, 5)
//	
//	// Click the button natively
//	WebUI.click(dynamicButton)
//}

(0..<4).each { i ->
	WebUI.click(findTestObject('Object Repository/cnarios/multipleadd/btn_addtocartupto5', [('index') : i]))
}

//click on cart
WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_cart'))

////click +
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_plus'))
//
////contnue shopping
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_continueshopping'))
//
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_addtocart2'))
//
//WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_cart'))

WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_proceedtoaddress'))

//Address
WebUI.setText(findTestObject('Object Repository/cnarios/endtoendflow/txt_firstname'), 'Nandalal')

WebUI.setText(findTestObject('Object Repository/cnarios/endtoendflow/txt_lastname'), 'Patil')


WebUI.setText(findTestObject('Object Repository/cnarios/endtoendflow/txt_address'), 'abcd pune')

//proceed to payment
WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_proceedtopayment'))
//

WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_Paynow'))
KeywordUtil.logInfo("Order Placed Successfully!")

//Back to home
WebUI.click(findTestObject('Object Repository/cnarios/endtoendflow/btn_backtohome'))//






	
	
	
	