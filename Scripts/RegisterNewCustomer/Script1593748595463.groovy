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

WebUI.navigateToUrl('http://54.169.247.250:88/')

WebUI.setText(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Login/input_User name or password incorrect_user_name'), 
    'Ngu Wah Kyaw')

WebUI.setEncryptedText(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Login/input_User name or password incorrect_user__13ad3b'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Login/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Dashboard/a_Sales'))

WebUI.click(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Dashboard/a_Customer'))

WebUI.click(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/a_Add New'))

WebUI.setText(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/input__customer_name'), 
    'Daw Nwe Ni Thandar')

WebUI.setText(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/input_Phone_customer_phone'), 
    '09475196478\t')

WebUI.setText(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/textarea_Address_customer_address'), 
    'No-23, ')

WebUI.click(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/div_Address'))

WebUI.setText(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/textarea_Address_customer_address'), 
    'No-57, Pan Pin St, Pathein Road')

WebUI.click(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/div__col-lg-7 col-md-7 col-sm-7 col-xs-7'))

WebUI.setText(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/input_Business Name_businessname'), 
    'Daw Nwe Ni Thandar')

WebUI.setText(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/input_Business Phone_businessphone'), 
    '09475196478\t')

WebUI.click(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/input_Phone_customer_phone'))

WebUI.click(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/div_Business Name                          _38ce8e'))

WebUI.click(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/div_Customer Name                          _c16540'))

WebUI.setText(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/input_Business Address_businessaddress'), 
    'No-57, Pan Pin St, Pathein Road')

WebUI.click(findTestObject('Object Repository/RegisterNewCustomer/Page_ATO Light ERP  Customer/button_Save'))

