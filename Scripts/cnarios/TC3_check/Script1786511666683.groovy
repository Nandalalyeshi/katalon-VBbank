import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open cnarios site using your existing custom keyword
CustomKeywords.'cnarios.urlopen.open'()

// If this opens the challenge listing page, navigate manually/click into the Progress Bar challenge before this point.

TestObject btnStart = new TestObject('btn_Start')
btnStart.addProperty('xpath', ConditionType.EQUALS, "//button[normalize-space()='Start']")

TestObject progressBar = new TestObject('progress_bar')
progressBar.addProperty('xpath', ConditionType.EQUALS, "//*[@role='progressbar' or contains(@class,'progress-bar')]")

WebUI.waitForElementClickable(btnStart, 10)
WebUI.click(btnStart)

// Browser-side fast polling gives a better chance of stopping close to 75%
WebUI.executeJavaScript('''
	window.__katalonStoppedAt75 = false;
	window.__katalonFinalProgress = null;

	function readProgressValue() {
		const bar = document.querySelector('[role="progressbar"], .progress-bar');
		if (!bar) return null;

		let value = bar.getAttribute('aria-valuenow');
		if (!value) {
			const match = (bar.innerText || bar.textContent || '').match(/d+/);
			value = match ? match[0] : null;
		}
		if (!value && bar.style.width) {
			const match = bar.style.width.match(/d+/);
			value = match ? match[0] : null;
		}
		return value == null ? null : parseInt(value, 10);
	}

	const timer = setInterval(function () {
		const value = readProgressValue();
		if (value !== null && value >= 75) {
			const stopBtn = Array.from(document.querySelectorAll('button'))
				.find(btn => btn.innerText.trim() === 'Stop');

			if (stopBtn) {
				stopBtn.click();
				window.__katalonFinalProgress = value;
				window.__katalonStoppedAt75 = true;
				clearInterval(timer);
			}
		}
	}, 5);
''', null)

// Wait until the JS timer has clicked Stop
int timeoutMs = 15000
int waitedMs = 0
while (waitedMs < timeoutMs) {
	Boolean stopped = WebUI.executeJavaScript('return window.__katalonStoppedAt75 === true;', null)
	if (stopped) {
		break
	}
	Thread.sleep(50)
	waitedMs += 50
}


String progressText = WebUI.getText(progressBar)
Integer stoppedValue = WebUI.executeJavaScript('return window.__katalonFinalProgress;', null) as Integer

WebUI.comment("Stopped progress value: ${stoppedValue}%")
WebUI.comment("Progress bar text after Stop: ${progressText}")
WebUI.comment("Difference from 75%: ${Math.abs((stoppedValue ?: 0) - 75)}")












