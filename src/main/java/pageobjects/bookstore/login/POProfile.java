package pageobjects.bookstore.login;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POProfile extends POBase {
    @FindBy(id = "gotoStore")
    private WebElement weGoToStoreButton;
    public POProfile(WebDriver driver) { super(driver); }
    public Boolean isGoToStoreButtonDisplayed() { return WEUtils.isDisplayed(weGoToStoreButton); }
    public Boolean clickGoToStoreButton() { return WEUtils.click(weGoToStoreButton); }

}
