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
WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Enter the Store'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/img'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_AV-CB-01'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_EST-18'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/img_1'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_AV-SB-02'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_EST-19'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Add to Cart_1'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/img_1'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/td_AV-SB-02'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_AV-SB-02'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_EST-19'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Add to Cart_1'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/img_1_2'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_FL-DSH-01'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_EST-15'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Add to Cart_1_2'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/img_1_2'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_FL-DSH-01'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_EST-14'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Add to Cart_1_2_3'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/img_1_2'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_FL-DSH-01'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_EST-15'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Add to Cart_1_2'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/img_1_2_3'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_K9-CW-01'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_EST-27'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Add to Cart_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Return to Main Menu'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/img_1_2'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_FL-DLH-02'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Add to Cart_1_2_3_4_5'))

WebUI.setText(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/input_false_EST-18'), '10')

WebUI.setText(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/input_false_EST-19'), '20')

WebUI.setText(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/input_false_EST-15'), '20')

WebUI.setText(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/input_false_EST-14'), '10')

WebUI.setText(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/input_false_EST-27'), '10')

WebUI.setText(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/input_false_EST-16'), '10')

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/input_Sub Total 578.79_updateCartQuantities'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/a_Return to Main Menu'))

WebUI.setText(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/input__keyword'), 'cat')

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/form'))

WebUI.click(findTestObject('Object Repository/WEBUI/Pet3/Page_JPetStore Demo/input__searchProducts'))

WebUI.closeBrowser()

