package pageobjects.homepage;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POElementsCard extends POBase {

    @FindBy(xpath = "//div[@class=\"category-cards\"]//h5[contains(text(),'Elements')]")
    private WebElement weElementsCard;

    public POElementsCard(WebDriver driver) {
        super(driver);
    }

    public Boolean isElementsCardDisplayed() {
        return WEUtils.isDisplayed(weElementsCard);
    }

    public Boolean clickElementsCard() {
        return WEUtils.click(weElementsCard);
    }
}
