package pageobjects.elementspage.buttons;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class PODoubleClickButton extends POBase {
    @FindBy(id = "doubleClickBtn")
    private WebElement weDoubleClickButton;
    public PODoubleClickButton(WebDriver driver) { super(driver); }
    public Boolean isDoubleClickButtonDisplayed() { return WEUtils.isDisplayed(weDoubleClickButton); }
    public Boolean doubleClickDoubleClickButton() { return WEUtils.doubleClick(weDoubleClickButton, driver); }

    @FindBy(id = "doubleClickMessage")
    private WebElement weDoubleClickButtonResponse;
    public Boolean isDoubleClickActionPerformed() { return WEUtils.isDisplayed(weDoubleClickButtonResponse); }
}
