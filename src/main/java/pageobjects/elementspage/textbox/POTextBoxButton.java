package pageobjects.elementspage.textbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POTextBoxButton extends POBase {
    @FindBy(xpath = "//div[@class=\"element-list collapse show\"]//li[@id=\"item-0\"]//span[contains(text(),'Text Box')]")
    private WebElement weTextBoxButton;
    public POTextBoxButton(WebDriver driver) { super(driver); }
    public Boolean isTextBoxButtonDisplayed() { return WEUtils.isDisplayed(weTextBoxButton); }
    public Boolean clickTextBoxButton() { return WEUtils.click(weTextBoxButton); }

}
