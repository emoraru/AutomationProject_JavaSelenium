package pageobjects.elementspage.textbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POTextFields extends POBase {
    @FindBy(id = "userName")
    private WebElement weFullName;
    public POTextFields(WebDriver driver) { super(driver); }
    public Boolean isFullNameFieldDisplayed() { return WEUtils.isDisplayed(weFullName); }
    public Boolean clickFullNameField() { return WEUtils.click(weFullName); }
    public Boolean setTextFullNameField(String text) { return WEUtils.setText(weFullName, text); }

    @FindBy(id = "userEmail")
    private WebElement weUserEmail;
    public Boolean isUserEmailFieldDisplayed() { return WEUtils.isDisplayed(weUserEmail); }
    public Boolean clickUserEmailField() { return WEUtils.click(weUserEmail); }
    public Boolean setTextUserEmailField(String text) { return WEUtils.setText(weUserEmail, text); }

    @FindBy(id = "currentAddress")
    private WebElement weCurrentAddress;
    public Boolean isCurrentAddressFieldDisplayed() { return WEUtils.isDisplayed(weCurrentAddress); }
    public Boolean clickCurrentAddressField() { return WEUtils.click(weCurrentAddress); }
    public Boolean setTextCurrentAddressField(String text) { return WEUtils.setText(weCurrentAddress, text); }

    @FindBy(id = "permanentAddress")
    private WebElement wePermanentAddress;
    public Boolean isPermanentAddressFieldDisplayed() { return WEUtils.isDisplayed(wePermanentAddress); }
    public Boolean clickPermanentAddressField() { return WEUtils.click(wePermanentAddress); }
    public Boolean setTextPermanentAddressField(String text) { return WEUtils.setText(wePermanentAddress, text); }

    @FindBy(id = "submit")
    private WebElement weSubmitButton;
    public Boolean isSubmitButtonDisplayed() { return WEUtils.isDisplayed(weSubmitButton); }
    public Boolean clickSubmitButton() { return WEUtils.click(weSubmitButton); }

}
