import data.IdentityDataConstants;
import data.URLConstants;
import framework.utils.webdriver.WDUtils;
import framework.utils.webelement.WEUtils;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.elementspage.buttons.POButtonsButton;
import pageobjects.elementspage.buttons.POClickMeButton;
import pageobjects.elementspage.buttons.PODoubleClickButton;
import pageobjects.elementspage.buttons.PORightClickMeButton;
import pageobjects.elementspage.checkbox.*;
import pageobjects.elementspage.textbox.POTextBoxButton;
import pageobjects.elementspage.textbox.POTextFields;
import pageobjects.elementspage.textbox.POTextFieldsResponse;

import javax.swing.*;

public class ElementsPageTests extends BaseTest {
    @BeforeMethod
    public void beforeMethod() { navigateToElementsPage(); }

    //checkbox tests
    @Test
    public void CheckboxButtonTest() {
        POCheckboxButton poCheckboxButton = new POCheckboxButton(driver);
        Assert.assertTrue(poCheckboxButton.isCheckboxButtonDisplayed(), "Unable to confirm Checkbox button is displayed");
        Assert.assertTrue(poCheckboxButton.clickCheckboxButton(), "Unable to click Checkbox button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue((WDUtils.getCurrentUrl(driver).equals(URLConstants.CHECKBOX_BUTTON_URL)), "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.CHECKBOX_BUTTON_URL);
    }

    @Test
    public void pressExpandAllButtonTest() {
        POExpandAllCheckBoxesButton poExpandAllCheckBoxesButton = new POExpandAllCheckBoxesButton(driver);
        WEUtils.pressCheckBoxButton(driver);
        Assert.assertTrue(poExpandAllCheckBoxesButton.isExpandAllButtonDisplayed(), "Unable to confirm Expand All button is displayed");
        Assert.assertTrue(poExpandAllCheckBoxesButton.clickExpandAllButton(), "Unable to click Checkbox button");
        WDUtils.waitForSeconds(5);
    }

    @Test
    public void ExcelFileCheckmarkTest() {
        POExcelFileCheckMark poExcelFileCheckMark = new POExcelFileCheckMark(driver);
        POExcelFileCheckMarkResponse poExcelFileCheckMarkResponse = new POExcelFileCheckMarkResponse(driver);
        WDUtils.waitForSeconds(5);

        WEUtils.pressCheckBoxButton(driver);
        WEUtils.expandAll(driver);
        Assert.assertTrue(WDUtils.scrollDown(driver), "Unable to scroll down");
        WDUtils.waitForSeconds(5);

        Assert.assertTrue(poExcelFileCheckMark.isExcelFileCheckMarkDisplayed(), "Unable to confirm Excel File.doc Checkmark is displayed");
        Assert.assertTrue(poExcelFileCheckMark.clickExcelFileCheckMark(), "Unable to click Excel File.doc Checkmark");
        Assert.assertTrue(poExcelFileCheckMarkResponse.isExcelFileCheckMarked(), "Excel File.doc Checkmark is not marked");
        WDUtils.waitForSeconds(5);

    }

    @Test
    public void WordFileCheckmarkTest() {
        POWordFileCheckMark poWordFileCheckMark = new POWordFileCheckMark(driver);
        POWordFileCheckMarkResponse poWordFileCheckMarkResponse = new POWordFileCheckMarkResponse(driver);
        WDUtils.waitForSeconds(5);

        WEUtils.pressCheckBoxButton(driver);
        WEUtils.expandAll(driver);
        Assert.assertTrue(WDUtils.scrollDown(driver), "Unable to scroll down");
        WDUtils.waitForSeconds(5);

        Assert.assertTrue(poWordFileCheckMark.isWordFileCheckMarkDisplayed(), "Unable to confirm Word File.doc Checkmark is displayed");
        Assert.assertTrue(poWordFileCheckMark.clickWordFileCheckMark(), "Unable to click Word File.doc Checkmark");
        Assert.assertTrue(poWordFileCheckMarkResponse.isWordFileCheckMarked(), "Word File Checkmark is not marked");
        WDUtils.waitForSeconds(5);
    }

