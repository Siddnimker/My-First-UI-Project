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
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.google.com/')

WebUI.click(findTestObject('Object Repository/WEBUI/Katdemo/Page_Google/button_No thanks'))

WebUI.setText(findTestObject('Object Repository/WEBUI/Katdemo/Page_Google/textarea__q'), 'katalon')

WebUI.click(findTestObject('Object Repository/WEBUI/Katdemo/Page_Google/span_katalon studio tutorial'))

WebUI.click(findTestObject('Object Repository/WEBUI/Katdemo/Page_katalon studio tutorial - Google Search/a_View Demo'))

WebUI.click(findTestObject('Object Repository/WEBUI/Katdemo/Page_View a demo  Katalon/div_Out-of-the-box fit for any ALM, CI tool_b38796'))

WebUI.click(findTestObject('Object Repository/WEBUI/Katdemo/Page_View a demo  Katalon/div_Submit_popup_back'))

WebUI.closeBrowser()

