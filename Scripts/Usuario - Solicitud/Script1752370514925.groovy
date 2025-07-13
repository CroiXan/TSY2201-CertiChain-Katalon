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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/User/Page_Certichain/input_Usuario o Email_username'), 'user1')

WebUI.setEncryptedText(findTestObject('Object Repository/User/Page_Certichain/input_Contrasea_password'), 'jXQUk1vFliNSakaNwZgtmg==')

WebUI.click(findTestObject('Object Repository/User/Page_Certichain/span_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/User/Page_Certichain/button_Dashboard_toggle-btn'))

WebUI.click(findTestObject('Object Repository/User/Page_Certichain/a_Usuarios'))

WebUI.click(findTestObject('Object Repository/User/Page_Certichain/i_Dashboard_pi pi-chevron-left ng-star-inserted'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/User/Page_Certichain/span_Seleccione una institucin'))

WebUI.click(findTestObject('Object Repository/User/Page_Certichain/span_institucion2'))

WebUI.click(findTestObject('Object Repository/User/Page_Certichain/span_Seleccione un documento'))

WebUI.click(findTestObject('Object Repository/User/Page_Certichain/span_Documento de Prueba'))

WebUI.click(findTestObject('Object Repository/User/Page_Certichain/button_Solicitar documento'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeBrowser()