    @Test
    public void DownloadsCheckMarkTest() {
        PODownloadsCheckMark poDownloadsCheckMark = new PODownloadsCheckMark(driver);
        PODownloadsCheckMarkResponse poDownloadsCheckMarkResponse = new PODownloadsCheckMarkResponse(driver);
        POWordFileCheckMarkResponse poWordFileCheckMarkResponse = new POWordFileCheckMarkResponse(driver);
        POExcelFileCheckMarkResponse poExcelFileCheckMarkResponse = new POExcelFileCheckMarkResponse(driver);

        WEUtils.pressCheckBoxButton(driver);
        WEUtils.expandAll(driver);
        Assert.assertTrue(WDUtils.scrollDown(driver), "Unable to scroll down");
        WDUtils.waitForSeconds(5);

        Assert.assertTrue(poDownloadsCheckMark.isDownloadsCheckMarkDisplayed(), "Unable to confirm Downloads Checkmark is displayed");
        Assert.assertTrue(poDownloadsCheckMark.clickDownloadsCheckMark(), "Unable to click Downloads Checkmark");
        Assert.assertTrue(poDownloadsCheckMarkResponse.isDownloadsCheckMarked(), "Downloads Checkmark is not marked");
        Assert.assertTrue(poWordFileCheckMarkResponse.isWordFileCheckMarked(), "Word File Checkmark is not marked");
        Assert.assertTrue(poExcelFileCheckMarkResponse.isExcelFileCheckMarked(), "Excel File.doc Checkmark is not marked");
    }

