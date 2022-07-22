package pageobjects.homepage;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POBookStoreCard extends POBase {

    @FindBy(xpath = "//div[@class=\"category-cards\"]//h5[contains(text(),'Book Store Application')]")
    private WebElement weBooksCard;

    public POBookStoreCard(WebDriver driver) {
        super(driver);
    }

    public Boolean isBooksCardDisplayed() {
        return WEUtils.isDisplayed(weBooksCard);
    }

    public Boolean clickBooksCard() {
        return WEUtils.click(weBooksCard);
    }
}
