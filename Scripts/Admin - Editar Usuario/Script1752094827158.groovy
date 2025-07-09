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

WebUI.doubleClick(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/input_Usuario o Email_username'))

WebUI.setText(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/input_Usuario o Email_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/input_Contrasea_password'), 
    'cx1a8fEuUdO1Nly0T1GAYQ==')

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/span_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/button_Dashboard_toggle-btn'))

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/span_Administracion'))

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/i_Dashboard_pi pi-chevron-left ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/a_Editar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/select_--Seleccione--AdminUsuarioInstitucion'), 
    '68635ee1d7102f0ba8f7b3ad', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/select_--Seleccione--AdminPersona JuridicaI_1650a1'), 
    '68635f05d7102f0ba8f7b3b0', true)

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/input_Activo_ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/button_Aplicar Cambios'))

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/button_Cancelar'))

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/a_Editar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/select_--Seleccione--AdminUsuarioInstitucion'), 
    '68635ed2d7102f0ba8f7b3ac', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/select_--Seleccione--AdminPersona JuridicaI_1650a1'), 
    '68635ef7d7102f0ba8f7b3af', true)

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/input_Activo_ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Admin Editar Usuario/Page_Certichain/button_Aplicar Cambios'))

WebUI.closeBrowser()

