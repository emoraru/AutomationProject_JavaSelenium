package pageobjects.elementspage.buttons;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POClickMeButton extends POBase {
    @FindBy(xpath = "//div[@class='mt-4']//button[text()='Click Me']")
    private WebElement weClickMeButton;
    public POClickMeButton(WebDriver driver) { super(driver); }
    public Boolean isClickMeButtonDisplayed() { return WEUtils.isDisplayed(weClickMeButton); }
    public Boolean clickClickMeButton() { return WEUtils.click(weClickMeButton); }

    @FindBy(xpath = "//p[@id='dynamicClickMessage']")
    private WebElement weClickMeButtonResponse;
    public Boolean isClickMeButtonPressed() { return WEUtils.isDisplayed(weClickMeButtonResponse); }

}
