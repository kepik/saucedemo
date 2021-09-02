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

WebUI.navigateToUrl('https://www.saucedemo.com/')

//--- LOGIN
WebUI.setText(findTestObject('Page_Swag Labs/txt_Username'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/txt_Passwd'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/btn_LOGIN'))

//validate home
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/span_Products'), 5)

//filter
WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Swag Labs/select_filter'), 'Price (low to high)', false)

//add product to cart
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

//go to cart
WebUI.click(findTestObject('Page_Swag Labs/shopping_cart_link'))

//checkout
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'standard')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'user')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '80123')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))

//back to home
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/button_Back Home'), 5)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Back Home'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_Logout'))

