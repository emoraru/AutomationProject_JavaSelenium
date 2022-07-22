package pageobjects.elementspage.checkbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POCheckboxButton extends POBase {

    @FindBy(xpath = "//div[@class=\"element-list collapse show\"]//li[@id=\"item-1\"]/span[contains(text(),\"Check Box\")]")
    private WebElement weCheckboxButton;
    public POCheckboxButton(WebDriver driver) {
        super(driver);
    }
    public Boolean isCheckboxButtonDisplayed() {
        return WEUtils.isDisplayed(weCheckboxButton);
    }
    public Boolean clickCheckboxButton() {
        return WEUtils.click(weCheckboxButton);
    }
}
