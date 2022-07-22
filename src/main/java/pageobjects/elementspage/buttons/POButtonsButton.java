package pageobjects.elementspage.buttons;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POButtonsButton extends POBase {
    @FindBy(xpath = "//div[@class=\"element-list collapse show\"]//li[@id=\"item-4\"]/span[contains(text(),\"Buttons\")]")
    private WebElement weButtonsButton;
    public POButtonsButton(WebDriver driver) {
        super(driver);
    }
    public Boolean isButtonsButtonDisplayed() {
        return WEUtils.isDisplayed(weButtonsButton);
    }
    public Boolean clickButtonsButton() {
        return WEUtils.click(weButtonsButton);
    }
}
