package pageobjects.bookstore.login;

import framework.utils.webelement.WEUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.POBase;

public class POLogoutButton extends POBase {
    @FindBy(xpath = "//div[@class=\"text-right col-md-5 col-sm-12\"]/button[text()='Log out']")
    private WebElement weLogoutButton;
    public POLogoutButton(WebDriver driver) { super(driver); }
    public Boolean isLogoutButtonDisplayed() { return WEUtils.isDisplayed(weLogoutButton); }
    public Boolean clickLogoutButton() { return WEUtils.click(weLogoutButton); }
}
