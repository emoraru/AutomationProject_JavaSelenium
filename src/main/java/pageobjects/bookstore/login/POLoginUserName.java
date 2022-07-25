package pageobjects.bookstore.login;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POLoginUserName extends POBase {
    @FindBy(id = "userName-value")
    private WebElement weLoginUserName;
    public POLoginUserName (WebDriver driver) { super(driver); }
    public Boolean isUserNameDisplayed() { return WEUtils.isDisplayed(weLoginUserName); }
    public String getUserNameText() { return WEUtils.getText(weLoginUserName); }
}
