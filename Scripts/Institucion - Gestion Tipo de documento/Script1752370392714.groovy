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

String sufijo = RandomStringUtils.randomNumeric(3)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Institucion/Page_Certichain/input_Usuario o Email_username'), 'Institucion1')

WebUI.setEncryptedText(findTestObject('Object Repository/Institucion/Page_Certichain/input_Contrasea_password'), 'fZs6f3uhTxhPpjPSJ0O/cA==')

WebUI.click(findTestObject('Object Repository/Institucion/Page_Certichain/button_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/Institucion/Page_Certichain/button_Dashboard_toggle-btn'))

WebUI.click(findTestObject('Object Repository/Institucion/Page_Certichain/a_Instituciones'))

WebUI.click(findTestObject('Object Repository/Institucion/Page_Certichain/button_Dashboard_toggle-btn'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Institucion/Page_Certichain/p-tab_Administrar Tipos Documentos'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Institucion/Page_Certichain/input_Tipo Usuario_createNombre'), 'TipoDocumento_' + sufijo)

WebUI.click(findTestObject('Object Repository/Institucion/Page_Certichain/button_Crear'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Institucion/Page_Certichain/a_Desactivar'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Institucion/Page_Certichain/a_Activar'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeBrowser()