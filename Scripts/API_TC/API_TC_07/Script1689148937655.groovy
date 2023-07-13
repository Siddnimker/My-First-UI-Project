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

WS.sendRequest(findTestObject('API/API_TC_07'))

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.Assert

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper

WS.sendRequest(findTestObject('API/API_TC_07'))

WS.sendRequestAndVerify(findTestObject('API/API_TC_07'))

RequestObject requestObject = findTestObject('API/API_TC_07')

def jsonslurper = new JsonSlurper()

def conTentType = new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json')

def acceptHeader = new TestObjectProperty('Accept', ConditionType.EQUALS, 'application/json')

requestObject.setHttpHeaderProperties(Arrays.asList(conTentType, acceptHeader))

def responseObject = WS.sendRequest(requestObject)

def responsevalue = jsonslurper.parseText(responseObject.getResponseText())

Assert.assertEquals(200, responseObject.getStatusCode())

 

println('Status Code '+responseObject.getStatusCode())

 

println('responsevalue ' + responsevalue)