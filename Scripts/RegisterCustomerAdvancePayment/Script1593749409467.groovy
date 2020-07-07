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

WebUI.setText(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  Login/input_User name or password incorrect_user_name'), 
    'Ngu Wah Kyaw')

WebUI.setEncryptedText(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  Login/input_User name or password incorrect_user__13ad3b'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  Dashboard/a_Account'))

WebUI.click(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  Dashboard/a_Advance Receive'))

WebUI.click(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/a_Add New'))

WebUI.click(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/span_Cash'))

WebUI.rightClick(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/li_AYA Bank'))

WebUI.click(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/span_Cash In Hand'))

WebUI.rightClick(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/li_Bank Account- AYA'))

WebUI.click(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/span_Please Select Customer'))

WebUI.rightClick(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/li_Daw Wathan Oo'))

WebUI.setText(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/input_Amount_adv_payment_amount'), 
    '500000')

WebUI.setText(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/textarea_Remark_remark'), 
    '-advance receipt from Daw Wathan Oo')

CustomKeywords.'upload_attachment.upload_file.uploadFile2'(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/div_Drop files here and click to upload (Ma_11fb1c'), 
    'D:\\ATO\\FactoryERP\\Test_Photo\\2.jpg')

WebUI.click(findTestObject('Object Repository/RegisterCustomerAdvancePayment/Page_ATO Light ERP  AdvancePayment/button_Save'))

