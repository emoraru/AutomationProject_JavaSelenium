package pageobjects.homepage;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POFormsCard extends POBase {


    @FindBy(xpath = "//div[@class=\"category-cards\"]//h5[contains(text(),'Forms')]")
    private WebElement weFormsCard;

    public POFormsCard(WebDriver driver) {
        super(driver);
    }

    public Boolean isFormsCardDisplayed() {
        return WEUtils.isDisplayed(weFormsCard);
    }

    public Boolean clickFormsCard() {
        return WEUtils.click(weFormsCard);
    }
}
