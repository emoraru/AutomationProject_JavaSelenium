package pageobjects.elementspage.checkbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POCollapseAllCheckBoxesButton extends POBase {
    @FindBy(xpath = "//div[@class=\"rct-options\"]//button[@class=\"rct-option rct-option-collapse-all\"]")
    private WebElement weCollapseAllButton;
    public POCollapseAllCheckBoxesButton(WebDriver driver) { super(driver); }
    public Boolean isCollapseAllCheckBoxDisplayed() { return WEUtils.isDisplayed(weCollapseAllButton); }
    public Boolean clickCollapseAllButton() { return WEUtils.click(weCollapseAllButton); }
}
