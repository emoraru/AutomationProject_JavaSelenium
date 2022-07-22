package pageobjects.bookstore.login;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POLoginNavigationButton extends POBase {
    @FindBy(xpath = "//*[@id=\"item-0\"]/span[contains(text(),'Login')]")
    private WebElement weLoginNavigationButton;
    public POLoginNavigationButton(WebDriver driver) { super(driver); }
    public Boolean isLoginNavigationButtonDisplayed() { return WEUtils.isDisplayed(weLoginNavigationButton); }
    public Boolean clickLoginNavigationButton() { return WEUtils.click(weLoginNavigationButton); }
}
