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

WebUI.navigateToUrl('https://certichain.ddns.net/login')

WebUI.setText(findTestObject('Object Repository/Admin -Audit/Page_Certichain/input_Usuario o Email_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin -Audit/Page_Certichain/input_Contrasea_password'), 'cx1a8fEuUdO1Nly0T1GAYQ==')

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/span_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/button_Dashboard_toggle-btn'))

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/span_Administracion'))

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/button_Dashboard_toggle-btn'))

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/p-tab_Auditora'))

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/td_institucion1'))

WebUI.setText(findTestObject('Object Repository/Admin -Audit/Page_Certichain/input_Emisor_ng-untouched ng-pristine ng-valid'), 
    'institucion1')

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/button_Buscar'))

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/input_Emisor_ng-untouched ng-pristine ng-valid'))

WebUI.doubleClick(findTestObject('Object Repository/Admin -Audit/Page_Certichain/input_Emisor_ng-untouched ng-pristine ng-valid'))

WebUI.setText(findTestObject('Object Repository/Admin -Audit/Page_Certichain/input_Emisor_ng-untouched ng-pristine ng-valid'), 
    '')

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/button_Buscar'))

WebUI.doubleClick(findTestObject('Object Repository/Admin -Audit/Page_Certichain/td_user45'))

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/td_user45'))

WebUI.setText(findTestObject('Object Repository/Admin -Audit/Page_Certichain/input_Solicitante_ng-untouched ng-pristine _4c63a6'), 
    'user45')

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/button_Buscar'))

WebUI.doubleClick(findTestObject('Object Repository/Admin -Audit/Page_Certichain/input_Solicitante_ng-untouched ng-pristine _4c63a6'))

WebUI.setText(findTestObject('Object Repository/Admin -Audit/Page_Certichain/input_Solicitante_ng-untouched ng-pristine _4c63a6'), 
    '')

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/button_Buscar'))

WebUI.click(findTestObject('Object Repository/Admin -Audit/Page_Certichain/button_Buscar'))

WebUI.closeBrowser()

