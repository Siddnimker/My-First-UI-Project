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

WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_Enter the Store'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/img'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_FI-SW-01'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_EST-1'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/img'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_FI-SW-02'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_EST-3'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/img_1'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_K9-BD-01'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_EST-7'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_Add to Cart_1'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/img_1_2'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_RP-SN-01'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_EST-11'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_Add to Cart_1_2'))

WebUI.setText(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/input_false_EST-11'), '10')

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/input_Sub Total 53.50_updateCartQuantities'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet1/Page_JPetStore Demo/a_Proceed to Checkout'))

WebUI.closeBrowser()

