package pageobjects.homepage;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POAlertsWindowsCard extends POBase {

    @FindBy(xpath = "//div[@class=\"category-cards\"]//h5[contains(text(),'Alerts')]")
    private WebElement weAlertsWindowsCard;

    public POAlertsWindowsCard(WebDriver driver) {
        super(driver);
    }

    public Boolean isAlertsWindowsCardDisplayed() {
        return WEUtils.isDisplayed(weAlertsWindowsCard);
    }

    public Boolean clickAlertsWindowsCard() {
        return WEUtils.click(weAlertsWindowsCard);
    }
}
