package pageobjects.homepage;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POHeader extends POBase {

    @FindBy(xpath = "//div[@id=\"app\"]/header/a/img")
    private WebElement weHeaderLogoButton;

    public POHeader(WebDriver driver) {
        super(driver);
    }

    public Boolean isHeaderLogoButtonDisplayed() {
        return WEUtils.isDisplayed(weHeaderLogoButton);
    }
    public Boolean clickHeaderLogoButton() { return WEUtils.click(weHeaderLogoButton);
    }


}
