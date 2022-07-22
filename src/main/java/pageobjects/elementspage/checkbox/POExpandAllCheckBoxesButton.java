package pageobjects.elementspage.checkbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POExpandAllCheckBoxesButton extends POBase {
    @FindBy(xpath = "//div[@class=\"rct-options\"]//button[@class=\"rct-option rct-option-expand-all\"]")
    private WebElement weExpandAllButton;
    public POExpandAllCheckBoxesButton(WebDriver driver) {super(driver);}
    public Boolean isExpandAllButtonDisplayed() { return WEUtils.isDisplayed(weExpandAllButton); }
    public Boolean clickExpandAllButton() { return WEUtils.click(weExpandAllButton); }
}