    @Test
    public void ButtonsButtonTest() {
        POButtonsButton poButtonsButton = new POButtonsButton(driver);
        WDUtils.waitForSeconds(3);
        Assert.assertTrue(poButtonsButton.isButtonsButtonDisplayed(), "Unable to confirm Buttons button is displayed");
        Assert.assertTrue(poButtonsButton.clickButtonsButton(), "Unable to click Buttons button");
        WDUtils.waitForSeconds(3);
        Assert.assertTrue((WDUtils.getCurrentUrl(driver).equals(URLConstants.BUTTONS_BUTTON_URL)), "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.BUTTONS_BUTTON_URL);
    }

    @Test
    public void DoubleClickButtonTest() {
        PODoubleClickButton poDoubleClickButton = new PODoubleClickButton(driver);

        WEUtils.pressButtonsButton(driver);
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poDoubleClickButton.isDoubleClickButtonDisplayed(), "Unable to confirm Double CLick Button is displayed");
        Assert.assertTrue(poDoubleClickButton.doubleClickDoubleClickButton(), "Unable to double click the Double CLick Button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poDoubleClickButton.isDoubleClickActionPerformed(), "Unable to verify Double Click action was performed on Double Click Me button");
    }

    @Test
    public void ClickMeButtonTest() {
        POClickMeButton poClickMeButton = new POClickMeButton(driver);
        WEUtils.pressButtonsButton(driver);
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poClickMeButton.isClickMeButtonDisplayed(), "Unable to confirm Click Me button is displayed");
        Assert.assertTrue(poClickMeButton.clickClickMeButton(), "Unable to click Click Me button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poClickMeButton.isClickMeButtonPressed(), "Unable to verify Click Me button was clicked");
    }

    @Test
    public void RightClickMeButtonTest() {
        PORightClickMeButton poRightClickMeButton = new PORightClickMeButton(driver);
        WEUtils.pressButtonsButton(driver);
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poRightClickMeButton.isRightClickMeButtonDisplayed(), "Unable to confirm Right Click Me button is displayed");
        Assert.assertTrue(poRightClickMeButton.rightClickRightClickMeButton(), "Unable to right click Right Click Me button");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poRightClickMeButton.isRightClickActionPerformed(), "Unable to verify Right Click action was performed on Right Click Me button.");
    }

    @Test
    public void TextBoxButtonTest() {
        POTextBoxButton poTextBoxButton = new POTextBoxButton(driver);
        Assert.assertTrue(poTextBoxButton.isTextBoxButtonDisplayed(), "Unable to confirm Text Box button is displayed.");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(poTextBoxButton.clickTextBoxButton(), "Unable to click Text Box button.");
        WDUtils.waitForSeconds(1);
        Assert.assertTrue(WDUtils.getCurrentUrl(driver).equals(URLConstants.TEXT_BOX_BUTTON_URL), "Found the following URL: " + WDUtils.getCurrentUrl(driver) + " instead of: " + URLConstants.TEXT_BOX_BUTTON_URL);
    }

    @Test
    public void setTextOnTextFieldTest() {
        POTextFields poTextFields = new POTextFields(driver);
        POTextFieldsResponse poTextFieldsResponse = new POTextFieldsResponse(driver);
        WEUtils.pressTextBoxButton(driver);

        //insert data in text fields
        Assert.assertTrue(poTextFields.isFullNameFieldDisplayed(), "Unable to confirm Full Name field is displayed.");
        Assert.assertTrue(poTextFields.clickFullNameField(), "Unable to click Full Name field.");
        Assert.assertTrue(poTextFields.setTextFullNameField(IdentityDataConstants.FULL_NAME), "Unable to set text to Full Name field.");
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poTextFields.isUserEmailFieldDisplayed(), "Unable to confirm Email field is displayed.");
        Assert.assertTrue(poTextFields.clickUserEmailField(), "Unable to click Email field.");
        Assert.assertTrue(poTextFields.setTextUserEmailField(IdentityDataConstants.EMAIL), "Unable to set text to Email field.");
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poTextFields.isCurrentAddressFieldDisplayed(), "Unable to confirm Current Address field is displayed.");
        Assert.assertTrue(poTextFields.clickCurrentAddressField(), "Unable to click Current Address field.");
        Assert.assertTrue(poTextFields.setTextCurrentAddressField(IdentityDataConstants.CURRENT_ADDRESS), "Unable to set text to Current Address field.");
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poTextFields.isPermanentAddressFieldDisplayed(), "Unable to confirm Permanent Address field is displayed.");
        Assert.assertTrue(poTextFields.clickPermanentAddressField(), "Unable to click Permanent Address field.");
        Assert.assertTrue(poTextFields.setTextPermanentAddressField(IdentityDataConstants.PERMANENT_ADDRESS), "Unable to set text to Permanent Address field.");
        WDUtils.waitForSeconds(1);

        //submit form
        Assert.assertTrue(poTextFields.isSubmitButtonDisplayed(), "Unable to confirm Submit button is displayed.");
        Assert.assertTrue(poTextFields.clickSubmitButton(), "Unable to click Submit button.");
        WDUtils.waitForSeconds(1);
        WDUtils.scrollDown(driver);

        //check response
        Assert.assertTrue(poTextFieldsResponse.isNameResponseDisplayed(), "Unable to confirm Name response is displayed.");
        Assert.assertTrue(poTextFieldsResponse.getTextNameField().equals("Name:" + IdentityDataConstants.FULL_NAME),
                "Unable to confirm Name returns the correct data.");
        System.out.println(poTextFieldsResponse.getTextNameField());
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poTextFieldsResponse.isEmailResponseDisplayed(), "Unable to confirm Email response is displayed.");
        Assert.assertTrue(poTextFieldsResponse.getTextEmailField().equals("Email:" + IdentityDataConstants.EMAIL),
                "Unable to confirm Email returns the correct data.");
        System.out.println(poTextFieldsResponse.getTextEmailField());
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poTextFieldsResponse.isCurrentAddressResponseDisplayed(), "Unable to confirm Current Address response is displayed.");
        Assert.assertTrue(poTextFieldsResponse.getTextCurrentAddressField().equals("Current Address :" + IdentityDataConstants.CURRENT_ADDRESS),
                "Unable to confirm Current Address returns the correct data.");
        System.out.println(poTextFieldsResponse.getTextCurrentAddressField());
        WDUtils.waitForSeconds(1);

        Assert.assertTrue(poTextFieldsResponse.isPermanentAddressResponseDisplayed(), "Unable to confirm Permanent Address response is displayed.");
        //wrong site response text for Permanent Address
        Assert.assertTrue(poTextFieldsResponse.getTextPermanentAddressField().equals("Permananet Address :" + IdentityDataConstants.PERMANENT_ADDRESS),
                "Unable to confirm Permanent Address returns the correct data.");
        System.out.println(poTextFieldsResponse.getTextPermanentAddressField());
        WDUtils.waitForSeconds(2);
    }

}
