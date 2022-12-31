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

WebUI.openBrowser('https://marketplace.iihtsrt.com/')

WebUI.click(findTestObject('market place practice/register button'))

WebUI.setText(findTestObject('market place practice/username'), 'rs123')

WebUI.setText(findTestObject('market place practice/firstname'), 'Raj')

WebUI.setText(findTestObject('market place practice/last name'), 'shah')

WebUI.setText(findTestObject('market place practice/email address'), 'adc@gmail.com')

WebUI.setText(findTestObject('market place practice/password'), '123456')

WebUI.setText(findTestObject('market place practice/confirm password'), '123456')

WebUI.click(findTestObject('market place practice/click on register button'))

WebUI.closeBrowser()

