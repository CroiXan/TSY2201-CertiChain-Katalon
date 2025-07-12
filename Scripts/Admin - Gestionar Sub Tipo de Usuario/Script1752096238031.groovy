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
import org.apache.commons.lang.RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

String sufijo = RandomStringUtils.randomNumeric(3)

WebUI.setText(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/input_Usuario o Email_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/input_Contrasea_password'), 
    'cx1a8fEuUdO1Nly0T1GAYQ==')

WebUI.sendKeys(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/input_Contrasea_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/button_Dashboard_toggle-btn'))

WebUI.click(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/a_Administracion'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/i_Dashboard_pi pi-chevron-left ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/p-tab_Categorias'))

WebUI.setText(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/input_Subtipo Usuario_p-inputtext p-compone_c630a2'), 
    'Subtipo_' + sufijo)

WebUI.click(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/span_Crear'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/button_Mostrando 1 hasta 10 de 11 registros_614c70'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/button_Mostrando 11 hasta 11 de 11 registro_477a16'))

WebUI.click(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/a_Desactivar'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Admin Sub Tipo Usuario/Page_Certichain/a_Activar'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeBrowser()

