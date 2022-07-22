package pageobjects.elementspage.checkbox;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POWordFileCheckMarkResponse extends POBase {
    @FindBy(xpath = "//div[@class=\"display-result mt-4\"]//span[contains(text(),\"wordFile\")]")
    private WebElement weWordFileCheckMarkResponse;
    public POWordFileCheckMarkResponse(WebDriver driver) { super(driver); }
    public Boolean isWordFileCheckMarked() { return WEUtils.isDisplayed(weWordFileCheckMarkResponse); }
}
