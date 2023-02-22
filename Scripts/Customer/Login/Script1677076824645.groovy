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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.CM_LoginPage)

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Login Help_ctl00ContentPlaceHolder1lo_a40c01'), 
    GlobalVariable.CM_iq2)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_Login Help_txtPassword'), GlobalVariable.CM_iq2_pass)

WebUI.click(findTestObject('Object Repository/Page_Customer Login/label_Remember me'))

WebUI.click(findTestObject('Object Repository/Page_Customer Login/input_Login Help_ctl00ContentPlaceHolder1lo_bbd03c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home  Alarm.com (Internal)/div_HH                Edit login information'), 
    0)

