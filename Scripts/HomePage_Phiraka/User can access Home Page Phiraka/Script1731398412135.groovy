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

WebUI.navigateToUrl('https://phiraka.com/')

WebUI.verifyEqual(WebUI.getUrl(), 'https://phiraka.com/')

WebUI.scrollToElement(findTestObject('Page_Home/p_Used by 50.000 User'), 0)

WebUI.verifyElementText(findTestObject('Page_Home/aboutPhiraka_Title'), 'Wujudkan Potensi Masa Depan Digital Anda')

WebUI.scrollToElement(findTestObject('Page_Home/aboutPhiraka_Description'), 0)

WebUI.verifyElementText(findTestObject('Page_Home/aboutPhiraka_Description'), 'PT. Phiraka Sinergi Indonesia adalah perusahaan IT yang mengkhususkan diri dalam solusi HR untuk bisnis. Sejak tahun 2004, kami telah membantu organisasi untuk menyederhanakan operasi HR mereka secara efektif.\n\nKami memahami tantangan yang dihadapi oleh departemen HR dan menawarkan solusi yang disesuaikan untuk mengatasi masalah tersebut. Tujuan kami adalah membantu organisasi dalam mengatasi tantangan HR dengan menyediakan solusi teknologi yang efisien dan ramah pengguna.')

WebUI.verifyElementVisible(findTestObject('Page_Home/aboutPhiraka_Image'))

WebUI.verifyElementClickable(findTestObject('Page_Home/btn_Menu_AboutUs'))

WebUI.closeBrowser()

