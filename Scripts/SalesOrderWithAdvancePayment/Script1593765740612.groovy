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

WebUI.setText(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  Login/input_User name or password incorrect_user_name'), 
    'Ngu Wah Kyaw')

WebUI.setEncryptedText(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  Login/input_User name or password incorrect_user__13ad3b'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  Login/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  Dashboard/a_Sales'))

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  Dashboard/a_Sales Order'))

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/a_Add New'))

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/span_Alpine (09-1235556)'))

WebUI.rightClick(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/li_Daw Wathan Oo (09-6763837363738)'))

WebUI.setText(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/input__carno'), 
    '8I-9876')

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/span_Please Select Team'))

WebUI.rightClick(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/li_Team A'))

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/i_Add Item_fa fa-plus'))

WebUI.setText(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/input__salesitemname'), 
    'Steel Rod')

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/div_Steel Rod'))

WebUI.setText(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/input__salesitemname'), 
    'Steel Rod')

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/input_Qty_sd_cal_qty'))

WebUI.setText(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/input_Qty_sd_cal_qty'), 
    '7')

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/div_Price'))

WebUI.setText(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/input_Price_salerate'), 
    '10000')

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/i_Add_fa fa-save'))

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/i_Save_fa fa-save'))

WebUI.click(findTestObject('Object Repository/SalesOrderWithAdvancePayment/Page_ATO Light ERP  SalesOrder/button_confirm'))

