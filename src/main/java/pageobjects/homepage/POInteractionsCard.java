package pageobjects.homepage;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POInteractionsCard extends POBase {

    @FindBy(xpath = "//div[@class=\"category-cards\"]//h5[contains(text(),'Interactions')]")
    private WebElement weInteractionsCard;

    public POInteractionsCard(WebDriver driver) {
        super(driver);
    }

    public Boolean isInteractionsCardDisplayed() {
        return WEUtils.isDisplayed(weInteractionsCard);
    }

    public Boolean clickInteractionsCard() {
        return WEUtils.click(weInteractionsCard);
    }
}
