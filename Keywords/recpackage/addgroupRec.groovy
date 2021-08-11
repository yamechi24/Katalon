package recpackage
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords


class addgroupRec {
	/**
	 * Refresh browser
	 */
	@Keyword
	def addRecipientGroup() {
		
		WebUI.click(findTestObject('Object Repository/Recipient_page/Page_Dashboard  ReminderMedia/a_Recipients        New'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Recipient_page/Page_Recipient Groups  ReminderMedia/h1_Recipient Groups'),     0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Recipient_page/Page_Recipient Groups  ReminderMedia/div_Learn how to use the new Recipient Manager'),     0)

		WebUI.click(findTestObject('Object Repository/Recipient_page/Page_Recipient Groups  ReminderMedia/button_Add Group'))

		WebUI.setText(findTestObject('Object Repository/Recipient_page/Page_Recipient Groups  ReminderMedia/input_Group Name_name'),     'Test group 1')

		WebUI.setText(findTestObject('Object Repository/Recipient_page/Page_Recipient Groups  ReminderMedia/textarea_Group Description_description'),     'This is a test')

		WebUI.click(findTestObject('Object Repository/Recipient_page/Page_Recipient Groups  ReminderMedia/button_Add Group_1'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Recipient_page/Page_Recipient Groups  ReminderMedia/a_Test group 1'),     0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Recipient_page/Page_Recipient Groups  ReminderMedia/td_Test group 1                     This is a test'),     0)
		KeywordUtil.markPassed("Refresh successfully")
	}

	
}