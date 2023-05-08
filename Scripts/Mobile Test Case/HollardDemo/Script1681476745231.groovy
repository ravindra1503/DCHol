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

Mobile.startExistingApplication('com.hollard.vip')

Mobile.waitForElementPresent(findTestObject('Object Repository/Hollard_Mobile/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Hollard_Mobile/android.widget.LinearLayout'), 0)

Mobile.setText(findTestObject('Object Repository/Hollard_Mobile/android.widget.EditText'), 'FORD', 0)

Mobile.setText(findTestObject('Object Repository/Hollard_Mobile/android.widget.EditText (1)'), 'FIESTA', 0)

Mobile.setText(findTestObject('Object Repository/Hollard_Mobile/android.widget.EditText (2)'), '2015', 0)

Mobile.setText(findTestObject('Object Repository/Hollard_Mobile/android.widget.EditText (3)'), 'CN23355', 0)

Mobile.setText(findTestObject('Object Repository/Hollard_Mobile/android.widget.EditText (4)'), '21451223', 0)

Mobile.takeScreenshot('C:\\Automation Projects\\DC_Policy_Demo\\Include\\Screenshot\\screenshot3039271607501398265.png')

Mobile.setText(findTestObject('Object Repository/Hollard_Mobile/android.widget.EditText (5)'), '23098258', 0)

Mobile.tap(findTestObject('Object Repository/Hollard_Mobile/android.widget.TextView - Diesel'), 0)

Mobile.setText(findTestObject('Object Repository/Hollard_Mobile/android.widget.EditText (6)'), '5', 0)

Mobile.setText(findTestObject('Object Repository/Hollard_Mobile/android.widget.EditText (7)'), 'SEDAN', 0)

Mobile.tap(findTestObject('Object Repository/Hollard_Mobile/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Hollard_Mobile/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Hollard_Mobile/android.widget.TextView - NEXT'), 0)

Mobile.takeScreenshot('C:\\Automation Projects\\DC_Policy_Demo\\Include\\Screenshot\\screenshot4388765419050757774.png')

Mobile.closeApplication()

