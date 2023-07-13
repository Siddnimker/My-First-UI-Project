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

WebUI.navigateToUrl('https://phptravels.com/demo/')

WebUI.setText(findTestObject('Object Repository/WEBUI/PHP travel/Page_Book Your Free Demo Now - Phptravels/input_Instant Demo_first_name'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/WEBUI/PHP travel/Page_Book Your Free Demo Now - Phptravels/input_Instant Demo_last_name'), 
    'Test2')

WebUI.setText(findTestObject('Object Repository/WEBUI/PHP travel/Page_Book Your Free Demo Now - Phptravels/input_Instant Demo_business_name'), 
    'Business ')

WebUI.setText(findTestObject('Object Repository/WEBUI/PHP travel/Page_Book Your Free Demo Now - Phptravels/input_Instant Demo_email'), 
    'Test@abc.com')

WebUI.setText(findTestObject('Object Repository/WEBUI/PHP travel/Page_Book Your Free Demo Now - Phptravels/input__number'), '12')

WebUI.click(findTestObject('Object Repository/WEBUI/PHP travel/Page_Book Your Free Demo Now - Phptravels/button_Submit'))

WebUI.closeBrowser()

