package pageobjects.elementspage.textbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POTextFieldsResponse extends POBase {
    @FindBy(id = "name")
    private WebElement weName;
    public POTextFieldsResponse(WebDriver driver) { super(driver);}
    public Boolean isNameResponseDisplayed() { return WEUtils.isDisplayed(weName); }
    public String getTextNameField() { return WEUtils.getText(weName); }

    @FindBy(id = "email")
    private WebElement weEmail;
    public Boolean isEmailResponseDisplayed() { return WEUtils.isDisplayed(weEmail); }
    public String getTextEmailField() { return WEUtils.getText(weEmail); }

    @FindBy(xpath = "//p[@id=\"currentAddress\"]")
    private WebElement weCurrentAddress;
    public Boolean isCurrentAddressResponseDisplayed() { return WEUtils.isDisplayed(weCurrentAddress); }
    public String getTextCurrentAddressField() { return WEUtils.getText(weCurrentAddress); }

    @FindBy(xpath = "//p[@id=\"permanentAddress\"]")
    private WebElement wePermanentAddress;
    public Boolean isPermanentAddressResponseDisplayed() { return WEUtils.isDisplayed(wePermanentAddress); }
    public String getTextPermanentAddressField() { return WEUtils.getText(wePermanentAddress); }
}
