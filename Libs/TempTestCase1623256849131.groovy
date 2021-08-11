import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\yamec\\AppData\\Local\\Temp\\Katalon\\Test Cases\\ProfileInformation_Locations\\20210609_124049\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//WebUI.openBrowser('')
//WebUI.navigateToUrl('http://rmc.ymejia.internal.network/login')
//WebUI.setText(findTestObject('Page_Log In  ReminderMedia/input_Email_email'), 'kshah4@yahoo.com')
//WebUI.setEncryptedText(findTestObject('Page_Log In  ReminderMedia/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')
//WebUI.click(findTestObject('Page_Log In  ReminderMedia/button_Log In'))
not_run: WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Dashboard/a_Profile'))

not_run: WebUI.verifyElementText(findTestObject('Page_Profile  ReminderMedia/p_Manage all your contact information here,_33f15c'), 
    'Manage all your contact information here, such as phone numbers, emails, and addresses.')

not_run: WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/a_Locations'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/h2_Locations'), 
    'Locations')

WebElement editLocation = WebUiCommonHelper.findWebElement(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/a_Edit Location'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(editLocation))

//WebUI.click(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/a_Edit Location'))
//WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'), 
//    'Example Company ')
//WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/div_Edit Location                     Editi_8c9e16'))
WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'))

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'), 
    'Company')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Address_location.address1'), 
    '66585 MAIN ST')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Apt, Suite, etc_location.address2'), 
    '100')

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_City_location.city'))

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/button_Save'))

WebUI.delay(3)

WebElement addNew1 = WebUiCommonHelper.findWebElement(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/button_Add New'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(addNew1))

//WebUI.click(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/button_Add New'))
WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'), 
    'Example Company 2')

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Address_location.address1'))

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Address_location.address1'), 
    '80469 MAIN ST')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Apt, Suite, etc_location.address2'), 
    '200')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_City_location.city'), 
    'Pleasantville')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_State_location.state'), 
    'NJ')

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_ZIP Code_location.zip'))

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_ZIP Code_location.zip'), 
    '08201')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/select_Office                              _37e981'), 
    'Home', true)

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/label_Primary                 No'))

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/button_Save'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/div_Home Primary Example Company 2 80469 MA_b52427'), 
    3)

WebElement addNew2 = WebUiCommonHelper.findWebElement(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/button_Add New2'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(addNew2))

//WebUI.click(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/button_Add New2'))
WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'), 
    'Example Company 3')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Address_location.address1'), 
    '54698 MAIN ST')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Apt, Suite, etc_location.address2'), 
    '200')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_City_location.city'), 
    'Pleasantville')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_State_location.state'), 
    'NJ')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_ZIP Code_location.zip'), 
    '08201')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/select_Office                              _37e981'), 
    'Custom', true)

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Custom Label_location.label'), 
    'Other')

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/button_Save'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/div_Other  Example Company 3 54698 MAIN ST _2bf3f1'), 
    3)

WebElement addNew3 = WebUiCommonHelper.findWebElement(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/button_Add New3'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(addNew3))

//WebUI.click(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/button_Add New3'))
WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'), 
    'Example Company 4')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Address_location.address1'), 
    '2928 BELGRAVE AVE')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Apt, Suite, etc_location.address2'), 
    '205')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_City_location.city'), 
    'HUNTINGTON PARK')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_State_location.state'), 
    'CA')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_ZIP Code_location.zip'), 
    '90255')

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/select_Office                              _37e981'))

WebUI.sendKeys(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/select_Office                              _37e981'), 
    'None')

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/button_Save'))

WebUI.delay(3)

editLocation = WebUiCommonHelper.findWebElement(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/a_Edit Location'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(editLocation))

//WebUI.click(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/a_Edit Location'))
//WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'), 
//    'Example Company ')
//WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/div_Edit Location                     Editi_8c9e16'))
WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'))

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Location Name_location.name'), 
    'Main Company')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Address_location.address1'), 
    '51430 MAIN ST')

WebUI.setText(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_Apt, Suite, etc_location.address2'), 
    '300')

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/input_City_location.city'))

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/label_Primary                 No'))

WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/button_Save'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/div_Office Primary Main Company 51430 MAIN _ac1426'), 
    3)

WebElement deleteLocation1 = WebUiCommonHelper.findWebElement(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/a_Delete Location'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(deleteLocation1))

//WebUI.click(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/a_Delete Location'))
WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/button_Delete'))

WebUI.delay(3)

WebElement deleteLocation2 = WebUiCommonHelper.findWebElement(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/a_Delete Location'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(deleteLocation2))

//WebUI.click(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/a_Delete Location'))
WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/button_Delete'))

WebUI.delay(3)

WebElement deleteLocation3 = WebUiCommonHelper.findWebElement(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/a_Delete Location'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(deleteLocation3))

//WebUI.click(findTestObject('Page_Profile_Locations/Page_Profile  ReminderMedia/a_Delete Location'))
WebUI.click(findTestObject('Object Repository/Page_Profile_Locations/Page_Profile  ReminderMedia/button_Delete'))

WebUI.callTestCase(findTestCase('Logout'), [:], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/ProfileInformation_Locations', new TestCaseBinding('Test Cases/ProfileInformation_Locations',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
