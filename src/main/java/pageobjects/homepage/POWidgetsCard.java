package pageobjects.homepage;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POWidgetsCard extends POBase {

    @FindBy(xpath = "//div[@class=\"category-cards\"]//h5[contains(text(),'Widgets')]")
    private WebElement weWidgetsCard;

    public POWidgetsCard(WebDriver driver) {
        super(driver);
    }

    public Boolean isWidgetsCardDisplayed() {
        return WEUtils.isDisplayed(weWidgetsCard);
    }

    public Boolean clickWidgetsCard() {
        return WEUtils.click(weWidgetsCard);
    }
}
