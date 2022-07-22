package pageobjects.elementspage.checkbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POWordFileCheckMark extends POBase {
    @FindBy(xpath = "//*[@id=\"tree-node\"]//span[contains(text(),'Word File.doc')]")
    private WebElement weWordFileCheckMark;
    public POWordFileCheckMark(WebDriver driver) { super(driver); }
    public Boolean isWordFileCheckMarkDisplayed() { return WEUtils.isDisplayed(weWordFileCheckMark); }
    public Boolean clickWordFileCheckMark() { return  WEUtils.click(weWordFileCheckMark); }
}
