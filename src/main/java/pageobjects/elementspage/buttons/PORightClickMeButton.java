package pageobjects.elementspage.buttons;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class PORightClickMeButton extends POBase {
    @FindBy(xpath = "//div[@class='mt-4']//button[text()='Right Click Me']")
    private WebElement poRightClickMeButton;
    public PORightClickMeButton(WebDriver driver) { super(driver); }
    public Boolean isRightClickMeButtonDisplayed() { return WEUtils.isDisplayed(poRightClickMeButton); }
    public Boolean rightClickRightClickMeButton() { return WEUtils.rightClick(poRightClickMeButton, driver); }

    @FindBy(id = "rightClickMessage")
    private WebElement poRightClickMeButtonResponse;
    public Boolean isRightClickActionPerformed() { return WEUtils.isDisplayed(poRightClickMeButtonResponse); }
}
